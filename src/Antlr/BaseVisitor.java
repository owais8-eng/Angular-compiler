package Antlr;

import AST.*;
import AST.Map;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.xml.transform.sax.SAXResult;
import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.teeing;
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
    public decorater visitComponentDecorator(AngParser.ComponentDecoratorContext ctx) {
        decorater decorater = new decorater();
        decorater.setType("Component");

        ComponentConfig config = (ComponentConfig) visit(ctx.componentConfig());
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
        String value = null;

        if (ctx != null) {
            if (ctx.SingleLineString() != null) {
                String raw = ctx.SingleLineString().getText();
                value = raw.substring(1, raw.length() - 1); // Remove quotes
            }
            if (value != null) {
                templateUrl.setValue(value);
                symbolTable.add(
                        "templateUrl",
                        "TemplateUrl",
                        value,
                        getCurrentScope()
                );
            }
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
                "Styleurls",
                "Styleurls",
                String.join(",",values),
                getCurrentScope()
        );
        return styleUrls;
    }
//------symbol-----
    @Override
    public ASTNode visitSelector(AngParser.SelectorContext ctx) {
        Selector selector = new Selector();
        if (ctx != null &&ctx.SingleLineString() != null) {
            String raw = ctx.SingleLineString().getText();
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
            exports.add(visitExports(ctx.exports().get(i)));

        }
        for (int i =0 ; i<ctx.interfaceCode().size();i++) {
            interfaceCodes.add(visitInterfaceCode(ctx.interfaceCode().get(i)));
        }
        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.setSymbolTable(this.symbolTable);
        boolean isValid =  semanticCheck.check(symbolTable);
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

        String scope = "class" + exports.getIds().get(0);
        scopeStack.push(scope);
        scopeStack.pop();

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
        for (int i =0 ; i < ctx.children.size(); i+= 2) {
            String key = ctx.children.get(i).getText();
            if (i +1 < ctx.children.size()) {
                ASTNode value = visit(ctx.children.get(i + 1));
                map.addEntry(key, value);
            }else {
                throw new IllegalArgumentException("Invalid map structure: missing value for key" + key);

            }
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
        String raw = ctx.DECIMEL().getText();

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
    public Variable visitVariable(AngParser.VariableContext ctx) {
        Variable variable = new Variable();
        String variableType = "any";

        if (ctx.getChildCount() > 1) {
            String secondChildText = ctx.getChild(1).getText();
            if (secondChildText.equals("public") || secondChildText.equals("private")) {
                variable.setModifier(secondChildText);
            }
        }

        if (ctx.getChildCount() > 0) {
            String firstChildText = ctx.getChild(0).getText();
            if (firstChildText.equals("let") || firstChildText.equals("var") || firstChildText.equals("const")) {
                variable.setVisibility(firstChildText);
            }
        }

        if (ctx.DATATYPE_() != null) {
            variableType = ctx.DATATYPE_().getText();
        }
        if (ctx.ID() != null) {
            variable.setName(ctx.ID().getText());
        }else {
            throw new IllegalArgumentException("Variable ID cannot be null");
        }

        if (ctx.vv() != null) {
            variable.setVvs((vv) visit(ctx.vv()));
        }

        List<dd> dds = ctx.dd().stream()
                .filter(Objects::nonNull)
                .map(ddContext -> (dd) visit(ddContext))
                .collect(Collectors.toList());
        variable.setDds(dds);



        StringBuilder value = new StringBuilder();

        if (variable.getModifier() != null) {
            value.append(", modifier: ").append(variable.getModifier());
        }
        if (variable.getVisibility() != null) {
            value.append(", visibility: ").append(variable.getVisibility());
        }
        if (variable.getVvs() != null) {
            value.append(", vv: ").append(variable.getVvs().toString());
        }
        if (!dds.isEmpty()) {
            value.append(", dds: ").append(dds.toString());
        }

        String actualValue = "";
        if (ctx.variableValue() != null) {
            actualValue = ctx.variableValue().getText();
            value.append(actualValue);
        }

        return variable;
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
        if (ctx.ID() != null) {
            fun.setName(ctx.ID().getText());
        }
        String functionScopeName = ctx.ID() != null ? ctx.ID().getText() : "anynomous function";
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


        StringBuilder valueStr = new StringBuilder();
        valueStr.append("name: ").append(fun.getName());
        if (!params.isEmpty()) {
            valueStr.append(", params: ").append(params);
        }
        String declaredReturnType = "void";
        if (ctx.DATATYPE_() != null){
            declaredReturnType = ctx.DATATYPE_().getText();
        }else if (fun.getVv() != null) {
            declaredReturnType = fun.getVv().toString();
        } else if (!fun.getDdList().isEmpty()) {
            declaredReturnType = fun.getDdList().toString();
        }
        if (fun.getFunctionBody() != null) {
            valueStr.append(", functionBody: ").append(fun.getFunctionBody());
        }

        if (fun.getReturnStatement() != null) {
            valueStr.append("return statement:").append(fun.getReturnStatement());
        }
        String actualReturnType;
        returnStatement retStmt = fun.getReturnStatement();

        if (retStmt != null) {
            actualReturnType = inferTypeFromReturn(retStmt);
        } else if (fun.getVv() != null) {
            actualReturnType = fun.getVv().toString(); // declared return type fallback
        } else if (!fun.getDdList().isEmpty()) {
            actualReturnType = fun.getDdList().get(0).toString(); // fallback
        } else {
            actualReturnType = "void";
        }


        symbolTable.add(
                fun.getName(),
                "function",
                declaredReturnType + ":"+ actualReturnType,
                functionScopeName);
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
        param.setVv((vv) visit(ctx.vv()));
        if (ctx.ID() != null) {
            param.setId(ctx.ID().getText());
        }
        scopeStack.pop();
        return param;

    }

    @Override
    public functionBody visitFunctionBody(AngParser.FunctionBodyContext ctx) {
       functionBody functionBody = new functionBody();
        List<Statement> statements = new ArrayList<>();
        for (AngParser.StatementContext statementContext : ctx.statement()) {
            if (statementContext != null) {
                statements.add((Statement) visit(statementContext));
            }
        }
        functionBody.setStatements(statements);
        return  functionBody;
    }


    @Override
    public Statement visitVariableStatement(AngParser.VariableStatementContext ctx) {
         Statement statement = new Statement();
         statement.setVariable((Variable) visit(ctx.variable()));
         return statement;
    }

    @Override
    public Statement visitThisCallStatement(AngParser.ThisCallStatementContext ctx) {
        Statement statement = new Statement();
        statement.setCall((thisCall) visit(ctx.thisCall()));
        return statement;
    }

    @Override
    public Statement visitPrintStatement(AngParser.PrintStatementContext ctx) {
         Statement statement = new Statement();
         statement.setPrintt((Print) visit(ctx.print()));
         return statement;
    }

    @Override
    public Statement visitCallFunStatement(AngParser.CallFunStatementContext ctx) {
        Statement statement = new Statement();
        statement.setCallFun((callFun) visit(ctx.callFun()));
        return statement;
    }

    @Override
    public thisCall visitThisCall(AngParser.ThisCallContext ctx) {

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
        html.setTagName(ctx.SYNTAX().toString());
        html.setBody((htmlBody) visit(ctx.htmlBody()));
        html.setDot((htmlDot) visit(ctx.htmlDot()));
        html.setVar((htmlVar) visit(ctx.htmlVar()));
        List<html> htmls = new ArrayList<>();
        for (AngParser.HtmlContext htmlContext : ctx.html()) {
            if (htmlContext != null) {
                htmls.add((html) visit(htmlContext));
            }
        }
        htmls.add(html);
        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> strings = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            html.setIds(strings);

        }
        html.setHtmlInside((htmlInside) visit(ctx.htmlinside()));

        StringBuilder value = new StringBuilder();

        if (html.getIds() != null && !html.getIds().isEmpty()) {
            value.append("ids: ").append(html.getIds());
        }

        if (html.getTagName() != null) {
            value.append(", tagName: ").append(html.getTagName());
        }
        if (html.getBody() != null) {
            value.append(", body: ").append(html.getBody());
        }
        if (html.getHtmlInside() != null) {
            value.append(", htmlInside: ").append(html.getHtmlInside());
        }

        return html;
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
        var.setId(ctx.ID().getText());

        return var;
    }

    @Override
    public htmlInside visitHtmlinside(AngParser.HtmlinsideContext ctx) {

        htmlInside inside = new htmlInside();
        if (ctx.sy() != null) {
            inside.setSy((sy) visit(ctx.sy()));
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
        if (inside.getSy() != null) {
            value.append("sy: ").append(inside.getSy());
        }

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
    public callFun visitCallFun(AngParser.CallFunContext ctx) {
        callFun callFun = new callFun();

        if (ctx.ID() != null) {
            callFun.setId(ctx.ID().toString());

        }
        List<TerminalNode> ids = ctx.ID();
        if (ids.size() == 2) {

            String idLeft = ids.get(0).getText();
            String idRight = ids.get(1).getText();
            callFun.setIdLeft(idLeft);
            callFun.setIdRight(idRight);
        } else if (ids.isEmpty()) {

            callFun.setIdLeft(null);
            callFun.setIdRight(null);
        } else {

            throw new IllegalStateException("call fun must have either two IDs (idLeft and idRight) or none.");
        }
        if (ctx.SingleLineString() != null && !ctx.SingleLineString().isEmpty()) {
            List<String> strings = ctx.SingleLineString().stream()
                    .map(ParseTree::getText).collect(toList());
            callFun.setStrings(strings);

        }

        if (ctx.ID() != null && !ctx.ID().isEmpty()) {
            List<String> identifiers = ctx.ID().stream()
                    .map(ParseTree::getText).collect(toList());
            callFun.setStrings(identifiers);
        }
        List<Map> maps = new ArrayList<>();
        for (AngParser.MapContext mapContext : ctx.map()) {
            if (mapContext != null) {
                maps.add((Map) visit(mapContext));
            }
        }
        callFun.setMaps(maps);

        List<callFun> callFuns = new ArrayList<>();
        for (AngParser.CallFunContext callFunContext : ctx.callFun()) {
            if (callFunContext != null) {
                callFuns.add((callFun) visit(callFunContext));
            }
        }
        callFun.setCallFuns(callFuns);
        String name = (ids != null && !ids.isEmpty()) ? ids.get(0).getText() : "anynomous";
        StringBuilder value = new StringBuilder();

        if (callFun.getIdLeft() != null) value.append("idLeft: ").append(callFun.getIdLeft());
        if (callFun.getIdRight() != null) value.append(", idRight: ").append(callFun.getIdRight());

        if (callFun.getStrings() != null && !callFun.getStrings().isEmpty()) {
            value.append(", strings: ").append(callFun.getStrings());
        }

        if (!maps.isEmpty()) value.append(", maps: ").append(maps.toString());
        if (!callFuns.isEmpty()) value.append(", callFuns: ").append(callFuns.toString());

        return callFun;

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
    private boolean isIdentifier(String text) {
        return text.matches("[a-zA-Z_][a-zA-Z0-9_]*");  // Example: check for valid variable names
    }

}