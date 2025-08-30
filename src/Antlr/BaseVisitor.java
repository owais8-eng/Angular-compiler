package Antlr;

import AST.*;
import AST.Map;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
public class BaseVisitor extends AngParserBaseVisitor<ASTNode> {

    public BaseVisitor() {

    }

    private  SemanticCheck semanticCheck;

    public BaseVisitor(SemanticCheck semanticCheck) {
        this.semanticCheck = semanticCheck;
    }

    SymbolTable symbolTable = new SymbolTable();
    MapSymbol symbol = new MapSymbol();
    private Deque<String> scopeStack = new ArrayDeque<>();

    private Deque<html> htmlStack = new ArrayDeque<>();
    private Deque<htmlInside> htmlInsideStack = new ArrayDeque<>();
    private String getCurrentScope(){
        return scopeStack.isEmpty() ? "global" :scopeStack.peek();
    }

    private String getEnclosingScope() {
        Iterator<String> it = scopeStack.iterator();
        it.next();
        return it.hasNext() ? it.next() : "global";
    }

    public SymbolTable getSymbolTable(){
        return  symbolTable;
    }


    @Override
    public ASTNode visitComponentConfig(AngParser.ComponentConfigContext ctx) {
        ComponentConfig config = new ComponentConfig();

        if (ctx.selector() != null) {
            config.setSelector((Selector) visit(ctx.selector()));
        }
        if (ctx.template() != null) {
            config.setTemplate((Template) visit(ctx.template()));
        } else if (ctx.templateUrl() != null) {
            config.setTemplateUrl((TemplateUrl) visit(ctx.templateUrl()));
        }
        if (ctx.styleUrls() != null) {
            config.setStyleUrls((StyleUrls) visit(ctx.styleUrls()));
        }

        return config;
    }

    @Override
    public decorater visitComponentDecorator(AngParser.ComponentDecoratorContext ctx) {
        decorater decorater = new decorater();
        decorater.setType("Component");

        ComponentConfig config = new ComponentConfig();

        if (ctx.componentConfig() != null) {
            if (ctx.componentConfig().selector() != null) {
                Selector selector = (Selector) visit(ctx.componentConfig().selector());
                config.setSelector(selector);
            }
            if (ctx.componentConfig().template() != null) {
                Template template = (Template) visit(ctx.componentConfig().template());
                config.setTemplate(template);
            } else if (ctx.componentConfig().templateUrl() != null) {
                {
                    TemplateUrl templateUrl = (TemplateUrl) visit(ctx.componentConfig().templateUrl());
                    config.setTemplateUrl(templateUrl);
                }
            }
            if (ctx.componentConfig().styleUrls() != null) {
                StyleUrls styleUrls = (StyleUrls) visit(ctx.componentConfig().styleUrls());
                config.setStyleUrls(styleUrls);
            }
        }

        decorater.setConfig(config);


        String componentScope = "Component" ;
        scopeStack.push(componentScope);

        scopeStack.pop();
        return decorater;
    }

    @Override
    public decorater visitDirectiveDecorator(AngParser.DirectiveDecoratorContext ctx) {
        decorater decorater = new decorater();
        decorater.setType("Directive");

        DirectiveConfig config = (DirectiveConfig) visit(ctx.directiveConfig());
        decorater.setConfig(config);

        String componentScope = "Component" ;
        scopeStack.push(componentScope);

        scopeStack.pop();

        return  decorater;
    }

    @Override
    public decorater visitInjectableDecorator(AngParser.InjectableDecoratorContext ctx) {
        decorater decoratorNode = new decorater();
        decoratorNode.setType("Injectable");

        InjectableConfig config = (InjectableConfig) visit(ctx.injectableConfig());
        decoratorNode.setConfig(config);

        String componentScope = "Component" ;
        scopeStack.push(componentScope);


        scopeStack.pop();
        return decoratorNode;
    }

    @Override
    public ASTNode visitTemplate(AngParser.TemplateContext ctx) {
        Template template = new Template();

        if (ctx != null && ctx.html() != null) {
            html htmlNode = visitHtml(ctx.html());
            template.setValue(htmlNode);
        }

        return template;
    }
//-----------symbol----------
@Override
public ASTNode visitTemplateUrl(AngParser.TemplateUrlContext ctx) {
    TemplateUrl templateUrl = new TemplateUrl();
    System.out.println(">>>>>");
     if (ctx != null && ctx.SINGLE_QUOTED_STRING() != null) {
      String raw = ctx.SINGLE_QUOTED_STRING().getText();
      String value = raw.substring(1,raw.length()-1);
      templateUrl.setValue(value);
         String currentScope = getCurrentScope();
         symbolTable.add("templateUrl", "TemplateUrl",value, currentScope);
    }
    return templateUrl;
}


    //-------symbol--------
    @Override
    public ASTNode visitStyleUrls(AngParser.StyleUrlsContext ctx) {
        StyleUrls styleUrls = new StyleUrls();
        Array array = (Array) visit(ctx.array());

        List<String> values = new ArrayList<>();
        for (SubValue subValue : array.getSubValues()){
            values.add(subValue.toString());
        }
        styleUrls.setValues(values);
        symbolTable.add(
                "Stylers",
                "Stylers",
                String.join(",",values),
                getCurrentScope()
        );
        return styleUrls;
    }
//------symbol-----
    @Override
    public ASTNode visitSelector(AngParser.SelectorContext ctx) {
        Selector selector = new Selector();
        if (ctx != null && ctx.SINGLE_QUOTED_STRING() != null) {
            String raw = ctx.SINGLE_QUOTED_STRING().getText();
            String value = raw.substring(1, raw.length() - 1);
            selector.setValue(value);
            String currentScope = getCurrentScope();
           symbol.addVariable("selector",value);
        }
        return selector;
    }

