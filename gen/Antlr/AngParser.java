// Generated from C:/Users/owais/Desktop/Angular-compiler/src/Antlr/AngParser.g4 by ANTLR 4.13.2
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
		ONCLICK_=88, HEIGHT=89, WIDTH=90, BUTTON_=91, MAP_=92, OPERATION=93, SYNTAX=94, 
		NUMBER=95, STRING=96, HEX_NUMBER=97, DECIMEL=98, SingleLineString=99, 
		MultiLineString=100, ID=101;
	public static final int
		RULE_app = 0, RULE_importR = 1, RULE_exports = 2, RULE_classBody = 3, 
		RULE_decorater = 4, RULE_componentConfig = 5, RULE_directiveConfig = 6, 
		RULE_injectableConfig = 7, RULE_selector = 8, RULE_templateUrl = 9, RULE_template = 10, 
		RULE_styleUrls = 11, RULE_map = 12, RULE_value = 13, RULE_array = 14, 
		RULE_subValue = 15, RULE_variable = 16, RULE_variableValue = 17, RULE_constructor = 18, 
		RULE_vv = 19, RULE_function = 20, RULE_function2 = 21, RULE_dd = 22, RULE_functionParams = 23, 
		RULE_functionBody = 24, RULE_thisCall = 25, RULE_dotdot = 26, RULE_print = 27, 
		RULE_returnStatement = 28, RULE_html = 29, RULE_htmlDot = 30, RULE_htmlVar = 31, 
		RULE_htmlinside = 32, RULE_htmlID = 33, RULE_htmlClass = 34, RULE_sy = 35, 
		RULE_value2 = 36, RULE_onClick = 37, RULE_attributeValue = 38, RULE_htmlBody = 39, 
		RULE_hh = 40, RULE_mapMethod2 = 41, RULE_mapParam = 42, RULE_callFun = 43, 
		RULE_cssCode = 44, RULE_cssKey = 45, RULE_cssInner = 46, RULE_enum = 47, 
		RULE_interfaceCode = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"app", "importR", "exports", "classBody", "decorater", "componentConfig", 
			"directiveConfig", "injectableConfig", "selector", "templateUrl", "template", 
			"styleUrls", "map", "value", "array", "subValue", "variable", "variableValue", 
			"constructor", "vv", "function", "function2", "dd", "functionParams", 
			"functionBody", "thisCall", "dotdot", "print", "returnStatement", "html", 
			"htmlDot", "htmlVar", "htmlinside", "htmlID", "htmlClass", "sy", "value2", 
			"onClick", "attributeValue", "htmlBody", "hh", "mapMethod2", "mapParam", 
			"callFun", "cssCode", "cssKey", "cssInner", "enum", "interfaceCode"
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
			"'onFocus'", "'onclick'", "'height'", "'width'", "'button'", "'map'"
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
			"DISABLED_", "ONFOCUS_", "ONCLICK_", "HEIGHT", "WIDTH", "BUTTON_", "MAP_", 
			"OPERATION", "SYNTAX", "NUMBER", "STRING", "HEX_NUMBER", "DECIMEL", "SingleLineString", 
			"MultiLineString", "ID"
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
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12668237967786304L) != 0) || _la==INTERFACE || _la==ID) {
				{
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(98);
					importR();
					}
					break;
				case 2:
					{
					setState(99);
					variable();
					}
					break;
				case 3:
					{
					setState(100);
					function();
					}
					break;
				case 4:
					{
					setState(101);
					exports();
					}
					break;
				case 5:
					{
					setState(102);
					enum_();
					}
					break;
				case 6:
					{
					setState(103);
					interfaceCode();
					}
					break;
				}
				}
				setState(108);
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
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
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
			setState(109);
			match(IMPORT);
			setState(110);
			match(OPEN_BRACE);
			{
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(111);
					match(ID);
					}
					setState(113);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(112);
						match(COMMA);
						}
						break;
					}
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNAL) {
				{
				setState(120);
				match(SIGNAL);
				}
			}

			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(123);
				match(COMMA);
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				{
				setState(126);
				match(ID);
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(127);
					match(COMMA);
					}
				}

				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(135);
			match(CLOSE_BRACE);
			setState(136);
			match(FROM);
			setState(137);
			match(SingleLineString);
			setState(138);
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
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(140);
				decorater();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(EXPORT);
			setState(147);
			match(CLASS);
			setState(148);
			match(ID);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENT || _la==EXTEND) {
				{
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==IMPLEMENT || _la==EXTEND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				match(ID);
				}
			}

			setState(153);
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
			setState(155);
			match(OPEN_BRACE);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1409230309425216L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 137438986241L) != 0)) {
				{
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(156);
					constructor();
					}
					break;
				case 2:
					{
					setState(157);
					variable();
					}
					break;
				case 3:
					{
					setState(158);
					function();
					}
					break;
				case 4:
					{
					setState(159);
					interfaceCode();
					}
					break;
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
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
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ComponentDecoratorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(AT);
				setState(168);
				match(COMPONENT);
				setState(169);
				match(OPEN_PAREN);
				setState(170);
				componentConfig();
				setState(171);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				_localctx = new DirectiveDecoratorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(AT);
				setState(174);
				match(DIRECTIVE);
				setState(175);
				match(OPEN_PAREN);
				setState(176);
				directiveConfig();
				setState(177);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				_localctx = new InjectableDecoratorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(AT);
				setState(180);
				match(INJECTABLE);
				setState(181);
				match(OPEN_PAREN);
				setState(182);
				injectableConfig();
				setState(183);
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
			setState(187);
			match(OPEN_BRACE);
			setState(188);
			selector();
			setState(189);
			match(COMMA);
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATEURL:
				{
				setState(190);
				templateUrl();
				}
				break;
			case TEMPLATE:
				{
				setState(191);
				template();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(194);
				match(COMMA);
				setState(195);
				styleUrls();
				}
			}

			setState(198);
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
			setState(200);
			match(OPEN_BRACE);
			setState(201);
			selector();
			setState(202);
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
			setState(204);
			match(OPEN_BRACE);
			setState(205);
			match(PROVIDEDIN);
			setState(206);
			match(COLON);
			setState(207);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 16777223L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(208);
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
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
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
			setState(210);
			match(SELECTOR);
			setState(211);
			match(COLON);
			setState(212);
			match(SingleLineString);
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
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
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
			setState(214);
			match(TEMPLATEURL);
			setState(215);
			match(COLON);
			setState(216);
			match(SingleLineString);
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
			setState(218);
			match(TEMPLATE);
			setState(219);
			match(COLON);
			setState(220);
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
			setState(222);
			match(STYLES);
			setState(223);
			match(COLON);
			setState(224);
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
			setState(226);
			match(OPEN_BRACE);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				{
				{
				setState(227);
				match(ID);
				}
				setState(228);
				match(COLON);
				setState(229);
				value();
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(231);
					match(COMMA);
					}
				}

				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
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
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new SubValueValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				subValue();
				}
				break;
			case 2:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				array();
				}
				break;
			case 3:
				_localctx = new HtmlValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(B_C);
				setState(244);
				html();
				setState(245);
				match(B_C);
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
			setState(249);
			match(OPEN_SQUARE);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==B_C || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 11L) != 0)) {
				{
				{
				setState(250);
				subValue();
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(251);
					match(COMMA);
					}
				}

				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
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
		public TerminalNode DECIMEL() { return getToken(AngParser.DECIMEL, 0); }
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
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineString:
				_localctx = new StringSubValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(SingleLineString);
				}
				break;
			case ID:
				_localctx = new IdSubValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(ID);
				}
				break;
			case DECIMEL:
				_localctx = new NumberSubValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(DECIMEL);
				}
				break;
			case B_C:
				_localctx = new CssBlockSubValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				match(B_C);
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(265);
					cssCode();
					}
					}
					setState(268); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67110928L) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2065L) != 0) );
				setState(270);
				match(B_C);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
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
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1407443603030016L) != 0)) {
				{
				setState(274);
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

			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(277);
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

			setState(280);
			match(ID);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(281);
				match(COLON);
				setState(295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(282);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(283);
					vv();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(284);
					match(OPEN_SQUARE);
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE_) {
						{
						{
						setState(285);
						dd();
						setState(287);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(286);
							match(COMMA);
							}
						}

						}
						}
						setState(293);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(294);
					match(CLOSE_SQUARE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE) {
					{
					setState(297);
					match(OPEN_SQUARE);
					setState(298);
					match(CLOSE_SQUARE);
					}
				}

				}
			}

			setState(303);
			match(EQUAL);
			setState(304);
			variableValue();
			setState(305);
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
		enterRule(_localctx, 34, RULE_variableValue);
		int _la;
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				_localctx = new StringVarValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(307);
					match(NEW);
					}
				}

				setState(310);
				match(SingleLineString);
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(311);
					match(OPEN_PAREN);
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(312);
						vv();
						}
						}
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(318);
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
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(321);
					match(NEW);
					}
				}

				setState(324);
				match(DECIMEL);
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(325);
					match(OPEN_PAREN);
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(326);
						vv();
						}
						}
						setState(331);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(332);
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
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(335);
					match(NEW);
					}
				}

				setState(338);
				match(ID);
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(339);
					match(OPEN_PAREN);
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(340);
						vv();
						}
						}
						setState(345);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(346);
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
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(349);
					match(NEW);
					}
				}

				setState(352);
				array();
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(353);
					match(OPEN_PAREN);
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(354);
						vv();
						}
						}
						setState(359);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(360);
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
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(363);
					match(NEW);
					}
				}

				setState(366);
				map();
				setState(375);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(367);
					match(OPEN_PAREN);
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(368);
						vv();
						}
						}
						setState(373);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(374);
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
				setState(377);
				thisCall();
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(378);
					match(OPEN_PAREN);
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(379);
						vv();
						}
						}
						setState(384);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(385);
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
				setState(388);
				function2();
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(389);
					match(OPEN_PAREN);
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(390);
						vv();
						}
						}
						setState(395);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(396);
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
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(399);
					match(NEW);
					}
				}

				setState(402);
				callFun();
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(403);
					match(OPEN_PAREN);
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(404);
						vv();
						}
						}
						setState(409);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(410);
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
				setState(413);
				function();
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(414);
					match(OPEN_PAREN);
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ID) {
						{
						{
						setState(415);
						vv();
						}
						}
						setState(420);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(421);
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
		enterRule(_localctx, 36, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(CONSTRUCTOR);
			setState(427);
			match(OPEN_PAREN);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 4611686018427387907L) != 0)) {
				{
				{
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE || _la==PUBLIC) {
					{
					setState(428);
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

				setState(431);
				vv();
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(432);
					match(COLON);
					setState(433);
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

				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(436);
					match(COMMA);
					}
				}

				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(CLOSE_PAREN);
			setState(445);
			match(OPEN_BRACE);
			setState(446);
			functionBody();
			setState(447);
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
		enterRule(_localctx, 38, RULE_vv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
		enterRule(_localctx, 40, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(451);
				match(FUNCTION);
				}
			}

			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(454);
				match(ID);
				}
			}

			setState(457);
			match(OPEN_PAREN);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(458);
				functionParams();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(CLOSE_PAREN);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(465);
				match(COLON);
				setState(479);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(466);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(467);
					vv();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(468);
					match(OPEN_SQUARE);
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE_) {
						{
						{
						setState(469);
						dd();
						setState(471);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(470);
							match(COMMA);
							}
						}

						}
						}
						setState(477);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(478);
					match(CLOSE_SQUARE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE) {
					{
					setState(481);
					match(OPEN_SQUARE);
					setState(482);
					match(CLOSE_SQUARE);
					}
				}

				}
			}

			setState(487);
			match(OPEN_BRACE);
			setState(488);
			functionBody();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274877907460L) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 11L) != 0)) {
				{
				setState(489);
				returnStatement();
				}
			}

			setState(492);
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
		enterRule(_localctx, 42, RULE_function2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(OPEN_PAREN);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(495);
				functionParams();
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(501);
			match(CLOSE_PAREN);
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(502);
				match(COLON);
				setState(516);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(503);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(504);
					vv();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(505);
					match(OPEN_SQUARE);
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE_) {
						{
						{
						setState(506);
						dd();
						setState(508);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(507);
							match(COMMA);
							}
						}

						}
						}
						setState(514);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(515);
					match(CLOSE_SQUARE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE) {
					{
					setState(518);
					match(OPEN_SQUARE);
					setState(519);
					match(CLOSE_SQUARE);
					}
				}

				}
			}

			setState(524);
			match(ARROW);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(525);
				match(OPEN_BRACE);
				}
			}

			setState(528);
			functionBody();
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(529);
				returnStatement();
				}
				break;
			}
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(532);
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
		enterRule(_localctx, 44, RULE_dd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
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
		public VvContext vv() {
			return getRuleContext(VvContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(AngParser.COMMA, 0); }
		public TerminalNode DATATYPE_() { return getToken(AngParser.DATATYPE_, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
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
		enterRule(_localctx, 46, RULE_functionParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			vv();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(538);
				match(COLON);
				setState(539);
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

			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(542);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ThisCallContext> thisCall() {
			return getRuleContexts(ThisCallContext.class);
		}
		public ThisCallContext thisCall(int i) {
			return getRuleContext(ThisCallContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<CallFunContext> callFun() {
			return getRuleContexts(CallFunContext.class);
		}
		public CallFunContext callFun(int i) {
			return getRuleContext(CallFunContext.class,i);
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
		enterRule(_localctx, 48, RULE_functionBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(545);
						variable();
						}
						break;
					case 2:
						{
						setState(546);
						thisCall();
						}
						break;
					case 3:
						{
						setState(547);
						print();
						}
						break;
					case 4:
						{
						setState(548);
						callFun();
						}
						break;
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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
		enterRule(_localctx, 50, RULE_thisCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(555);
					match(DOT);
					setState(556);
					match(ID);
					setState(558);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
					case 1:
						{
						setState(557);
						match(DOT);
						}
						break;
					}
					}
					} 
				}
				setState(564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(565);
				variableValue();
				}
				break;
			case 2:
				{
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(566);
						dotdot();
						}
						} 
					}
					setState(571);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(572);
				match(PLPL);
				}
				break;
			}
			setState(576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(575);
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
		enterRule(_localctx, 52, RULE_dotdot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(578);
				match(DOT);
				setState(579);
				match(ID);
				}
			}

			{
			setState(582);
			match(OPEN_PAREN);
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAREN || _la==SingleLineString || _la==ID) {
				{
				{
				setState(586);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(583);
					vv();
					}
					break;
				case SingleLineString:
					{
					setState(584);
					match(SingleLineString);
					}
					break;
				case OPEN_PAREN:
					{
					setState(585);
					function2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(588);
					match(COMMA);
					}
				}

				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
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
		enterRule(_localctx, 54, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(CONSOLE_);
			setState(599);
			match(DOT);
			setState(600);
			match(LOG_);
			setState(601);
			match(OPEN_PAREN);
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineString:
				{
				setState(602);
				match(SingleLineString);
				}
				break;
			case THIS:
			case ID:
				{
				setState(603);
				thisCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(606);
			match(CLOSE_PAREN);
			setState(607);
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
		enterRule(_localctx, 56, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(609);
				match(RETURN);
				}
			}

			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(612);
				thisCall();
				}
				break;
			case 2:
				{
				setState(613);
				match(SingleLineString);
				}
				break;
			case 3:
				{
				setState(614);
				match(DECIMEL);
				}
				break;
			case 4:
				{
				setState(615);
				match(ID);
				}
				break;
			case 5:
				{
				setState(616);
				array();
				}
				break;
			}
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(619);
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
		public HtmlBodyContext htmlBody() {
			return getRuleContext(HtmlBodyContext.class,0);
		}
		public HtmlDotContext htmlDot() {
			return getRuleContext(HtmlDotContext.class,0);
		}
		public HtmlVarContext htmlVar() {
			return getRuleContext(HtmlVarContext.class,0);
		}
		public List<HtmlContext> html() {
			return getRuleContexts(HtmlContext.class);
		}
		public HtmlContext html(int i) {
			return getRuleContext(HtmlContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
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
		enterRule(_localctx, 58, RULE_html);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(JSX_OPEN);
			{
			setState(623);
			match(SYNTAX);
			}
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(624);
				htmlinside();
				}
				break;
			}
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX_SLASH) {
				{
				setState(627);
				match(JSX_SLASH);
				}
			}

			setState(630);
			match(JSX_CLOSE);
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(631);
					htmlBody();
					}
					break;
				case 2:
					{
					setState(635);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(632);
							html();
							}
							} 
						}
						setState(637);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
					}
					}
					break;
				case 3:
					{
					setState(646);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						setState(641);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==ID) {
							{
							{
							setState(638);
							match(ID);
							}
							}
							setState(643);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(644);
						htmlDot();
						}
						break;
					case 3:
						{
						setState(645);
						htmlVar();
						}
						break;
					}
					}
					break;
				}
				{
				setState(650);
				match(JSX_OPEN);
				setState(651);
				match(JSX_SLASH);
				setState(652);
				match(SYNTAX);
				setState(653);
				match(JSX_CLOSE);
				}
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
		enterRule(_localctx, 60, RULE_htmlDot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(656);
				match(OPEN_BRACE);
				}
			}

			setState(659);
			match(ID);
			setState(660);
			match(DOT);
			setState(661);
			match(ID);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(662);
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
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
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
		enterRule(_localctx, 62, RULE_htmlVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(665);
				match(OPEN_BRACE);
				}
			}

			setState(668);
			match(ID);
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(669);
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
		enterRule(_localctx, 64, RULE_htmlinside);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(672);
				sy();
				}
				break;
			}
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI || _la==CLASS || _la==ID) {
				{
				setState(677);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTI:
				case ID:
					{
					setState(675);
					htmlID();
					}
					break;
				case CLASS:
					{
					setState(676);
					htmlClass();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(681);
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
		enterRule(_localctx, 66, RULE_htmlID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTI) {
				{
				setState(682);
				match(MULTI);
				}
			}

			{
			setState(685);
			match(ID);
			}
			setState(686);
			match(EQUAL);
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(687);
				match(OPEN_BRACE);
				}
				break;
			}
			setState(690);
			value2();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(691);
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
		enterRule(_localctx, 68, RULE_htmlClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(694);
			match(CLASS);
			}
			setState(695);
			match(EQUAL);
			setState(697);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				{
				setState(696);
				match(OPEN_BRACE);
				}
				break;
			}
			setState(699);
			value2();
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(700);
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
		enterRule(_localctx, 70, RULE_sy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
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
		public OnClickContext onClick() {
			return getRuleContext(OnClickContext.class,0);
		}
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(AngParser.DOT, 0); }
		public Value2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterValue2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitValue2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitValue2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value2Context value2() throws RecognitionException {
		Value2Context _localctx = new Value2Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_value2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(705);
				onClick();
				}
				break;
			case 2:
				{
				setState(706);
				attributeValue();
				}
				break;
			case 3:
				{
				setState(707);
				match(ID);
				setState(708);
				match(DOT);
				setState(709);
				match(ID);
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
		enterRule(_localctx, 74, RULE_onClick);
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				match(OPEN_BRACE);
				{
				setState(713);
				function2();
				}
				setState(714);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(716);
				match(OPEN_BRACE);
				{
				setState(717);
				match(ID);
				}
				setState(718);
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
		enterRule(_localctx, 76, RULE_attributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 81L) != 0)) ) {
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
		enterRule(_localctx, 78, RULE_htmlBody);
		try {
			setState(731);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				_localctx = new MapHtmlBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(OPEN_BRACE);
				setState(724);
				mapMethod2();
				setState(725);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				_localctx = new IfHtmlBodyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				match(OPEN_BRACE);
				setState(728);
				hh();
				setState(729);
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
		enterRule(_localctx, 80, RULE_hh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(ID);
			setState(734);
			match(AND);
			setState(735);
			match(OPEN_PAREN);
			setState(736);
			html();
			setState(737);
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
		enterRule(_localctx, 82, RULE_mapMethod2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(739);
				match(ID);
				setState(740);
				match(DOT);
				}
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(746);
			match(MAP_);
			setState(747);
			match(OPEN_PAREN);
			setState(748);
			match(OPEN_PAREN);
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(749);
				mapParam();
				}
				break;
			}
			setState(752);
			match(CLOSE_PAREN);
			setState(753);
			match(ARROW);
			setState(754);
			match(OPEN_PAREN);
			setState(755);
			html();
			setState(756);
			match(CLOSE_PAREN);
			setState(757);
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
		enterRule(_localctx, 84, RULE_mapParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(759);
				match(ID);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(760);
					match(COMMA);
					}
				}

				}
				}
				setState(767);
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
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public List<TerminalNode> ID() { return getTokens(AngParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(AngParser.DOT, 0); }
		public TerminalNode AWAIT() { return getToken(AngParser.AWAIT, 0); }
		public List<TerminalNode> SingleLineString() { return getTokens(AngParser.SingleLineString); }
		public TerminalNode SingleLineString(int i) {
			return getToken(AngParser.SingleLineString, i);
		}
		public List<MapContext> map() {
			return getRuleContexts(MapContext.class);
		}
		public MapContext map(int i) {
			return getRuleContext(MapContext.class,i);
		}
		public List<CallFunContext> callFun() {
			return getRuleContexts(CallFunContext.class);
		}
		public CallFunContext callFun(int i) {
			return getRuleContext(CallFunContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngParser.COMMA, i);
		}
		public CallFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCallFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCallFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCallFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunContext callFun() throws RecognitionException {
		CallFunContext _localctx = new CallFunContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_callFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(768);
				match(AWAIT);
				}
			}

			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(771);
				match(ID);
				}
				break;
			case 2:
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
			setState(777);
			match(OPEN_PAREN);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACE || _la==AWAIT || _la==SingleLineString || _la==ID) {
				{
				{
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(778);
					match(ID);
					}
					break;
				case 2:
					{
					setState(779);
					match(SingleLineString);
					}
					break;
				case 3:
					{
					setState(780);
					map();
					}
					break;
				case 4:
					{
					setState(781);
					callFun();
					}
					break;
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(784);
					match(COMMA);
					}
				}

				}
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(792);
			match(CLOSE_PAREN);
			setState(793);
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
		enterRule(_localctx, 88, RULE_cssCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==SQ || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2065L) != 0)) {
				{
				{
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT || _la==SQ) {
					{
					setState(795);
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

				setState(798);
				cssKey();
				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(804);
			match(OPEN_BRACE);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2065L) != 0)) {
				{
				{
				setState(805);
				cssInner();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
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
		enterRule(_localctx, 90, RULE_cssKey);
		int _la;
		try {
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(813);
				sy();
				setState(816); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(814);
					match(MINUS);
					setState(815);
					sy();
					}
					}
					setState(818); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				match(WIDTH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(822);
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
		public CssKeyContext cssKey() {
			return getRuleContext(CssKeyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngParser.COLON, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public CallFunContext callFun() {
			return getRuleContext(CallFunContext.class,0);
		}
		public TerminalNode SIME() { return getToken(AngParser.SIME, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(AngParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(AngParser.NUMBER, i);
		}
		public TerminalNode HUN() { return getToken(AngParser.HUN, 0); }
		public List<TerminalNode> PX() { return getTokens(AngParser.PX); }
		public TerminalNode PX(int i) {
			return getToken(AngParser.PX, i);
		}
		public CssInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterCssInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitCssInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitCssInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssInnerContext cssInner() throws RecognitionException {
		CssInnerContext _localctx = new CssInnerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_cssInner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			cssKey();
			setState(826);
			match(COLON);
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(827);
				match(ID);
				}
				break;
			case 2:
				{
				setState(832); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(828);
					match(NUMBER);
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PX) {
						{
						setState(829);
						match(PX);
						}
					}

					}
					}
					setState(834); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case 3:
				{
				{
				setState(836);
				match(NUMBER);
				setState(837);
				match(HUN);
				}
				}
				break;
			case 4:
				{
				setState(838);
				callFun();
				}
				break;
			}
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIME) {
				{
				setState(841);
				match(SIME);
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
		enterRule(_localctx, 94, RULE_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(ENUM);
			setState(845);
			sy();
			setState(846);
			match(OPEN_BRACE);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(847);
				match(ID);
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(848);
					match(COMMA);
					}
				}

				}
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(856);
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
		enterRule(_localctx, 96, RULE_interfaceCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			match(INTERFACE);
			setState(859);
			sy();
			setState(860);
			match(OPEN_BRACE);
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(861);
				match(ID);
				setState(862);
				match(COLON);
				setState(865);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(863);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(864);
					vv();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(867);
				match(SIME);
				}
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(873);
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
		"\u0004\u0001e\u036c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000i\b\u0000"+
		"\n\u0000\f\u0000l\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001r\b\u0001\u0005\u0001t\b\u0001\n\u0001\f\u0001w\t\u0001\u0001"+
		"\u0001\u0003\u0001z\b\u0001\u0001\u0001\u0003\u0001}\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0081\b\u0001\u0005\u0001\u0083\b\u0001\n\u0001"+
		"\f\u0001\u0086\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0005\u0002\u008e\b\u0002\n\u0002\f\u0002\u0091"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0098\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00a1\b\u0003\n\u0003\f\u0003"+
		"\u00a4\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00ba\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c1\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00c5\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e9\b\f\u0005\f\u00eb\b\f\n\f\f\f"+
		"\u00ee\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00f8\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00fd"+
		"\b\u000e\u0005\u000e\u00ff\b\u000e\n\u000e\f\u000e\u0102\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u010b\b\u000f\u000b\u000f\f\u000f\u010c\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0111\b\u000f\u0001\u0010\u0003\u0010\u0114\b"+
		"\u0010\u0001\u0010\u0003\u0010\u0117\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0120"+
		"\b\u0010\u0005\u0010\u0122\b\u0010\n\u0010\f\u0010\u0125\t\u0010\u0001"+
		"\u0010\u0003\u0010\u0128\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u012c"+
		"\b\u0010\u0003\u0010\u012e\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0003\u0011\u0135\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u013a\b\u0011\n\u0011\f\u0011\u013d\t\u0011\u0001"+
		"\u0011\u0003\u0011\u0140\b\u0011\u0001\u0011\u0003\u0011\u0143\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0148\b\u0011\n\u0011"+
		"\f\u0011\u014b\t\u0011\u0001\u0011\u0003\u0011\u014e\b\u0011\u0001\u0011"+
		"\u0003\u0011\u0151\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0156\b\u0011\n\u0011\f\u0011\u0159\t\u0011\u0001\u0011\u0003\u0011\u015c"+
		"\b\u0011\u0001\u0011\u0003\u0011\u015f\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0164\b\u0011\n\u0011\f\u0011\u0167\t\u0011\u0001"+
		"\u0011\u0003\u0011\u016a\b\u0011\u0001\u0011\u0003\u0011\u016d\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0172\b\u0011\n\u0011"+
		"\f\u0011\u0175\t\u0011\u0001\u0011\u0003\u0011\u0178\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u017d\b\u0011\n\u0011\f\u0011\u0180"+
		"\t\u0011\u0001\u0011\u0003\u0011\u0183\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0188\b\u0011\n\u0011\f\u0011\u018b\t\u0011\u0001"+
		"\u0011\u0003\u0011\u018e\b\u0011\u0001\u0011\u0003\u0011\u0191\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0196\b\u0011\n\u0011"+
		"\f\u0011\u0199\t\u0011\u0001\u0011\u0003\u0011\u019c\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u01a1\b\u0011\n\u0011\f\u0011\u01a4"+
		"\t\u0011\u0001\u0011\u0003\u0011\u01a7\b\u0011\u0003\u0011\u01a9\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01ae\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u01b3\b\u0012\u0001\u0012\u0003\u0012"+
		"\u01b6\b\u0012\u0005\u0012\u01b8\b\u0012\n\u0012\f\u0012\u01bb\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0003\u0014\u01c5\b\u0014\u0001\u0014\u0003\u0014"+
		"\u01c8\b\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01cc\b\u0014\n\u0014"+
		"\f\u0014\u01cf\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01d8\b\u0014\u0005\u0014"+
		"\u01da\b\u0014\n\u0014\f\u0014\u01dd\t\u0014\u0001\u0014\u0003\u0014\u01e0"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01e4\b\u0014\u0003\u0014"+
		"\u01e6\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01eb\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u01f1"+
		"\b\u0015\n\u0015\f\u0015\u01f4\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01fd\b\u0015"+
		"\u0005\u0015\u01ff\b\u0015\n\u0015\f\u0015\u0202\t\u0015\u0001\u0015\u0003"+
		"\u0015\u0205\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0209\b\u0015"+
		"\u0003\u0015\u020b\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u020f\b"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0213\b\u0015\u0001\u0015\u0003"+
		"\u0015\u0216\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u021d\b\u0017\u0001\u0017\u0003\u0017\u0220\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0226\b\u0018"+
		"\n\u0018\f\u0018\u0229\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u022f\b\u0019\u0005\u0019\u0231\b\u0019\n\u0019\f\u0019"+
		"\u0234\t\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0238\b\u0019\n\u0019"+
		"\f\u0019\u023b\t\u0019\u0001\u0019\u0003\u0019\u023e\b\u0019\u0001\u0019"+
		"\u0003\u0019\u0241\b\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u0245\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u024b"+
		"\b\u001a\u0001\u001a\u0003\u001a\u024e\b\u001a\u0005\u001a\u0250\b\u001a"+
		"\n\u001a\f\u001a\u0253\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u025d"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0003\u001c\u0263"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003"+
		"\u001c\u026a\b\u001c\u0001\u001c\u0003\u001c\u026d\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0272\b\u001d\u0001\u001d\u0003\u001d"+
		"\u0275\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u027a\b"+
		"\u001d\n\u001d\f\u001d\u027d\t\u001d\u0001\u001d\u0005\u001d\u0280\b\u001d"+
		"\n\u001d\f\u001d\u0283\t\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0287"+
		"\b\u001d\u0003\u001d\u0289\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u028f\b\u001d\u0001\u001e\u0003\u001e\u0292\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0298"+
		"\b\u001e\u0001\u001f\u0003\u001f\u029b\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u029f\b\u001f\u0001 \u0003 \u02a2\b \u0001 \u0001 \u0005"+
		" \u02a6\b \n \f \u02a9\t \u0001!\u0003!\u02ac\b!\u0001!\u0001!\u0001!"+
		"\u0003!\u02b1\b!\u0001!\u0001!\u0003!\u02b5\b!\u0001\"\u0001\"\u0001\""+
		"\u0003\"\u02ba\b\"\u0001\"\u0001\"\u0003\"\u02be\b\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u02c7\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0003%\u02d0\b%\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02dc\b\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0005)\u02e6\b)\n)\f)\u02e9"+
		"\t)\u0001)\u0001)\u0001)\u0001)\u0003)\u02ef\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001*\u0001*\u0003*\u02fa\b*\u0005*\u02fc\b*\n"+
		"*\f*\u02ff\t*\u0001+\u0003+\u0302\b+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u0308\b+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u030f\b+\u0001+\u0003"+
		"+\u0312\b+\u0005+\u0314\b+\n+\f+\u0317\t+\u0001+\u0001+\u0001+\u0001,"+
		"\u0003,\u031d\b,\u0001,\u0005,\u0320\b,\n,\f,\u0323\t,\u0001,\u0001,\u0005"+
		",\u0327\b,\n,\f,\u032a\t,\u0001,\u0001,\u0001-\u0001-\u0001-\u0004-\u0331"+
		"\b-\u000b-\f-\u0332\u0001-\u0001-\u0001-\u0003-\u0338\b-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u033f\b.\u0004.\u0341\b.\u000b.\f.\u0342"+
		"\u0001.\u0001.\u0001.\u0003.\u0348\b.\u0001.\u0003.\u034b\b.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u0352\b/\u0005/\u0354\b/\n/\f/\u0357\t/"+
		"\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0003"+
		"0\u0362\b0\u00010\u00050\u0365\b0\n0\f0\u0368\t0\u00010\u00010\u00010"+
		"\u0000\u00001\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`\u0000\b\u0001"+
		"\u0000DE\u0002\u0000KMcc\u0003\u0000$$0022\u0001\u0000\'(\u0002\u0000"+
		"AAee\u0002\u0000\t\tee\u0003\u0000__ccee\u0002\u0000\u000b\u000b\u001a"+
		"\u001a\u03e7\u0000j\u0001\u0000\u0000\u0000\u0002m\u0001\u0000\u0000\u0000"+
		"\u0004\u008f\u0001\u0000\u0000\u0000\u0006\u009b\u0001\u0000\u0000\u0000"+
		"\b\u00b9\u0001\u0000\u0000\u0000\n\u00bb\u0001\u0000\u0000\u0000\f\u00c8"+
		"\u0001\u0000\u0000\u0000\u000e\u00cc\u0001\u0000\u0000\u0000\u0010\u00d2"+
		"\u0001\u0000\u0000\u0000\u0012\u00d6\u0001\u0000\u0000\u0000\u0014\u00da"+
		"\u0001\u0000\u0000\u0000\u0016\u00de\u0001\u0000\u0000\u0000\u0018\u00e2"+
		"\u0001\u0000\u0000\u0000\u001a\u00f7\u0001\u0000\u0000\u0000\u001c\u00f9"+
		"\u0001\u0000\u0000\u0000\u001e\u0110\u0001\u0000\u0000\u0000 \u0113\u0001"+
		"\u0000\u0000\u0000\"\u01a8\u0001\u0000\u0000\u0000$\u01aa\u0001\u0000"+
		"\u0000\u0000&\u01c1\u0001\u0000\u0000\u0000(\u01c4\u0001\u0000\u0000\u0000"+
		"*\u01ee\u0001\u0000\u0000\u0000,\u0217\u0001\u0000\u0000\u0000.\u0219"+
		"\u0001\u0000\u0000\u00000\u0227\u0001\u0000\u0000\u00002\u022a\u0001\u0000"+
		"\u0000\u00004\u0244\u0001\u0000\u0000\u00006\u0256\u0001\u0000\u0000\u0000"+
		"8\u0262\u0001\u0000\u0000\u0000:\u026e\u0001\u0000\u0000\u0000<\u0291"+
		"\u0001\u0000\u0000\u0000>\u029a\u0001\u0000\u0000\u0000@\u02a1\u0001\u0000"+
		"\u0000\u0000B\u02ab\u0001\u0000\u0000\u0000D\u02b6\u0001\u0000\u0000\u0000"+
		"F\u02bf\u0001\u0000\u0000\u0000H\u02c6\u0001\u0000\u0000\u0000J\u02cf"+
		"\u0001\u0000\u0000\u0000L\u02d1\u0001\u0000\u0000\u0000N\u02db\u0001\u0000"+
		"\u0000\u0000P\u02dd\u0001\u0000\u0000\u0000R\u02e7\u0001\u0000\u0000\u0000"+
		"T\u02fd\u0001\u0000\u0000\u0000V\u0301\u0001\u0000\u0000\u0000X\u0321"+
		"\u0001\u0000\u0000\u0000Z\u0337\u0001\u0000\u0000\u0000\\\u0339\u0001"+
		"\u0000\u0000\u0000^\u034c\u0001\u0000\u0000\u0000`\u035a\u0001\u0000\u0000"+
		"\u0000bi\u0003\u0002\u0001\u0000ci\u0003 \u0010\u0000di\u0003(\u0014\u0000"+
		"ei\u0003\u0004\u0002\u0000fi\u0003^/\u0000gi\u0003`0\u0000hb\u0001\u0000"+
		"\u0000\u0000hc\u0001\u0000\u0000\u0000hd\u0001\u0000\u0000\u0000he\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000k\u0001\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005"+
		"5\u0000\u0000nu\u0005\u0004\u0000\u0000oq\u0005e\u0000\u0000pr\u0005\u0001"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001"+
		"\u0000\u0000\u0000so\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000xz\u0005B\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{}\u0005\u0001"+
		"\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0084"+
		"\u0001\u0000\u0000\u0000~\u0080\u0005e\u0000\u0000\u007f\u0081\u0005\u0001"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000"+
		"\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000"+
		"\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0005\u0000"+
		"\u0000\u0088\u0089\u00057\u0000\u0000\u0089\u008a\u0005c\u0000\u0000\u008a"+
		"\u008b\u0005\u0017\u0000\u0000\u008b\u0003\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0003\b\u0004\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u00053\u0000\u0000\u0093\u0094\u0005"+
		"/\u0000\u0000\u0094\u0097\u0005e\u0000\u0000\u0095\u0096\u0007\u0000\u0000"+
		"\u0000\u0096\u0098\u0005e\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0003\u0006\u0003\u0000\u009a\u0005\u0001\u0000\u0000\u0000"+
		"\u009b\u00a2\u0005\u0004\u0000\u0000\u009c\u00a1\u0003$\u0012\u0000\u009d"+
		"\u00a1\u0003 \u0010\u0000\u009e\u00a1\u0003(\u0014\u0000\u009f\u00a1\u0003"+
		"`0\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0005\u0000"+
		"\u0000\u00a6\u0007\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\b\u0000\u0000"+
		"\u00a8\u00a9\u0005\"\u0000\u0000\u00a9\u00aa\u0005\u0006\u0000\u0000\u00aa"+
		"\u00ab\u0003\n\u0005\u0000\u00ab\u00ac\u0005\u0007\u0000\u0000\u00ac\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\b\u0000\u0000\u00ae\u00af\u0005"+
		"#\u0000\u0000\u00af\u00b0\u0005\u0006\u0000\u0000\u00b0\u00b1\u0003\f"+
		"\u0006\u0000\u00b1\u00b2\u0005\u0007\u0000\u0000\u00b2\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005\b\u0000\u0000\u00b4\u00b5\u0005)\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0006\u0000\u0000\u00b6\u00b7\u0003\u000e\u0007"+
		"\u0000\u00b7\u00b8\u0005\u0007\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b9\u00a7\u0001\u0000\u0000\u0000\u00b9\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b3\u0001\u0000\u0000\u0000\u00ba\t\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0004\u0000\u0000\u00bc\u00bd\u0003\u0010\b\u0000\u00bd"+
		"\u00c0\u0005\u0001\u0000\u0000\u00be\u00c1\u0003\u0012\t\u0000\u00bf\u00c1"+
		"\u0003\u0014\n\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"\u0001\u0000\u0000\u00c3\u00c5\u0003\u0016\u000b\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005\u0005\u0000\u0000\u00c7\u000b\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0005\u0004\u0000\u0000\u00c9\u00ca\u0003"+
		"\u0010\b\u0000\u00ca\u00cb\u0005\u0005\u0000\u0000\u00cb\r\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005\u0004\u0000\u0000\u00cd\u00ce\u0005J\u0000"+
		"\u0000\u00ce\u00cf\u0005\n\u0000\u0000\u00cf\u00d0\u0007\u0001\u0000\u0000"+
		"\u00d0\u00d1\u0005\u0005\u0000\u0000\u00d1\u000f\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005I\u0000\u0000\u00d3\u00d4\u0005\n\u0000\u0000\u00d4"+
		"\u00d5\u0005c\u0000\u0000\u00d5\u0011\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005G\u0000\u0000\u00d7\u00d8\u0005\n\u0000\u0000\u00d8\u00d9\u0005"+
		"c\u0000\u0000\u00d9\u0013\u0001\u0000\u0000\u0000\u00da\u00db\u0005F\u0000"+
		"\u0000\u00db\u00dc\u0005\n\u0000\u0000\u00dc\u00dd\u0003:\u001d\u0000"+
		"\u00dd\u0015\u0001\u0000\u0000\u0000\u00de\u00df\u0005H\u0000\u0000\u00df"+
		"\u00e0\u0005\n\u0000\u0000\u00e0\u00e1\u0003\u001c\u000e\u0000\u00e1\u0017"+
		"\u0001\u0000\u0000\u0000\u00e2\u00ec\u0005\u0004\u0000\u0000\u00e3\u00e4"+
		"\u0005e\u0000\u0000\u00e4\u00e5\u0005\n\u0000\u0000\u00e5\u00e6\u0003"+
		"\u001a\r\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e9\u0005\u0001"+
		"\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e3\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0005"+
		"\u0000\u0000\u00f0\u0019\u0001\u0000\u0000\u0000\u00f1\u00f8\u0003\u001e"+
		"\u000f\u0000\u00f2\u00f8\u0003\u001c\u000e\u0000\u00f3\u00f4\u0005\u001d"+
		"\u0000\u0000\u00f4\u00f5\u0003:\u001d\u0000\u00f5\u00f6\u0005\u001d\u0000"+
		"\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f2\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f8\u001b\u0001\u0000\u0000\u0000\u00f9\u0100\u0005\u0002\u0000"+
		"\u0000\u00fa\u00fc\u0003\u001e\u000f\u0000\u00fb\u00fd\u0005\u0001\u0000"+
		"\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000"+
		"\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0003\u0000"+
		"\u0000\u0104\u001d\u0001\u0000\u0000\u0000\u0105\u0111\u0005c\u0000\u0000"+
		"\u0106\u0111\u0005e\u0000\u0000\u0107\u0111\u0005b\u0000\u0000\u0108\u010a"+
		"\u0005\u001d\u0000\u0000\u0109\u010b\u0003X,\u0000\u010a\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0005\u001d\u0000\u0000\u010f\u0111\u0001\u0000"+
		"\u0000\u0000\u0110\u0105\u0001\u0000\u0000\u0000\u0110\u0106\u0001\u0000"+
		"\u0000\u0000\u0110\u0107\u0001\u0000\u0000\u0000\u0110\u0108\u0001\u0000"+
		"\u0000\u0000\u0111\u001f\u0001\u0000\u0000\u0000\u0112\u0114\u0007\u0002"+
		"\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000"+
		"\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0117\u0007\u0003"+
		"\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u012d\u0005e\u0000"+
		"\u0000\u0119\u0127\u0005\n\u0000\u0000\u011a\u0128\u0005A\u0000\u0000"+
		"\u011b\u0128\u0003&\u0013\u0000\u011c\u0123\u0005\u0002\u0000\u0000\u011d"+
		"\u011f\u0003,\u0016\u0000\u011e\u0120\u0005\u0001\u0000\u0000\u011f\u011e"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0122"+
		"\u0001\u0000\u0000\u0000\u0121\u011d\u0001\u0000\u0000\u0000\u0122\u0125"+
		"\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123"+
		"\u0001\u0000\u0000\u0000\u0126\u0128\u0005\u0003\u0000\u0000\u0127\u011a"+
		"\u0001\u0000\u0000\u0000\u0127\u011b\u0001\u0000\u0000\u0000\u0127\u011c"+
		"\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0005\u0002\u0000\u0000\u012a\u012c\u0005\u0003\u0000\u0000\u012b\u0129"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e"+
		"\u0001\u0000\u0000\u0000\u012d\u0119\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0005\r\u0000\u0000\u0130\u0131\u0003\"\u0011\u0000\u0131\u0132\u0005"+
		"\u0017\u0000\u0000\u0132!\u0001\u0000\u0000\u0000\u0133\u0135\u0005,\u0000"+
		"\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u013f\u0005c\u0000\u0000"+
		"\u0137\u013b\u0005\u0006\u0000\u0000\u0138\u013a\u0003&\u0013\u0000\u0139"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c"+
		"\u013e\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e"+
		"\u0140\u0005\u0007\u0000\u0000\u013f\u0137\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0001\u0000\u0000\u0000\u0140\u01a9\u0001\u0000\u0000\u0000\u0141"+
		"\u0143\u0005,\u0000\u0000\u0142\u0141\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u014d"+
		"\u0005b\u0000\u0000\u0145\u0149\u0005\u0006\u0000\u0000\u0146\u0148\u0003"+
		"&\u0013\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014c\u014e\u0005\u0007\u0000\u0000\u014d\u0145\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u01a9\u0001\u0000"+
		"\u0000\u0000\u014f\u0151\u0005,\u0000\u0000\u0150\u014f\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u015b\u0005e\u0000\u0000\u0153\u0157\u0005\u0006\u0000\u0000"+
		"\u0154\u0156\u0003&\u0013\u0000\u0155\u0154\u0001\u0000\u0000\u0000\u0156"+
		"\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0001\u0000\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000\u0159"+
		"\u0157\u0001\u0000\u0000\u0000\u015a\u015c\u0005\u0007\u0000\u0000\u015b"+
		"\u0153\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c"+
		"\u01a9\u0001\u0000\u0000\u0000\u015d\u015f\u0005,\u0000\u0000\u015e\u015d"+
		"\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0001\u0000\u0000\u0000\u0160\u0169\u0003\u001c\u000e\u0000\u0161\u0165"+
		"\u0005\u0006\u0000\u0000\u0162\u0164\u0003&\u0013\u0000\u0163\u0162\u0001"+
		"\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168\u0001"+
		"\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u016a\u0005"+
		"\u0007\u0000\u0000\u0169\u0161\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u01a9\u0001\u0000\u0000\u0000\u016b\u016d\u0005"+
		",\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0177\u0003\u0018"+
		"\f\u0000\u016f\u0173\u0005\u0006\u0000\u0000\u0170\u0172\u0003&\u0013"+
		"\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000"+
		"\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000"+
		"\u0000\u0176\u0178\u0005\u0007\u0000\u0000\u0177\u016f\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u01a9\u0001\u0000\u0000"+
		"\u0000\u0179\u0182\u00032\u0019\u0000\u017a\u017e\u0005\u0006\u0000\u0000"+
		"\u017b\u017d\u0003&\u0013\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d"+
		"\u0180\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180"+
		"\u017e\u0001\u0000\u0000\u0000\u0181\u0183\u0005\u0007\u0000\u0000\u0182"+
		"\u017a\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183"+
		"\u01a9\u0001\u0000\u0000\u0000\u0184\u018d\u0003*\u0015\u0000\u0185\u0189"+
		"\u0005\u0006\u0000\u0000\u0186\u0188\u0003&\u0013\u0000\u0187\u0186\u0001"+
		"\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0001"+
		"\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018e\u0005"+
		"\u0007\u0000\u0000\u018d\u0185\u0001\u0000\u0000\u0000\u018d\u018e\u0001"+
		"\u0000\u0000\u0000\u018e\u01a9\u0001\u0000\u0000\u0000\u018f\u0191\u0005"+
		",\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u019b\u0003V+\u0000"+
		"\u0193\u0197\u0005\u0006\u0000\u0000\u0194\u0196\u0003&\u0013\u0000\u0195"+
		"\u0194\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198"+
		"\u019a\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a"+
		"\u019c\u0005\u0007\u0000\u0000\u019b\u0193\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0001\u0000\u0000\u0000\u019c\u01a9\u0001\u0000\u0000\u0000\u019d"+
		"\u01a6\u0003(\u0014\u0000\u019e\u01a2\u0005\u0006\u0000\u0000\u019f\u01a1"+
		"\u0003&\u0013\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a7\u0005\u0007\u0000\u0000\u01a6\u019e\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a8\u0134\u0001\u0000\u0000\u0000\u01a8\u0142\u0001"+
		"\u0000\u0000\u0000\u01a8\u0150\u0001\u0000\u0000\u0000\u01a8\u015e\u0001"+
		"\u0000\u0000\u0000\u01a8\u016c\u0001\u0000\u0000\u0000\u01a8\u0179\u0001"+
		"\u0000\u0000\u0000\u01a8\u0184\u0001\u0000\u0000\u0000\u01a8\u0190\u0001"+
		"\u0000\u0000\u0000\u01a8\u019d\u0001\u0000\u0000\u0000\u01a9#\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0005O\u0000\u0000\u01ab\u01b9\u0005\u0006\u0000"+
		"\u0000\u01ac\u01ae\u0007\u0003\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000"+
		"\u0000\u01af\u01b2\u0003&\u0013\u0000\u01b0\u01b1\u0005\n\u0000\u0000"+
		"\u01b1\u01b3\u0007\u0004\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b6\u0005\u0001\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000"+
		"\u01b7\u01ad\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0005\u0007\u0000\u0000\u01bd\u01be\u0005\u0004\u0000\u0000"+
		"\u01be\u01bf\u00030\u0018\u0000\u01bf\u01c0\u0005\u0005\u0000\u0000\u01c0"+
		"%\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005e\u0000\u0000\u01c2\'\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c5\u0005%\u0000\u0000\u01c4\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c8\u0005e\u0000\u0000\u01c7\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cd\u0005\u0006\u0000\u0000\u01ca\u01cc\u0003.\u0017\u0000"+
		"\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000"+
		"\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000"+
		"\u01d0\u01e5\u0005\u0007\u0000\u0000\u01d1\u01df\u0005\n\u0000\u0000\u01d2"+
		"\u01e0\u0005A\u0000\u0000\u01d3\u01e0\u0003&\u0013\u0000\u01d4\u01db\u0005"+
		"\u0002\u0000\u0000\u01d5\u01d7\u0003,\u0016\u0000\u01d6\u01d8\u0005\u0001"+
		"\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d5\u0001\u0000"+
		"\u0000\u0000\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000"+
		"\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01de\u0001\u0000"+
		"\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01e0\u0005\u0003"+
		"\u0000\u0000\u01df\u01d2\u0001\u0000\u0000\u0000\u01df\u01d3\u0001\u0000"+
		"\u0000\u0000\u01df\u01d4\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0005\u0002\u0000\u0000\u01e2\u01e4\u0005\u0003"+
		"\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e6\u0001\u0000\u0000\u0000\u01e5\u01d1\u0001\u0000"+
		"\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e8\u0005\u0004\u0000\u0000\u01e8\u01ea\u00030\u0018"+
		"\u0000\u01e9\u01eb\u00038\u001c\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ed\u0005\u0005\u0000\u0000\u01ed)\u0001\u0000\u0000\u0000\u01ee"+
		"\u01f2\u0005\u0006\u0000\u0000\u01ef\u01f1\u0003.\u0017\u0000\u01f0\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u020a"+
		"\u0005\u0007\u0000\u0000\u01f6\u0204\u0005\n\u0000\u0000\u01f7\u0205\u0005"+
		"A\u0000\u0000\u01f8\u0205\u0003&\u0013\u0000\u01f9\u0200\u0005\u0002\u0000"+
		"\u0000\u01fa\u01fc\u0003,\u0016\u0000\u01fb\u01fd\u0005\u0001\u0000\u0000"+
		"\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000"+
		"\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe\u01fa\u0001\u0000\u0000\u0000"+
		"\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0203\u0001\u0000\u0000\u0000"+
		"\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u0205\u0005\u0003\u0000\u0000"+
		"\u0204\u01f7\u0001\u0000\u0000\u0000\u0204\u01f8\u0001\u0000\u0000\u0000"+
		"\u0204\u01f9\u0001\u0000\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0005\u0002\u0000\u0000\u0207\u0209\u0005\u0003\u0000\u0000"+
		"\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000"+
		"\u0209\u020b\u0001\u0000\u0000\u0000\u020a\u01f6\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000"+
		"\u020c\u020e\u0005\f\u0000\u0000\u020d\u020f\u0005\u0004\u0000\u0000\u020e"+
		"\u020d\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u00030\u0018\u0000\u0211\u0213"+
		"\u00038\u001c\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0212\u0213\u0001"+
		"\u0000\u0000\u0000\u0213\u0215\u0001\u0000\u0000\u0000\u0214\u0216\u0005"+
		"\u0005\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001"+
		"\u0000\u0000\u0000\u0216+\u0001\u0000\u0000\u0000\u0217\u0218\u0005A\u0000"+
		"\u0000\u0218-\u0001\u0000\u0000\u0000\u0219\u021c\u0003&\u0013\u0000\u021a"+
		"\u021b\u0005\n\u0000\u0000\u021b\u021d\u0007\u0004\u0000\u0000\u021c\u021a"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021f"+
		"\u0001\u0000\u0000\u0000\u021e\u0220\u0005\u0001\u0000\u0000\u021f\u021e"+
		"\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220/\u0001"+
		"\u0000\u0000\u0000\u0221\u0226\u0003 \u0010\u0000\u0222\u0226\u00032\u0019"+
		"\u0000\u0223\u0226\u00036\u001b\u0000\u0224\u0226\u0003V+\u0000\u0225"+
		"\u0221\u0001\u0000\u0000\u0000\u0225\u0222\u0001\u0000\u0000\u0000\u0225"+
		"\u0223\u0001\u0000\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226"+
		"\u0229\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0001\u0000\u0000\u0000\u02281\u0001\u0000\u0000\u0000\u0229\u0227"+
		"\u0001\u0000\u0000\u0000\u022a\u0232\u0007\u0005\u0000\u0000\u022b\u022c"+
		"\u0005\u000b\u0000\u0000\u022c\u022e\u0005e\u0000\u0000\u022d\u022f\u0005"+
		"\u000b\u0000\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022b\u0001"+
		"\u0000\u0000\u0000\u0231\u0234\u0001\u0000\u0000\u0000\u0232\u0230\u0001"+
		"\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u023d\u0001"+
		"\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0235\u023e\u0003"+
		"\"\u0011\u0000\u0236\u0238\u00034\u001a\u0000\u0237\u0236\u0001\u0000"+
		"\u0000\u0000\u0238\u023b\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023e\u0001\u0000"+
		"\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023c\u023e\u0005\u0015"+
		"\u0000\u0000\u023d\u0235\u0001\u0000\u0000\u0000\u023d\u0239\u0001\u0000"+
		"\u0000\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u0240\u0001\u0000"+
		"\u0000\u0000\u023f\u0241\u0005\u0017\u0000\u0000\u0240\u023f\u0001\u0000"+
		"\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u02413\u0001\u0000\u0000"+
		"\u0000\u0242\u0243\u0005\u000b\u0000\u0000\u0243\u0245\u0005e\u0000\u0000"+
		"\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0251\u0005\u0006\u0000\u0000"+
		"\u0247\u024b\u0003&\u0013\u0000\u0248\u024b\u0005c\u0000\u0000\u0249\u024b"+
		"\u0003*\u0015\u0000\u024a\u0247\u0001\u0000\u0000\u0000\u024a\u0248\u0001"+
		"\u0000\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024b\u024d\u0001"+
		"\u0000\u0000\u0000\u024c\u024e\u0005\u0001\u0000\u0000\u024d\u024c\u0001"+
		"\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0250\u0001"+
		"\u0000\u0000\u0000\u024f\u024a\u0001\u0000\u0000\u0000\u0250\u0253\u0001"+
		"\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0251\u0252\u0001"+
		"\u0000\u0000\u0000\u0252\u0254\u0001\u0000\u0000\u0000\u0253\u0251\u0001"+
		"\u0000\u0000\u0000\u0254\u0255\u0005\u0007\u0000\u0000\u02555\u0001\u0000"+
		"\u0000\u0000\u0256\u0257\u0005P\u0000\u0000\u0257\u0258\u0005\u000b\u0000"+
		"\u0000\u0258\u0259\u0005Q\u0000\u0000\u0259\u025c\u0005\u0006\u0000\u0000"+
		"\u025a\u025d\u0005c\u0000\u0000\u025b\u025d\u00032\u0019\u0000\u025c\u025a"+
		"\u0001\u0000\u0000\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025d\u025e"+
		"\u0001\u0000\u0000\u0000\u025e\u025f\u0005\u0007\u0000\u0000\u025f\u0260"+
		"\u0005\u0017\u0000\u0000\u02607\u0001\u0000\u0000\u0000\u0261\u0263\u0005"+
		"&\u0000\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000"+
		"\u0000\u0000\u0263\u0269\u0001\u0000\u0000\u0000\u0264\u026a\u00032\u0019"+
		"\u0000\u0265\u026a\u0005c\u0000\u0000\u0266\u026a\u0005b\u0000\u0000\u0267"+
		"\u026a\u0005e\u0000\u0000\u0268\u026a\u0003\u001c\u000e\u0000\u0269\u0264"+
		"\u0001\u0000\u0000\u0000\u0269\u0265\u0001\u0000\u0000\u0000\u0269\u0266"+
		"\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u0268"+
		"\u0001\u0000\u0000\u0000\u026a\u026c\u0001\u0000\u0000\u0000\u026b\u026d"+
		"\u0005\u0017\u0000\u0000\u026c\u026b\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0001\u0000\u0000\u0000\u026d9\u0001\u0000\u0000\u0000\u026e\u026f\u0005"+
		":\u0000\u0000\u026f\u0271\u0005^\u0000\u0000\u0270\u0272\u0003@ \u0000"+
		"\u0271\u0270\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000"+
		"\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u0275\u0005<\u0000\u0000\u0274"+
		"\u0273\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275"+
		"\u0276\u0001\u0000\u0000\u0000\u0276\u028e\u0005;\u0000\u0000\u0277\u0289"+
		"\u0003N\'\u0000\u0278\u027a\u0003:\u001d\u0000\u0279\u0278\u0001\u0000"+
		"\u0000\u0000\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000"+
		"\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u0289\u0001\u0000"+
		"\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u0280\u0005e\u0000"+
		"\u0000\u027f\u027e\u0001\u0000\u0000\u0000\u0280\u0283\u0001\u0000\u0000"+
		"\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000"+
		"\u0000\u0282\u0287\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000"+
		"\u0000\u0284\u0287\u0003<\u001e\u0000\u0285\u0287\u0003>\u001f\u0000\u0286"+
		"\u0281\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0286"+
		"\u0285\u0001\u0000\u0000\u0000\u0287\u0289\u0001\u0000\u0000\u0000\u0288"+
		"\u0277\u0001\u0000\u0000\u0000\u0288\u027b\u0001\u0000\u0000\u0000\u0288"+
		"\u0286\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a"+
		"\u028b\u0005:\u0000\u0000\u028b\u028c\u0005<\u0000\u0000\u028c\u028d\u0005"+
		"^\u0000\u0000\u028d\u028f\u0005;\u0000\u0000\u028e\u0288\u0001\u0000\u0000"+
		"\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f;\u0001\u0000\u0000\u0000"+
		"\u0290\u0292\u0005\u0004\u0000\u0000\u0291\u0290\u0001\u0000\u0000\u0000"+
		"\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000"+
		"\u0293\u0294\u0005e\u0000\u0000\u0294\u0295\u0005\u000b\u0000\u0000\u0295"+
		"\u0297\u0005e\u0000\u0000\u0296\u0298\u0005\u0005\u0000\u0000\u0297\u0296"+
		"\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298=\u0001"+
		"\u0000\u0000\u0000\u0299\u029b\u0005\u0004\u0000\u0000\u029a\u0299\u0001"+
		"\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029b\u029c\u0001"+
		"\u0000\u0000\u0000\u029c\u029e\u0005e\u0000\u0000\u029d\u029f\u0005\u0005"+
		"\u0000\u0000\u029e\u029d\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000"+
		"\u0000\u0000\u029f?\u0001\u0000\u0000\u0000\u02a0\u02a2\u0003F#\u0000"+
		"\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a7\u0001\u0000\u0000\u0000\u02a3\u02a6\u0003B!\u0000\u02a4\u02a6"+
		"\u0003D\"\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a9\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8A\u0001\u0000"+
		"\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa\u02ac\u0005\u0019"+
		"\u0000\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02ae\u0005e\u0000"+
		"\u0000\u02ae\u02b0\u0005\r\u0000\u0000\u02af\u02b1\u0005\u0004\u0000\u0000"+
		"\u02b0\u02af\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b4\u0003H$\u0000\u02b3\u02b5"+
		"\u0005\u0005\u0000\u0000\u02b4\u02b3\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b5C\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005"+
		"/\u0000\u0000\u02b7\u02b9\u0005\r\u0000\u0000\u02b8\u02ba\u0005\u0004"+
		"\u0000\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bd\u0003H$\u0000"+
		"\u02bc\u02be\u0005\u0005\u0000\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000"+
		"\u02bd\u02be\u0001\u0000\u0000\u0000\u02beE\u0001\u0000\u0000\u0000\u02bf"+
		"\u02c0\u0005e\u0000\u0000\u02c0G\u0001\u0000\u0000\u0000\u02c1\u02c7\u0003"+
		"J%\u0000\u02c2\u02c7\u0003L&\u0000\u02c3\u02c4\u0005e\u0000\u0000\u02c4"+
		"\u02c5\u0005\u000b\u0000\u0000\u02c5\u02c7\u0005e\u0000\u0000\u02c6\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c2\u0001\u0000\u0000\u0000\u02c6\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c7I\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005"+
		"\u0004\u0000\u0000\u02c9\u02ca\u0003*\u0015\u0000\u02ca\u02cb\u0005\u0005"+
		"\u0000\u0000\u02cb\u02d0\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005\u0004"+
		"\u0000\u0000\u02cd\u02ce\u0005e\u0000\u0000\u02ce\u02d0\u0005\u0005\u0000"+
		"\u0000\u02cf\u02c8\u0001\u0000\u0000\u0000\u02cf\u02cc\u0001\u0000\u0000"+
		"\u0000\u02d0K\u0001\u0000\u0000\u0000\u02d1\u02d2\u0007\u0006\u0000\u0000"+
		"\u02d2M\u0001\u0000\u0000\u0000\u02d3\u02d4\u0005\u0004\u0000\u0000\u02d4"+
		"\u02d5\u0003R)\u0000\u02d5\u02d6\u0005\u0005\u0000\u0000\u02d6\u02dc\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d8\u0005\u0004\u0000\u0000\u02d8\u02d9\u0003"+
		"P(\u0000\u02d9\u02da\u0005\u0005\u0000\u0000\u02da\u02dc\u0001\u0000\u0000"+
		"\u0000\u02db\u02d3\u0001\u0000\u0000\u0000\u02db\u02d7\u0001\u0000\u0000"+
		"\u0000\u02dcO\u0001\u0000\u0000\u0000\u02dd\u02de\u0005e\u0000\u0000\u02de"+
		"\u02df\u0005\u0012\u0000\u0000\u02df\u02e0\u0005\u0006\u0000\u0000\u02e0"+
		"\u02e1\u0003:\u001d\u0000\u02e1\u02e2\u0005\u0007\u0000\u0000\u02e2Q\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e4\u0005e\u0000\u0000\u02e4\u02e6\u0005\u000b"+
		"\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000"+
		"\u0000\u0000\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000"+
		"\u0000\u0000\u02ea\u02eb\u0005\\\u0000\u0000\u02eb\u02ec\u0005\u0006\u0000"+
		"\u0000\u02ec\u02ee\u0005\u0006\u0000\u0000\u02ed\u02ef\u0003T*\u0000\u02ee"+
		"\u02ed\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005\u0007\u0000\u0000\u02f1"+
		"\u02f2\u0005\f\u0000\u0000\u02f2\u02f3\u0005\u0006\u0000\u0000\u02f3\u02f4"+
		"\u0003:\u001d\u0000\u02f4\u02f5\u0005\u0007\u0000\u0000\u02f5\u02f6\u0005"+
		"\u0007\u0000\u0000\u02f6S\u0001\u0000\u0000\u0000\u02f7\u02f9\u0005e\u0000"+
		"\u0000\u02f8\u02fa\u0005\u0001\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000"+
		"\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fb\u02f7\u0001\u0000\u0000\u0000\u02fc\u02ff\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000"+
		"\u0000\u02feU\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000"+
		"\u0300\u0302\u00059\u0000\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0301"+
		"\u0302\u0001\u0000\u0000\u0000\u0302\u0307\u0001\u0000\u0000\u0000\u0303"+
		"\u0308\u0005e\u0000\u0000\u0304\u0305\u0005e\u0000\u0000\u0305\u0306\u0005"+
		"\u000b\u0000\u0000\u0306\u0308\u0005e\u0000\u0000\u0307\u0303\u0001\u0000"+
		"\u0000\u0000\u0307\u0304\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000"+
		"\u0000\u0000\u0309\u0315\u0005\u0006\u0000\u0000\u030a\u030f\u0005e\u0000"+
		"\u0000\u030b\u030f\u0005c\u0000\u0000\u030c\u030f\u0003\u0018\f\u0000"+
		"\u030d\u030f\u0003V+\u0000\u030e\u030a\u0001\u0000\u0000\u0000\u030e\u030b"+
		"\u0001\u0000\u0000\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030d"+
		"\u0001\u0000\u0000\u0000\u030f\u0311\u0001\u0000\u0000\u0000\u0310\u0312"+
		"\u0005\u0001\u0000\u0000\u0311\u0310\u0001\u0000\u0000\u0000\u0311\u0312"+
		"\u0001\u0000\u0000\u0000\u0312\u0314\u0001\u0000\u0000\u0000\u0313\u030e"+
		"\u0001\u0000\u0000\u0000\u0314\u0317\u0001\u0000\u0000\u0000\u0315\u0313"+
		"\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0318"+
		"\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000\u0000\u0318\u0319"+
		"\u0005\u0007\u0000\u0000\u0319\u031a\u0005\u0017\u0000\u0000\u031aW\u0001"+
		"\u0000\u0000\u0000\u031b\u031d\u0007\u0007\u0000\u0000\u031c\u031b\u0001"+
		"\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031e\u0001"+
		"\u0000\u0000\u0000\u031e\u0320\u0003Z-\u0000\u031f\u031c\u0001\u0000\u0000"+
		"\u0000\u0320\u0323\u0001\u0000\u0000\u0000\u0321\u031f\u0001\u0000\u0000"+
		"\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0324\u0001\u0000\u0000"+
		"\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0324\u0328\u0005\u0004\u0000"+
		"\u0000\u0325\u0327\u0003\\.\u0000\u0326\u0325\u0001\u0000\u0000\u0000"+
		"\u0327\u032a\u0001\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000\u0000"+
		"\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032b\u0001\u0000\u0000\u0000"+
		"\u032a\u0328\u0001\u0000\u0000\u0000\u032b\u032c\u0005\u0005\u0000\u0000"+
		"\u032cY\u0001\u0000\u0000\u0000\u032d\u0330\u0003F#\u0000\u032e\u032f"+
		"\u0005\u000e\u0000\u0000\u032f\u0331\u0003F#\u0000\u0330\u032e\u0001\u0000"+
		"\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000"+
		"\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0338\u0001\u0000"+
		"\u0000\u0000\u0334\u0338\u0005e\u0000\u0000\u0335\u0338\u0005Z\u0000\u0000"+
		"\u0336\u0338\u0005^\u0000\u0000\u0337\u032d\u0001\u0000\u0000\u0000\u0337"+
		"\u0334\u0001\u0000\u0000\u0000\u0337\u0335\u0001\u0000\u0000\u0000\u0337"+
		"\u0336\u0001\u0000\u0000\u0000\u0338[\u0001\u0000\u0000\u0000\u0339\u033a"+
		"\u0003Z-\u0000\u033a\u0347\u0005\n\u0000\u0000\u033b\u0348\u0005e\u0000"+
		"\u0000\u033c\u033e\u0005_\u0000\u0000\u033d\u033f\u0005\u001e\u0000\u0000"+
		"\u033e\u033d\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000"+
		"\u033f\u0341\u0001\u0000\u0000\u0000\u0340\u033c\u0001\u0000\u0000\u0000"+
		"\u0341\u0342\u0001\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000\u0000"+
		"\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0348\u0001\u0000\u0000\u0000"+
		"\u0344\u0345\u0005_\u0000\u0000\u0345\u0348\u0005\u001f\u0000\u0000\u0346"+
		"\u0348\u0003V+\u0000\u0347\u033b\u0001\u0000\u0000\u0000\u0347\u0340\u0001"+
		"\u0000\u0000\u0000\u0347\u0344\u0001\u0000\u0000\u0000\u0347\u0346\u0001"+
		"\u0000\u0000\u0000\u0348\u034a\u0001\u0000\u0000\u0000\u0349\u034b\u0005"+
		"\u0017\u0000\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034a\u034b\u0001"+
		"\u0000\u0000\u0000\u034b]\u0001\u0000\u0000\u0000\u034c\u034d\u0005!\u0000"+
		"\u0000\u034d\u034e\u0003F#\u0000\u034e\u0355\u0005\u0004\u0000\u0000\u034f"+
		"\u0351\u0005e\u0000\u0000\u0350\u0352\u0005\u0001\u0000\u0000\u0351\u0350"+
		"\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u0354"+
		"\u0001\u0000\u0000\u0000\u0353\u034f\u0001\u0000\u0000\u0000\u0354\u0357"+
		"\u0001\u0000\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0356"+
		"\u0001\u0000\u0000\u0000\u0356\u0358\u0001\u0000\u0000\u0000\u0357\u0355"+
		"\u0001\u0000\u0000\u0000\u0358\u0359\u0005\u0005\u0000\u0000\u0359_\u0001"+
		"\u0000\u0000\u0000\u035a\u035b\u0005@\u0000\u0000\u035b\u035c\u0003F#"+
		"\u0000\u035c\u0366\u0005\u0004\u0000\u0000\u035d\u035e\u0005e\u0000\u0000"+
		"\u035e\u0361\u0005\n\u0000\u0000\u035f\u0362\u0005A\u0000\u0000\u0360"+
		"\u0362\u0003&\u0013\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0361\u0360"+
		"\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363\u0365"+
		"\u0005\u0017\u0000\u0000\u0364\u035d\u0001\u0000\u0000\u0000\u0365\u0368"+
		"\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0366\u0367"+
		"\u0001\u0000\u0000\u0000\u0367\u0369\u0001\u0000\u0000\u0000\u0368\u0366"+
		"\u0001\u0000\u0000\u0000\u0369\u036a\u0005\u0005\u0000\u0000\u036aa\u0001"+
		"\u0000\u0000\u0000\u0089hjquy|\u0080\u0084\u008f\u0097\u00a0\u00a2\u00b9"+
		"\u00c0\u00c4\u00e8\u00ec\u00f7\u00fc\u0100\u010c\u0110\u0113\u0116\u011f"+
		"\u0123\u0127\u012b\u012d\u0134\u013b\u013f\u0142\u0149\u014d\u0150\u0157"+
		"\u015b\u015e\u0165\u0169\u016c\u0173\u0177\u017e\u0182\u0189\u018d\u0190"+
		"\u0197\u019b\u01a2\u01a6\u01a8\u01ad\u01b2\u01b5\u01b9\u01c4\u01c7\u01cd"+
		"\u01d7\u01db\u01df\u01e3\u01e5\u01ea\u01f2\u01fc\u0200\u0204\u0208\u020a"+
		"\u020e\u0212\u0215\u021c\u021f\u0225\u0227\u022e\u0232\u0239\u023d\u0240"+
		"\u0244\u024a\u024d\u0251\u025c\u0262\u0269\u026c\u0271\u0274\u027b\u0281"+
		"\u0286\u0288\u028e\u0291\u0297\u029a\u029e\u02a1\u02a5\u02a7\u02ab\u02b0"+
		"\u02b4\u02b9\u02bd\u02c6\u02cf\u02db\u02e7\u02ee\u02f9\u02fd\u0301\u0307"+
		"\u030e\u0311\u0315\u031c\u0321\u0328\u0332\u0337\u033e\u0342\u0347\u034a"+
		"\u0351\u0355\u0361\u0366";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}