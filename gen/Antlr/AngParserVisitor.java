// Generated from C:/Users/owais/Desktop/Angular-compiler/src/Antlr/AngParser.g4 by ANTLR 4.13.2
package Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(AngParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#importR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportR(AngParser.ImportRContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#exports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExports(AngParser.ExportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code componentDecorator}
	 * labeled alternative in {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDecorator(AngParser.ComponentDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directiveDecorator}
	 * labeled alternative in {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveDecorator(AngParser.DirectiveDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code injectableDecorator}
	 * labeled alternative in {@link AngParser#decorater}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableDecorator(AngParser.InjectableDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#componentConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentConfig(AngParser.ComponentConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#directiveConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveConfig(AngParser.DirectiveConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#injectableConfig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableConfig(AngParser.InjectableConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(AngParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#templateUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrl(AngParser.TemplateUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(AngParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#styleUrls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrls(AngParser.StyleUrlsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(AngParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subValueValue}
	 * labeled alternative in {@link AngParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubValueValue(AngParser.SubValueValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayValue}
	 * labeled alternative in {@link AngParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(AngParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code htmlValue}
	 * labeled alternative in {@link AngParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlValue(AngParser.HtmlValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringSubValue(AngParser.StringSubValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdSubValue(AngParser.IdSubValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberSubValue(AngParser.NumberSubValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cssBlockSubValue}
	 * labeled alternative in {@link AngParser#subValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlockSubValue(AngParser.CssBlockSubValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AngParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVarValue(AngParser.StringVarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberVarValue(AngParser.NumberVarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdVarValue(AngParser.IdVarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVarValue(AngParser.ArrayVarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapVarValue(AngParser.MapVarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisCallVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisCallVarValue(AngParser.ThisCallVarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code func2VarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc2VarValue(AngParser.Func2VarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callFunVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunVarValue(AngParser.CallFunVarValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcVarValue}
	 * labeled alternative in {@link AngParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncVarValue(AngParser.FuncVarValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(AngParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#vv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVv(AngParser.VvContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(AngParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#function2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction2(AngParser.Function2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#dd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDd(AngParser.DdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#functionParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParams(AngParser.FunctionParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(AngParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableStatement(AngParser.VariableStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code thisCallStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisCallStatement(AngParser.ThisCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(AngParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callFunStatement}
	 * labeled alternative in {@link AngParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunStatement(AngParser.CallFunStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#thisCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisCall(AngParser.ThisCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#dotdot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotdot(AngParser.DotdotContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(AngParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(AngParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#htmlDot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDot(AngParser.HtmlDotContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#htmlVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlVar(AngParser.HtmlVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#htmlinside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlinside(AngParser.HtmlinsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#htmlID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlID(AngParser.HtmlIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#htmlClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlClass(AngParser.HtmlClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#sy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSy(AngParser.SyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code onClickValue}
	 * labeled alternative in {@link AngParser#value2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClickValue(AngParser.OnClickValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributedValue}
	 * labeled alternative in {@link AngParser#value2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributedValue(AngParser.AttributedValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyAccessValue}
	 * labeled alternative in {@link AngParser#value2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccessValue(AngParser.PropertyAccessValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#onClick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClick(AngParser.OnClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(AngParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mapHtmlBody}
	 * labeled alternative in {@link AngParser#htmlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapHtmlBody(AngParser.MapHtmlBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifHtmlBody}
	 * labeled alternative in {@link AngParser#htmlBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfHtmlBody(AngParser.IfHtmlBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#hh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHh(AngParser.HhContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#mapMethod2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapMethod2(AngParser.MapMethod2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#mapParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapParam(AngParser.MapParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#callFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFun(AngParser.CallFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#cssCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCode(AngParser.CssCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#cssKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssKey(AngParser.CssKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdCssValue(AngParser.IdCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberCssValue(AngParser.NumberCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code percentageCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentageCssValue(AngParser.PercentageCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCssValue}
	 * labeled alternative in {@link AngParser#cssInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCssValue(AngParser.FunctionCssValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(AngParser.EnumContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngParser#interfaceCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceCode(AngParser.InterfaceCodeContext ctx);
}