    //---------App----start Node
    @Override
    public App visitApp(AngParser.AppContext ctx) {
        App app = new App();
        Row row = new Row();

        List<ImportR>  importRS=  new ArrayList<>();
        List<function> functions = new ArrayList<>();
        List<Variable> variables = new ArrayList<>();
        List<enum_> enumS = new ArrayList<>();
        List<Exports> exports = new ArrayList<>();
        List<interfaceCode> interfaceCodes = new ArrayList<>();
        List<html> htmlList = new ArrayList<>();
        List<cssCode> cssCodeList = new ArrayList<>();
        for (int i =0 ; i<ctx.importR().size();i++) {
            ImportR importR = visitImportR(ctx.importR().get(i));
            importRS.add(importR);
        }
        for (int i =0 ; i<ctx.enum_().size();i++) {
            enum_ enumEntry = visitEnum(ctx.enum_().get(i));
            enumS.add(enumEntry);
        }
        for (int i =0 ; i<ctx.function().size();i++) {
            functions.add(visitFunction(ctx.function().get(i)));
        }
        for (int i =0 ; i<ctx.variable().size();i++) {
            variables.add(visitVariable(ctx.variable().get(i)));

        }
        for (int i =0 ; i<ctx.exports().size();i++) {
            Exports exportNode = visitExports(ctx.exports().get(i));
            exports.add(exportNode);

        }
        for (int i =0 ; i<ctx.interfaceCode().size();i++) {
            interfaceCodes.add(visitInterfaceCode(ctx.interfaceCode().get(i)));
        }
        for (int i=0 ; i<ctx.html().size();i++) {
                htmlList.add(visitHtml(ctx.html().get(i))) ;
        }
        for (int i=0 ; i<ctx.cssCode().size();i++) {
            cssCodeList.add(visitCssCode(ctx.cssCode().get(i))) ;
        }

        app.setImportRS(importRS);
        app.setFunctions(functions);
        app.setVariables(variables);
        app.setEnumS(enumS);
        app.setExports(exports);
        app.setInterfaceCodes(interfaceCodes);
        app.setHtmlList(htmlList);
        app.setCssCodeList(cssCodeList);

        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.setSymbolTable(this.symbolTable);

        boolean isValid = semanticCheck.check(this.symbolTable);

        if (!isValid) {
            // Handle semantic errors (e.g., throw exception or log errors)
            System.err.println("Semantic errors detected in the app.");
            semanticCheck.printErrors();
        }

        symbol.print();
        return app;
    }

    @Override
    public ImportR visitImportR(AngParser.ImportRContext ctx) {
        ImportR imp = new ImportR();
        imp.setFrom(ctx.FROM().getText());

        if (ctx.SIGNAL() != null) {
            imp.setSignal(ctx.SIGNAL().getText());
        }
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> strings = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            imp.setIdentifiers(strings);
        }
        Row row = new Row();
        row.setType("Import");
        StringBuilder value = new StringBuilder("from: " + imp.getFrom());
        if (imp.getSignal() != null) {
            value.append(", signal: ").append(imp.getSignal());
        }
        if (imp.getIdentifiers() != null && !imp.getIdentifiers().isEmpty()) {
            value.append(", identifiers: ").append(imp.getIdentifiers());
        }

