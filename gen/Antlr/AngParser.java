// Generated from C:/Users/owais/Desktop/Compiler Project/Angular-compiler/src/Antlr/AngParser.g4 by ANTLR 4.13.2
package Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, OPEN_SQUARE=2, CLOSE_SQUARE=3, OPEN_BRACE=4, CLOSE_BRACE=5, OPEN_PAREN=6, 
		CLOSE_PAREN=7, AT=8, THIS=9, COLON=10, DOT=11, ARROW=12, EQUAL=13, MINUS=14, 
		NEQUAL=15, NOT=16, OR=17, AND=18, PLUS=19, PLE=20, PLPL=21, QUESTION=22, 
		SIME=23, DOLLAR=24, MULTI=25, SQ=26, S_C=27, D_C=28, B_C=29, PX=30, HUN=31, 
		EXPENSES=32, ENUM=33, COMPONENT=34, DIRECTIVE=35, CONST=36, FUNCTION=37, 
		RETURN=38, PRIVATE=39, PUBLIC=40, INJECTABLE=41, IF=42, ELSE=43, NEW=44, 
		FOR=45, WHILE=46, CLASS=47, VAR=48, NULL=49, LET=50, EXPORT=51, DEFAULT=52, 
		IMPORT=53, DOCUMNET=54, FROM=55, ASYNC=56, AWAIT=57, JSX_OPEN=58, JSX_CLOSE=59, 
		JSX_SLASH=60, WS=61, COMMENT=62, TYPE=63, INTERFACE=64, DATATYPE_=65, 
		SIGNAL=66, RESOURCE=67, IMPLEMENT=68, EXTEND=69, TEMPLATE=70, TEMPLATEURL=71, 
		STYLES=72, SELECTOR=73, PROVIDEDIN=74, PROVIDED_IN_ROOT=75, PROVIDED_IN_PLATFORM=76, 
		PROVIDED_IN_ANY=77, STYLEURL=78, CONSTRUCTOR=79, CONSOLE_=80, LOG_=81, 
		INPUT_=82, ONCHANGE_=83, VALUE_=84, PLACEHOLDER_=85, DISABLED_=86, ONFOCUS_=87, 
		ONCLICK_=88, NAVIGATE=89, ROUTER=90, STATE=91, HEIGHT=92, WIDTH=93, MAP_=94, 
		OPERATION=95, SYNTAX=96, NUMBER=97, SINGLE_QUOTED_STRING=98, HEX_NUMBER=99, 
		DECIMEL=100, SingleLineString=101, MultiLineString=102, ID=103;
	public static final int
		RULE_app = 0, RULE_importR = 1, RULE_exports = 2, RULE_classBody = 3, 
		RULE_decorater = 4, RULE_componentConfig = 5, RULE_directiveConfig = 6, 
		RULE_injectableConfig = 7, RULE_selector = 8, RULE_templateUrl = 9, RULE_template = 10, 
		RULE_styleUrls = 11, RULE_map = 12, RULE_value = 13, RULE_array = 14, 
		RULE_subValue = 15, RULE_variable = 16, RULE_arrayType = 17, RULE_variableName = 18, 
		RULE_updateState = 19, RULE_variableValue = 20, RULE_constructor = 21, 
		RULE_vv = 22, RULE_function = 23, RULE_function2 = 24, RULE_dd = 25, RULE_functionParams = 26, 
		RULE_functionBody = 27, RULE_statement = 28, RULE_thisCall = 29, RULE_dotdot = 30, 
		RULE_print = 31, RULE_returnStatement = 32, RULE_html = 33, RULE_htmlContent = 34, 
		RULE_htmlExpression = 35, RULE_htmlDot = 36, RULE_htmlVar = 37, RULE_htmlinside = 38, 
		RULE_htmlID = 39, RULE_htmlClass = 40, RULE_sy = 41, RULE_value2 = 42, 
		RULE_onClick = 43, RULE_attributeValue = 44, RULE_htmlBody = 45, RULE_hh = 46, 
		RULE_mapMethod2 = 47, RULE_mapParam = 48, RULE_callFun = 49, RULE_navigateCall = 50, 
		RULE_routerCall = 51, RULE_routerName = 52, RULE_stateParam = 53, RULE_cssCode = 54, 
		RULE_cssKey = 55, RULE_cssInner = 56, RULE_enum = 57, RULE_interfaceCode = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "importR", "exports", "classBody", "decorater", "componentConfig", 
			"directiveConfig", "injectableConfig", "selector", "templateUrl", "template", 
			"styleUrls", "map", "value", "array", "subValue", "variable", "arrayType", 
			"variableName", "updateState", "variableValue", "constructor", "vv", 
			"function", "function2", "dd", "functionParams", "functionBody", "statement", 
			"thisCall", "dotdot", "print", "returnStatement", "html", "htmlContent", 
			"htmlExpression", "htmlDot", "htmlVar", "htmlinside", "htmlID", "htmlClass", 
			"sy", "value2", "onClick", "attributeValue", "htmlBody", "hh", "mapMethod2", 
			"mapParam", "callFun", "navigateCall", "routerCall", "routerName", "stateParam", 
			"cssCode", "cssKey", "cssInner", "enum", "interfaceCode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'['", "']'", "'{'", "'}'", "'('", "')'", "'@'", "'this'", 
			"':'", "'.'", "'=>'", "'='", "'-'", "'=!'", "'!'", "'||'", "'&&'", "'+'", 
			"'+='", "'++'", "'?'", "';'", "'$'", "'*'", "'#'", "'''", "'\"'", "'`'", 
			"'px'", "'%'", "'expenses'", "'enum'", "'Component'", "'Directive'", 
			"'const'", "'function'", "'return'", "'private'", "'public'", "'Injectable'", 
			"'if'", "'else'", "'new'", "'for'", "'while'", "'class'", "'var'", "'null'", 
			"'let'", "'export'", "'default'", "'import'", "'document'", "'from'", 
			"'async'", "'await'", "'<'", "'>'", "'/'", null, null, "'type'", "'interface'", 
			null, "'Signal'", "'Resource'", "'implements '", "'extend'", "'template'", 
			"'templateUrl'", "'styles'", "'selector'", "'providedIn'", "''root''", 
			"''platform''", "''any''", "'styleUrl'", "'constructor'", "'console'", 
			"'log'", "'input'", "'onChange'", "'value'", "'placeholder'", "'disabled '", 
			"'onFocus'", "'onclick'", "'navigate'", "'router'", "'state'", "'height'", 
			"'width'", "'map'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMA", "OPEN_SQUARE", "CLOSE_SQUARE", "OPEN_BRACE", "CLOSE_BRACE", 
			"OPEN_PAREN", "CLOSE_PAREN", "AT", "THIS", "COLON", "DOT", "ARROW", "EQUAL", 
			"MINUS", "NEQUAL", "NOT", "OR", "AND", "PLUS", "PLE", "PLPL", "QUESTION", 
			"SIME", "DOLLAR", "MULTI", "SQ", "S_C", "D_C", "B_C", "PX", "HUN", "EXPENSES", 
			"ENUM", "COMPONENT", "DIRECTIVE", "CONST", "FUNCTION", "RETURN", "PRIVATE", 
			"PUBLIC", "INJECTABLE", "IF", "ELSE", "NEW", "FOR", "WHILE", "CLASS", 
			"VAR", "NULL", "LET", "EXPORT", "DEFAULT", "IMPORT", "DOCUMNET", "FROM", 
			"ASYNC", "AWAIT", "JSX_OPEN", "JSX_CLOSE", "JSX_SLASH", "WS", "COMMENT", 
			"TYPE", "INTERFACE", "DATATYPE_", "SIGNAL", "RESOURCE", "IMPLEMENT", 
			"EXTEND", "TEMPLATE", "TEMPLATEURL", "STYLES", "SELECTOR", "PROVIDEDIN", 
			"PROVIDED_IN_ROOT", "PROVIDED_IN_PLATFORM", "PROVIDED_IN_ANY", "STYLEURL", 
			"CONSTRUCTOR", "CONSOLE_", "LOG_", "INPUT_", "ONCHANGE_", "VALUE_", "PLACEHOLDER_", 
			"DISABLED_", "ONFOCUS_", "ONCLICK_", "NAVIGATE", "ROUTER", "STATE", "HEIGHT", 
			"WIDTH", "MAP_", "OPERATION", "SYNTAX", "NUMBER", "SINGLE_QUOTED_STRING", 
			"HEX_NUMBER", "DECIMEL", "SingleLineString", "MultiLineString", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppContext extends ParserRuleContext {
		public List<ImportRContext> importR() {
			return getRuleContexts(ImportRContext.class);
		}
		public ImportRContext importR(int i) {
			return getRuleContext(ImportRContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<ExportsContext> exports() {
			return getRuleContexts(ExportsContext.class);
		}
		public ExportsContext exports(int i) {
			return getRuleContext(ExportsContext.class,i);
		}
		public List<EnumContext> enum_() {
			return getRuleContexts(EnumContext.class);
		}
		public EnumContext enum_(int i) {
			return getRuleContext(EnumContext.class,i);
		}
		public List<InterfaceCodeContext> interfaceCode() {
			return getRuleContexts(InterfaceCodeContext.class);
		}
		public InterfaceCodeContext interfaceCode(int i) {
			return getRuleContext(InterfaceCodeContext.class,i);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public List<CssCodeContext> cssCode() {
			return getRuleContexts(CssCodeContext.class);
		}
		public CssCodeContext cssCode(int i) {
			return getRuleContext(CssCodeContext.class,i);
		}
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_app);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 300898614186608976L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 554721869825L) != 0)) {
				{
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(118);
					importR();
					}
					break;
				case 2:
					{
					setState(119);
					variable();
					}
					break;
				case 3:
					{
					setState(120);
					function();
					}
					break;
				case 4:
					{
					setState(121);
					exports();
					}
					break;
				case 5:
					{
					setState(122);
					enum_();
					}
					break;
				case 6:
					{
					setState(123);
					interfaceCode();
					}
					break;
				case 7:
					{
					setState(124);
					html();
					}
					break;
				case 8:
					{
					setState(125);
					cssCode();
					}
					break;
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportRContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngParser.IMPORT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public TerminalNode FROM() { return getToken(AngParser.FROM, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AngParser.SINGLE_QUOTED_STRING, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public TerminalNode SIGNAL() { return getToken(AngParser.SIGNAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public ImportRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importR; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterImportR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitImportR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitImportR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportRContext importR() throws RecognitionException {
		ImportRContext _localctx = new ImportRContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importR);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IMPORT);
			setState(132);
			match(OPEN_BRACE);
			{
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(133);
					match(ID);
					}
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(134);
						match(COMMA);
						}
						break;
					}
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNAL) {
				{
				setState(142);
				match(SIGNAL);
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(145);
				match(COMMA);
				}
			}

			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				{
				setState(148);
				match(ID);
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(149);
					match(COMMA);
					}
				}

				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(157);
			match(CLOSE_BRACE);
			setState(158);
			match(FROM);
			setState(159);
			match(SINGLE_QUOTED_STRING);
			setState(160);
			match(SIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportsContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngParser.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(AngParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<DecoraterContext> decorater() {
			return getRuleContexts(DecoraterContext.class);
		}
		public DecoraterContext decorater(int i) {
			return getRuleContext(DecoraterContext.class,i);
		}
		public TerminalNode IMPLEMENT() { return getToken(AngParser.IMPLEMENT, 0); }
		public TerminalNode EXTEND() { return getToken(AngParser.EXTEND, 0); }
		public ExportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterExports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitExports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitExports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportsContext exports() throws RecognitionException {
		ExportsContext _localctx = new ExportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(162);
				decorater();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(EXPORT);
			setState(169);
			match(CLASS);
			setState(170);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENT || _la==EXTEND) {
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==IMPLEMENT || _la==EXTEND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				match(ID);
				}
			}

			setState(175);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<InterfaceCodeContext> interfaceCode() {
			return getRuleContexts(InterfaceCodeContext.class);
		}
		public InterfaceCodeContext interfaceCode(int i) {
			return getRuleContext(InterfaceCodeContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(OPEN_BRACE);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1409230309425216L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 549890064385L) != 0)) {
				{
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(178);
					constructor();
					}
					break;
				case 2:
					{
					setState(179);
					variable();
					}
					break;
				case 3:
					{
					setState(180);
					function();
					}
					break;
				case 4:
					{
					setState(181);
					interfaceCode();
					}
					break;
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoraterContext extends ParserRuleContext {
		public DecoraterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorater; }
	 
		public DecoraterContext() { }
		public void copyFrom(DecoraterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveDecoratorContext extends DecoraterContext {
		public TerminalNode AT() { return getToken(AngParser.AT, 0); }
		public TerminalNode DIRECTIVE() { return getToken(AngParser.DIRECTIVE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public DirectiveConfigContext directiveConfig() {
			return getRuleContext(DirectiveConfigContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public DirectiveDecoratorContext(DecoraterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDirectiveDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDirectiveDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDirectiveDecorator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InjectableDecoratorContext extends DecoraterContext {
		public TerminalNode AT() { return getToken(AngParser.AT, 0); }
		public TerminalNode INJECTABLE() { return getToken(AngParser.INJECTABLE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public InjectableConfigContext injectableConfig() {
			return getRuleContext(InjectableConfigContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public InjectableDecoratorContext(DecoraterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterInjectableDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitInjectableDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitInjectableDecorator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDecoratorContext extends DecoraterContext {
		public TerminalNode AT() { return getToken(AngParser.AT, 0); }
		public TerminalNode COMPONENT() { return getToken(AngParser.COMPONENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public ComponentConfigContext componentConfig() {
			return getRuleContext(ComponentConfigContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public ComponentDecoratorContext(DecoraterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterComponentDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitComponentDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitComponentDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoraterContext decorater() throws RecognitionException {
		DecoraterContext _localctx = new DecoraterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decorater);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ComponentDecoratorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(AT);
				setState(190);
				match(COMPONENT);
				setState(191);
				match(OPEN_PAREN);
				setState(192);
				componentConfig();
				setState(193);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				_localctx = new DirectiveDecoratorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(AT);
				setState(196);
				match(DIRECTIVE);
				setState(197);
				match(OPEN_PAREN);
				setState(198);
				directiveConfig();
				setState(199);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				_localctx = new InjectableDecoratorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(AT);
				setState(202);
				match(INJECTABLE);
				setState(203);
				match(OPEN_PAREN);
				setState(204);
				injectableConfig();
				setState(205);
				match(CLOSE_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentConfigContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public TemplateUrlContext templateUrl() {
			return getRuleContext(TemplateUrlContext.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public StyleUrlsContext styleUrls() {
			return getRuleContext(StyleUrlsContext.class,0);
		}
		public ComponentConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterComponentConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitComponentConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitComponentConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentConfigContext componentConfig() throws RecognitionException {
		ComponentConfigContext _localctx = new ComponentConfigContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(OPEN_BRACE);
			setState(210);
			selector();
			setState(211);
			match(COMMA);
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATEURL:
				{
				setState(212);
				templateUrl();
				}
				break;
			case TEMPLATE:
				{
				setState(213);
				template();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(216);
				match(COMMA);
				setState(217);
				styleUrls();
				}
			}

			setState(220);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveConfigContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public DirectiveConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDirectiveConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDirectiveConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDirectiveConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveConfigContext directiveConfig() throws RecognitionException {
		DirectiveConfigContext _localctx = new DirectiveConfigContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_directiveConfig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(OPEN_BRACE);
			setState(223);
			selector();
			setState(224);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InjectableConfigContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode PROVIDEDIN() { return getToken(AngParser.PROVIDEDIN, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public TerminalNode PROVIDED_IN_ROOT() { return getToken(AngParser.PROVIDED_IN_ROOT, 0); }
		public TerminalNode PROVIDED_IN_PLATFORM() { return getToken(AngParser.PROVIDED_IN_PLATFORM, 0); }
		public TerminalNode PROVIDED_IN_ANY() { return getToken(AngParser.PROVIDED_IN_ANY, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public InjectableConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterInjectableConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitInjectableConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitInjectableConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableConfigContext injectableConfig() throws RecognitionException {
		InjectableConfigContext _localctx = new InjectableConfigContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_injectableConfig);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(OPEN_BRACE);
			setState(227);
			match(PROVIDEDIN);
			setState(228);
			match(COLON);
			setState(229);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 67108871L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(230);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(AngParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AngParser.SINGLE_QUOTED_STRING, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(SELECTOR);
			setState(233);
			match(COLON);
			setState(234);
			match(SINGLE_QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlContext extends ParserRuleContext {
		public TerminalNode TEMPLATEURL() { return getToken(AngParser.TEMPLATEURL, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AngParser.SINGLE_QUOTED_STRING, 0); }
		public TemplateUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterTemplateUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitTemplateUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitTemplateUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateUrlContext templateUrl() throws RecognitionException {
		TemplateUrlContext _localctx = new TemplateUrlContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_templateUrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(TEMPLATEURL);
			setState(237);
			match(COLON);
			setState(238);
			match(SINGLE_QUOTED_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(AngParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(TEMPLATE);
			setState(241);
			match(COLON);
			setState(242);
			html();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsContext extends ParserRuleContext {
		public TerminalNode STYLES() { return getToken(AngParser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StyleUrlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleUrls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterStyleUrls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitStyleUrls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitStyleUrls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleUrlsContext styleUrls() throws RecognitionException {
		StyleUrlsContext _localctx = new StyleUrlsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_styleUrls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(STYLES);
			setState(245);
			match(COLON);
			setState(246);
			array();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(AngParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngParser.COLON, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(OPEN_BRACE);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				{
				{
				setState(249);
				match(ID);
				}
				setState(250);
				match(COLON);
				setState(251);
				value();
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(253);
					match(COMMA);
					}
				}

				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapValueContext extends ValueContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public MapValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterMapValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitMapValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitMapValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlValueContext extends ValueContext {
		public List<TerminalNode> B_C() { return getTokens(AngParser.B_C); }
		public TerminalNode B_C(int i) {
			return getToken(AngParser.B_C, i);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public HtmlValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValueContext extends ValueContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubValueValueContext extends ValueContext {
		public SubValueContext subValue() {
			return getRuleContext(SubValueContext.class,0);
		}
		public SubValueValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterSubValueValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitSubValueValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitSubValueValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new SubValueValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				subValue();
				}
				break;
			case 2:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				array();
				}
				break;
			case 3:
				_localctx = new HtmlValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(B_C);
				setState(266);
				html();
				setState(267);
				match(B_C);
				}
				break;
			case 4:
				_localctx = new MapValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				map();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(AngParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngParser.CLOSE_SQUARE, 0); }
		public List<SubValueContext> subValue() {
			return getRuleContexts(SubValueContext.class);
		}
		public SubValueContext subValue(int i) {
			return getRuleContext(SubValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(OPEN_SQUARE);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==B_C || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 5185L) != 0)) {
				{
				{
				setState(273);
				subValue();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(274);
					match(COMMA);
					}
				}

				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(CLOSE_SQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubValueContext extends ParserRuleContext {
		public SubValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subValue; }
	 
		public SubValueContext() { }
		public void copyFrom(SubValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotAccessSubValueContext extends SubValueContext {
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode STATE() { return getToken(AngParser.STATE, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngParser.DOT, i);
		}
		public DotAccessSubValueContext(SubValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDotAccessSubValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDotAccessSubValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDotAccessSubValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdSubValueContext extends SubValueContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public IdSubValueContext(SubValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterIdSubValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitIdSubValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitIdSubValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBlockSubValueContext extends SubValueContext {
		public List<TerminalNode> B_C() { return getTokens(AngParser.B_C); }
		public TerminalNode B_C(int i) {
			return getToken(AngParser.B_C, i);
		}
		public List<CssCodeContext> cssCode() {
			return getRuleContexts(CssCodeContext.class);
		}
		public CssCodeContext cssCode(int i) {
			return getRuleContext(CssCodeContext.class,i);
		}
		public CssBlockSubValueContext(SubValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCssBlockSubValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCssBlockSubValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCssBlockSubValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberSubValueContext extends SubValueContext {
		public TerminalNode NUMBER() { return getToken(AngParser.NUMBER, 0); }
		public NumberSubValueContext(SubValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterNumberSubValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitNumberSubValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitNumberSubValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringSubValueContext extends SubValueContext {
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public StringSubValueContext(SubValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterStringSubValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitStringSubValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitStringSubValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubValueContext subValue() throws RecognitionException {
		SubValueContext _localctx = new SubValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subValue);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new StringSubValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(SingleLineString);
				}
				break;
			case 2:
				_localctx = new IdSubValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(ID);
				}
				break;
			case 3:
				_localctx = new NumberSubValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(NUMBER);
				}
				break;
			case 4:
				_localctx = new CssBlockSubValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(B_C);
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(288);
					cssCode();
					}
					}
					setState(291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67110928L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1033L) != 0) );
				setState(293);
				match(B_C);
				}
				break;
			case 5:
				_localctx = new DotAccessSubValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==STATE || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(296);
					match(DOT);
					setState(297);
					match(ID);
					}
					}
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngParser.EQUAL, 0); }
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode LET() { return getToken(AngParser.LET, 0); }
		public TerminalNode VAR() { return getToken(AngParser.VAR, 0); }
		public TerminalNode CONST() { return getToken(AngParser.CONST, 0); }
		public TerminalNode PRIVATE() { return getToken(AngParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(AngParser.PUBLIC, 0); }
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1407443603030016L) != 0)) {
				{
				setState(304);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1407443603030016L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(307);
				_la = _input.LA(1);
				if ( !(_la==PRIVATE || _la==PUBLIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(310);
			variableName();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(311);
				match(COLON);
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(312);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(313);
					vv();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(314);
					arrayType();
					}
					break;
				case EQUAL:
					break;
				default:
					break;
				}
				}
			}

			setState(319);
			match(EQUAL);
			setState(320);
			variableValue();
			setState(321);
			match(SIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode OPEN_SQUARE() { return getToken(AngParser.OPEN_SQUARE, 0); }
		public TerminalNode CLOSE_SQUARE() { return getToken(AngParser.CLOSE_SQUARE, 0); }
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayType);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				match(OPEN_SQUARE);
				setState(324);
				match(CLOSE_SQUARE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(OPEN_SQUARE);
				setState(326);
				match(DATATYPE_);
				setState(327);
				match(CLOSE_SQUARE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableNameContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngParser.DOT, i);
		}
		public TerminalNode STATE() { return getToken(AngParser.STATE, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variableName);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(ID);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(331);
					match(DOT);
					setState(332);
					match(ID);
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(STATE);
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(339);
					match(DOT);
					setState(340);
					match(ID);
					}
					}
					setState(343); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateStateContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngParser.EQUAL, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public SubValueContext subValue() {
			return getRuleContext(SubValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public UpdateStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterUpdateState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitUpdateState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitUpdateState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStateContext updateState() throws RecognitionException {
		UpdateStateContext _localctx = new UpdateStateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_updateState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			variableName();
			setState(348);
			match(EQUAL);
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case B_C:
			case STATE:
			case NUMBER:
			case SingleLineString:
			case ID:
				{
				setState(349);
				subValue();
				}
				break;
			case OPEN_SQUARE:
				{
				setState(350);
				array();
				}
				break;
			case OPEN_BRACE:
				{
				setState(351);
				map();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(354);
			match(SIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableValueContext extends ParserRuleContext {
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
	 
		public VariableValueContext() { }
		public void copyFrom(VariableValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisCallVarValueContext extends VariableValueContext {
		public ThisCallContext thisCall() {
			return getRuleContext(ThisCallContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public ThisCallVarValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterThisCallVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitThisCallVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitThisCallVarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberVarValueContext extends VariableValueContext {
		public TerminalNode DECIMEL() { return getToken(AngParser.DECIMEL, 0); }
		public TerminalNode NEW() { return getToken(AngParser.NEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public NumberVarValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterNumberVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitNumberVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitNumberVarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncVarValueContext extends VariableValueContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public FuncVarValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFuncVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFuncVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFuncVarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Func2VarValueContext extends VariableValueContext {
		public Function2Context function2() {
			return getRuleContext(Function2Context.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public Func2VarValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunc2VarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunc2VarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunc2VarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdVarValueContext extends VariableValueContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode NEW() { return getToken(AngParser.NEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public IdVarValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterIdVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitIdVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitIdVarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayVarValueContext extends VariableValueContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode NEW() { return getToken(AngParser.NEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public ArrayVarValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterArrayVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitArrayVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitArrayVarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunVarValueContext extends VariableValueContext {
		public CallFunContext callFun() {
			return getRuleContext(CallFunContext.class,0);
		}
		public TerminalNode NEW() { return getToken(AngParser.NEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public CallFunVarValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCallFunVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCallFunVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCallFunVarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapVarValueContext extends VariableValueContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public TerminalNode NEW() { return getToken(AngParser.NEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public MapVarValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterMapVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitMapVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitMapVarValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringVarValueContext extends VariableValueContext {
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode NEW() { return getToken(AngParser.NEW, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public StringVarValueContext(VariableValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterStringVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitStringVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitStringVarValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableValue);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new StringVarValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(356);
					match(NEW);
					}
				}

				setState(359);
				match(SingleLineString);
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(360);
					match(OPEN_PAREN);
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(361);
						vv();
						}
						}
						setState(366);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(367);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new NumberVarValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(370);
					match(NEW);
					}
				}

				setState(373);
				match(DECIMEL);
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(374);
					match(OPEN_PAREN);
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(375);
						vv();
						}
						}
						setState(380);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(381);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new IdVarValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(384);
					match(NEW);
					}
				}

				setState(387);
				match(ID);
				setState(396);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(388);
					match(OPEN_PAREN);
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(389);
						vv();
						}
						}
						setState(394);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(395);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ArrayVarValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(398);
					match(NEW);
					}
				}

				setState(401);
				array();
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(402);
					match(OPEN_PAREN);
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(403);
						vv();
						}
						}
						setState(408);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(409);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new MapVarValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(412);
					match(NEW);
					}
				}

				setState(415);
				map();
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(416);
					match(OPEN_PAREN);
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(417);
						vv();
						}
						}
						setState(422);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(423);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new ThisCallVarValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				thisCall();
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(427);
					match(OPEN_PAREN);
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(428);
						vv();
						}
						}
						setState(433);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(434);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new Func2VarValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(437);
				function2();
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(438);
					match(OPEN_PAREN);
					setState(442);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(439);
						vv();
						}
						}
						setState(444);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(445);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new CallFunVarValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(448);
					match(NEW);
					}
				}

				setState(451);
				callFun();
				setState(460);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(452);
					match(OPEN_PAREN);
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(453);
						vv();
						}
						}
						setState(458);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(459);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new FuncVarValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(462);
				function();
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(463);
					match(OPEN_PAREN);
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(464);
						vv();
						}
						}
						setState(469);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(470);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngParser.CONSTRUCTOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public List<TerminalNode> PRIVATE() { return getTokens(AngParser.PRIVATE); }
		public TerminalNode PRIVATE(int i) {
			return getToken(AngParser.PRIVATE, i);
		}
		public List<TerminalNode> PUBLIC() { return getTokens(AngParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(AngParser.PUBLIC, i);
		}
		public List<TerminalNode> DATATYPE_() { return getTokens(AngParser.DATATYPE_); }
		public TerminalNode DATATYPE_(int i) {
			return getToken(AngParser.DATATYPE_, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(CONSTRUCTOR);
			setState(476);
			match(OPEN_PAREN);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIVATE || _la==PUBLIC || _la==ID) {
				{
				{
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE || _la==PUBLIC) {
					{
					setState(477);
					_la = _input.LA(1);
					if ( !(_la==PRIVATE || _la==PUBLIC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(480);
				vv();
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(481);
					match(COLON);
					setState(482);
					_la = _input.LA(1);
					if ( !(_la==DATATYPE_ || _la==ID) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(485);
					match(COMMA);
					}
				}

				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			match(CLOSE_PAREN);
			setState(494);
			match(OPEN_BRACE);
			setState(495);
			functionBody();
			setState(496);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VvContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public VvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterVv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitVv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitVv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VvContext vv() throws RecognitionException {
		VvContext _localctx = new VvContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_vv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public TerminalNode FUNCTION() { return getToken(AngParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public List<FunctionParamsContext> functionParams() {
			return getRuleContexts(FunctionParamsContext.class);
		}
		public FunctionParamsContext functionParams(int i) {
			return getRuleContext(FunctionParamsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
		public List<TerminalNode> OPEN_SQUARE() { return getTokens(AngParser.OPEN_SQUARE); }
		public TerminalNode OPEN_SQUARE(int i) {
			return getToken(AngParser.OPEN_SQUARE, i);
		}
		public List<TerminalNode> CLOSE_SQUARE() { return getTokens(AngParser.CLOSE_SQUARE); }
		public TerminalNode CLOSE_SQUARE(int i) {
			return getToken(AngParser.CLOSE_SQUARE, i);
		}
		public List<DdContext> dd() {
			return getRuleContexts(DdContext.class);
		}
		public DdContext dd(int i) {
			return getRuleContext(DdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(500);
				match(FUNCTION);
				}
			}

			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(503);
				match(ID);
				}
			}

			setState(506);
			match(OPEN_PAREN);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(507);
				functionParams();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
			match(CLOSE_PAREN);
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(514);
				match(COLON);
				setState(528);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(515);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(516);
					vv();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(517);
					match(OPEN_SQUARE);
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE_) {
						{
						{
						setState(518);
						dd();
						setState(520);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(519);
							match(COMMA);
							}
						}

						}
						}
						setState(526);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(527);
					match(CLOSE_SQUARE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE) {
					{
					setState(530);
					match(OPEN_SQUARE);
					setState(531);
					match(CLOSE_SQUARE);
					}
				}

				}
			}

			setState(536);
			match(OPEN_BRACE);
			setState(537);
			functionBody();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274877907460L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 11L) != 0)) {
				{
				setState(538);
				returnStatement();
				}
			}

			setState(541);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function2Context extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(AngParser.ARROW, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public List<FunctionParamsContext> functionParams() {
			return getRuleContexts(FunctionParamsContext.class);
		}
		public FunctionParamsContext functionParams(int i) {
			return getRuleContext(FunctionParamsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
		public List<TerminalNode> OPEN_SQUARE() { return getTokens(AngParser.OPEN_SQUARE); }
		public TerminalNode OPEN_SQUARE(int i) {
			return getToken(AngParser.OPEN_SQUARE, i);
		}
		public List<TerminalNode> CLOSE_SQUARE() { return getTokens(AngParser.CLOSE_SQUARE); }
		public TerminalNode CLOSE_SQUARE(int i) {
			return getToken(AngParser.CLOSE_SQUARE, i);
		}
		public List<DdContext> dd() {
			return getRuleContexts(DdContext.class);
		}
		public DdContext dd(int i) {
			return getRuleContext(DdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public Function2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunction2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunction2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunction2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function2Context function2() throws RecognitionException {
		Function2Context _localctx = new Function2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_function2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(OPEN_PAREN);
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(544);
				functionParams();
				}
				}
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(550);
			match(CLOSE_PAREN);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(551);
				match(COLON);
				setState(565);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(552);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(553);
					vv();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(554);
					match(OPEN_SQUARE);
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE_) {
						{
						{
						setState(555);
						dd();
						setState(557);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(556);
							match(COMMA);
							}
						}

						}
						}
						setState(563);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(564);
					match(CLOSE_SQUARE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE) {
					{
					setState(567);
					match(OPEN_SQUARE);
					setState(568);
					match(CLOSE_SQUARE);
					}
				}

				}
			}

			setState(573);
			match(ARROW);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(574);
				match(OPEN_BRACE);
				}
			}

			setState(577);
			functionBody();
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(578);
				returnStatement();
				}
				break;
			}
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(581);
				match(CLOSE_BRACE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DdContext extends ParserRuleContext {
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public DdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdContext dd() throws RecognitionException {
		DdContext _localctx = new DdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(DATATYPE_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(AngParser.COMMA, 0); }
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public FunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunctionParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunctionParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunctionParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParamsContext functionParams() throws RecognitionException {
		FunctionParamsContext _localctx = new FunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(ID);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(587);
				match(COLON);
				setState(588);
				_la = _input.LA(1);
				if ( !(_la==DATATYPE_ || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(591);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<UpdateStateContext> updateState() {
			return getRuleContexts(UpdateStateContext.class);
		}
		public UpdateStateContext updateState(int i) {
			return getRuleContext(UpdateStateContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(596);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(594);
						statement();
						}
						break;
					case 2:
						{
						setState(595);
						updateState();
						}
						break;
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableStatementContext extends StatementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitVariableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitVariableStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisCallStatementContext extends StatementContext {
		public ThisCallContext thisCall() {
			return getRuleContext(ThisCallContext.class,0);
		}
		public ThisCallStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterThisCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitThisCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitThisCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunStatementContext extends StatementContext {
		public CallFunContext callFun() {
			return getRuleContext(CallFunContext.class,0);
		}
		public CallFunStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCallFunStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCallFunStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCallFunStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_statement);
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new VariableStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				variable();
				}
				break;
			case 2:
				_localctx = new ThisCallStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				thisCall();
				}
				break;
			case 3:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				print();
				}
				break;
			case 4:
				_localctx = new CallFunStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(604);
				callFun();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThisCallContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(AngParser.THIS, 0); }
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public TerminalNode PLPL() { return getToken(AngParser.PLPL, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngParser.DOT, i);
		}
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public List<DotdotContext> dotdot() {
			return getRuleContexts(DotdotContext.class);
		}
		public DotdotContext dotdot(int i) {
			return getRuleContext(DotdotContext.class,i);
		}
		public ThisCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterThisCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitThisCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitThisCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisCallContext thisCall() throws RecognitionException {
		ThisCallContext _localctx = new ThisCallContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_thisCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(608);
					match(DOT);
					setState(609);
					match(ID);
					setState(611);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(610);
						match(DOT);
						}
						break;
					}
					}
					} 
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(618);
				variableValue();
				}
				break;
			case 2:
				{
				setState(622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(619);
						dotdot();
						}
						} 
					}
					setState(624);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(625);
				match(PLPL);
				}
				break;
			}
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(628);
				match(SIME);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DotdotContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode DOT() { return getToken(AngParser.DOT, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public List<TerminalNode> SingleLineString() { return getTokens(AngParser.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(AngParser.SingleLineString, i);
		}
		public List<Function2Context> function2() {
			return getRuleContexts(Function2Context.class);
		}
		public Function2Context function2(int i) {
			return getRuleContext(Function2Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public DotdotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotdot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDotdot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDotdot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDotdot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotdotContext dotdot() throws RecognitionException {
		DotdotContext _localctx = new DotdotContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dotdot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(631);
				match(DOT);
				setState(632);
				match(ID);
				}
			}

			{
			setState(635);
			match(OPEN_PAREN);
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAREN || _la==SingleLineString || _la==ID) {
				{
				{
				setState(639);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(636);
					vv();
					}
					break;
				case SingleLineString:
					{
					setState(637);
					match(SingleLineString);
					}
					break;
				case OPEN_PAREN:
					{
					setState(638);
					function2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(641);
					match(COMMA);
					}
				}

				}
				}
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(649);
			match(CLOSE_PAREN);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode CONSOLE_() { return getToken(AngParser.CONSOLE_, 0); }
		public TerminalNode DOT() { return getToken(AngParser.DOT, 0); }
		public TerminalNode LOG_() { return getToken(AngParser.LOG_, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public ThisCallContext thisCall() {
			return getRuleContext(ThisCallContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(CONSOLE_);
			setState(652);
			match(DOT);
			setState(653);
			match(LOG_);
			setState(654);
			match(OPEN_PAREN);
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineString:
				{
				setState(655);
				match(SingleLineString);
				}
				break;
			case THIS:
			case ID:
				{
				setState(656);
				thisCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(659);
			match(CLOSE_PAREN);
			setState(660);
			match(SIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ThisCallContext thisCall() {
			return getRuleContext(ThisCallContext.class,0);
		}
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode DECIMEL() { return getToken(AngParser.DECIMEL, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(AngParser.RETURN, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(662);
				match(RETURN);
				}
			}

			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(665);
				thisCall();
				}
				break;
			case 2:
				{
				setState(666);
				match(SingleLineString);
				}
				break;
			case 3:
				{
				setState(667);
				match(DECIMEL);
				}
				break;
			case 4:
				{
				setState(668);
				match(ID);
				}
				break;
			case 5:
				{
				setState(669);
				array();
				}
				break;
			}
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(672);
				match(SIME);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public List<TerminalNode> JSX_OPEN() { return getTokens(AngParser.JSX_OPEN); }
		public TerminalNode JSX_OPEN(int i) {
			return getToken(AngParser.JSX_OPEN, i);
		}
		public List<TerminalNode> JSX_CLOSE() { return getTokens(AngParser.JSX_CLOSE); }
		public TerminalNode JSX_CLOSE(int i) {
			return getToken(AngParser.JSX_CLOSE, i);
		}
		public List<TerminalNode> SYNTAX() { return getTokens(AngParser.SYNTAX); }
		public TerminalNode SYNTAX(int i) {
			return getToken(AngParser.SYNTAX, i);
		}
		public HtmlinsideContext htmlinside() {
			return getRuleContext(HtmlinsideContext.class,0);
		}
		public List<TerminalNode> JSX_SLASH() { return getTokens(AngParser.JSX_SLASH); }
		public TerminalNode JSX_SLASH(int i) {
			return getToken(AngParser.JSX_SLASH, i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_html);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(JSX_OPEN);
			{
			setState(676);
			match(SYNTAX);
			}
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(677);
				htmlinside();
				}
				break;
			}
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX_SLASH) {
				{
				setState(680);
				match(JSX_SLASH);
				}
			}

			setState(683);
			match(JSX_CLOSE);
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(684);
						htmlContent();
						}
						} 
					}
					setState(689);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				setState(690);
				match(JSX_OPEN);
				setState(691);
				match(JSX_SLASH);
				setState(692);
				match(SYNTAX);
				setState(693);
				match(JSX_CLOSE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	 
		public HtmlContentContext() { }
		public void copyFrom(HtmlContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionHtmlContext extends HtmlContentContext {
		public HtmlExpressionContext htmlExpression() {
			return getRuleContext(HtmlExpressionContext.class,0);
		}
		public ExpressionHtmlContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterExpressionHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitExpressionHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitExpressionHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BodyHtmlContext extends HtmlContentContext {
		public HtmlBodyContext htmlBody() {
			return getRuleContext(HtmlBodyContext.class,0);
		}
		public BodyHtmlContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterBodyHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitBodyHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitBodyHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JustHtmlContext extends HtmlContentContext {
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public JustHtmlContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterJustHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitJustHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitJustHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_htmlContent);
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new BodyHtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				htmlBody();
				}
				break;
			case 2:
				_localctx = new JustHtmlContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				html();
				}
				break;
			case 3:
				_localctx = new ExpressionHtmlContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(698);
				htmlExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlExpressionContext extends ParserRuleContext {
		public HtmlExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlExpression; }
	 
		public HtmlExpressionContext() { }
		public void copyFrom(HtmlExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotExpressionContext extends HtmlExpressionContext {
		public HtmlDotContext htmlDot() {
			return getRuleContext(HtmlDotContext.class,0);
		}
		public DotExpressionContext(HtmlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExpressionContext extends HtmlExpressionContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public CallFunContext callFun() {
			return getRuleContext(CallFunContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public CallExpressionContext(HtmlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarExpressionContext extends HtmlExpressionContext {
		public HtmlVarContext htmlVar() {
			return getRuleContext(HtmlVarContext.class,0);
		}
		public VarExpressionContext(HtmlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitVarExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlExpressionContext htmlExpression() throws RecognitionException {
		HtmlExpressionContext _localctx = new HtmlExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_htmlExpression);
		try {
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				_localctx = new CallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				match(ID);
				setState(702);
				match(COLON);
				setState(703);
				match(OPEN_BRACE);
				setState(704);
				callFun();
				setState(705);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				_localctx = new DotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(707);
				htmlDot();
				}
				break;
			case 3:
				_localctx = new VarExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				htmlVar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDotContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(AngParser.DOT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public HtmlDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDotContext htmlDot() throws RecognitionException {
		HtmlDotContext _localctx = new HtmlDotContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_htmlDot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(711);
				match(OPEN_BRACE);
				}
			}

			setState(714);
			match(ID);
			setState(715);
			match(DOT);
			setState(716);
			match(ID);
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(717);
				match(CLOSE_BRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlVarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngParser.DOT, i);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public HtmlVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlVarContext htmlVar() throws RecognitionException {
		HtmlVarContext _localctx = new HtmlVarContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_htmlVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(720);
				match(OPEN_BRACE);
				}
			}

			setState(723);
			match(ID);
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(724);
				match(DOT);
				setState(725);
				match(ID);
				}
				}
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(731);
				match(CLOSE_BRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlinsideContext extends ParserRuleContext {
		public SyContext sy() {
			return getRuleContext(SyContext.class,0);
		}
		public List<HtmlIDContext> htmlID() {
			return getRuleContexts(HtmlIDContext.class);
		}
		public HtmlIDContext htmlID(int i) {
			return getRuleContext(HtmlIDContext.class,i);
		}
		public List<HtmlClassContext> htmlClass() {
			return getRuleContexts(HtmlClassContext.class);
		}
		public HtmlClassContext htmlClass(int i) {
			return getRuleContext(HtmlClassContext.class,i);
		}
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public HtmlinsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlinside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlinside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlinside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlinside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlinsideContext htmlinside() throws RecognitionException {
		HtmlinsideContext _localctx = new HtmlinsideContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_htmlinside);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(734);
				sy();
				}
				break;
			}
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI || _la==CLASS || _la==ID) {
				{
				setState(739);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTI:
				case ID:
					{
					setState(737);
					htmlID();
					}
					break;
				case CLASS:
					{
					setState(738);
					htmlClass();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SingleLineString) {
				{
				setState(744);
				match(SingleLineString);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlIDContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(AngParser.EQUAL, 0); }
		public Value2Context value2() {
			return getRuleContext(Value2Context.class,0);
		}
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode MULTI() { return getToken(AngParser.MULTI, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public HtmlIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlIDContext htmlID() throws RecognitionException {
		HtmlIDContext _localctx = new HtmlIDContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_htmlID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTI) {
				{
				setState(747);
				match(MULTI);
				}
			}

			{
			setState(750);
			match(ID);
			}
			setState(751);
			match(EQUAL);
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(752);
				match(OPEN_BRACE);
				}
				break;
			}
			setState(755);
			value2();
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(756);
				match(CLOSE_BRACE);
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlClassContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(AngParser.EQUAL, 0); }
		public Value2Context value2() {
			return getRuleContext(Value2Context.class,0);
		}
		public TerminalNode CLASS() { return getToken(AngParser.CLASS, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public HtmlClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlClassContext htmlClass() throws RecognitionException {
		HtmlClassContext _localctx = new HtmlClassContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_htmlClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(759);
			match(CLASS);
			}
			setState(760);
			match(EQUAL);
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(761);
				match(OPEN_BRACE);
				}
				break;
			}
			setState(764);
			value2();
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(765);
				match(CLOSE_BRACE);
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public SyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterSy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitSy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitSy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyContext sy() throws RecognitionException {
		SyContext _localctx = new SyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Value2Context extends ParserRuleContext {
		public Value2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value2; }
	 
		public Value2Context() { }
		public void copyFrom(Value2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributedValueContext extends Value2Context {
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributedValueContext(Value2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterAttributedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitAttributedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitAttributedValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessValueContext extends Value2Context {
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(AngParser.DOT, 0); }
		public PropertyAccessValueContext(Value2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterPropertyAccessValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitPropertyAccessValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitPropertyAccessValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OnClickValueContext extends Value2Context {
		public OnClickContext onClick() {
			return getRuleContext(OnClickContext.class,0);
		}
		public OnClickValueContext(Value2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterOnClickValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitOnClickValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitOnClickValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value2Context value2() throws RecognitionException {
		Value2Context _localctx = new Value2Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_value2);
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				_localctx = new OnClickValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				onClick();
				}
				break;
			case 2:
				_localctx = new AttributedValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				attributeValue();
				}
				break;
			case 3:
				_localctx = new PropertyAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(772);
				match(ID);
				setState(773);
				match(DOT);
				setState(774);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnClickContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public Function2Context function2() {
			return getRuleContext(Function2Context.class,0);
		}
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public OnClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterOnClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitOnClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitOnClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClickContext onClick() throws RecognitionException {
		OnClickContext _localctx = new OnClickContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_onClick);
		try {
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(777);
				match(OPEN_BRACE);
				{
				setState(778);
				function2();
				}
				setState(779);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				match(OPEN_BRACE);
				{
				setState(782);
				match(ID);
				}
				setState(783);
				match(CLOSE_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode NUMBER() { return getToken(AngParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_attributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 81L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlBodyContext extends ParserRuleContext {
		public HtmlBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBody; }
	 
		public HtmlBodyContext() { }
		public void copyFrom(HtmlBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapHtmlBodyContext extends HtmlBodyContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public MapMethod2Context mapMethod2() {
			return getRuleContext(MapMethod2Context.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public MapHtmlBodyContext(HtmlBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterMapHtmlBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitMapHtmlBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitMapHtmlBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfHtmlBodyContext extends HtmlBodyContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public HhContext hh() {
			return getRuleContext(HhContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public IfHtmlBodyContext(HtmlBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterIfHtmlBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitIfHtmlBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitIfHtmlBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBodyContext htmlBody() throws RecognitionException {
		HtmlBodyContext _localctx = new HtmlBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_htmlBody);
		try {
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				_localctx = new MapHtmlBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				match(OPEN_BRACE);
				setState(789);
				mapMethod2();
				setState(790);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				_localctx = new IfHtmlBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(OPEN_BRACE);
				setState(793);
				hh();
				setState(794);
				match(CLOSE_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HhContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode AND() { return getToken(AngParser.AND, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public HhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HhContext hh() throws RecognitionException {
		HhContext _localctx = new HhContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_hh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(ID);
			setState(799);
			match(AND);
			setState(800);
			match(OPEN_PAREN);
			setState(801);
			html();
			setState(802);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapMethod2Context extends ParserRuleContext {
		public TerminalNode MAP_() { return getToken(AngParser.MAP_, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(AngParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(AngParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(AngParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(AngParser.CLOSE_PAREN, i);
		}
		public TerminalNode ARROW() { return getToken(AngParser.ARROW, 0); }
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngParser.DOT, i);
		}
		public MapParamContext mapParam() {
			return getRuleContext(MapParamContext.class,0);
		}
		public MapMethod2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapMethod2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterMapMethod2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitMapMethod2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitMapMethod2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapMethod2Context mapMethod2() throws RecognitionException {
		MapMethod2Context _localctx = new MapMethod2Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_mapMethod2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(804);
				match(ID);
				setState(805);
				match(DOT);
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
			match(MAP_);
			setState(812);
			match(OPEN_PAREN);
			setState(813);
			match(OPEN_PAREN);
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(814);
				mapParam();
				}
				break;
			}
			setState(817);
			match(CLOSE_PAREN);
			setState(818);
			match(ARROW);
			setState(819);
			match(OPEN_PAREN);
			setState(820);
			html();
			setState(821);
			match(CLOSE_PAREN);
			setState(822);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapParamContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public MapParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterMapParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitMapParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitMapParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapParamContext mapParam() throws RecognitionException {
		MapParamContext _localctx = new MapParamContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_mapParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(824);
				match(ID);
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(825);
					match(COMMA);
					}
				}

				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunContext extends ParserRuleContext {
		public CallFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFun; }
	 
		public CallFunContext() { }
		public void copyFrom(CallFunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NavigateStatementContext extends CallFunContext {
		public NavigateCallContext navigateCall() {
			return getRuleContext(NavigateCallContext.class,0);
		}
		public TerminalNode AWAIT() { return getToken(AngParser.AWAIT, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public NavigateStatementContext(CallFunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterNavigateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitNavigateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitNavigateStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeneralCallContext extends CallFunContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<SubValueContext> subValue() {
			return getRuleContexts(SubValueContext.class);
		}
		public SubValueContext subValue(int i) {
			return getRuleContext(SubValueContext.class,i);
		}
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public GeneralCallContext(CallFunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterGeneralCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitGeneralCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitGeneralCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RouterStatementContext extends CallFunContext {
		public RouterCallContext routerCall() {
			return getRuleContext(RouterCallContext.class,0);
		}
		public TerminalNode AWAIT() { return getToken(AngParser.AWAIT, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public RouterStatementContext(CallFunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterRouterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitRouterStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitRouterStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunContext callFun() throws RecognitionException {
		CallFunContext _localctx = new CallFunContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_callFun);
		int _la;
		try {
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				_localctx = new NavigateStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AWAIT) {
					{
					setState(833);
					match(AWAIT);
					}
				}

				setState(836);
				navigateCall();
				setState(838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(837);
					match(SIME);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RouterStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AWAIT) {
					{
					setState(840);
					match(AWAIT);
					}
				}

				setState(843);
				routerCall();
				setState(845);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(844);
					match(SIME);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new GeneralCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(847);
				match(ID);
				setState(848);
				match(OPEN_PAREN);
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==B_C || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 5185L) != 0)) {
					{
					setState(849);
					subValue();
					setState(854);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(850);
						match(COMMA);
						setState(851);
						subValue();
						}
						}
						setState(856);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(859);
				match(CLOSE_PAREN);
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(860);
					match(SIME);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NavigateCallContext extends ParserRuleContext {
		public TerminalNode NAVIGATE() { return getToken(AngParser.NAVIGATE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(AngParser.COMMA, 0); }
		public StateParamContext stateParam() {
			return getRuleContext(StateParamContext.class,0);
		}
		public NavigateCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigateCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterNavigateCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitNavigateCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitNavigateCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigateCallContext navigateCall() throws RecognitionException {
		NavigateCallContext _localctx = new NavigateCallContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_navigateCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(NAVIGATE);
			setState(866);
			match(OPEN_PAREN);
			setState(867);
			match(SingleLineString);
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(868);
				match(COMMA);
				setState(869);
				stateParam();
				}
			}

			setState(872);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RouterCallContext extends ParserRuleContext {
		public RouterNameContext routerName() {
			return getRuleContext(RouterNameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AngParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngParser.DOT, i);
		}
		public TerminalNode NAVIGATE() { return getToken(AngParser.NAVIGATE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode THIS() { return getToken(AngParser.THIS, 0); }
		public TerminalNode COMMA() { return getToken(AngParser.COMMA, 0); }
		public StateParamContext stateParam() {
			return getRuleContext(StateParamContext.class,0);
		}
		public RouterCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterRouterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitRouterCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitRouterCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterCallContext routerCall() throws RecognitionException {
		RouterCallContext _localctx = new RouterCallContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_routerCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(874);
				match(THIS);
				setState(875);
				match(DOT);
				}
			}

			setState(878);
			routerName();
			setState(879);
			match(DOT);
			setState(880);
			match(NAVIGATE);
			setState(881);
			match(OPEN_PAREN);
			setState(882);
			match(SingleLineString);
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(883);
				match(COMMA);
				setState(884);
				stateParam();
				}
			}

			setState(887);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RouterNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode ROUTER() { return getToken(AngParser.ROUTER, 0); }
		public RouterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterRouterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitRouterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitRouterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterNameContext routerName() throws RecognitionException {
		RouterNameContext _localctx = new RouterNameContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_routerName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			_la = _input.LA(1);
			if ( !(_la==ROUTER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateParamContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngParser.COLON, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public List<TerminalNode> SingleLineString() { return getTokens(AngParser.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(AngParser.SingleLineString, i);
		}
		public List<TerminalNode> DECIMEL() { return getTokens(AngParser.DECIMEL); }
		public TerminalNode DECIMEL(int i) {
			return getToken(AngParser.DECIMEL, i);
		}
		public List<MapContext> map() {
			return getRuleContexts(MapContext.class);
		}
		public MapContext map(int i) {
			return getRuleContext(MapContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public StateParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterStateParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitStateParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitStateParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateParamContext stateParam() throws RecognitionException {
		StateParamContext _localctx = new StateParamContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_stateParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(OPEN_BRACE);
			{
			setState(892);
			match(ID);
			setState(893);
			match(COLON);
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineString:
				{
				setState(894);
				match(SingleLineString);
				}
				break;
			case DECIMEL:
				{
				setState(895);
				match(DECIMEL);
				}
				break;
			case ID:
				{
				setState(896);
				match(ID);
				}
				break;
			case OPEN_BRACE:
				{
				setState(897);
				map();
				}
				break;
			case OPEN_SQUARE:
				{
				setState(898);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(901);
				match(COMMA);
				{
				setState(902);
				match(ID);
				setState(903);
				match(COLON);
				setState(909);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SingleLineString:
					{
					setState(904);
					match(SingleLineString);
					}
					break;
				case DECIMEL:
					{
					setState(905);
					match(DECIMEL);
					}
					break;
				case ID:
					{
					setState(906);
					match(ID);
					}
					break;
				case OPEN_BRACE:
					{
					setState(907);
					map();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(908);
					array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				}
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(916);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssCodeContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<CssKeyContext> cssKey() {
			return getRuleContexts(CssKeyContext.class);
		}
		public CssKeyContext cssKey(int i) {
			return getRuleContext(CssKeyContext.class,i);
		}
		public List<CssInnerContext> cssInner() {
			return getRuleContexts(CssInnerContext.class);
		}
		public CssInnerContext cssInner(int i) {
			return getRuleContext(CssInnerContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngParser.DOT, i);
		}
		public List<TerminalNode> SQ() { return getTokens(AngParser.SQ); }
		public TerminalNode SQ(int i) {
			return getToken(AngParser.SQ, i);
		}
		public CssCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCssCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCssCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCssCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssCodeContext cssCode() throws RecognitionException {
		CssCodeContext _localctx = new CssCodeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_cssCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==SQ || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1033L) != 0)) {
				{
				{
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT || _la==SQ) {
					{
					setState(918);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==SQ) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(921);
				cssKey();
				}
				}
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(927);
			match(OPEN_BRACE);
			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 1033L) != 0)) {
				{
				{
				setState(928);
				cssInner();
				}
				}
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(934);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssKeyContext extends ParserRuleContext {
		public List<SyContext> sy() {
			return getRuleContexts(SyContext.class);
		}
		public SyContext sy(int i) {
			return getRuleContext(SyContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(AngParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(AngParser.MINUS, i);
		}
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode WIDTH() { return getToken(AngParser.WIDTH, 0); }
		public TerminalNode SYNTAX() { return getToken(AngParser.SYNTAX, 0); }
		public CssKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCssKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCssKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCssKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssKeyContext cssKey() throws RecognitionException {
		CssKeyContext _localctx = new CssKeyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_cssKey);
		int _la;
		try {
			setState(946);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(936);
				sy();
				setState(939); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(937);
					match(MINUS);
					setState(938);
					sy();
					}
					}
					setState(941); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(944);
				match(WIDTH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(945);
				match(SYNTAX);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssInnerContext extends ParserRuleContext {
		public CssInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssInner; }
	 
		public CssInnerContext() { }
		public void copyFrom(CssInnerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PercentageCssValueContext extends CssInnerContext {
		public CssKeyContext cssKey() {
			return getRuleContext(CssKeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode NUMBER() { return getToken(AngParser.NUMBER, 0); }
		public TerminalNode HUN() { return getToken(AngParser.HUN, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public PercentageCssValueContext(CssInnerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterPercentageCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitPercentageCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitPercentageCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdCssValueContext extends CssInnerContext {
		public CssKeyContext cssKey() {
			return getRuleContext(CssKeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public IdCssValueContext(CssInnerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterIdCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitIdCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitIdCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberCssValueContext extends CssInnerContext {
		public CssKeyContext cssKey() {
			return getRuleContext(CssKeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(AngParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AngParser.NUMBER, i);
		}
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public List<TerminalNode> PX() { return getTokens(AngParser.PX); }
		public TerminalNode PX(int i) {
			return getToken(AngParser.PX, i);
		}
		public NumberCssValueContext(CssInnerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterNumberCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitNumberCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitNumberCssValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCssValueContext extends CssInnerContext {
		public CssKeyContext cssKey() {
			return getRuleContext(CssKeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public CallFunContext callFun() {
			return getRuleContext(CallFunContext.class,0);
		}
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public FunctionCssValueContext(CssInnerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterFunctionCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitFunctionCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitFunctionCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssInnerContext cssInner() throws RecognitionException {
		CssInnerContext _localctx = new CssInnerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cssInner);
		int _la;
		try {
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				_localctx = new IdCssValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				cssKey();
				setState(949);
				match(COLON);
				setState(950);
				match(ID);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIME) {
					{
					setState(951);
					match(SIME);
					}
				}

				}
				break;
			case 2:
				_localctx = new NumberCssValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				cssKey();
				setState(955);
				match(COLON);
				setState(960); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(956);
					match(NUMBER);
					setState(958);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PX) {
						{
						setState(957);
						match(PX);
						}
					}

					}
					}
					setState(962); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIME) {
					{
					setState(964);
					match(SIME);
					}
				}

				}
				break;
			case 3:
				_localctx = new PercentageCssValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(967);
				cssKey();
				setState(968);
				match(COLON);
				{
				setState(969);
				match(NUMBER);
				setState(970);
				match(HUN);
				}
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIME) {
					{
					setState(972);
					match(SIME);
					}
				}

				}
				break;
			case 4:
				_localctx = new FunctionCssValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(975);
				cssKey();
				setState(976);
				match(COLON);
				setState(977);
				callFun();
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SIME) {
					{
					setState(978);
					match(SIME);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(AngParser.ENUM, 0); }
		public SyContext sy() {
			return getRuleContext(SyContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public EnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumContext enum_() throws RecognitionException {
		EnumContext _localctx = new EnumContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(ENUM);
			setState(984);
			sy();
			setState(985);
			match(OPEN_BRACE);
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(986);
				match(ID);
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(987);
					match(COMMA);
					}
				}

				}
				}
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(995);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceCodeContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngParser.INTERFACE, 0); }
		public SyContext sy() {
			return getRuleContext(SyContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngParser.COLON, i);
		}
		public List<TerminalNode> SIME() { return getTokens(AngParser.SIME); }
		public TerminalNode SIME(int i) {
			return getToken(AngParser.SIME, i);
		}
		public List<TerminalNode> DATATYPE_() { return getTokens(AngParser.DATATYPE_); }
		public TerminalNode DATATYPE_(int i) {
			return getToken(AngParser.DATATYPE_, i);
		}
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public InterfaceCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterInterfaceCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitInterfaceCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitInterfaceCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceCodeContext interfaceCode() throws RecognitionException {
		InterfaceCodeContext _localctx = new InterfaceCodeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_interfaceCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(INTERFACE);
			setState(998);
			sy();
			setState(999);
			match(OPEN_BRACE);
			setState(1009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(1000);
				match(ID);
				setState(1001);
				match(COLON);
				setState(1004);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(1002);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(1003);
					vv();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1006);
				match(SIME);
				}
				}
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1012);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001g\u03f7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u007f\b\u0000\n\u0000\f\u0000\u0082\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0088\b\u0001\u0005\u0001\u008a"+
		"\b\u0001\n\u0001\f\u0001\u008d\t\u0001\u0001\u0001\u0003\u0001\u0090\b"+
		"\u0001\u0001\u0001\u0003\u0001\u0093\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0097\b\u0001\u0005\u0001\u0099\b\u0001\n\u0001\f\u0001\u009c\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0005\u0002\u00a4\b\u0002\n\u0002\f\u0002\u00a7\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ae\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00b7\b\u0003\n\u0003\f\u0003\u00ba\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00d0\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d7\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00db\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u00ff\b\f\u0005\f\u0101\b\f\n\f\f\f\u0104\t\f\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u010f\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0114\b\u000e"+
		"\u0005\u000e\u0116\b\u000e\n\u000e\f\u000e\u0119\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u0122\b\u000f\u000b\u000f\f\u000f\u0123\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u012b\b\u000f\u000b\u000f"+
		"\f\u000f\u012c\u0003\u000f\u012f\b\u000f\u0001\u0010\u0003\u0010\u0132"+
		"\b\u0010\u0001\u0010\u0003\u0010\u0135\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u013c\b\u0010\u0003\u0010"+
		"\u013e\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0149\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u014e\b\u0012\n\u0012"+
		"\f\u0012\u0151\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012"+
		"\u0156\b\u0012\u000b\u0012\f\u0012\u0157\u0003\u0012\u015a\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0161"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u0166\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u016b\b\u0014\n\u0014"+
		"\f\u0014\u016e\t\u0014\u0001\u0014\u0003\u0014\u0171\b\u0014\u0001\u0014"+
		"\u0003\u0014\u0174\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0179\b\u0014\n\u0014\f\u0014\u017c\t\u0014\u0001\u0014\u0003\u0014\u017f"+
		"\b\u0014\u0001\u0014\u0003\u0014\u0182\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0187\b\u0014\n\u0014\f\u0014\u018a\t\u0014\u0001"+
		"\u0014\u0003\u0014\u018d\b\u0014\u0001\u0014\u0003\u0014\u0190\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0195\b\u0014\n\u0014"+
		"\f\u0014\u0198\t\u0014\u0001\u0014\u0003\u0014\u019b\b\u0014\u0001\u0014"+
		"\u0003\u0014\u019e\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u01a3\b\u0014\n\u0014\f\u0014\u01a6\t\u0014\u0001\u0014\u0003\u0014\u01a9"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01ae\b\u0014"+
		"\n\u0014\f\u0014\u01b1\t\u0014\u0001\u0014\u0003\u0014\u01b4\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01b9\b\u0014\n\u0014\f\u0014"+
		"\u01bc\t\u0014\u0001\u0014\u0003\u0014\u01bf\b\u0014\u0001\u0014\u0003"+
		"\u0014\u01c2\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01c7"+
		"\b\u0014\n\u0014\f\u0014\u01ca\t\u0014\u0001\u0014\u0003\u0014\u01cd\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01d2\b\u0014\n"+
		"\u0014\f\u0014\u01d5\t\u0014\u0001\u0014\u0003\u0014\u01d8\b\u0014\u0003"+
		"\u0014\u01da\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01df"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01e4\b\u0015"+
		"\u0001\u0015\u0003\u0015\u01e7\b\u0015\u0005\u0015\u01e9\b\u0015\n\u0015"+
		"\f\u0015\u01ec\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0003\u0017\u01f6\b\u0017"+
		"\u0001\u0017\u0003\u0017\u01f9\b\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u01fd\b\u0017\n\u0017\f\u0017\u0200\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0209"+
		"\b\u0017\u0005\u0017\u020b\b\u0017\n\u0017\f\u0017\u020e\t\u0017\u0001"+
		"\u0017\u0003\u0017\u0211\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0215"+
		"\b\u0017\u0003\u0017\u0217\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u021c\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0005\u0018\u0222\b\u0018\n\u0018\f\u0018\u0225\t\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u022e\b\u0018\u0005\u0018\u0230\b\u0018\n\u0018\f\u0018\u0233\t"+
		"\u0018\u0001\u0018\u0003\u0018\u0236\b\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u023a\b\u0018\u0003\u0018\u023c\b\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0240\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0244\b"+
		"\u0018\u0001\u0018\u0003\u0018\u0247\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u024e\b\u001a\u0001\u001a\u0003"+
		"\u001a\u0251\b\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u0255\b\u001b"+
		"\n\u001b\f\u001b\u0258\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u025e\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0003\u001d\u0264\b\u001d\u0005\u001d\u0266\b\u001d\n\u001d\f\u001d"+
		"\u0269\t\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u026d\b\u001d\n\u001d"+
		"\f\u001d\u0270\t\u001d\u0001\u001d\u0003\u001d\u0273\b\u001d\u0001\u001d"+
		"\u0003\u001d\u0276\b\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u027a\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0280"+
		"\b\u001e\u0001\u001e\u0003\u001e\u0283\b\u001e\u0005\u001e\u0285\b\u001e"+
		"\n\u001e\f\u001e\u0288\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0292"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0003 \u0298\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u029f\b \u0001 \u0003 \u02a2\b \u0001"+
		"!\u0001!\u0001!\u0003!\u02a7\b!\u0001!\u0003!\u02aa\b!\u0001!\u0001!\u0005"+
		"!\u02ae\b!\n!\f!\u02b1\t!\u0001!\u0001!\u0001!\u0001!\u0003!\u02b7\b!"+
		"\u0001\"\u0001\"\u0001\"\u0003\"\u02bc\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u02c6\b#\u0001$\u0003$\u02c9\b$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u02cf\b$\u0001%\u0003%\u02d2\b%\u0001%\u0001"+
		"%\u0001%\u0005%\u02d7\b%\n%\f%\u02da\t%\u0001%\u0003%\u02dd\b%\u0001&"+
		"\u0003&\u02e0\b&\u0001&\u0001&\u0005&\u02e4\b&\n&\f&\u02e7\t&\u0001&\u0003"+
		"&\u02ea\b&\u0001\'\u0003\'\u02ed\b\'\u0001\'\u0001\'\u0001\'\u0003\'\u02f2"+
		"\b\'\u0001\'\u0001\'\u0003\'\u02f6\b\'\u0001(\u0001(\u0001(\u0003(\u02fb"+
		"\b(\u0001(\u0001(\u0003(\u02ff\b(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u0308\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u0311\b+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u031d\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0005/\u0327\b/\n/\f/\u032a\t/\u0001/\u0001/\u0001/\u0001"+
		"/\u0003/\u0330\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00030\u033b\b0\u00050\u033d\b0\n0\f0\u0340\t0\u00011\u00031"+
		"\u0343\b1\u00011\u00011\u00031\u0347\b1\u00011\u00031\u034a\b1\u00011"+
		"\u00011\u00031\u034e\b1\u00011\u00011\u00011\u00011\u00011\u00051\u0355"+
		"\b1\n1\f1\u0358\t1\u00031\u035a\b1\u00011\u00011\u00031\u035e\b1\u0003"+
		"1\u0360\b1\u00012\u00012\u00012\u00012\u00012\u00032\u0367\b2\u00012\u0001"+
		"2\u00013\u00013\u00033\u036d\b3\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00033\u0376\b3\u00013\u00013\u00014\u00014\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00035\u0384\b5\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00035\u038e\b5\u00055\u0390\b5\n"+
		"5\f5\u0393\t5\u00015\u00015\u00016\u00036\u0398\b6\u00016\u00056\u039b"+
		"\b6\n6\f6\u039e\t6\u00016\u00016\u00056\u03a2\b6\n6\f6\u03a5\t6\u0001"+
		"6\u00016\u00017\u00017\u00017\u00047\u03ac\b7\u000b7\f7\u03ad\u00017\u0001"+
		"7\u00017\u00037\u03b3\b7\u00018\u00018\u00018\u00018\u00038\u03b9\b8\u0001"+
		"8\u00018\u00018\u00018\u00038\u03bf\b8\u00048\u03c1\b8\u000b8\f8\u03c2"+
		"\u00018\u00038\u03c6\b8\u00018\u00018\u00018\u00018\u00018\u00018\u0003"+
		"8\u03ce\b8\u00018\u00018\u00018\u00018\u00038\u03d4\b8\u00038\u03d6\b"+
		"8\u00019\u00019\u00019\u00019\u00019\u00039\u03dd\b9\u00059\u03df\b9\n"+
		"9\f9\u03e2\t9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:"+
		"\u0001:\u0003:\u03ed\b:\u0001:\u0005:\u03f0\b:\n:\f:\u03f3\t:\u0001:\u0001"+
		":\u0001:\u0000\u0000;\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprt\u0000\n\u0001\u0000DE\u0002\u0000KMee\u0002\u0000[[gg\u0003"+
		"\u0000$$0022\u0001\u0000\'(\u0002\u0000AAgg\u0002\u0000\t\tgg\u0003\u0000"+
		"aaeegg\u0002\u0000ZZgg\u0002\u0000\u000b\u000b\u001a\u001a\u0484\u0000"+
		"\u0080\u0001\u0000\u0000\u0000\u0002\u0083\u0001\u0000\u0000\u0000\u0004"+
		"\u00a5\u0001\u0000\u0000\u0000\u0006\u00b1\u0001\u0000\u0000\u0000\b\u00cf"+
		"\u0001\u0000\u0000\u0000\n\u00d1\u0001\u0000\u0000\u0000\f\u00de\u0001"+
		"\u0000\u0000\u0000\u000e\u00e2\u0001\u0000\u0000\u0000\u0010\u00e8\u0001"+
		"\u0000\u0000\u0000\u0012\u00ec\u0001\u0000\u0000\u0000\u0014\u00f0\u0001"+
		"\u0000\u0000\u0000\u0016\u00f4\u0001\u0000\u0000\u0000\u0018\u00f8\u0001"+
		"\u0000\u0000\u0000\u001a\u010e\u0001\u0000\u0000\u0000\u001c\u0110\u0001"+
		"\u0000\u0000\u0000\u001e\u012e\u0001\u0000\u0000\u0000 \u0131\u0001\u0000"+
		"\u0000\u0000\"\u0148\u0001\u0000\u0000\u0000$\u0159\u0001\u0000\u0000"+
		"\u0000&\u015b\u0001\u0000\u0000\u0000(\u01d9\u0001\u0000\u0000\u0000*"+
		"\u01db\u0001\u0000\u0000\u0000,\u01f2\u0001\u0000\u0000\u0000.\u01f5\u0001"+
		"\u0000\u0000\u00000\u021f\u0001\u0000\u0000\u00002\u0248\u0001\u0000\u0000"+
		"\u00004\u024a\u0001\u0000\u0000\u00006\u0256\u0001\u0000\u0000\u00008"+
		"\u025d\u0001\u0000\u0000\u0000:\u025f\u0001\u0000\u0000\u0000<\u0279\u0001"+
		"\u0000\u0000\u0000>\u028b\u0001\u0000\u0000\u0000@\u0297\u0001\u0000\u0000"+
		"\u0000B\u02a3\u0001\u0000\u0000\u0000D\u02bb\u0001\u0000\u0000\u0000F"+
		"\u02c5\u0001\u0000\u0000\u0000H\u02c8\u0001\u0000\u0000\u0000J\u02d1\u0001"+
		"\u0000\u0000\u0000L\u02df\u0001\u0000\u0000\u0000N\u02ec\u0001\u0000\u0000"+
		"\u0000P\u02f7\u0001\u0000\u0000\u0000R\u0300\u0001\u0000\u0000\u0000T"+
		"\u0307\u0001\u0000\u0000\u0000V\u0310\u0001\u0000\u0000\u0000X\u0312\u0001"+
		"\u0000\u0000\u0000Z\u031c\u0001\u0000\u0000\u0000\\\u031e\u0001\u0000"+
		"\u0000\u0000^\u0328\u0001\u0000\u0000\u0000`\u033e\u0001\u0000\u0000\u0000"+
		"b\u035f\u0001\u0000\u0000\u0000d\u0361\u0001\u0000\u0000\u0000f\u036c"+
		"\u0001\u0000\u0000\u0000h\u0379\u0001\u0000\u0000\u0000j\u037b\u0001\u0000"+
		"\u0000\u0000l\u039c\u0001\u0000\u0000\u0000n\u03b2\u0001\u0000\u0000\u0000"+
		"p\u03d5\u0001\u0000\u0000\u0000r\u03d7\u0001\u0000\u0000\u0000t\u03e5"+
		"\u0001\u0000\u0000\u0000v\u007f\u0003\u0002\u0001\u0000w\u007f\u0003 "+
		"\u0010\u0000x\u007f\u0003.\u0017\u0000y\u007f\u0003\u0004\u0002\u0000"+
		"z\u007f\u0003r9\u0000{\u007f\u0003t:\u0000|\u007f\u0003B!\u0000}\u007f"+
		"\u0003l6\u0000~v\u0001\u0000\u0000\u0000~w\u0001\u0000\u0000\u0000~x\u0001"+
		"\u0000\u0000\u0000~y\u0001\u0000\u0000\u0000~z\u0001\u0000\u0000\u0000"+
		"~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0001\u0001\u0000\u0000\u0000"+
		"\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u00055\u0000\u0000\u0084"+
		"\u008b\u0005\u0004\u0000\u0000\u0085\u0087\u0005g\u0000\u0000\u0086\u0088"+
		"\u0005\u0001\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0085"+
		"\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0005B\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u0093\u0005"+
		"\u0001\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u009a\u0001\u0000\u0000\u0000\u0094\u0096\u0005"+
		"g\u0000\u0000\u0095\u0097\u0005\u0001\u0000\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000"+
		"\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0005\u0005\u0000\u0000\u009e\u009f\u00057\u0000"+
		"\u0000\u009f\u00a0\u0005b\u0000\u0000\u00a0\u00a1\u0005\u0017\u0000\u0000"+
		"\u00a1\u0003\u0001\u0000\u0000\u0000\u00a2\u00a4\u0003\b\u0004\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u00053\u0000\u0000\u00a9\u00aa\u0005/\u0000\u0000\u00aa\u00ad\u0005"+
		"g\u0000\u0000\u00ab\u00ac\u0007\u0000\u0000\u0000\u00ac\u00ae\u0005g\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0\u0003\u0006\u0003"+
		"\u0000\u00b0\u0005\u0001\u0000\u0000\u0000\u00b1\u00b8\u0005\u0004\u0000"+
		"\u0000\u00b2\u00b7\u0003*\u0015\u0000\u00b3\u00b7\u0003 \u0010\u0000\u00b4"+
		"\u00b7\u0003.\u0017\u0000\u00b5\u00b7\u0003t:\u0000\u00b6\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005\u0005\u0000\u0000\u00bc\u0007\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005\b\u0000\u0000\u00be\u00bf\u0005\""+
		"\u0000\u0000\u00bf\u00c0\u0005\u0006\u0000\u0000\u00c0\u00c1\u0003\n\u0005"+
		"\u0000\u00c1\u00c2\u0005\u0007\u0000\u0000\u00c2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0005\b\u0000\u0000\u00c4\u00c5\u0005#\u0000\u0000"+
		"\u00c5\u00c6\u0005\u0006\u0000\u0000\u00c6\u00c7\u0003\f\u0006\u0000\u00c7"+
		"\u00c8\u0005\u0007\u0000\u0000\u00c8\u00d0\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0005\b\u0000\u0000\u00ca\u00cb\u0005)\u0000\u0000\u00cb\u00cc"+
		"\u0005\u0006\u0000\u0000\u00cc\u00cd\u0003\u000e\u0007\u0000\u00cd\u00ce"+
		"\u0005\u0007\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00c3\u0001\u0000\u0000\u0000\u00cf\u00c9"+
		"\u0001\u0000\u0000\u0000\u00d0\t\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\u0004\u0000\u0000\u00d2\u00d3\u0003\u0010\b\u0000\u00d3\u00d6\u0005\u0001"+
		"\u0000\u0000\u00d4\u00d7\u0003\u0012\t\u0000\u00d5\u00d7\u0003\u0014\n"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0001\u0000"+
		"\u0000\u00d9\u00db\u0003\u0016\u000b\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005\u0005\u0000\u0000\u00dd\u000b\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0005\u0004\u0000\u0000\u00df\u00e0\u0003\u0010\b\u0000"+
		"\u00e0\u00e1\u0005\u0005\u0000\u0000\u00e1\r\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0005\u0004\u0000\u0000\u00e3\u00e4\u0005J\u0000\u0000\u00e4\u00e5"+
		"\u0005\n\u0000\u0000\u00e5\u00e6\u0007\u0001\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0005\u0000\u0000\u00e7\u000f\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"I\u0000\u0000\u00e9\u00ea\u0005\n\u0000\u0000\u00ea\u00eb\u0005b\u0000"+
		"\u0000\u00eb\u0011\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005G\u0000\u0000"+
		"\u00ed\u00ee\u0005\n\u0000\u0000\u00ee\u00ef\u0005b\u0000\u0000\u00ef"+
		"\u0013\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005F\u0000\u0000\u00f1\u00f2"+
		"\u0005\n\u0000\u0000\u00f2\u00f3\u0003B!\u0000\u00f3\u0015\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f5\u0005H\u0000\u0000\u00f5\u00f6\u0005\n\u0000"+
		"\u0000\u00f6\u00f7\u0003\u001c\u000e\u0000\u00f7\u0017\u0001\u0000\u0000"+
		"\u0000\u00f8\u0102\u0005\u0004\u0000\u0000\u00f9\u00fa\u0005g\u0000\u0000"+
		"\u00fa\u00fb\u0005\n\u0000\u0000\u00fb\u00fc\u0003\u001a\r\u0000\u00fc"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fd\u00ff\u0005\u0001\u0000\u0000\u00fe"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0101\u0001\u0000\u0000\u0000\u0100\u00f9\u0001\u0000\u0000\u0000\u0101"+
		"\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104"+
		"\u0102\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u0005\u0000\u0000\u0106"+
		"\u0019\u0001\u0000\u0000\u0000\u0107\u010f\u0003\u001e\u000f\u0000\u0108"+
		"\u010f\u0003\u001c\u000e\u0000\u0109\u010a\u0005\u001d\u0000\u0000\u010a"+
		"\u010b\u0003B!\u0000\u010b\u010c\u0005\u001d\u0000\u0000\u010c\u010f\u0001"+
		"\u0000\u0000\u0000\u010d\u010f\u0003\u0018\f\u0000\u010e\u0107\u0001\u0000"+
		"\u0000\u0000\u010e\u0108\u0001\u0000\u0000\u0000\u010e\u0109\u0001\u0000"+
		"\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u001b\u0001\u0000"+
		"\u0000\u0000\u0110\u0117\u0005\u0002\u0000\u0000\u0111\u0113\u0003\u001e"+
		"\u000f\u0000\u0112\u0114\u0005\u0001\u0000\u0000\u0113\u0112\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000"+
		"\u0000\u0000\u0115\u0111\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0005\u0003\u0000\u0000\u011b\u001d\u0001\u0000"+
		"\u0000\u0000\u011c\u012f\u0005e\u0000\u0000\u011d\u012f\u0005g\u0000\u0000"+
		"\u011e\u012f\u0005a\u0000\u0000\u011f\u0121\u0005\u001d\u0000\u0000\u0120"+
		"\u0122\u0003l6\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005"+
		"\u001d\u0000\u0000\u0126\u012f\u0001\u0000\u0000\u0000\u0127\u012a\u0007"+
		"\u0002\u0000\u0000\u0128\u0129\u0005\u000b\u0000\u0000\u0129\u012b\u0005"+
		"g\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000"+
		"\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000"+
		"\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u011c\u0001\u0000"+
		"\u0000\u0000\u012e\u011d\u0001\u0000\u0000\u0000\u012e\u011e\u0001\u0000"+
		"\u0000\u0000\u012e\u011f\u0001\u0000\u0000\u0000\u012e\u0127\u0001\u0000"+
		"\u0000\u0000\u012f\u001f\u0001\u0000\u0000\u0000\u0130\u0132\u0007\u0003"+
		"\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0135\u0007\u0004"+
		"\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u013d\u0003$\u0012"+
		"\u0000\u0137\u013b\u0005\n\u0000\u0000\u0138\u013c\u0005A\u0000\u0000"+
		"\u0139\u013c\u0003,\u0016\u0000\u013a\u013c\u0003\"\u0011\u0000\u013b"+
		"\u0138\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b"+
		"\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013e\u0001\u0000\u0000\u0000\u013d\u0137\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0005\r\u0000\u0000\u0140\u0141\u0003(\u0014\u0000\u0141\u0142"+
		"\u0005\u0017\u0000\u0000\u0142!\u0001\u0000\u0000\u0000\u0143\u0144\u0005"+
		"\u0002\u0000\u0000\u0144\u0149\u0005\u0003\u0000\u0000\u0145\u0146\u0005"+
		"\u0002\u0000\u0000\u0146\u0147\u0005A\u0000\u0000\u0147\u0149\u0005\u0003"+
		"\u0000\u0000\u0148\u0143\u0001\u0000\u0000\u0000\u0148\u0145\u0001\u0000"+
		"\u0000\u0000\u0149#\u0001\u0000\u0000\u0000\u014a\u014f\u0005g\u0000\u0000"+
		"\u014b\u014c\u0005\u000b\u0000\u0000\u014c\u014e\u0005g\u0000\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f"+
		"\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150"+
		"\u015a\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152"+
		"\u0155\u0005[\u0000\u0000\u0153\u0154\u0005\u000b\u0000\u0000\u0154\u0156"+
		"\u0005g\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0001"+
		"\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001"+
		"\u0000\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159\u014a\u0001"+
		"\u0000\u0000\u0000\u0159\u0152\u0001\u0000\u0000\u0000\u015a%\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0003$\u0012\u0000\u015c\u0160\u0005\r\u0000"+
		"\u0000\u015d\u0161\u0003\u001e\u000f\u0000\u015e\u0161\u0003\u001c\u000e"+
		"\u0000\u015f\u0161\u0003\u0018\f\u0000\u0160\u015d\u0001\u0000\u0000\u0000"+
		"\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000"+
		"\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0017\u0000\u0000"+
		"\u0163\'\u0001\u0000\u0000\u0000\u0164\u0166\u0005,\u0000\u0000\u0165"+
		"\u0164\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0001\u0000\u0000\u0000\u0167\u0170\u0005e\u0000\u0000\u0168\u016c"+
		"\u0005\u0006\u0000\u0000\u0169\u016b\u0003,\u0016\u0000\u016a\u0169\u0001"+
		"\u0000\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016f\u0001"+
		"\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0171\u0005"+
		"\u0007\u0000\u0000\u0170\u0168\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171\u01da\u0001\u0000\u0000\u0000\u0172\u0174\u0005"+
		",\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u017e\u0005d\u0000"+
		"\u0000\u0176\u017a\u0005\u0006\u0000\u0000\u0177\u0179\u0003,\u0016\u0000"+
		"\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000"+
		"\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000"+
		"\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000"+
		"\u017d\u017f\u0005\u0007\u0000\u0000\u017e\u0176\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u01da\u0001\u0000\u0000\u0000"+
		"\u0180\u0182\u0005,\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183"+
		"\u018c\u0005g\u0000\u0000\u0184\u0188\u0005\u0006\u0000\u0000\u0185\u0187"+
		"\u0003,\u0016\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0187\u018a\u0001"+
		"\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001"+
		"\u0000\u0000\u0000\u0189\u018b\u0001\u0000\u0000\u0000\u018a\u0188\u0001"+
		"\u0000\u0000\u0000\u018b\u018d\u0005\u0007\u0000\u0000\u018c\u0184\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u01da\u0001"+
		"\u0000\u0000\u0000\u018e\u0190\u0005,\u0000\u0000\u018f\u018e\u0001\u0000"+
		"\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u019a\u0003\u001c\u000e\u0000\u0192\u0196\u0005\u0006"+
		"\u0000\u0000\u0193\u0195\u0003,\u0016\u0000\u0194\u0193\u0001\u0000\u0000"+
		"\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0199\u0001\u0000\u0000"+
		"\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019b\u0005\u0007\u0000"+
		"\u0000\u019a\u0192\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u01da\u0001\u0000\u0000\u0000\u019c\u019e\u0005,\u0000\u0000"+
		"\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a8\u0003\u0018\f\u0000\u01a0"+
		"\u01a4\u0005\u0006\u0000\u0000\u01a1\u01a3\u0003,\u0016\u0000\u01a2\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a7"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a9"+
		"\u0005\u0007\u0000\u0000\u01a8\u01a0\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9\u01da\u0001\u0000\u0000\u0000\u01aa\u01b3"+
		"\u0003:\u001d\u0000\u01ab\u01af\u0005\u0006\u0000\u0000\u01ac\u01ae\u0003"+
		",\u0016\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000"+
		"\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b4\u0005\u0007\u0000\u0000\u01b3\u01ab\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01da\u0001\u0000"+
		"\u0000\u0000\u01b5\u01be\u00030\u0018\u0000\u01b6\u01ba\u0005\u0006\u0000"+
		"\u0000\u01b7\u01b9\u0003,\u0016\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bf\u0005\u0007\u0000\u0000"+
		"\u01be\u01b6\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf\u01da\u0001\u0000\u0000\u0000\u01c0\u01c2\u0005,\u0000\u0000\u01c1"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c3\u01cc\u0003b1\u0000\u01c4\u01c8\u0005"+
		"\u0006\u0000\u0000\u01c5\u01c7\u0003,\u0016\u0000\u01c6\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cb\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cd\u0005\u0007"+
		"\u0000\u0000\u01cc\u01c4\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cd\u01da\u0001\u0000\u0000\u0000\u01ce\u01d7\u0003.\u0017"+
		"\u0000\u01cf\u01d3\u0005\u0006\u0000\u0000\u01d0\u01d2\u0003,\u0016\u0000"+
		"\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d8\u0005\u0007\u0000\u0000\u01d7\u01cf\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000"+
		"\u01d9\u0165\u0001\u0000\u0000\u0000\u01d9\u0173\u0001\u0000\u0000\u0000"+
		"\u01d9\u0181\u0001\u0000\u0000\u0000\u01d9\u018f\u0001\u0000\u0000\u0000"+
		"\u01d9\u019d\u0001\u0000\u0000\u0000\u01d9\u01aa\u0001\u0000\u0000\u0000"+
		"\u01d9\u01b5\u0001\u0000\u0000\u0000\u01d9\u01c1\u0001\u0000\u0000\u0000"+
		"\u01d9\u01ce\u0001\u0000\u0000\u0000\u01da)\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\u0005O\u0000\u0000\u01dc\u01ea\u0005\u0006\u0000\u0000\u01dd\u01df"+
		"\u0007\u0004\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df"+
		"\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e3"+
		"\u0003,\u0016\u0000\u01e1\u01e2\u0005\n\u0000\u0000\u01e2\u01e4\u0007"+
		"\u0005\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e6\u0001\u0000\u0000\u0000\u01e5\u01e7\u0005"+
		"\u0001\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000\u0000\u0000\u01e8\u01de\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ec\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001"+
		"\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ed\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005"+
		"\u0007\u0000\u0000\u01ee\u01ef\u0005\u0004\u0000\u0000\u01ef\u01f0\u0003"+
		"6\u001b\u0000\u01f0\u01f1\u0005\u0005\u0000\u0000\u01f1+\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0005g\u0000\u0000\u01f3-\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f6\u0005%\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f9"+
		"\u0005g\u0000\u0000\u01f8\u01f7\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fe\u0005"+
		"\u0006\u0000\u0000\u01fb\u01fd\u00034\u001a\u0000\u01fc\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0201\u0001\u0000"+
		"\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0216\u0005\u0007"+
		"\u0000\u0000\u0202\u0210\u0005\n\u0000\u0000\u0203\u0211\u0005A\u0000"+
		"\u0000\u0204\u0211\u0003,\u0016\u0000\u0205\u020c\u0005\u0002\u0000\u0000"+
		"\u0206\u0208\u00032\u0019\u0000\u0207\u0209\u0005\u0001\u0000\u0000\u0208"+
		"\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209"+
		"\u020b\u0001\u0000\u0000\u0000\u020a\u0206\u0001\u0000\u0000\u0000\u020b"+
		"\u020e\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c"+
		"\u020d\u0001\u0000\u0000\u0000\u020d\u020f\u0001\u0000\u0000\u0000\u020e"+
		"\u020c\u0001\u0000\u0000\u0000\u020f\u0211\u0005\u0003\u0000\u0000\u0210"+
		"\u0203\u0001\u0000\u0000\u0000\u0210\u0204\u0001\u0000\u0000\u0000\u0210"+
		"\u0205\u0001\u0000\u0000\u0000\u0211\u0214\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0005\u0002\u0000\u0000\u0213\u0215\u0005\u0003\u0000\u0000\u0214"+
		"\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215"+
		"\u0217\u0001\u0000\u0000\u0000\u0216\u0202\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0005\u0004\u0000\u0000\u0219\u021b\u00036\u001b\u0000\u021a\u021c"+
		"\u0003@ \u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0005\u0005"+
		"\u0000\u0000\u021e/\u0001\u0000\u0000\u0000\u021f\u0223\u0005\u0006\u0000"+
		"\u0000\u0220\u0222\u00034\u001a\u0000\u0221\u0220\u0001\u0000\u0000\u0000"+
		"\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001\u0000\u0000\u0000"+
		"\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0226\u0001\u0000\u0000\u0000"+
		"\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u023b\u0005\u0007\u0000\u0000"+
		"\u0227\u0235\u0005\n\u0000\u0000\u0228\u0236\u0005A\u0000\u0000\u0229"+
		"\u0236\u0003,\u0016\u0000\u022a\u0231\u0005\u0002\u0000\u0000\u022b\u022d"+
		"\u00032\u0019\u0000\u022c\u022e\u0005\u0001\u0000\u0000\u022d\u022c\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u0230\u0001"+
		"\u0000\u0000\u0000\u022f\u022b\u0001\u0000\u0000\u0000\u0230\u0233\u0001"+
		"\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001"+
		"\u0000\u0000\u0000\u0232\u0234\u0001\u0000\u0000\u0000\u0233\u0231\u0001"+
		"\u0000\u0000\u0000\u0234\u0236\u0005\u0003\u0000\u0000\u0235\u0228\u0001"+
		"\u0000\u0000\u0000\u0235\u0229\u0001\u0000\u0000\u0000\u0235\u022a\u0001"+
		"\u0000\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0238\u0005"+
		"\u0002\u0000\u0000\u0238\u023a\u0005\u0003\u0000\u0000\u0239\u0237\u0001"+
		"\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023c\u0001"+
		"\u0000\u0000\u0000\u023b\u0227\u0001\u0000\u0000\u0000\u023b\u023c\u0001"+
		"\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023f\u0005"+
		"\f\u0000\u0000\u023e\u0240\u0005\u0004\u0000\u0000\u023f\u023e\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000"+
		"\u0000\u0000\u0241\u0243\u00036\u001b\u0000\u0242\u0244\u0003@ \u0000"+
		"\u0243\u0242\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000"+
		"\u0244\u0246\u0001\u0000\u0000\u0000\u0245\u0247\u0005\u0005\u0000\u0000"+
		"\u0246\u0245\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000"+
		"\u02471\u0001\u0000\u0000\u0000\u0248\u0249\u0005A\u0000\u0000\u02493"+
		"\u0001\u0000\u0000\u0000\u024a\u024d\u0005g\u0000\u0000\u024b\u024c\u0005"+
		"\n\u0000\u0000\u024c\u024e\u0007\u0005\u0000\u0000\u024d\u024b\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0250\u0001\u0000"+
		"\u0000\u0000\u024f\u0251\u0005\u0001\u0000\u0000\u0250\u024f\u0001\u0000"+
		"\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u02515\u0001\u0000\u0000"+
		"\u0000\u0252\u0255\u00038\u001c\u0000\u0253\u0255\u0003&\u0013\u0000\u0254"+
		"\u0252\u0001\u0000\u0000\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0255"+
		"\u0258\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0001\u0000\u0000\u0000\u02577\u0001\u0000\u0000\u0000\u0258\u0256"+
		"\u0001\u0000\u0000\u0000\u0259\u025e\u0003 \u0010\u0000\u025a\u025e\u0003"+
		":\u001d\u0000\u025b\u025e\u0003>\u001f\u0000\u025c\u025e\u0003b1\u0000"+
		"\u025d\u0259\u0001\u0000\u0000\u0000\u025d\u025a\u0001\u0000\u0000\u0000"+
		"\u025d\u025b\u0001\u0000\u0000\u0000\u025d\u025c\u0001\u0000\u0000\u0000"+
		"\u025e9\u0001\u0000\u0000\u0000\u025f\u0267\u0007\u0006\u0000\u0000\u0260"+
		"\u0261\u0005\u000b\u0000\u0000\u0261\u0263\u0005g\u0000\u0000\u0262\u0264"+
		"\u0005\u000b\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\u0001\u0000\u0000\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265\u0260"+
		"\u0001\u0000\u0000\u0000\u0266\u0269\u0001\u0000\u0000\u0000\u0267\u0265"+
		"\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0272"+
		"\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u026a\u0273"+
		"\u0003(\u0014\u0000\u026b\u026d\u0003<\u001e\u0000\u026c\u026b\u0001\u0000"+
		"\u0000\u0000\u026d\u0270\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000"+
		"\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0273\u0001\u0000"+
		"\u0000\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0271\u0273\u0005\u0015"+
		"\u0000\u0000\u0272\u026a\u0001\u0000\u0000\u0000\u0272\u026e\u0001\u0000"+
		"\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0275\u0001\u0000"+
		"\u0000\u0000\u0274\u0276\u0005\u0017\u0000\u0000\u0275\u0274\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276;\u0001\u0000\u0000"+
		"\u0000\u0277\u0278\u0005\u000b\u0000\u0000\u0278\u027a\u0005g\u0000\u0000"+
		"\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u0286\u0005\u0006\u0000\u0000"+
		"\u027c\u0280\u0003,\u0016\u0000\u027d\u0280\u0005e\u0000\u0000\u027e\u0280"+
		"\u00030\u0018\u0000\u027f\u027c\u0001\u0000\u0000\u0000\u027f\u027d\u0001"+
		"\u0000\u0000\u0000\u027f\u027e\u0001\u0000\u0000\u0000\u0280\u0282\u0001"+
		"\u0000\u0000\u0000\u0281\u0283\u0005\u0001\u0000\u0000\u0282\u0281\u0001"+
		"\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0285\u0001"+
		"\u0000\u0000\u0000\u0284\u027f\u0001\u0000\u0000\u0000\u0285\u0288\u0001"+
		"\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0286\u0287\u0001"+
		"\u0000\u0000\u0000\u0287\u0289\u0001\u0000\u0000\u0000\u0288\u0286\u0001"+
		"\u0000\u0000\u0000\u0289\u028a\u0005\u0007\u0000\u0000\u028a=\u0001\u0000"+
		"\u0000\u0000\u028b\u028c\u0005P\u0000\u0000\u028c\u028d\u0005\u000b\u0000"+
		"\u0000\u028d\u028e\u0005Q\u0000\u0000\u028e\u0291\u0005\u0006\u0000\u0000"+
		"\u028f\u0292\u0005e\u0000\u0000\u0290\u0292\u0003:\u001d\u0000\u0291\u028f"+
		"\u0001\u0000\u0000\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0292\u0293"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0005\u0007\u0000\u0000\u0294\u0295"+
		"\u0005\u0017\u0000\u0000\u0295?\u0001\u0000\u0000\u0000\u0296\u0298\u0005"+
		"&\u0000\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000"+
		"\u0000\u0000\u0298\u029e\u0001\u0000\u0000\u0000\u0299\u029f\u0003:\u001d"+
		"\u0000\u029a\u029f\u0005e\u0000\u0000\u029b\u029f\u0005d\u0000\u0000\u029c"+
		"\u029f\u0005g\u0000\u0000\u029d\u029f\u0003\u001c\u000e\u0000\u029e\u0299"+
		"\u0001\u0000\u0000\u0000\u029e\u029a\u0001\u0000\u0000\u0000\u029e\u029b"+
		"\u0001\u0000\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029d"+
		"\u0001\u0000\u0000\u0000\u029f\u02a1\u0001\u0000\u0000\u0000\u02a0\u02a2"+
		"\u0005\u0017\u0000\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a2A\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005"+
		":\u0000\u0000\u02a4\u02a6\u0005`\u0000\u0000\u02a5\u02a7\u0003L&\u0000"+
		"\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a9\u0001\u0000\u0000\u0000\u02a8\u02aa\u0005<\u0000\u0000\u02a9"+
		"\u02a8\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ab\u02b6\u0005;\u0000\u0000\u02ac\u02ae"+
		"\u0003D\"\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ae\u02b1\u0001"+
		"\u0000\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02af\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b0\u02b2\u0001\u0000\u0000\u0000\u02b1\u02af\u0001"+
		"\u0000\u0000\u0000\u02b2\u02b3\u0005:\u0000\u0000\u02b3\u02b4\u0005<\u0000"+
		"\u0000\u02b4\u02b5\u0005`\u0000\u0000\u02b5\u02b7\u0005;\u0000\u0000\u02b6"+
		"\u02af\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7"+
		"C\u0001\u0000\u0000\u0000\u02b8\u02bc\u0003Z-\u0000\u02b9\u02bc\u0003"+
		"B!\u0000\u02ba\u02bc\u0003F#\u0000\u02bb\u02b8\u0001\u0000\u0000\u0000"+
		"\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000"+
		"\u02bcE\u0001\u0000\u0000\u0000\u02bd\u02be\u0005g\u0000\u0000\u02be\u02bf"+
		"\u0005\n\u0000\u0000\u02bf\u02c0\u0005\u0004\u0000\u0000\u02c0\u02c1\u0003"+
		"b1\u0000\u02c1\u02c2\u0005\u0005\u0000\u0000\u02c2\u02c6\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c6\u0003H$\u0000\u02c4\u02c6\u0003J%\u0000\u02c5\u02bd"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c6G\u0001\u0000\u0000\u0000\u02c7\u02c9\u0005"+
		"\u0004\u0000\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001"+
		"\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005"+
		"g\u0000\u0000\u02cb\u02cc\u0005\u000b\u0000\u0000\u02cc\u02ce\u0005g\u0000"+
		"\u0000\u02cd\u02cf\u0005\u0005\u0000\u0000\u02ce\u02cd\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cfI\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d2\u0005\u0004\u0000\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000"+
		"\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d8\u0005g\u0000\u0000\u02d4\u02d5\u0005\u000b\u0000\u0000\u02d5"+
		"\u02d7\u0005g\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u02da"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d8\u02d9"+
		"\u0001\u0000\u0000\u0000\u02d9\u02dc\u0001\u0000\u0000\u0000\u02da\u02d8"+
		"\u0001\u0000\u0000\u0000\u02db\u02dd\u0005\u0005\u0000\u0000\u02dc\u02db"+
		"\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02ddK\u0001"+
		"\u0000\u0000\u0000\u02de\u02e0\u0003R)\u0000\u02df\u02de\u0001\u0000\u0000"+
		"\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e5\u0001\u0000\u0000"+
		"\u0000\u02e1\u02e4\u0003N\'\u0000\u02e2\u02e4\u0003P(\u0000\u02e3\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e6"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000\u0000\u0000\u02e7\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e8\u02ea\u0005e\u0000\u0000\u02e9\u02e8\u0001"+
		"\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02eaM\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ed\u0005\u0019\u0000\u0000\u02ec\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ef\u0005g\u0000\u0000\u02ef\u02f1\u0005\r\u0000"+
		"\u0000\u02f0\u02f2\u0005\u0004\u0000\u0000\u02f1\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f5\u0003T*\u0000\u02f4\u02f6\u0005\u0005\u0000\u0000\u02f5"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6"+
		"O\u0001\u0000\u0000\u0000\u02f7\u02f8\u0005/\u0000\u0000\u02f8\u02fa\u0005"+
		"\r\u0000\u0000\u02f9\u02fb\u0005\u0004\u0000\u0000\u02fa\u02f9\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fc\u02fe\u0003T*\u0000\u02fd\u02ff\u0005\u0005\u0000\u0000"+
		"\u02fe\u02fd\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000"+
		"\u02ffQ\u0001\u0000\u0000\u0000\u0300\u0301\u0005g\u0000\u0000\u0301S"+
		"\u0001\u0000\u0000\u0000\u0302\u0308\u0003V+\u0000\u0303\u0308\u0003X"+
		",\u0000\u0304\u0305\u0005g\u0000\u0000\u0305\u0306\u0005\u000b\u0000\u0000"+
		"\u0306\u0308\u0005g\u0000\u0000\u0307\u0302\u0001\u0000\u0000\u0000\u0307"+
		"\u0303\u0001\u0000\u0000\u0000\u0307\u0304\u0001\u0000\u0000\u0000\u0308"+
		"U\u0001\u0000\u0000\u0000\u0309\u030a\u0005\u0004\u0000\u0000\u030a\u030b"+
		"\u00030\u0018\u0000\u030b\u030c\u0005\u0005\u0000\u0000\u030c\u0311\u0001"+
		"\u0000\u0000\u0000\u030d\u030e\u0005\u0004\u0000\u0000\u030e\u030f\u0005"+
		"g\u0000\u0000\u030f\u0311\u0005\u0005\u0000\u0000\u0310\u0309\u0001\u0000"+
		"\u0000\u0000\u0310\u030d\u0001\u0000\u0000\u0000\u0311W\u0001\u0000\u0000"+
		"\u0000\u0312\u0313\u0007\u0007\u0000\u0000\u0313Y\u0001\u0000\u0000\u0000"+
		"\u0314\u0315\u0005\u0004\u0000\u0000\u0315\u0316\u0003^/\u0000\u0316\u0317"+
		"\u0005\u0005\u0000\u0000\u0317\u031d\u0001\u0000\u0000\u0000\u0318\u0319"+
		"\u0005\u0004\u0000\u0000\u0319\u031a\u0003\\.\u0000\u031a\u031b\u0005"+
		"\u0005\u0000\u0000\u031b\u031d\u0001\u0000\u0000\u0000\u031c\u0314\u0001"+
		"\u0000\u0000\u0000\u031c\u0318\u0001\u0000\u0000\u0000\u031d[\u0001\u0000"+
		"\u0000\u0000\u031e\u031f\u0005g\u0000\u0000\u031f\u0320\u0005\u0012\u0000"+
		"\u0000\u0320\u0321\u0005\u0006\u0000\u0000\u0321\u0322\u0003B!\u0000\u0322"+
		"\u0323\u0005\u0007\u0000\u0000\u0323]\u0001\u0000\u0000\u0000\u0324\u0325"+
		"\u0005g\u0000\u0000\u0325\u0327\u0005\u000b\u0000\u0000\u0326\u0324\u0001"+
		"\u0000\u0000\u0000\u0327\u032a\u0001\u0000\u0000\u0000\u0328\u0326\u0001"+
		"\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032b\u0001"+
		"\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032b\u032c\u0005"+
		"^\u0000\u0000\u032c\u032d\u0005\u0006\u0000\u0000\u032d\u032f\u0005\u0006"+
		"\u0000\u0000\u032e\u0330\u0003`0\u0000\u032f\u032e\u0001\u0000\u0000\u0000"+
		"\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000"+
		"\u0331\u0332\u0005\u0007\u0000\u0000\u0332\u0333\u0005\f\u0000\u0000\u0333"+
		"\u0334\u0005\u0006\u0000\u0000\u0334\u0335\u0003B!\u0000\u0335\u0336\u0005"+
		"\u0007\u0000\u0000\u0336\u0337\u0005\u0007\u0000\u0000\u0337_\u0001\u0000"+
		"\u0000\u0000\u0338\u033a\u0005g\u0000\u0000\u0339\u033b\u0005\u0001\u0000"+
		"\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000"+
		"\u0000\u033b\u033d\u0001\u0000\u0000\u0000\u033c\u0338\u0001\u0000\u0000"+
		"\u0000\u033d\u0340\u0001\u0000\u0000\u0000\u033e\u033c\u0001\u0000\u0000"+
		"\u0000\u033e\u033f\u0001\u0000\u0000\u0000\u033fa\u0001\u0000\u0000\u0000"+
		"\u0340\u033e\u0001\u0000\u0000\u0000\u0341\u0343\u00059\u0000\u0000\u0342"+
		"\u0341\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343"+
		"\u0344\u0001\u0000\u0000\u0000\u0344\u0346\u0003d2\u0000\u0345\u0347\u0005"+
		"\u0017\u0000\u0000\u0346\u0345\u0001\u0000\u0000\u0000\u0346\u0347\u0001"+
		"\u0000\u0000\u0000\u0347\u0360\u0001\u0000\u0000\u0000\u0348\u034a\u0005"+
		"9\u0000\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000"+
		"\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034d\u0003f3\u0000"+
		"\u034c\u034e\u0005\u0017\u0000\u0000\u034d\u034c\u0001\u0000\u0000\u0000"+
		"\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u0360\u0001\u0000\u0000\u0000"+
		"\u034f\u0350\u0005g\u0000\u0000\u0350\u0359\u0005\u0006\u0000\u0000\u0351"+
		"\u0356\u0003\u001e\u000f\u0000\u0352\u0353\u0005\u0001\u0000\u0000\u0353"+
		"\u0355\u0003\u001e\u000f\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0355"+
		"\u0358\u0001\u0000\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0356"+
		"\u0357\u0001\u0000\u0000\u0000\u0357\u035a\u0001\u0000\u0000\u0000\u0358"+
		"\u0356\u0001\u0000\u0000\u0000\u0359\u0351\u0001\u0000\u0000\u0000\u0359"+
		"\u035a\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b"+
		"\u035d\u0005\u0007\u0000\u0000\u035c\u035e\u0005\u0017\u0000\u0000\u035d"+
		"\u035c\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000\u0000\u0000\u035e"+
		"\u0360\u0001\u0000\u0000\u0000\u035f\u0342\u0001\u0000\u0000\u0000\u035f"+
		"\u0349\u0001\u0000\u0000\u0000\u035f\u034f\u0001\u0000\u0000\u0000\u0360"+
		"c\u0001\u0000\u0000\u0000\u0361\u0362\u0005Y\u0000\u0000\u0362\u0363\u0005"+
		"\u0006\u0000\u0000\u0363\u0366\u0005e\u0000\u0000\u0364\u0365\u0005\u0001"+
		"\u0000\u0000\u0365\u0367\u0003j5\u0000\u0366\u0364\u0001\u0000\u0000\u0000"+
		"\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000\u0000"+
		"\u0368\u0369\u0005\u0007\u0000\u0000\u0369e\u0001\u0000\u0000\u0000\u036a"+
		"\u036b\u0005\t\u0000\u0000\u036b\u036d\u0005\u000b\u0000\u0000\u036c\u036a"+
		"\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u036e"+
		"\u0001\u0000\u0000\u0000\u036e\u036f\u0003h4\u0000\u036f\u0370\u0005\u000b"+
		"\u0000\u0000\u0370\u0371\u0005Y\u0000\u0000\u0371\u0372\u0005\u0006\u0000"+
		"\u0000\u0372\u0375\u0005e\u0000\u0000\u0373\u0374\u0005\u0001\u0000\u0000"+
		"\u0374\u0376\u0003j5\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0375\u0376"+
		"\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0378"+
		"\u0005\u0007\u0000\u0000\u0378g\u0001\u0000\u0000\u0000\u0379\u037a\u0007"+
		"\b\u0000\u0000\u037ai\u0001\u0000\u0000\u0000\u037b\u037c\u0005\u0004"+
		"\u0000\u0000\u037c\u037d\u0005g\u0000\u0000\u037d\u0383\u0005\n\u0000"+
		"\u0000\u037e\u0384\u0005e\u0000\u0000\u037f\u0384\u0005d\u0000\u0000\u0380"+
		"\u0384\u0005g\u0000\u0000\u0381\u0384\u0003\u0018\f\u0000\u0382\u0384"+
		"\u0003\u001c\u000e\u0000\u0383\u037e\u0001\u0000\u0000\u0000\u0383\u037f"+
		"\u0001\u0000\u0000\u0000\u0383\u0380\u0001\u0000\u0000\u0000\u0383\u0381"+
		"\u0001\u0000\u0000\u0000\u0383\u0382\u0001\u0000\u0000\u0000\u0384\u0391"+
		"\u0001\u0000\u0000\u0000\u0385\u0386\u0005\u0001\u0000\u0000\u0386\u0387"+
		"\u0005g\u0000\u0000\u0387\u038d\u0005\n\u0000\u0000\u0388\u038e\u0005"+
		"e\u0000\u0000\u0389\u038e\u0005d\u0000\u0000\u038a\u038e\u0005g\u0000"+
		"\u0000\u038b\u038e\u0003\u0018\f\u0000\u038c\u038e\u0003\u001c\u000e\u0000"+
		"\u038d\u0388\u0001\u0000\u0000\u0000\u038d\u0389\u0001\u0000\u0000\u0000"+
		"\u038d\u038a\u0001\u0000\u0000\u0000\u038d\u038b\u0001\u0000\u0000\u0000"+
		"\u038d\u038c\u0001\u0000\u0000\u0000\u038e\u0390\u0001\u0000\u0000\u0000"+
		"\u038f\u0385\u0001\u0000\u0000\u0000\u0390\u0393\u0001\u0000\u0000\u0000"+
		"\u0391\u038f\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000"+
		"\u0392\u0394\u0001\u0000\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000"+
		"\u0394\u0395\u0005\u0005\u0000\u0000\u0395k\u0001\u0000\u0000\u0000\u0396"+
		"\u0398\u0007\t\u0000\u0000\u0397\u0396\u0001\u0000\u0000\u0000\u0397\u0398"+
		"\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399\u039b"+
		"\u0003n7\u0000\u039a\u0397\u0001\u0000\u0000\u0000\u039b\u039e\u0001\u0000"+
		"\u0000\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000"+
		"\u0000\u0000\u039d\u039f\u0001\u0000\u0000\u0000\u039e\u039c\u0001\u0000"+
		"\u0000\u0000\u039f\u03a3\u0005\u0004\u0000\u0000\u03a0\u03a2\u0003p8\u0000"+
		"\u03a1\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a5\u0001\u0000\u0000\u0000"+
		"\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a6\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a6\u03a7\u0005\u0005\u0000\u0000\u03a7m\u0001\u0000\u0000\u0000\u03a8"+
		"\u03ab\u0003R)\u0000\u03a9\u03aa\u0005\u000e\u0000\u0000\u03aa\u03ac\u0003"+
		"R)\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000"+
		"\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000"+
		"\u0000\u03ae\u03b3\u0001\u0000\u0000\u0000\u03af\u03b3\u0005g\u0000\u0000"+
		"\u03b0\u03b3\u0005]\u0000\u0000\u03b1\u03b3\u0005`\u0000\u0000\u03b2\u03a8"+
		"\u0001\u0000\u0000\u0000\u03b2\u03af\u0001\u0000\u0000\u0000\u03b2\u03b0"+
		"\u0001\u0000\u0000\u0000\u03b2\u03b1\u0001\u0000\u0000\u0000\u03b3o\u0001"+
		"\u0000\u0000\u0000\u03b4\u03b5\u0003n7\u0000\u03b5\u03b6\u0005\n\u0000"+
		"\u0000\u03b6\u03b8\u0005g\u0000\u0000\u03b7\u03b9\u0005\u0017\u0000\u0000"+
		"\u03b8\u03b7\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000"+
		"\u03b9\u03d6\u0001\u0000\u0000\u0000\u03ba\u03bb\u0003n7\u0000\u03bb\u03c0"+
		"\u0005\n\u0000\u0000\u03bc\u03be\u0005a\u0000\u0000\u03bd\u03bf\u0005"+
		"\u001e\u0000\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03be\u03bf\u0001"+
		"\u0000\u0000\u0000\u03bf\u03c1\u0001\u0000\u0000\u0000\u03c0\u03bc\u0001"+
		"\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c0\u0001"+
		"\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000\u0000\u03c3\u03c5\u0001"+
		"\u0000\u0000\u0000\u03c4\u03c6\u0005\u0017\u0000\u0000\u03c5\u03c4\u0001"+
		"\u0000\u0000\u0000\u03c5\u03c6\u0001\u0000\u0000\u0000\u03c6\u03d6\u0001"+
		"\u0000\u0000\u0000\u03c7\u03c8\u0003n7\u0000\u03c8\u03c9\u0005\n\u0000"+
		"\u0000\u03c9\u03ca\u0005a\u0000\u0000\u03ca\u03cb\u0005\u001f\u0000\u0000"+
		"\u03cb\u03cd\u0001\u0000\u0000\u0000\u03cc\u03ce\u0005\u0017\u0000\u0000"+
		"\u03cd\u03cc\u0001\u0000\u0000\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000"+
		"\u03ce\u03d6\u0001\u0000\u0000\u0000\u03cf\u03d0\u0003n7\u0000\u03d0\u03d1"+
		"\u0005\n\u0000\u0000\u03d1\u03d3\u0003b1\u0000\u03d2\u03d4\u0005\u0017"+
		"\u0000\u0000\u03d3\u03d2\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000"+
		"\u0000\u0000\u03d4\u03d6\u0001\u0000\u0000\u0000\u03d5\u03b4\u0001\u0000"+
		"\u0000\u0000\u03d5\u03ba\u0001\u0000\u0000\u0000\u03d5\u03c7\u0001\u0000"+
		"\u0000\u0000\u03d5\u03cf\u0001\u0000\u0000\u0000\u03d6q\u0001\u0000\u0000"+
		"\u0000\u03d7\u03d8\u0005!\u0000\u0000\u03d8\u03d9\u0003R)\u0000\u03d9"+
		"\u03e0\u0005\u0004\u0000\u0000\u03da\u03dc\u0005g\u0000\u0000\u03db\u03dd"+
		"\u0005\u0001\u0000\u0000\u03dc\u03db\u0001\u0000\u0000\u0000\u03dc\u03dd"+
		"\u0001\u0000\u0000\u0000\u03dd\u03df\u0001\u0000\u0000\u0000\u03de\u03da"+
		"\u0001\u0000\u0000\u0000\u03df\u03e2\u0001\u0000\u0000\u0000\u03e0\u03de"+
		"\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e3"+
		"\u0001\u0000\u0000\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e3\u03e4"+
		"\u0005\u0005\u0000\u0000\u03e4s\u0001\u0000\u0000\u0000\u03e5\u03e6\u0005"+
		"@\u0000\u0000\u03e6\u03e7\u0003R)\u0000\u03e7\u03f1\u0005\u0004\u0000"+
		"\u0000\u03e8\u03e9\u0005g\u0000\u0000\u03e9\u03ec\u0005\n\u0000\u0000"+
		"\u03ea\u03ed\u0005A\u0000\u0000\u03eb\u03ed\u0003,\u0016\u0000\u03ec\u03ea"+
		"\u0001\u0000\u0000\u0000\u03ec\u03eb\u0001\u0000\u0000\u0000\u03ed\u03ee"+
		"\u0001\u0000\u0000\u0000\u03ee\u03f0\u0005\u0017\u0000\u0000\u03ef\u03e8"+
		"\u0001\u0000\u0000\u0000\u03f0\u03f3\u0001\u0000\u0000\u0000\u03f1\u03ef"+
		"\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2\u03f4"+
		"\u0001\u0000\u0000\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f4\u03f5"+
		"\u0005\u0005\u0000\u0000\u03f5u\u0001\u0000\u0000\u0000\u009a~\u0080\u0087"+
		"\u008b\u008f\u0092\u0096\u009a\u00a5\u00ad\u00b6\u00b8\u00cf\u00d6\u00da"+
		"\u00fe\u0102\u010e\u0113\u0117\u0123\u012c\u012e\u0131\u0134\u013b\u013d"+
		"\u0148\u014f\u0157\u0159\u0160\u0165\u016c\u0170\u0173\u017a\u017e\u0181"+
		"\u0188\u018c\u018f\u0196\u019a\u019d\u01a4\u01a8\u01af\u01b3\u01ba\u01be"+
		"\u01c1\u01c8\u01cc\u01d3\u01d7\u01d9\u01de\u01e3\u01e6\u01ea\u01f5\u01f8"+
		"\u01fe\u0208\u020c\u0210\u0214\u0216\u021b\u0223\u022d\u0231\u0235\u0239"+
		"\u023b\u023f\u0243\u0246\u024d\u0250\u0254\u0256\u025d\u0263\u0267\u026e"+
		"\u0272\u0275\u0279\u027f\u0282\u0286\u0291\u0297\u029e\u02a1\u02a6\u02a9"+
		"\u02af\u02b6\u02bb\u02c5\u02c8\u02ce\u02d1\u02d8\u02dc\u02df\u02e3\u02e5"+
		"\u02e9\u02ec\u02f1\u02f5\u02fa\u02fe\u0307\u0310\u031c\u0328\u032f\u033a"+
		"\u033e\u0342\u0346\u0349\u034d\u0356\u0359\u035d\u035f\u0366\u036c\u0375"+
		"\u0383\u038d\u0391\u0397\u039c\u03a3\u03ad\u03b2\u03b8\u03be\u03c2\u03c5"+
		"\u03cd\u03d3\u03d5\u03dc\u03e0\u03ec\u03f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}