// Generated from C:/Users/owais/Desktop/Compiler Project/Angular-compiler/src/Antlr/AngParser.g4 by ANTLR 4.13.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngParser}.
 */
public interface AngParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngParser#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(AngParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(AngParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#importR}.
	 * @param ctx the parse tree
	 */
	void enterImportR(AngParser.ImportRContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#importR}.
	 * @param ctx the parse tree
	 */
	void exitImportR(AngParser.ImportRContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#exports}.
	 * @param ctx the parse tree
	 */
	void enterExports(AngParser.ExportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#exports}.
	 * @param ctx the parse tree
	 */
	void exitExports(AngParser.ExportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code componentDecorator}
	 * labeled alternative in {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecorator(AngParser.ComponentDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code componentDecorator}
	 * labeled alternative in {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecorator(AngParser.ComponentDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directiveDecorator}
	 * labeled alternative in {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveDecorator(AngParser.DirectiveDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directiveDecorator}
	 * labeled alternative in {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveDecorator(AngParser.DirectiveDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code injectableDecorator}
	 * labeled alternative in {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 */
	void enterInjectableDecorator(AngParser.InjectableDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code injectableDecorator}
	 * labeled alternative in {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 */
	void exitInjectableDecorator(AngParser.InjectableDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void enterComponentConfig(AngParser.ComponentConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#componentConfig}.
	 * @param ctx the parse tree
	 */
	void exitComponentConfig(AngParser.ComponentConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#directiveConfig}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveConfig(AngParser.DirectiveConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#directiveConfig}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveConfig(AngParser.DirectiveConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#injectableConfig}.
	 * @param ctx the parse tree
	 */
	void enterInjectableConfig(AngParser.InjectableConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#injectableConfig}.
	 * @param ctx the parse tree
	 */
	void exitInjectableConfig(AngParser.InjectableConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(AngParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(AngParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrl(AngParser.TemplateUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrl(AngParser.TemplateUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(AngParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(AngParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#styleUrls}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrls(AngParser.StyleUrlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#styleUrls}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrls(AngParser.StyleUrlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(AngParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(AngParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subValueValue}
	 * labeled alternative in {@link AngParser#value}.
	 * @param ctx the parse tree
	 */
	void enterSubValueValue(AngParser.SubValueValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subValueValue}
	 * labeled alternative in {@link AngParser#value}.
	 * @param ctx the parse tree
	 */
	void exitSubValueValue(AngParser.SubValueValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link AngParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(AngParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link AngParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(AngParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code htmlValue}
	 * labeled alternative in {@link AngParser#value}.
	 * @param ctx the parse tree
	 */
	void enterHtmlValue(AngParser.HtmlValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code htmlValue}
	 * labeled alternative in {@link AngParser#value}.
	 * @param ctx the parse tree
	 */
	void exitHtmlValue(AngParser.HtmlValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stateValue}
	 * labeled alternative in {@link AngParser#value}.
	 * @param ctx the parse tree
	 */
	void enterStateValue(AngParser.StateValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stateValue}
	 * labeled alternative in {@link AngParser#value}.
	 * @param ctx the parse tree
	 */
	void exitStateValue(AngParser.StateValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void enterStringSubValue(AngParser.StringSubValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void exitStringSubValue(AngParser.StringSubValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void enterIdSubValue(AngParser.IdSubValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void exitIdSubValue(AngParser.IdSubValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberSubValue(AngParser.NumberSubValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberSubValue(AngParser.NumberSubValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cssBlockSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void enterCssBlockSubValue(AngParser.CssBlockSubValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cssBlockSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void exitCssBlockSubValue(AngParser.CssBlockSubValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dotAccessSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void enterDotAccessSubValue(AngParser.DotAccessSubValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dotAccessSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 */
	void exitDotAccessSubValue(AngParser.DotAccessSubValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AngParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AngParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(AngParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(AngParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#updateState}.
	 * @param ctx the parse tree
	 */
	void enterUpdateState(AngParser.UpdateStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#updateState}.
	 * @param ctx the parse tree
	 */
	void exitUpdateState(AngParser.UpdateStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterStringVarValue(AngParser.StringVarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitStringVarValue(AngParser.StringVarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberVarValue(AngParser.NumberVarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberVarValue(AngParser.NumberVarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterIdVarValue(AngParser.IdVarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitIdVarValue(AngParser.IdVarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayVarValue(AngParser.ArrayVarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayVarValue(AngParser.ArrayVarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterMapVarValue(AngParser.MapVarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitMapVarValue(AngParser.MapVarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisCallVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterThisCallVarValue(AngParser.ThisCallVarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisCallVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitThisCallVarValue(AngParser.ThisCallVarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func2VarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterFunc2VarValue(AngParser.Func2VarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func2VarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitFunc2VarValue(AngParser.Func2VarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callFunVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterCallFunVarValue(AngParser.CallFunVarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callFunVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitCallFunVarValue(AngParser.CallFunVarValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterFuncVarValue(AngParser.FuncVarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitFuncVarValue(AngParser.FuncVarValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(AngParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(AngParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#vv}.
	 * @param ctx the parse tree
	 */
	void enterVv(AngParser.VvContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#vv}.
	 * @param ctx the parse tree
	 */
	void exitVv(AngParser.VvContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AngParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AngParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#function2}.
	 * @param ctx the parse tree
	 */
	void enterFunction2(AngParser.Function2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#function2}.
	 * @param ctx the parse tree
	 */
	void exitFunction2(AngParser.Function2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#dd}.
	 * @param ctx the parse tree
	 */
	void enterDd(AngParser.DdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#dd}.
	 * @param ctx the parse tree
	 */
	void exitDd(AngParser.DdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#functionParams}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParams(AngParser.FunctionParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#functionParams}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParams(AngParser.FunctionParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(AngParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(AngParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisCallStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThisCallStatement(AngParser.ThisCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisCallStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThisCallStatement(AngParser.ThisCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(AngParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(AngParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callFunStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallFunStatement(AngParser.CallFunStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callFunStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallFunStatement(AngParser.CallFunStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#thisCall}.
	 * @param ctx the parse tree
	 */
	void enterThisCall(AngParser.ThisCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#thisCall}.
	 * @param ctx the parse tree
	 */
	void exitThisCall(AngParser.ThisCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#dotdot}.
	 * @param ctx the parse tree
	 */
	void enterDotdot(AngParser.DotdotContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#dotdot}.
	 * @param ctx the parse tree
	 */
	void exitDotdot(AngParser.DotdotContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(AngParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(AngParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(AngParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(AngParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#htmlDot}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDot(AngParser.HtmlDotContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#htmlDot}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDot(AngParser.HtmlDotContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#htmlVar}.
	 * @param ctx the parse tree
	 */
	void enterHtmlVar(AngParser.HtmlVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#htmlVar}.
	 * @param ctx the parse tree
	 */
	void exitHtmlVar(AngParser.HtmlVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#htmlinside}.
	 * @param ctx the parse tree
	 */
	void enterHtmlinside(AngParser.HtmlinsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#htmlinside}.
	 * @param ctx the parse tree
	 */
	void exitHtmlinside(AngParser.HtmlinsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#htmlID}.
	 * @param ctx the parse tree
	 */
	void enterHtmlID(AngParser.HtmlIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#htmlID}.
	 * @param ctx the parse tree
	 */
	void exitHtmlID(AngParser.HtmlIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#htmlClass}.
	 * @param ctx the parse tree
	 */
	void enterHtmlClass(AngParser.HtmlClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#htmlClass}.
	 * @param ctx the parse tree
	 */
	void exitHtmlClass(AngParser.HtmlClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#sy}.
	 * @param ctx the parse tree
	 */
	void enterSy(AngParser.SyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#sy}.
	 * @param ctx the parse tree
	 */
	void exitSy(AngParser.SyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code onClickValue}
	 * labeled alternative in {@link AngParser#value2}.
	 * @param ctx the parse tree
	 */
	void enterOnClickValue(AngParser.OnClickValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code onClickValue}
	 * labeled alternative in {@link AngParser#value2}.
	 * @param ctx the parse tree
	 */
	void exitOnClickValue(AngParser.OnClickValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributedValue}
	 * labeled alternative in {@link AngParser#value2}.
	 * @param ctx the parse tree
	 */
	void enterAttributedValue(AngParser.AttributedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributedValue}
	 * labeled alternative in {@link AngParser#value2}.
	 * @param ctx the parse tree
	 */
	void exitAttributedValue(AngParser.AttributedValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyAccessValue}
	 * labeled alternative in {@link AngParser#value2}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAccessValue(AngParser.PropertyAccessValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyAccessValue}
	 * labeled alternative in {@link AngParser#value2}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAccessValue(AngParser.PropertyAccessValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#onClick}.
	 * @param ctx the parse tree
	 */
	void enterOnClick(AngParser.OnClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#onClick}.
	 * @param ctx the parse tree
	 */
	void exitOnClick(AngParser.OnClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(AngParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(AngParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mapHtmlBody}
	 * labeled alternative in {@link AngParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void enterMapHtmlBody(AngParser.MapHtmlBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mapHtmlBody}
	 * labeled alternative in {@link AngParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void exitMapHtmlBody(AngParser.MapHtmlBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifHtmlBody}
	 * labeled alternative in {@link AngParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void enterIfHtmlBody(AngParser.IfHtmlBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifHtmlBody}
	 * labeled alternative in {@link AngParser#htmlBody}.
	 * @param ctx the parse tree
	 */
	void exitIfHtmlBody(AngParser.IfHtmlBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#hh}.
	 * @param ctx the parse tree
	 */
	void enterHh(AngParser.HhContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#hh}.
	 * @param ctx the parse tree
	 */
	void exitHh(AngParser.HhContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#mapMethod2}.
	 * @param ctx the parse tree
	 */
	void enterMapMethod2(AngParser.MapMethod2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#mapMethod2}.
	 * @param ctx the parse tree
	 */
	void exitMapMethod2(AngParser.MapMethod2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#mapParam}.
	 * @param ctx the parse tree
	 */
	void enterMapParam(AngParser.MapParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#mapParam}.
	 * @param ctx the parse tree
	 */
	void exitMapParam(AngParser.MapParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code navigateStatement}
	 * labeled alternative in {@link AngParser#callFun}.
	 * @param ctx the parse tree
	 */
	void enterNavigateStatement(AngParser.NavigateStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code navigateStatement}
	 * labeled alternative in {@link AngParser#callFun}.
	 * @param ctx the parse tree
	 */
	void exitNavigateStatement(AngParser.NavigateStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routerStatement}
	 * labeled alternative in {@link AngParser#callFun}.
	 * @param ctx the parse tree
	 */
	void enterRouterStatement(AngParser.RouterStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routerStatement}
	 * labeled alternative in {@link AngParser#callFun}.
	 * @param ctx the parse tree
	 */
	void exitRouterStatement(AngParser.RouterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#navigateCall}.
	 * @param ctx the parse tree
	 */
	void enterNavigateCall(AngParser.NavigateCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#navigateCall}.
	 * @param ctx the parse tree
	 */
	void exitNavigateCall(AngParser.NavigateCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#routerCall}.
	 * @param ctx the parse tree
	 */
	void enterRouterCall(AngParser.RouterCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#routerCall}.
	 * @param ctx the parse tree
	 */
	void exitRouterCall(AngParser.RouterCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#routerName}.
	 * @param ctx the parse tree
	 */
	void enterRouterName(AngParser.RouterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#routerName}.
	 * @param ctx the parse tree
	 */
	void exitRouterName(AngParser.RouterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#stateParam}.
	 * @param ctx the parse tree
	 */
	void enterStateParam(AngParser.StateParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#stateParam}.
	 * @param ctx the parse tree
	 */
	void exitStateParam(AngParser.StateParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#cssCode}.
	 * @param ctx the parse tree
	 */
	void enterCssCode(AngParser.CssCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#cssCode}.
	 * @param ctx the parse tree
	 */
	void exitCssCode(AngParser.CssCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#cssKey}.
	 * @param ctx the parse tree
	 */
	void enterCssKey(AngParser.CssKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#cssKey}.
	 * @param ctx the parse tree
	 */
	void exitCssKey(AngParser.CssKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 */
	void enterIdCssValue(AngParser.IdCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 */
	void exitIdCssValue(AngParser.IdCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 */
	void enterNumberCssValue(AngParser.NumberCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 */
	void exitNumberCssValue(AngParser.NumberCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code percentageCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 */
	void enterPercentageCssValue(AngParser.PercentageCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code percentageCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 */
	void exitPercentageCssValue(AngParser.PercentageCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCssValue(AngParser.FunctionCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCssValue(AngParser.FunctionCssValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#enum}.
	 * @param ctx the parse tree
	 */
	void enterEnum(AngParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#enum}.
	 * @param ctx the parse tree
	 */
	void exitEnum(AngParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngParser#interfaceCode}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceCode(AngParser.InterfaceCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngParser#interfaceCode}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceCode(AngParser.InterfaceCodeContext ctx);
}