        return imp;
    }

    //----------Here in Symbol Table-----------
    @Override
    public Exports visitExports(AngParser.ExportsContext ctx) {

        Exports exports = new Exports();


        String className = null;
        if (ctx.ID() != null && !ctx.ID().isEmpty() && ctx.ID(0) != null) {
            className = ctx.ID(0).getText();
        } else {
            // handle missing className case, maybe throw exception or assign default
            className = "UnnamedClass";
        }
        List<decorater> decoraters = new ArrayList<>();
        for (AngParser.DecoraterContext decoraterContext : ctx.decorater()) {
            if (decoraterContext != null) {
                decoraters.add((decorater) visit(decoraterContext));
            }
        }
        exports.setDecorators(decoraters);


        List<String> ids = new ArrayList<>();
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            ids = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            exports.setIds(ids);
        }


        if (ctx.classBody() != null) {
            scopeStack.push(className);
            classBody body = (classBody) visit(ctx.classBody());
            exports.setClassBody(body);
            scopeStack.pop();
        }


        return exports;
    }

    @Override
    public classBody visitClassBody(AngParser.ClassBodyContext ctx) {
        classBody body = new classBody();

        List<Variable> variables = new ArrayList<>();
        for (AngParser.VariableContext variableContext : ctx.variable()) {
            if (variableContext != null) {
                variables.add((Variable) visit(variableContext));
            }
        }
        body.setVariables(variables);

        List<function> functions = new ArrayList<>();
        for (int i =0; i <ctx.function().size();i++) {
            functions.add((function) visit(ctx.function().get(i)));

        }

        List<interfaceCode> interfaceCodes = new ArrayList<>();
        for (int i =0; i< ctx.interfaceCode().size();i++) {
            interfaceCodes.add((interfaceCode) visit(ctx.interfaceCode().get(i)));
        }

        List<constructor> constructors = new ArrayList<>();
        for (int i=0;i<ctx.constructor().size();i++) {
            constructors.add((constructor) visit(ctx.constructor().get(i)));
        }

        StringBuilder value = new StringBuilder();

        value.append("variables: ").append(variables.size()).append(", ");
        value.append("functions: ").append(functions.size()).append(", ");
        value.append("interfaces: ").append(interfaceCodes.size()).append(", ");
        value.append("constructors: ").append(constructors.size());

        return body;
    }

    @Override
    public Map visitMap(AngParser.MapContext ctx) {
        Map map = new Map();
        int keyCount = ctx.ID().size();
        int valueCount = ctx.value().size();

        if (keyCount != valueCount) {
            throw new IllegalArgumentException("Map key-value count mismatch");
        }
        for (int i = 0; i < ctx.ID().size(); i++) {
            String key = ctx.ID(i).getText();
            ASTNode valueNode = (ASTNode) visit(ctx.value().get(i));
            map.addEntry(key, valueNode);
        }

        return map;
    }


    @Override
    public Value visitSubValueValue(AngParser.SubValueValueContext ctx) {
        Value value = new Value();
        SubValue subValue = (SubValue) visit(ctx.subValue());
        value.setSubValue(subValue);

        return value;
    }

    @Override
    public Value visitArrayValue(AngParser.ArrayValueContext ctx) {
        Value value = new Value();
        Array arr = (Array) visit(ctx.array());
        value.setArray(arr);
        return value;
    }

    @Override
    public Value visitHtmlValue(AngParser.HtmlValueContext ctx) {
        Value value = new Value();
        html htmlVal = (html) visit(ctx.html());
        value.setHtml(htmlVal);
        return value;
    }
    @Override
    public Value visitMapValue(AngParser.MapValueContext ctx) {
        Value value = new Value();
        Map map = (Map) visit(ctx.map());
        value.setMap(map);
        return value;

    }


    @Override
    public Array visitArray(AngParser.ArrayContext ctx) {
        Array array = new Array();
        List<SubValue> subValues = new ArrayList<>();

        for (AngParser.SubValueContext subValueContext :ctx.subValue()) {
            if (subValueContext != null) {
                subValues.add((SubValue) visit(subValueContext));
            }
        }
        array.setSubValues(subValues);


        StringBuilder value = new StringBuilder();
        value.append("subValues: [");
        for (int i = 0; i < subValues.size(); i++) {
            value.append(subValues.get(i).toString());
            if (i < subValues.size() - 1) {
                value.append(", ");
            }
        }
        value.append("]");

        return array;

    }

    @Override
    public SubValue visitStringSubValue(AngParser.StringSubValueContext ctx) {
        SubValue subValue = new SubValue();
        String text = ctx.SingleLineString().getText();
        subValue.setString(text);

        return subValue;
    }

    @Override
    public SubValue visitIdSubValue(AngParser.IdSubValueContext ctx) {
        SubValue subValue = new SubValue();
        String id = ctx.ID().getText();
        subValue.setId(id);

        return subValue;
    }

    @Override
    public SubValue visitNumberSubValue(AngParser.NumberSubValueContext ctx) {
        SubValue subValue = new SubValue();
        String raw = ctx.NUMBER().getText();

        return subValue;
    }

    @Override
    public SubValue visitCssBlockSubValue(AngParser.CssBlockSubValueContext ctx) {
        SubValue subValue = new SubValue();

        List<cssCode> cssCodes = new ArrayList<>();
        for (AngParser.CssCodeContext cssCtx : ctx.cssCode()) {
            cssCodes.add((cssCode) visit(cssCtx));
        }
        subValue.setCssCode(cssCodes);

        return subValue;
    }
    @Override
    public SubValue visitDotAccessSubValue(AngParser.DotAccessSubValueContext ctx) {
        SubValue subValue = new SubValue();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0 ; i < ctx.children.size() ; i++) {
         stringBuilder.append(ctx.children.get(i).getText());
        }
        subValue.setDotAccess(stringBuilder.toString());
        return subValue;
    }

    private List<String> extractNameParts(AngParser.VariableNameContext ctx) {
        List<String> parts = new ArrayList<>();

        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            parts.add(ctx.ID(0).getText());

            for (int i = 1; i < ctx.ID().size(); i++) {
                parts.add(ctx.ID(i).getText());
            }
        }
        return parts;
    }


    @Override
    public Variable visitVariable(AngParser.VariableContext ctx) {

        Variable variable = new Variable();

        if (ctx.LET() != null) variable.setModifier("let");
        else if (ctx.VAR() != null) variable.setModifier("var");
        else if (ctx.CONST() != null) variable.setModifier("const");

        if (ctx.PUBLIC() != null) variable.setVisibility("public");
        else if (ctx.PRIVATE() != null) variable.setVisibility("private");

       if (ctx.variableName() != null) {
           List<String> nameParts = extractNameParts(ctx.variableName());
           variable.setNameParts(nameParts);

       }
       if (ctx.DATATYPE_() != null) {
           variable.setDatatype(ctx.DATATYPE_().getText());
       }else if (ctx.vv() != null) {
           variable.setVvNode((vv) visit(ctx.vv()));
       }else if (ctx.arrayType() != null) {
           variable.setArrayTypeNode((arrayType) visit(ctx.arrayType()));
       }

       if (ctx.variableValue() != null) {
           variable.setValue((VariableValue) visit(ctx.variableValue()));
       }
        return variable;
    }

    @Override
    public arrayType visitArrayType(AngParser.ArrayTypeContext ctx) {
        arrayType arrayType = new arrayType();

        if (ctx.DATATYPE_() != null) {
            arrayType.setDataType(ctx.DATATYPE_().getText());
        } else {
            arrayType.setDataType(null);
        }

        return arrayType;
    }

    @Override
    public variableName visitVariableName(AngParser.VariableNameContext ctx) {
        variableName variableName = new variableName();

        if (ctx.ID() != null && !ctx.ID().isEmpty()) {

            variableName.setFirstPart(ctx.ID(0).getText());

            for (int i = 1; i < ctx.ID().size(); i++) {
                variableName.getDotIds().add(ctx.ID(i).getText());
            }
        } else if (ctx.STATE() != null && ctx.ID() != null && ctx.ID().size() > 0) {
            variableName.setFirstPart(ctx.STATE().getText());

            for (int i = 0; i < ctx.ID().size(); i++) {
                variableName.getDotIds().add(ctx.ID(i).getText());
            }
        }

        return variableName;
    }

    @Override
    public ASTNode visitUpdateState(AngParser.UpdateStateContext ctx) {
        updateState updateState = new updateState();

        updateState.setVariableName(visitVariableName(ctx.variableName()));

        if (ctx.subValue() != null) {
            updateState.setValue((ASTNode) visit(ctx.subValue()));
        } else if (ctx.array() != null) {
            updateState.setValue((ASTNode) visit(ctx.array()));
        } else if (ctx.map() != null) {
            updateState.setValue((ASTNode) visit(ctx.map()));
        }
        return updateState;
    }

    //-------------------------//
    @Override
    public VariableValue visitStringVarValue(AngParser.StringVarValueContext ctx) {
        VariableValue value = new VariableValue();
        value.setString(ctx.SingleLineString().getText());

        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvCtx : ctx.vv()) {
            vvs.add((vv) visit(vvCtx));
        }
        value.setVvs(vvs);

        return value;
    }

    @Override
    public VariableValue visitNumberVarValue(AngParser.NumberVarValueContext ctx) {
        VariableValue value = new VariableValue();
        value.setDecimal(Integer.parseInt(ctx.DECIMEL().getText()));

        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvCtx : ctx.vv()) {
            vvs.add((vv) visit(vvCtx));
        }
        value.setVvs(vvs);

        return value;
    }

    @Override
    public VariableValue visitIdVarValue(AngParser.IdVarValueContext ctx) {
        VariableValue value = new VariableValue();
        value.setId(ctx.ID().getText());

        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvCtx : ctx.vv()) {
            vvs.add((vv) visit(vvCtx));
        }
        value.setVvs(vvs);


        return value;
    }

    @Override
    public VariableValue visitArrayVarValue(AngParser.ArrayVarValueContext ctx) {
        VariableValue value = new VariableValue();
        value.setArray((Array) visit(ctx.array()));

        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvCtx : ctx.vv()) {
            vvs.add((vv) visit(vvCtx));
        }
        value.setVvs(vvs);


        return value;
    }

    @Override
    public VariableValue visitMapVarValue(AngParser.MapVarValueContext ctx) {
        VariableValue value = new VariableValue();
        value.setMap((Map) visit(ctx.map()));

        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvCtx : ctx.vv()) {
            vvs.add((vv) visit(vvCtx));
        }
        value.setVvs(vvs);

        return value;
    }

    @Override
    public VariableValue visitThisCallVarValue(AngParser.ThisCallVarValueContext ctx) {
        VariableValue value = new VariableValue();
        value.setThisCall((thisCall) visit(ctx.thisCall()));

        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvCtx : ctx.vv()) {
            vvs.add((vv) visit(vvCtx));
        }
        value.setVvs(vvs);

        return value;
    }

    @Override
    public VariableValue visitFunc2VarValue(AngParser.Func2VarValueContext ctx) {
        VariableValue value = new VariableValue();
        value.setFunction2((function2) visit(ctx.function2()));

        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvCtx : ctx.vv()) {
            vvs.add((vv) visit(vvCtx));
        }
        value.setVvs(vvs);

        return value;
    }

    @Override
    public VariableValue visitCallFunVarValue(AngParser.CallFunVarValueContext ctx) {
        VariableValue value = new VariableValue();
        value.setCallFun((callFun) visit(ctx.callFun()));

        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvCtx : ctx.vv()) {
            vvs.add((vv) visit(vvCtx));
        }
        value.setVvs(vvs);

        return value;
    }

    @Override
    public VariableValue visitFuncVarValue(AngParser.FuncVarValueContext ctx) {
        VariableValue value = new VariableValue();
        value.setFunction((function) visit(ctx.function()));

        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvCtx : ctx.vv()) {
            vvs.add((vv) visit(vvCtx));
        }
        value.setVvs(vvs);

        return value;
    }


    @Override
    public constructor visitConstructor(AngParser.ConstructorContext ctx) {
        constructor constructor = new constructor();
        String scope =  "Constructor";
        scopeStack.push(scope);
        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvContext : ctx.vv()) {
            if (vvContext != null) {
                vvs.add((vv) visit(vvContext));
            }
        }
        constructor.setVvs(vvs);
        constructor.setFunctionBody((functionBody) visit(ctx.functionBody()));


        StringBuilder valueStr = new StringBuilder();
        if (!vvs.isEmpty()) {
            valueStr.append("vvs: ").append(vvs);
        }
        if (constructor.getFunctionBody() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("functionBody: ").append(constructor.getFunctionBody().toString());
        }
        scopeStack.pop();

        return constructor;
    }

    @Override
    public vv visitVv(AngParser.VvContext ctx) {
        vv vv = new vv();
        vv.setString(ctx.ID().getText());
        return vv;
    }
    private String inferTypeFromReturn(returnStatement ret) {
        if (ret == null) return "void";

        if (ret.getString() != null) {
            return "string";
        } else if (ret.getDecimal() != null) {
            return "number";
        } else if (ret.getArray() != null) {
            return "array";
        } else if (ret.getId() != null) {
            return "ID";
        } else if (ret.getThisCall() != null) {
            return "unknown";
        }

        return "void";
    }
//----symbol-------
    @Override
    public function visitFunction(AngParser.FunctionContext ctx) {
        function fun = new function();

        String functionName = ctx.ID() != null ? ctx.ID().getText() : "anonymous";
        fun.setName(functionName);
        String functionScopeName = functionName;
        scopeStack.push(functionScopeName);

        List<functionParam> params = new ArrayList<>();
        for (AngParser.FunctionParamsContext paramsContext : ctx.functionParams()) {
            if (paramsContext != null) {
                params.add((functionParam) visit(paramsContext));
            }
        }
        fun.setFunctionParams(params);

        if (ctx.vv() != null) {
            fun.setVv((vv) visit(ctx.vv()));
        }

        List<dd> dds = new ArrayList<>();
        for (AngParser.DdContext ddContext : ctx.dd()) {
            if (ddContext != null) {
                dds.add((dd) visit(ddContext));
            }
        }
        fun.setDdList(dds);


        if (ctx.functionBody() != null) {
            fun.setFunctionBody((functionBody) visit(ctx.functionBody()));
        }

        if (ctx.returnStatement() != null) {
            fun.setReturnStatement((returnStatement) visit(ctx.returnStatement()));
        }

        String declaredReturnType = "void";
        if (ctx.DATATYPE_() != null) {
            declaredReturnType = ctx.DATATYPE_().getText();
        } else if (fun.getVv() != null) {
            declaredReturnType = fun.getVv().toString();
        } else if (!fun.getDdList().isEmpty()) {
            declaredReturnType = fun.getDdList().toString();
        }

        String actualReturnType = "void";
        returnStatement retStmt = fun.getReturnStatement();
        if (retStmt != null) {
            actualReturnType = inferTypeFromReturn(retStmt);
        } else if (fun.getVv() != null) {
            actualReturnType = fun.getVv().toString();
        } else if (!fun.getDdList().isEmpty()) {
            actualReturnType = fun.getDdList().get(0).toString();
        }

        try {
            if (functionName != null && functionScopeName != null && declaredReturnType != null && actualReturnType != null) {
                symbolTable.add(
                        functionName,
                        "function",
                        declaredReturnType + ":" + actualReturnType,
                        functionScopeName
                );
            } else {
                System.err.println("⚠️ Cannot add function to symbol table due to null values.");
            }
        } catch (Exception e) {
            System.err.println("❌ Exception while adding function to symbol table: " + e.getMessage());
            e.printStackTrace();
        }

        scopeStack.pop();



        return fun;
    }

    @Override
    public function2 visitFunction2(AngParser.Function2Context ctx) {
        function2 fun2 = new function2();

        String scopeName = "function2@" + ctx.getStart().getLine() + ":" + ctx.getStart().getCharPositionInLine();
        scopeStack.push(scopeName);
        List<functionParam> params = new ArrayList<>();
        for (AngParser.FunctionParamsContext paramsContext : ctx.functionParams()) {
            if (paramsContext != null) {
                params.add((functionParam) visit(paramsContext));
            }
        }
        fun2.setFunctionParams(params);

        fun2.setVv((vv) visit(ctx.vv()));

        List<dd> dds = new ArrayList<>();
        for (AngParser.DdContext ddContext : ctx.dd()) {
            if (ddContext != null) {
                dds.add((dd) visit(ddContext));
            }
        }
        fun2.setDdList(dds);
        fun2.setFunctionBody((functionBody) visit(ctx.functionBody()));
        fun2.setReturnStatement((returnStatement) visit(ctx.returnStatement()));

        StringBuilder valueStr = new StringBuilder();
        valueStr.append("params: ").append(params);
        if (fun2.getVv() != null) {
            valueStr.append(", vv: ").append(fun2.getVv());
        }
        if (!dds.isEmpty()) {
            valueStr.append(", dds: ").append(dds);
        }
        if (fun2.getFunctionBody() != null) {
            valueStr.append(", functionBody: ").append(fun2.getFunctionBody());
        }
        if (fun2.getReturnStatement() != null) {
            valueStr.append(", returnStatement: ").append(fun2.getReturnStatement());
        }
        scopeStack.pop();
        return fun2;

    }

    @Override
    public dd visitDd(AngParser.DdContext ctx) {
        dd dd = new dd();
        dd.setDataType(ctx.DATATYPE_().getText());
        return dd;
    }

    @Override
    public functionParam visitFunctionParams(AngParser.FunctionParamsContext ctx) {
        functionParam param = new functionParam();
        String scopeName = getCurrentScope() + ".params";
        scopeStack.push(scopeName);
       param.setId(ctx.ID(0).getText());
       if (ctx.COLON() != null) {
           if (ctx.DATATYPE_() != null) {
               param.setType(ctx.DATATYPE_().getText());
           }else if (ctx.ID().size() > 1) {
               param.setType(ctx.ID(1).getText());
           }
       }
        scopeStack.pop();
        return param;

    }
    @Override
    public functionBody visitFunctionBody(AngParser.FunctionBodyContext ctx) {
        functionBody functionBody = new functionBody();

        if (ctx.children != null) {
            for (ParseTree child : ctx.children) {
                ASTNode stmt = null;

                if (child instanceof AngParser.VariableStatementContext) {
                    stmt = visitVariableStatement((AngParser.VariableStatementContext) child);
                } else if (child instanceof AngParser.PrintStatementContext) {
                    stmt = visitPrintStatement((AngParser.PrintStatementContext) child);
                } else if (child instanceof AngParser.ThisCallStatementContext) {
                    stmt = visitThisCallStatement((AngParser.ThisCallStatementContext) child);
                } else if (child instanceof AngParser.CallFunStatementContext) {
                    stmt = visitCallFunStatement((AngParser.CallFunStatementContext) child);
                }

                if (stmt != null) {
                    functionBody.addStatement(stmt);
                }
            }
        }
        return functionBody;
    }

    @Override
    public ASTNode visitVariableStatement(AngParser.VariableStatementContext ctx) {
         Statement statement = new Statement();
         statement.setVariable((Variable) visit(ctx.variable()));
         return statement;
    }

    @Override
    public ASTNode visitThisCallStatement(AngParser.ThisCallStatementContext ctx) {
        Statement statement = new Statement();
        statement.setCall((thisCall) visit(ctx.thisCall()));
        return statement;
    }

    @Override
    public ASTNode visitPrintStatement(AngParser.PrintStatementContext ctx) {
         Statement statement = new Statement();
         statement.setPrintt((Print) visit(ctx.print()));
         return statement;
    }

    @Override
    public ASTNode visitCallFunStatement(AngParser.CallFunStatementContext ctx) {
        Statement statement = new Statement();
        statement.setCallFun((callFun) visit(ctx.callFun()));
        return statement;
    }

    @Override
    public ASTNode visitThisCall(AngParser.ThisCallContext ctx) {

        thisCall call= new thisCall();

        String propertyName = null;
        if (ctx.ID() != null) {
            propertyName = ctx.ID().toString();
            call.setId(propertyName);
        }

        if (ctx.variableValue() != null) {
            call.setVariableValues((VariableValue) visit(ctx.variableValue()));
        }

        List<dotdot> dots = new ArrayList<>();
        for (AngParser.DotdotContext dotdotContext : ctx.dotdot()) {
            if (dotdotContext != null) {
                dots.add((dotdot) visit(dotdotContext));
            }
        }
        call.setDotdots(dots);

        StringBuilder valueStr = new StringBuilder();
        if (call.getId() != null) {
            valueStr.append("id: ").append(call.getId());
        }

        if (call.getVariableValues() != null) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("variableValues: ").append(call.getVariableValues());
        }

        if (!dots.isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("dotdots: ").append(dots);
        }

        return call;
    }

    @Override
    public dotdot visitDotdot(AngParser.DotdotContext ctx) {
        dotdot dot = new dotdot();

        if (ctx.ID() != null) {
            dot.setId(ctx.ID().getText());
        }
        if (ctx.SingleLineString() != null && !ctx.SingleLineString().isEmpty()) {
            List<String> strings = ctx.SingleLineString().stream()
                    .map(ParseTree::getText).collect(toList());
            dot.setStrings(strings);
        }

        List<vv> vvs = new ArrayList<>();
        List<AngParser.VvContext> vvContexts = (List<AngParser.VvContext>) ctx.vv();
        for (AngParser.VvContext vvContext : vvContexts) {
            if (vvContext != null) {
                vvs.add((vv) visit(vvContext));
            }
        }
        dot.setVvs(vvs);

        List<function2> function2s = new ArrayList<>();
        List<AngParser.Function2Context> function2Contexts = (List<AngParser.Function2Context>) ctx.function2();
        for (AngParser.Function2Context function2Context : function2Contexts) {
            if (function2Context != null) {
                function2s.add((function2) visit(function2Context));
            }
        }
        dot.setFunction2s(function2s);

        StringBuilder valueStr = new StringBuilder();

        if (dot.getId() != null) {
            valueStr.append("id: ").append(dot.getId());
        }

        if (dot.getStrings() != null && !dot.getStrings().isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("strings: ").append(dot.getStrings());
        }

        if (!dot.getVvs().isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("vvs: ").append(dot.getVvs());
        }

        if (!dot.getFunction2s().isEmpty()) {
            if (valueStr.length() > 0) valueStr.append(", ");
            valueStr.append("function2s: ").append(dot.getFunction2s());
        }

        return dot;
    }

    @Override
    public Print visitPrint(AngParser.PrintContext ctx) {
        Print print = new Print();

        if (ctx.SingleLineString() != null) {
            String raw = ctx.SingleLineString().getText();
            String unquoted = raw.substring(1, raw.length() - 1);
            print.setString(unquoted);
        }
        if (ctx.thisCall() !=null) {
            print.setThisCall((thisCall) visit(ctx.thisCall()));
        }

        StringBuilder value = new StringBuilder();

        if (print.getString() != null) {
            value.append("string: ").append(print.getString());
        }

        if (print.getThisCall() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("thisCall: ").append(print.getThisCall());
        }


        return print;
    }

    @Override
    public returnStatement visitReturnStatement(AngParser.ReturnStatementContext ctx) {
        returnStatement statement = new returnStatement();

        if (ctx.thisCall() != null){
            statement.setThisCall((thisCall) visit(ctx.thisCall()));
        }
        if (ctx.ID() != null) {
            statement.setId(ctx.ID().getText());
        }
        if (ctx.SingleLineString() != null) {
            statement.setString(ctx.SingleLineString().getText());
        }
        if (ctx.DECIMEL() != null) {
            statement.setDecimal(Integer.parseInt(ctx.DECIMEL().getText()));
        }
        if (ctx.array() != null) {
            statement.setArray((Array) visit(ctx.array()));
        }

        StringBuilder value = new StringBuilder();

        if (statement.getId() != null) {
            value.append("id: ").append(statement.getId());
        }
        if (statement.getString() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("string: ").append(statement.getString());
        }
        if (statement.getDecimal() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("decimal: ").append(statement.getDecimal());
        }
        if (statement.getArray() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("array: ").append(statement.getArray());
        }
        if (statement.getThisCall() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("thisCall: ").append(statement.getThisCall());
        }

        return statement;
    }

    @Override
    public html visitHtml(AngParser.HtmlContext ctx) {
        html html = new html();
        html.setTagName(ctx.SYNTAX().get(0) != null ? ctx.SYNTAX().get(0).toString() : null);
        if (ctx.htmlinside() != null) {
            html.setHtmlInside((htmlInside) visit(ctx.htmlinside()));
        }

        if (ctx.htmlContent() != null && !ctx.htmlContent().isEmpty()){
            List<htmlContent> contentList = new ArrayList<>();
            for (AngParser.HtmlContentContext contentContext : ctx.htmlContent()) {
                htmlContent content = (htmlContent) visit(contentContext);
                contentList.add(content);
            }
            html.setContents(contentList);
        }
        return html;
    }

    @Override
    public htmlExpression visitCallExpression(AngParser.CallExpressionContext ctx) {
       callExpression callExpression = new callExpression();

        if (ctx.ID() != null) {
            callExpression.setLabel(ctx.ID().getText());
        }
        if (ctx.callFun() != null) {
            callExpression.setFunction((callFun) visit(ctx.callFun()));
        }

        if (!htmlStack.isEmpty()) htmlStack.peek().getContents().add(callExpression);
        else if (!htmlInsideStack.isEmpty()) htmlInsideStack.peek().getChildrens().add(callExpression);

        return  callExpression;
    }

    @Override
    public htmlExpression visitDotExpression(AngParser.DotExpressionContext ctx){
        dotExpression dotExpression = new dotExpression();
        if (ctx.htmlDot() != null) {
            dotExpression.setHtmlDot((htmlDot) visit(ctx.htmlDot()));
        }
        if (!htmlStack.isEmpty()) htmlStack.peek().getContents().add(dotExpression);
        else if (!htmlInsideStack.isEmpty()) htmlInsideStack.peek().getChildrens().add(dotExpression);

        return dotExpression;
    }

    @Override
    public htmlExpression visitVarExpression(AngParser.VarExpressionContext ctx) {
        varExpression varExpression = new varExpression();
        if (ctx.htmlVar() != null) {
            varExpression.setHtmlVar((htmlVar) visit(ctx.htmlVar()));
        }
        if (!htmlStack.isEmpty()) htmlStack.peek().getContents().add(varExpression);
        else if (!htmlInsideStack.isEmpty()) htmlInsideStack.peek().getChildrens().add(varExpression);

        return varExpression;
    }

    @Override
    public htmlDot visitHtmlDot(AngParser.HtmlDotContext ctx) {

        htmlDot dot = new htmlDot();
        List<TerminalNode> ids = ctx.ID();
        if (ids.size() == 2) {

            String idLeft = ids.get(0).getText();
            String idRight = ids.get(1).getText();
            dot.setIdLeft(idLeft);
            dot.setIdright(idRight);
        } else if (ids.isEmpty()) {

            dot.setIdLeft(null);
            dot.setIdright(null);
        } else {

            throw new IllegalStateException("call fun must have either two IDs (idLeft and idRight) or none.");
        }

        StringBuilder value = new StringBuilder();

        if (dot.getIdLeft() != null) {
            value.append("idLeft: ").append(dot.getIdLeft());
        }
        if (dot.getIdright() != null) {
            if (!value.isEmpty()) value.append(", ");
            value.append("idRight: ").append(dot.getIdright());
        }

        if (value.isEmpty()) {
            value.append("No IDs defined");
        }

        return dot;
    }

    @Override
    public htmlVar visitHtmlVar(AngParser.HtmlVarContext ctx) {
        htmlVar var = new htmlVar();
       List<String> nameParts = new ArrayList<>();
       if (ctx.ID() != null && !ctx.ID().isEmpty()) {
           nameParts.add(ctx.ID(0).getText());
           for (int i = 1; i < ctx.ID().size();i++) {
               nameParts.add(ctx.ID(i).getText());
           }
       }
       var.setNameParts(nameParts);
        return var;
    }

    @Override
    public htmlInside visitHtmlinside(AngParser.HtmlinsideContext ctx) {

        htmlInside inside = new htmlInside();

        if (ctx.sy() != null) {
            inside.setProperty(ctx.sy().getText());
        }

        List<htmlId> ids = new ArrayList<>();
        for (AngParser.HtmlIDContext idContext : ctx.htmlID()) {
            if (idContext != null) {
                ids.add((htmlId) visit(idContext));
            }
        }
        inside.setHtmlIds(ids);
        List<htmlClass> classes = new ArrayList<>();
        for (AngParser.HtmlClassContext classContext : ctx.htmlClass()) {
            if (classContext != null) {
                classes.add((htmlClass) visit(classContext));
            }
        }
        inside.setHtmlClasses(classes);


        StringBuilder value = new StringBuilder();

        if (!ids.isEmpty()) {
            if (value.length() > 0) value.append(", ");
            value.append("ids: ").append(ids);
        }

        if (!classes.isEmpty()) {
            if (value.length() > 0) value.append(", ");
            value.append("classes: ").append(classes);
        }

        return inside;
    }

    @Override
    public htmlId visitHtmlID(AngParser.HtmlIDContext ctx) {

        htmlId id= new htmlId();
        if (ctx.MULTI() != null) {
            id.setIsMulti(ctx.MULTI().getText());
        }
        id.setId(ctx.ID().getText());
        id.setValue2((Value2) visit(ctx.value2()));


        StringBuilder value = new StringBuilder();
        value.append("id: ").append(id.getId());

        if (id.getIsMulti() != null) {
            value.append(", isMulti: ").append(id.getIsMulti());
        }

        if (id.getValue2() != null) {
            value.append(", value2: ").append(id.getValue2());
        }
        return id;
    }

    @Override
    public htmlClass visitHtmlClass(AngParser.HtmlClassContext ctx) {
        htmlClass htmlClass = new htmlClass();
        htmlClass.setClassName(ctx.CLASS().getText());
        htmlClass.setValue2((Value2) visit(ctx.value2()));

        StringBuilder value = new StringBuilder();
        value.append("className: ").append(htmlClass.getClassName());

        if (htmlClass.getValue2() != null) {
            value.append(", value2: ").append(htmlClass.getValue2());
        }
        return htmlClass;
    }

    @Override
    public sy visitSy(AngParser.SyContext ctx) {
        sy sy =new sy();
        sy.setId(ctx.ID().getText());


        StringBuilder value = new StringBuilder();
        value.append("id: ").append(sy.getId());

        return sy;
    }

    @Override
    public Value2 visitOnClickValue(AngParser.OnClickValueContext ctx) {
        Value2 value2 = new Value2();
        value2.setOnClick((OnClick) visit(ctx.onClick()));
        return value2;
    }

    @Override
    public Value2 visitAttributedValue(AngParser.AttributedValueContext ctx) {
        Value2 value2 = new Value2();
        value2.setAttributeValue((attributeValue) visit(ctx.attributeValue()));
        return value2;
    }

    @Override
    public Value2 visitPropertyAccessValue(AngParser.PropertyAccessValueContext ctx) {
        Value2 value2 = new Value2();
        value2.setIdLeft(ctx.ID(0).getText());
        value2.setIdRight(ctx.ID(1).getText());
        return value2;
    }


    @Override
    public OnClick visitOnClick(AngParser.OnClickContext ctx) {
        OnClick click = new OnClick();
        click.setFunction2((function2) visit(ctx.function2()));
        click.setId(ctx.ID().getText());

        StringBuilder value = new StringBuilder();
        if (click.getId() != null) {
            value.append("id: ").append(click.getId());
        }
        if (click.getFunction2() != null) {
            if (!value.isEmpty()) value.append(", ");
            value.append("function2: ").append(click.getFunction2());
        }
        return click;
    }

    @Override
    public attributeValue visitAttributeValue(AngParser.AttributeValueContext ctx) {
        attributeValue attributeValue = new attributeValue();
        if (ctx.SingleLineString() != null) {
            attributeValue.setString(ctx.SingleLineString().getText());
        }
        if (ctx.ID() != null) {
            attributeValue.setId(ctx.ID().getText());
        }
        if (ctx.NUMBER() != null) {
            attributeValue.setNumber(ctx.NUMBER().getText());
        }


        StringBuilder value = new StringBuilder();
        if (attributeValue.getString() != null) {
            value.append("string: ").append(attributeValue.getString());
        }
        if (attributeValue.getId() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("id: ").append(attributeValue.getId());
        }
        if (attributeValue.getNumber() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("number: ").append(attributeValue.getNumber());
        }

        return attributeValue;

    }

    @Override
    public hh visitHh(AngParser.HhContext ctx) {
        hh h = new hh();
        h.setId(ctx.ID().getText());
        h.setHtml((html) visit(ctx.html()));

        StringBuilder value = new StringBuilder();
        if (h.getId() != null) {
            value.append("id: ").append(h.getId());
        }
        if (h.getHtml() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("html: ").append(h.getHtml().toString());
        }
        return h;
    }

    @Override
    public htmlBody visitMapHtmlBody(AngParser.MapHtmlBodyContext ctx) {
        htmlBody body = new htmlBody();
        body.setMapMethod2((mapMethod2) visit(ctx.mapMethod2()));

        StringBuilder value = new StringBuilder();
        if (body.getMapMethod2() != null) {
            value.append("mapMethod2: ").append(body.getMapMethod2().toString());
        }

        return body;
    }

    @Override
    public htmlBody visitIfHtmlBody(AngParser.IfHtmlBodyContext ctx) {
        htmlBody body = new htmlBody();
        body.setHh((hh) visit(ctx.hh()));

        StringBuilder value = new StringBuilder();
        if (body.getHh() != null) {
            value.append("hh: ").append(body.getHh().toString());
        }

        return body;
    }

    @Override
    public mapMethod2 visitMapMethod2(AngParser.MapMethod2Context ctx) {
        mapMethod2 map = new mapMethod2();
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> strings = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            map.setIds(strings);

        }
        map.setMapParam((mapParam) visit(ctx.mapParam()));
        map.setHtml((html) visit(ctx.html()));


        StringBuilder value = new StringBuilder();
        if (map.getIds() != null && !map.getIds().isEmpty()) {
            value.append("ids: ").append(String.join(", ", map.getIds()));
        }
        if (map.getMapParam() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("mapParam: ").append(map.getMapParam().toString());
        }
        if (map.getHtml() != null) {
            if (value.length() > 0) value.append(", ");
            value.append("html: ").append(map.getHtml().toString());
        }
        return map;

    }

  @Override
  public callFun visitNavigateStatement(AngParser.NavigateStatementContext ctx) {
        navigateCall nav = new navigateCall();
        nav.setAwait(ctx.AWAIT() != null);

      if (ctx.navigateCall() != null && ctx.navigateCall().SingleLineString() != null) {
          nav.setPath(ctx.navigateCall().SingleLineString().getText());
      }
      if (ctx.navigateCall() != null && ctx.navigateCall().stateParam() != null) {
          nav.setStateParam((stateParam) visit(ctx.navigateCall().stateParam()));
      }
      return  nav;
  }

    @Override
    public callFun visitRouterStatement(AngParser.RouterStatementContext ctx) {
        routerCall router = new routerCall();
        router.setAwait(ctx.AWAIT() != null);

        if (ctx.routerCall() != null && ctx.routerCall().routerName() != null) {
            if (ctx.routerCall().routerName().ID() != null) {
                router.setRouterName(ctx.routerCall().routerName().ID().getText());
            } else if (ctx.routerCall().routerName().ROUTER() != null) {
                router.setRouterName(ctx.routerCall().routerName().ROUTER().getText());
            }
        }

        if (ctx.routerCall() != null && ctx.routerCall().SingleLineString() != null) {
            router.setPath(ctx.routerCall().SingleLineString().getText());
        }

        if (ctx.routerCall() != null && ctx.routerCall().stateParam() != null) {
            router.setStateParam((stateParam) visit(ctx.routerCall().stateParam()));
        }

        return router;
    }

    @Override
    public routerName visitRouterName(AngParser.RouterNameContext ctx) {
        routerName routerName = new routerName();
        if (ctx.ID() != null) {
            routerName.setName(ctx.ID().getText());
        }else if (ctx.ROUTER() != null) {
            routerName.setName(ctx.ROUTER().getText());
        }else {
            routerName.setName("unknown");
        }
        return routerName;
    }

    @Override
    public ASTNode visitStateParam(AngParser.StateParamContext ctx) {
        List<stateParam> params = new ArrayList<>();

        for (int i =0 ; i < ctx.ID().size(); i++) {
            stateParam param = new stateParam();

            String key = ctx.ID(i).getText();
            param.setKey(key);
            int valueIndex = 2 + i * 4;

            ParseTree valueNode = ctx.getChild(valueIndex);


            ASTNode value = (ASTNode) visit(valueNode);
            param.setValue(value);
            params.add(param);
        }

StateParamsContainer container = new StateParamsContainer();
        container.setParams(params);
        return container;

    }
    @Override
    public mapParam visitMapParam(AngParser.MapParamContext ctx) {
        mapParam param = new mapParam();
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> strings = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            param.setIds(strings);
        }

        return param;
    }

    @Override
    public cssCode visitCssCode(AngParser.CssCodeContext ctx) {
        cssCode code = new cssCode();

        List<cssKey> keys = new ArrayList<>();
        for (AngParser.CssKeyContext cssKeyContext : ctx.cssKey()) {
            if (cssKeyContext != null) {
                cssKey key = (cssKey) visit(cssKeyContext);
                keys.add(key);

            }
        }
        code.setCssKeys(keys);
        List<cssInner> inners = new ArrayList<>();
        for (AngParser.CssInnerContext innerContext : ctx.cssInner()) {
            if (innerContext != null) {
                cssInner inner = (cssInner) visit(innerContext);
                inners.add(inner);

            }
        }
        code.setCssInners(inners);

        return code;
    }
    @Override
    public cssInner visitIdCssValue(AngParser.IdCssValueContext ctx) {
        cssInner inner = new cssInner();
        inner.setCssKey((cssKey) visit(ctx.cssKey()));
        inner.setId(ctx.ID().getText());
        return inner;
    }

    @Override
    public cssInner visitNumberCssValue(AngParser.NumberCssValueContext ctx) {
        cssInner inner = new cssInner();
        inner.setCssKey((cssKey) visit(ctx.cssKey()));

        List<String> numbers = ctx.NUMBER().stream()
                .map(ParseTree::getText)
                .collect(Collectors.toList());

        inner.setNumbers(numbers);
        return inner;
    }

    @Override
    public cssInner visitPercentageCssValue(AngParser.PercentageCssValueContext ctx) {
        cssInner inner = new cssInner();
        inner.setCssKey((cssKey) visit(ctx.cssKey()));
        String percentage = ctx.NUMBER().getText() + ctx.HUN().getText();
        inner.setNumber(percentage);
        return inner;
    }

    @Override
    public cssInner visitFunctionCssValue(AngParser.FunctionCssValueContext ctx) {
        cssInner inner = new cssInner();
        inner.setCssKey((cssKey) visit(ctx.cssKey()));
        inner.setCallFun((callFun) visit(ctx.callFun()));
        return inner;
    }


    @Override
    public cssKey visitCssKey(AngParser.CssKeyContext ctx) {
        cssKey key = new cssKey();
        List<sy> sies = new ArrayList<>();
        for (AngParser.SyContext syContext : ctx.sy()) {
            if (syContext != null) {
                sies.add((sy) visit(syContext));
            }
        }
        key.setSies(sies);

        StringBuilder syValues = new StringBuilder();
        for (sy s : sies) {
            if (syValues.length() > 0) syValues.append(", ");
            syValues.append(s.toString());
        }

        return key;
    }

    @Override
    public enum_ visitEnum(AngParser.EnumContext ctx) {
        enum_ e = new enum_();
        sy enumName = (sy) visit(ctx.sy());
        e.setName(enumName);
        String enumScope = (enumName != null) ? enumName.toString() : "anonymous_enum";

        scopeStack.push(enumScope);
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> strings = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            e.setIds(strings);

        }

        return e;
    }

    @Override
    public interfaceCode visitInterfaceCode(AngParser.InterfaceCodeContext ctx) {
        interfaceCode interfaceCode = new interfaceCode();
        sy name = (sy) visit(ctx.sy());
        interfaceCode.setName(name);

        String interfaceScope = name != null ? name.toString() : "anonymous_interface";

        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> strings = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            interfaceCode.setIds(strings);
            for (String id : strings) {
                symbolTable.add(id, "interface_id", "Part of interface " + interfaceScope, getCurrentScope());
            }
        }
        List<vv> vvs = new ArrayList<>();
        for (AngParser.VvContext vvContext : ctx.vv()) {
            if (vvContext != null) {
                vv member = (vv) visit(vvContext);

            }
        }
        interfaceCode.setMembers(vvs);
        return interfaceCode;
    }
//this for print AST

    private int level = 0;

/*
        @Override
        public ASTNode visit(ParseTree tree) {
            if (tree == null) return null;

            String indent = " ".repeat(level);
            if (tree.getClass().getSimpleName().equals("TerminalNodeImpl")) {
                 String text = tree.getText();
                System.out.println(indent + text);


                return null;
            }

            System.out.println(indent + tree.getClass().getSimpleName() + ": ");
           if (tree.getChildCount() == 0) {
               System.out.println(tree.getText());
           }else {
               System.out.println("{");
               level++;
               for (int i = 0; i < tree.getChildCount(); i++) {
                   visit(tree.getChild(i));
               }
               level--;
               System.out.println(indent + "}");

           }
            return null;
        }

 */
    private boolean isIdentifier(String text) {
        return text.matches("[a-zA-Z_][a-zA-Z0-9_]*");  // Example: check for valid variable names
    }

}