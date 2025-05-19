// Generated from C:/Users/owais/Desktop/Code/Code/AngularCompiler/src/Antlr/AngParser.g4 by ANTLR 4.13.2
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
		MultiLineString=100, ID=101, CLASS_NAME=102;
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
			"'templateUrl'", "'styleUrls'", "'selector'", "'providedIn'", "''root''", 
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
			"MultiLineString", "ID", "CLASS_NAME"
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
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
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
			match(OPEN_BRACE);
			setState(154);
			classBody();
			setState(155);
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
	public static class ClassBodyContext extends ParserRuleContext {
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
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1409230309425216L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 137438986241L) != 0)) {
				{
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(157);
					constructor();
					}
					break;
				case 2:
					{
					setState(158);
					variable();
					}
					break;
				case 3:
					{
					setState(159);
					function();
					}
					break;
				case 4:
					{
					setState(160);
					interfaceCode();
					}
					break;
				}
				}
				setState(165);
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
	public static class DecoraterContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngParser.AT, 0); }
		public TerminalNode COMPONENT() { return getToken(AngParser.COMPONENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public ComponentConfigContext componentConfig() {
			return getRuleContext(ComponentConfigContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public TerminalNode DIRECTIVE() { return getToken(AngParser.DIRECTIVE, 0); }
		public DirectiveConfigContext directiveConfig() {
			return getRuleContext(DirectiveConfigContext.class,0);
		}
		public TerminalNode INJECTABLE() { return getToken(AngParser.INJECTABLE, 0); }
		public InjectableConfigContext injectableConfig() {
			return getRuleContext(InjectableConfigContext.class,0);
		}
		public DecoraterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterDecorater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitDecorater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitDecorater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoraterContext decorater() throws RecognitionException {
		DecoraterContext _localctx = new DecoraterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decorater);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(AT);
				setState(167);
				match(COMPONENT);
				setState(168);
				match(OPEN_PAREN);
				setState(169);
				componentConfig();
				setState(170);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(AT);
				setState(173);
				match(DIRECTIVE);
				setState(174);
				match(OPEN_PAREN);
				setState(175);
				directiveConfig();
				setState(176);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(AT);
				setState(179);
				match(INJECTABLE);
				setState(180);
				match(OPEN_PAREN);
				setState(181);
				injectableConfig();
				setState(182);
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
			setState(186);
			match(OPEN_BRACE);
			setState(187);
			selector();
			setState(188);
			match(COMMA);
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATEURL:
				{
				setState(189);
				templateUrl();
				}
				break;
			case TEMPLATE:
				{
				setState(190);
				template();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(193);
				match(COMMA);
				setState(194);
				styleUrls();
				}
			}

			setState(197);
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
			setState(199);
			match(OPEN_BRACE);
			setState(200);
			selector();
			setState(201);
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
			setState(203);
			match(OPEN_BRACE);
			setState(204);
			match(PROVIDEDIN);
			setState(205);
			match(COLON);
			setState(206);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 16777223L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(207);
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
			setState(209);
			match(SELECTOR);
			setState(210);
			match(COLON);
			setState(211);
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
			setState(213);
			match(TEMPLATEURL);
			setState(214);
			match(COLON);
			setState(215);
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
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
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
			setState(217);
			match(TEMPLATE);
			setState(218);
			match(COLON);
			setState(219);
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
			setState(221);
			match(STYLES);
			setState(222);
			match(COLON);
			setState(223);
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
			setState(225);
			match(OPEN_BRACE);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				{
				{
				setState(226);
				match(ID);
				}
				setState(227);
				match(COLON);
				setState(228);
				value();
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(230);
					match(COMMA);
					}
				}

				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
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
		public SubValueContext subValue() {
			return getRuleContext(SubValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<TerminalNode> B_C() { return getTokens(AngParser.B_C); }
		public TerminalNode B_C(int i) {
			return getToken(AngParser.B_C, i);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				subValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(B_C);
				setState(243);
				html();
				setState(244);
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
			setState(248);
			match(OPEN_SQUARE);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==B_C || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 11L) != 0)) {
				{
				{
				setState(249);
				subValue();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(250);
					match(COMMA);
					}
				}

				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
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
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public TerminalNode DECIMEL() { return getToken(AngParser.DECIMEL, 0); }
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
		public SubValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterSubValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitSubValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitSubValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubValueContext subValue() throws RecognitionException {
		SubValueContext _localctx = new SubValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subValue);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineString:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(SingleLineString);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(ID);
				}
				break;
			case DECIMEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(DECIMEL);
				}
				break;
			case B_C:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				match(B_C);
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(264);
					cssCode();
					}
					}
					setState(267); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 67110928L) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2065L) != 0) );
				setState(269);
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
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1407443603030016L) != 0)) {
				{
				setState(273);
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

			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(276);
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

			setState(279);
			match(ID);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(280);
				match(COLON);
				setState(294);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(281);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(282);
					vv();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(283);
					match(OPEN_SQUARE);
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE_) {
						{
						{
						setState(284);
						dd();
						setState(286);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(285);
							match(COMMA);
							}
						}

						}
						}
						setState(292);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(293);
					match(CLOSE_SQUARE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE) {
					{
					setState(296);
					match(OPEN_SQUARE);
					setState(297);
					match(CLOSE_SQUARE);
					}
				}

				}
			}

			setState(302);
			match(EQUAL);
			setState(303);
			variableValue();
			setState(304);
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
		public TerminalNode SingleLineString() { return getToken(AngParser.SingleLineString, 0); }
		public TerminalNode DECIMEL() { return getToken(AngParser.DECIMEL, 0); }
		public TerminalNode ID() { return getToken(AngParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ThisCallContext thisCall() {
			return getRuleContext(ThisCallContext.class,0);
		}
		public Function2Context function2() {
			return getRuleContext(Function2Context.class,0);
		}
		public CallFunContext callFun() {
			return getRuleContext(CallFunContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<TerminalNode> NEW() { return getTokens(AngParser.NEW); }
		public TerminalNode NEW(int i) {
			return getToken(AngParser.NEW, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(AngParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(AngParser.CLOSE_PAREN, 0); }
		public List<VvContext> vv() {
			return getRuleContexts(VvContext.class);
		}
		public VvContext vv(int i) {
			return getRuleContext(VvContext.class,i);
		}
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(306);
				match(NEW);
				}
				break;
			}
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(309);
				match(SingleLineString);
				}
				break;
			case 2:
				{
				setState(310);
				match(DECIMEL);
				}
				break;
			case 3:
				{
				setState(311);
				match(ID);
				}
				break;
			case 4:
				{
				setState(312);
				array();
				}
				break;
			case 5:
				{
				setState(313);
				map();
				}
				break;
			case 6:
				{
				setState(314);
				thisCall();
				}
				break;
			case 7:
				{
				setState(315);
				function2();
				}
				break;
			case 8:
				{
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(316);
					match(NEW);
					}
				}

				setState(319);
				callFun();
				}
				break;
			case 9:
				{
				setState(320);
				function();
				}
				break;
			}
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(323);
				match(OPEN_PAREN);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(324);
					vv();
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				match(CLOSE_PAREN);
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
			setState(333);
			match(CONSTRUCTOR);
			setState(334);
			match(OPEN_PAREN);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & 4611686018427387907L) != 0)) {
				{
				{
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVATE || _la==PUBLIC) {
					{
					setState(335);
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

				setState(338);
				vv();
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(339);
					match(COLON);
					setState(340);
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

				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(343);
					match(COMMA);
					}
				}

				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(CLOSE_PAREN);
			setState(352);
			match(OPEN_BRACE);
			setState(353);
			functionBody();
			setState(354);
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
			setState(356);
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
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(358);
				match(FUNCTION);
				}
			}

			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(361);
				match(ID);
				}
			}

			setState(364);
			match(OPEN_PAREN);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(365);
				functionParams();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			match(CLOSE_PAREN);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(372);
				match(COLON);
				setState(386);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(373);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(374);
					vv();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(375);
					match(OPEN_SQUARE);
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE_) {
						{
						{
						setState(376);
						dd();
						setState(378);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(377);
							match(COMMA);
							}
						}

						}
						}
						setState(384);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(385);
					match(CLOSE_SQUARE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE) {
					{
					setState(388);
					match(OPEN_SQUARE);
					setState(389);
					match(CLOSE_SQUARE);
					}
				}

				}
			}

			setState(394);
			match(OPEN_BRACE);
			setState(395);
			functionBody();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 274877907460L) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 11L) != 0)) {
				{
				setState(396);
				returnStatement();
				}
			}

			setState(399);
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
			setState(401);
			match(OPEN_PAREN);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(402);
				functionParams();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(CLOSE_PAREN);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(409);
				match(COLON);
				setState(423);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(410);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(411);
					vv();
					}
					break;
				case OPEN_SQUARE:
					{
					setState(412);
					match(OPEN_SQUARE);
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DATATYPE_) {
						{
						{
						setState(413);
						dd();
						setState(415);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(414);
							match(COMMA);
							}
						}

						}
						}
						setState(421);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(422);
					match(CLOSE_SQUARE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE) {
					{
					setState(425);
					match(OPEN_SQUARE);
					setState(426);
					match(CLOSE_SQUARE);
					}
				}

				}
			}

			setState(431);
			match(ARROW);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(432);
				match(OPEN_BRACE);
				}
			}

			setState(435);
			functionBody();
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(436);
				returnStatement();
				}
				break;
			}
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(439);
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
			setState(442);
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
			setState(444);
			vv();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(445);
				match(COLON);
				setState(446);
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

			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(449);
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
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(456);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(452);
						variable();
						}
						break;
					case 2:
						{
						setState(453);
						thisCall();
						}
						break;
					case 3:
						{
						setState(454);
						print();
						}
						break;
					case 4:
						{
						setState(455);
						callFun();
						}
						break;
					}
					} 
				}
				setState(460);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
			setState(461);
			_la = _input.LA(1);
			if ( !(_la==THIS || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(462);
					match(DOT);
					setState(463);
					match(ID);
					setState(465);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(464);
						match(DOT);
						}
						break;
					}
					}
					} 
				}
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			}
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(472);
				variableValue();
				}
				break;
			case 2:
				{
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(473);
						dotdot();
						}
						} 
					}
					setState(478);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
				break;
			case 3:
				{
				setState(479);
				match(PLPL);
				}
				break;
			}
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(482);
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
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(485);
				match(DOT);
				setState(486);
				match(ID);
				}
			}

			{
			setState(489);
			match(OPEN_PAREN);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_PAREN || _la==SingleLineString || _la==ID) {
				{
				{
				setState(493);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(490);
					vv();
					}
					break;
				case SingleLineString:
					{
					setState(491);
					match(SingleLineString);
					}
					break;
				case OPEN_PAREN:
					{
					setState(492);
					function2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(495);
					match(COMMA);
					}
				}

				}
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(503);
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
			setState(505);
			match(CONSOLE_);
			setState(506);
			match(DOT);
			setState(507);
			match(LOG_);
			setState(508);
			match(OPEN_PAREN);
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SingleLineString:
				{
				setState(509);
				match(SingleLineString);
				}
				break;
			case THIS:
			case ID:
				{
				setState(510);
				thisCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(513);
			match(CLOSE_PAREN);
			setState(514);
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
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(516);
				match(RETURN);
				}
			}

			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(519);
				thisCall();
				}
				break;
			case 2:
				{
				setState(520);
				match(SingleLineString);
				}
				break;
			case 3:
				{
				setState(521);
				match(DECIMEL);
				}
				break;
			case 4:
				{
				setState(522);
				match(ID);
				}
				break;
			case 5:
				{
				setState(523);
				array();
				}
				break;
			}
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(526);
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
			setState(529);
			match(JSX_OPEN);
			{
			setState(530);
			match(SYNTAX);
			}
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(531);
				htmlinside();
				}
				break;
			}
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JSX_SLASH) {
				{
				setState(534);
				match(JSX_SLASH);
				}
			}

			setState(537);
			match(JSX_CLOSE);
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(538);
					htmlBody();
					}
					break;
				case 2:
					{
					setState(542);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(539);
							html();
							}
							} 
						}
						setState(544);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
					}
					}
					break;
				case 3:
					{
					setState(553);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(548);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==ID) {
							{
							{
							setState(545);
							match(ID);
							}
							}
							setState(550);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(551);
						htmlDot();
						}
						break;
					case 3:
						{
						setState(552);
						htmlVar();
						}
						break;
					}
					}
					break;
				}
				{
				setState(557);
				match(JSX_OPEN);
				setState(558);
				match(JSX_SLASH);
				setState(559);
				match(SYNTAX);
				setState(560);
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
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(563);
				match(OPEN_BRACE);
				}
			}

			setState(566);
			match(ID);
			setState(567);
			match(DOT);
			setState(568);
			match(ID);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(569);
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
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(572);
				match(OPEN_BRACE);
				}
			}

			setState(575);
			match(ID);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(576);
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
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(579);
				sy();
				}
				break;
			}
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI || _la==ID || _la==CLASS_NAME) {
				{
				setState(584);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTI:
				case ID:
					{
					setState(582);
					htmlID();
					}
					break;
				case CLASS_NAME:
					{
					setState(583);
					htmlClass();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(588);
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
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTI) {
				{
				setState(589);
				match(MULTI);
				}
			}

			{
			setState(592);
			match(ID);
			}
			setState(593);
			match(EQUAL);
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(594);
				match(OPEN_BRACE);
				}
				break;
			}
			setState(597);
			value2();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(598);
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
		public TerminalNode CLASS_NAME() { return getToken(AngParser.CLASS_NAME, 0); }
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
			setState(601);
			match(CLASS_NAME);
			}
			setState(602);
			match(EQUAL);
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(603);
				match(OPEN_BRACE);
				}
				break;
			}
			setState(606);
			value2();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_BRACE) {
				{
				setState(607);
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
			setState(610);
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
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(612);
				onClick();
				}
				break;
			case 2:
				{
				setState(613);
				attributeValue();
				}
				break;
			case 3:
				{
				setState(614);
				match(ID);
				setState(615);
				match(DOT);
				setState(616);
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
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(OPEN_BRACE);
				{
				setState(620);
				function2();
				}
				setState(621);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(OPEN_BRACE);
				{
				setState(624);
				match(ID);
				}
				setState(625);
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
			setState(628);
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
		public TerminalNode OPEN_BRACE() { return getToken(AngParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(AngParser.CLOSE_BRACE, 0); }
		public MapMethod2Context mapMethod2() {
			return getRuleContext(MapMethod2Context.class,0);
		}
		public HhContext hh() {
			return getRuleContext(HhContext.class,0);
		}
		public HtmlBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).enterHtmlBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngParserListener ) ((AngParserListener)listener).exitHtmlBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngParserVisitor ) return ((AngParserVisitor<? extends T>)visitor).visitHtmlBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBodyContext htmlBody() throws RecognitionException {
		HtmlBodyContext _localctx = new HtmlBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_htmlBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(OPEN_BRACE);
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(631);
				mapMethod2();
				}
				break;
			case 2:
				{
				setState(632);
				hh();
				}
				break;
			}
			setState(635);
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
			setState(637);
			match(ID);
			setState(638);
			match(AND);
			setState(639);
			match(OPEN_PAREN);
			setState(640);
			html();
			setState(641);
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
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(643);
				match(ID);
				setState(644);
				match(DOT);
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			match(MAP_);
			setState(651);
			match(OPEN_PAREN);
			setState(652);
			match(OPEN_PAREN);
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(653);
				mapParam();
				}
				break;
			}
			setState(656);
			match(CLOSE_PAREN);
			setState(657);
			match(ARROW);
			setState(658);
			match(OPEN_PAREN);
			setState(659);
			html();
			setState(660);
			match(CLOSE_PAREN);
			setState(661);
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
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(663);
				match(ID);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(664);
					match(COMMA);
					}
				}

				}
				}
				setState(671);
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
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AWAIT) {
				{
				setState(672);
				match(AWAIT);
				}
			}

			setState(679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(675);
				match(ID);
				}
				break;
			case 2:
				{
				setState(676);
				match(ID);
				setState(677);
				match(DOT);
				setState(678);
				match(ID);
				}
				break;
			}
			setState(681);
			match(OPEN_PAREN);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_BRACE || _la==AWAIT || _la==SingleLineString || _la==ID) {
				{
				{
				setState(686);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(682);
					match(ID);
					}
					break;
				case 2:
					{
					setState(683);
					match(SingleLineString);
					}
					break;
				case 3:
					{
					setState(684);
					map();
					}
					break;
				case 4:
					{
					setState(685);
					callFun();
					}
					break;
				}
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(688);
					match(COMMA);
					}
				}

				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
			match(CLOSE_PAREN);
			setState(697);
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
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==SQ || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2065L) != 0)) {
				{
				{
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOT || _la==SQ) {
					{
					setState(699);
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

				setState(702);
				cssKey();
				}
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(708);
			match(OPEN_BRACE);
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2065L) != 0)) {
				{
				{
				setState(709);
				cssInner();
				}
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(715);
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
			setState(727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(717);
				sy();
				setState(720); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(718);
					match(MINUS);
					setState(719);
					sy();
					}
					}
					setState(722); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MINUS );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(725);
				match(WIDTH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(726);
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
			setState(729);
			cssKey();
			setState(730);
			match(COLON);
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(731);
				match(ID);
				}
				break;
			case 2:
				{
				setState(736); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(732);
					match(NUMBER);
					setState(734);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PX) {
						{
						setState(733);
						match(PX);
						}
					}

					}
					}
					setState(738); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUMBER );
				}
				break;
			case 3:
				{
				{
				setState(740);
				match(NUMBER);
				setState(741);
				match(HUN);
				}
				}
				break;
			case 4:
				{
				setState(742);
				callFun();
				}
				break;
			}
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIME) {
				{
				setState(745);
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
			setState(748);
			match(ENUM);
			setState(749);
			sy();
			setState(750);
			match(OPEN_BRACE);
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(751);
				match(ID);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(752);
					match(COMMA);
					}
				}

				}
				}
				setState(759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(760);
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
			setState(762);
			match(INTERFACE);
			setState(763);
			sy();
			setState(764);
			match(OPEN_BRACE);
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(765);
				match(ID);
				setState(766);
				match(COLON);
				setState(769);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATATYPE_:
					{
					setState(767);
					match(DATATYPE_);
					}
					break;
				case ID:
					{
					setState(768);
					vv();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(771);
				match(SIME);
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(777);
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
		"\u0004\u0001f\u030c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0002\u0098\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00a2\b\u0003\n"+
		"\u0003\f\u0003\u00a5\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b9\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c0\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00c4\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00e8\b\f\u0005\f\u00ea\b\f\n\f\f\f\u00ed\t"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00f7\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00fc\b\u000e"+
		"\u0005\u000e\u00fe\b\u000e\n\u000e\f\u000e\u0101\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004"+
		"\u000f\u010a\b\u000f\u000b\u000f\f\u000f\u010b\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u0110\b\u000f\u0001\u0010\u0003\u0010\u0113\b\u0010\u0001"+
		"\u0010\u0003\u0010\u0116\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u011f\b\u0010\u0005"+
		"\u0010\u0121\b\u0010\n\u0010\f\u0010\u0124\t\u0010\u0001\u0010\u0003\u0010"+
		"\u0127\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u012b\b\u0010\u0003"+
		"\u0010\u012d\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0003\u0011\u0134\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u013e"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0142\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0146\b\u0011\n\u0011\f\u0011\u0149\t\u0011\u0001"+
		"\u0011\u0003\u0011\u014c\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0151\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0156"+
		"\b\u0012\u0001\u0012\u0003\u0012\u0159\b\u0012\u0005\u0012\u015b\b\u0012"+
		"\n\u0012\f\u0012\u015e\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u0168"+
		"\b\u0014\u0001\u0014\u0003\u0014\u016b\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u016f\b\u0014\n\u0014\f\u0014\u0172\t\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u017b\b\u0014\u0005\u0014\u017d\b\u0014\n\u0014\f\u0014\u0180\t"+
		"\u0014\u0001\u0014\u0003\u0014\u0183\b\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0187\b\u0014\u0003\u0014\u0189\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u018e\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u0194\b\u0015\n\u0015\f\u0015\u0197\t\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u01a0\b\u0015\u0005\u0015\u01a2\b\u0015\n\u0015\f\u0015"+
		"\u01a5\t\u0015\u0001\u0015\u0003\u0015\u01a8\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u01ac\b\u0015\u0003\u0015\u01ae\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01b2\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01b6\b\u0015\u0001\u0015\u0003\u0015\u01b9\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01c0\b\u0017\u0001"+
		"\u0017\u0003\u0017\u01c3\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u01c9\b\u0018\n\u0018\f\u0018\u01cc\t\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01d2\b\u0019\u0005\u0019"+
		"\u01d4\b\u0019\n\u0019\f\u0019\u01d7\t\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u01db\b\u0019\n\u0019\f\u0019\u01de\t\u0019\u0001\u0019\u0003\u0019"+
		"\u01e1\b\u0019\u0001\u0019\u0003\u0019\u01e4\b\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01e8\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01ee\b\u001a\u0001\u001a\u0003\u001a\u01f1\b\u001a"+
		"\u0005\u001a\u01f3\b\u001a\n\u001a\f\u001a\u01f6\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u0200\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0003\u001c\u0206\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u020d\b\u001c\u0001\u001c\u0003\u001c\u0210"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0215\b\u001d"+
		"\u0001\u001d\u0003\u001d\u0218\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u021d\b\u001d\n\u001d\f\u001d\u0220\t\u001d\u0001\u001d\u0005"+
		"\u001d\u0223\b\u001d\n\u001d\f\u001d\u0226\t\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u022a\b\u001d\u0003\u001d\u022c\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0232\b\u001d\u0001\u001e\u0003"+
		"\u001e\u0235\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u023b\b\u001e\u0001\u001f\u0003\u001f\u023e\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0242\b\u001f\u0001 \u0003 \u0245\b \u0001 \u0001"+
		" \u0005 \u0249\b \n \f \u024c\t \u0001!\u0003!\u024f\b!\u0001!\u0001!"+
		"\u0001!\u0003!\u0254\b!\u0001!\u0001!\u0003!\u0258\b!\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u025d\b\"\u0001\"\u0001\"\u0003\"\u0261\b\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u026a\b$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u0273\b%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u027a\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0005)\u0286\b)\n)\f)\u0289\t)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u028f\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0003*\u029a\b*\u0005*\u029c\b*\n*\f*\u029f\t*"+
		"\u0001+\u0003+\u02a2\b+\u0001+\u0001+\u0001+\u0001+\u0003+\u02a8\b+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u02af\b+\u0001+\u0003+\u02b2\b+\u0005"+
		"+\u02b4\b+\n+\f+\u02b7\t+\u0001+\u0001+\u0001+\u0001,\u0003,\u02bd\b,"+
		"\u0001,\u0005,\u02c0\b,\n,\f,\u02c3\t,\u0001,\u0001,\u0005,\u02c7\b,\n"+
		",\f,\u02ca\t,\u0001,\u0001,\u0001-\u0001-\u0001-\u0004-\u02d1\b-\u000b"+
		"-\f-\u02d2\u0001-\u0001-\u0001-\u0003-\u02d8\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u02df\b.\u0004.\u02e1\b.\u000b.\f.\u02e2\u0001.\u0001"+
		".\u0001.\u0003.\u02e8\b.\u0001.\u0003.\u02eb\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u02f2\b/\u0005/\u02f4\b/\n/\f/\u02f7\t/\u0001/\u0001/"+
		"\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u0302\b0\u0001"+
		"0\u00050\u0305\b0\n0\f0\u0308\t0\u00010\u00010\u00010\u0000\u00001\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`\u0000\b\u0001\u0000DE\u0002"+
		"\u0000KMcc\u0003\u0000$$0022\u0001\u0000\'(\u0002\u0000AAee\u0002\u0000"+
		"\t\tee\u0003\u0000__ccee\u0002\u0000\u000b\u000b\u001a\u001a\u0373\u0000"+
		"j\u0001\u0000\u0000\u0000\u0002m\u0001\u0000\u0000\u0000\u0004\u008f\u0001"+
		"\u0000\u0000\u0000\u0006\u00a3\u0001\u0000\u0000\u0000\b\u00b8\u0001\u0000"+
		"\u0000\u0000\n\u00ba\u0001\u0000\u0000\u0000\f\u00c7\u0001\u0000\u0000"+
		"\u0000\u000e\u00cb\u0001\u0000\u0000\u0000\u0010\u00d1\u0001\u0000\u0000"+
		"\u0000\u0012\u00d5\u0001\u0000\u0000\u0000\u0014\u00d9\u0001\u0000\u0000"+
		"\u0000\u0016\u00dd\u0001\u0000\u0000\u0000\u0018\u00e1\u0001\u0000\u0000"+
		"\u0000\u001a\u00f6\u0001\u0000\u0000\u0000\u001c\u00f8\u0001\u0000\u0000"+
		"\u0000\u001e\u010f\u0001\u0000\u0000\u0000 \u0112\u0001\u0000\u0000\u0000"+
		"\"\u0133\u0001\u0000\u0000\u0000$\u014d\u0001\u0000\u0000\u0000&\u0164"+
		"\u0001\u0000\u0000\u0000(\u0167\u0001\u0000\u0000\u0000*\u0191\u0001\u0000"+
		"\u0000\u0000,\u01ba\u0001\u0000\u0000\u0000.\u01bc\u0001\u0000\u0000\u0000"+
		"0\u01ca\u0001\u0000\u0000\u00002\u01cd\u0001\u0000\u0000\u00004\u01e7"+
		"\u0001\u0000\u0000\u00006\u01f9\u0001\u0000\u0000\u00008\u0205\u0001\u0000"+
		"\u0000\u0000:\u0211\u0001\u0000\u0000\u0000<\u0234\u0001\u0000\u0000\u0000"+
		">\u023d\u0001\u0000\u0000\u0000@\u0244\u0001\u0000\u0000\u0000B\u024e"+
		"\u0001\u0000\u0000\u0000D\u0259\u0001\u0000\u0000\u0000F\u0262\u0001\u0000"+
		"\u0000\u0000H\u0269\u0001\u0000\u0000\u0000J\u0272\u0001\u0000\u0000\u0000"+
		"L\u0274\u0001\u0000\u0000\u0000N\u0276\u0001\u0000\u0000\u0000P\u027d"+
		"\u0001\u0000\u0000\u0000R\u0287\u0001\u0000\u0000\u0000T\u029d\u0001\u0000"+
		"\u0000\u0000V\u02a1\u0001\u0000\u0000\u0000X\u02c1\u0001\u0000\u0000\u0000"+
		"Z\u02d7\u0001\u0000\u0000\u0000\\\u02d9\u0001\u0000\u0000\u0000^\u02ec"+
		"\u0001\u0000\u0000\u0000`\u02fa\u0001\u0000\u0000\u0000bi\u0003\u0002"+
		"\u0001\u0000ci\u0003 \u0010\u0000di\u0003(\u0014\u0000ei\u0003\u0004\u0002"+
		"\u0000fi\u0003^/\u0000gi\u0003`0\u0000hb\u0001\u0000\u0000\u0000hc\u0001"+
		"\u0000\u0000\u0000hd\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k\u0001\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u00055\u0000\u0000nu\u0005"+
		"\u0004\u0000\u0000oq\u0005e\u0000\u0000pr\u0005\u0001\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000"+
		"so\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xz\u0005B\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z|\u0001\u0000\u0000\u0000{}\u0005\u0001\u0000\u0000|{\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0084\u0001\u0000\u0000"+
		"\u0000~\u0080\u0005e\u0000\u0000\u007f\u0081\u0005\u0001\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0083\u0086"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0005\u0000\u0000\u0088\u0089"+
		"\u00057\u0000\u0000\u0089\u008a\u0005c\u0000\u0000\u008a\u008b\u0005\u0017"+
		"\u0000\u0000\u008b\u0003\u0001\u0000\u0000\u0000\u008c\u008e\u0003\b\u0004"+
		"\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u00053\u0000\u0000\u0093\u0094\u0005/\u0000\u0000\u0094"+
		"\u0097\u0005e\u0000\u0000\u0095\u0096\u0007\u0000\u0000\u0000\u0096\u0098"+
		"\u0005e\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\u0004\u0000\u0000\u009a\u009b\u0003\u0006\u0003\u0000\u009b\u009c\u0005"+
		"\u0005\u0000\u0000\u009c\u0005\u0001\u0000\u0000\u0000\u009d\u00a2\u0003"+
		"$\u0012\u0000\u009e\u00a2\u0003 \u0010\u0000\u009f\u00a2\u0003(\u0014"+
		"\u0000\u00a0\u00a2\u0003`0\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a1"+
		"\u009e\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u0007\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005\b\u0000\u0000\u00a7\u00a8\u0005\"\u0000\u0000\u00a8\u00a9"+
		"\u0005\u0006\u0000\u0000\u00a9\u00aa\u0003\n\u0005\u0000\u00aa\u00ab\u0005"+
		"\u0007\u0000\u0000\u00ab\u00b9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\b\u0000\u0000\u00ad\u00ae\u0005#\u0000\u0000\u00ae\u00af\u0005\u0006"+
		"\u0000\u0000\u00af\u00b0\u0003\f\u0006\u0000\u00b0\u00b1\u0005\u0007\u0000"+
		"\u0000\u00b1\u00b9\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\b\u0000\u0000"+
		"\u00b3\u00b4\u0005)\u0000\u0000\u00b4\u00b5\u0005\u0006\u0000\u0000\u00b5"+
		"\u00b6\u0003\u000e\u0007\u0000\u00b6\u00b7\u0005\u0007\u0000\u0000\u00b7"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b8\u00a6\u0001\u0000\u0000\u0000\u00b8"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b8\u00b2\u0001\u0000\u0000\u0000\u00b9"+
		"\t\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0004\u0000\u0000\u00bb\u00bc"+
		"\u0003\u0010\b\u0000\u00bc\u00bf\u0005\u0001\u0000\u0000\u00bd\u00c0\u0003"+
		"\u0012\t\u0000\u00be\u00c0\u0003\u0014\n\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0005\u0001\u0000\u0000\u00c2\u00c4\u0003\u0016"+
		"\u000b\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0005"+
		"\u0000\u0000\u00c6\u000b\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0004"+
		"\u0000\u0000\u00c8\u00c9\u0003\u0010\b\u0000\u00c9\u00ca\u0005\u0005\u0000"+
		"\u0000\u00ca\r\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0004\u0000\u0000"+
		"\u00cc\u00cd\u0005J\u0000\u0000\u00cd\u00ce\u0005\n\u0000\u0000\u00ce"+
		"\u00cf\u0007\u0001\u0000\u0000\u00cf\u00d0\u0005\u0005\u0000\u0000\u00d0"+
		"\u000f\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005I\u0000\u0000\u00d2\u00d3"+
		"\u0005\n\u0000\u0000\u00d3\u00d4\u0005c\u0000\u0000\u00d4\u0011\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005G\u0000\u0000\u00d6\u00d7\u0005\n"+
		"\u0000\u0000\u00d7\u00d8\u0005c\u0000\u0000\u00d8\u0013\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005F\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000"+
		"\u00db\u00dc\u0005c\u0000\u0000\u00dc\u0015\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0005H\u0000\u0000\u00de\u00df\u0005\n\u0000\u0000\u00df\u00e0"+
		"\u0003\u001c\u000e\u0000\u00e0\u0017\u0001\u0000\u0000\u0000\u00e1\u00eb"+
		"\u0005\u0004\u0000\u0000\u00e2\u00e3\u0005e\u0000\u0000\u00e3\u00e4\u0005"+
		"\n\u0000\u0000\u00e4\u00e5\u0003\u001a\r\u0000\u00e5\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e8\u0005\u0001\u0000\u0000\u00e7\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e2\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0005\u0000\u0000\u00ef\u0019\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f7\u0003\u001e\u000f\u0000\u00f1\u00f7\u0003\u001c"+
		"\u000e\u0000\u00f2\u00f3\u0005\u001d\u0000\u0000\u00f3\u00f4\u0003:\u001d"+
		"\u0000\u00f4\u00f5\u0005\u001d\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f0\u0001\u0000\u0000\u0000\u00f6\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f7\u001b\u0001\u0000\u0000"+
		"\u0000\u00f8\u00ff\u0005\u0002\u0000\u0000\u00f9\u00fb\u0003\u001e\u000f"+
		"\u0000\u00fa\u00fc\u0005\u0001\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000"+
		"\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"+
		"\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0005\u0003\u0000\u0000\u0103\u001d\u0001\u0000\u0000"+
		"\u0000\u0104\u0110\u0005c\u0000\u0000\u0105\u0110\u0005e\u0000\u0000\u0106"+
		"\u0110\u0005b\u0000\u0000\u0107\u0109\u0005\u001d\u0000\u0000\u0108\u010a"+
		"\u0003X,\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u001d"+
		"\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u0104\u0001\u0000"+
		"\u0000\u0000\u010f\u0105\u0001\u0000\u0000\u0000\u010f\u0106\u0001\u0000"+
		"\u0000\u0000\u010f\u0107\u0001\u0000\u0000\u0000\u0110\u001f\u0001\u0000"+
		"\u0000\u0000\u0111\u0113\u0007\u0002\u0000\u0000\u0112\u0111\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000"+
		"\u0000\u0000\u0114\u0116\u0007\u0003\u0000\u0000\u0115\u0114\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000"+
		"\u0000\u0000\u0117\u012c\u0005e\u0000\u0000\u0118\u0126\u0005\n\u0000"+
		"\u0000\u0119\u0127\u0005A\u0000\u0000\u011a\u0127\u0003&\u0013\u0000\u011b"+
		"\u0122\u0005\u0002\u0000\u0000\u011c\u011e\u0003,\u0016\u0000\u011d\u011f"+
		"\u0005\u0001\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011c"+
		"\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0125"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0127"+
		"\u0005\u0003\u0000\u0000\u0126\u0119\u0001\u0000\u0000\u0000\u0126\u011a"+
		"\u0001\u0000\u0000\u0000\u0126\u011b\u0001\u0000\u0000\u0000\u0127\u012a"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0002\u0000\u0000\u0129\u012b"+
		"\u0005\u0003\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0001\u0000\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0118"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0005\r\u0000\u0000\u012f\u0130\u0003"+
		"\"\u0011\u0000\u0130\u0131\u0005\u0017\u0000\u0000\u0131!\u0001\u0000"+
		"\u0000\u0000\u0132\u0134\u0005,\u0000\u0000\u0133\u0132\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0141\u0001\u0000\u0000"+
		"\u0000\u0135\u0142\u0005c\u0000\u0000\u0136\u0142\u0005b\u0000\u0000\u0137"+
		"\u0142\u0005e\u0000\u0000\u0138\u0142\u0003\u001c\u000e\u0000\u0139\u0142"+
		"\u0003\u0018\f\u0000\u013a\u0142\u00032\u0019\u0000\u013b\u0142\u0003"+
		"*\u0015\u0000\u013c\u013e\u0005,\u0000\u0000\u013d\u013c\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000"+
		"\u0000\u013f\u0142\u0003V+\u0000\u0140\u0142\u0003(\u0014\u0000\u0141"+
		"\u0135\u0001\u0000\u0000\u0000\u0141\u0136\u0001\u0000\u0000\u0000\u0141"+
		"\u0137\u0001\u0000\u0000\u0000\u0141\u0138\u0001\u0000\u0000\u0000\u0141"+
		"\u0139\u0001\u0000\u0000\u0000\u0141\u013a\u0001\u0000\u0000\u0000\u0141"+
		"\u013b\u0001\u0000\u0000\u0000\u0141\u013d\u0001\u0000\u0000\u0000\u0141"+
		"\u0140\u0001\u0000\u0000\u0000\u0142\u014b\u0001\u0000\u0000\u0000\u0143"+
		"\u0147\u0005\u0006\u0000\u0000\u0144\u0146\u0003&\u0013\u0000\u0145\u0144"+
		"\u0001\u0000\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0145"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u014a"+
		"\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014c"+
		"\u0005\u0007\u0000\u0000\u014b\u0143\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c#\u0001\u0000\u0000\u0000\u014d\u014e\u0005"+
		"O\u0000\u0000\u014e\u015c\u0005\u0006\u0000\u0000\u014f\u0151\u0007\u0003"+
		"\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0155\u0003&\u0013"+
		"\u0000\u0153\u0154\u0005\n\u0000\u0000\u0154\u0156\u0007\u0004\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156\u0158\u0001\u0000\u0000\u0000\u0157\u0159\u0005\u0001\u0000\u0000"+
		"\u0158\u0157\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000"+
		"\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u0150\u0001\u0000\u0000\u0000"+
		"\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0001\u0000\u0000\u0000"+
		"\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u0007\u0000\u0000"+
		"\u0160\u0161\u0005\u0004\u0000\u0000\u0161\u0162\u00030\u0018\u0000\u0162"+
		"\u0163\u0005\u0005\u0000\u0000\u0163%\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0005e\u0000\u0000\u0165\'\u0001\u0000\u0000\u0000\u0166\u0168\u0005"+
		"%\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000"+
		"\u0000\u0000\u0168\u016a\u0001\u0000\u0000\u0000\u0169\u016b\u0005e\u0000"+
		"\u0000\u016a\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u0170\u0005\u0006\u0000"+
		"\u0000\u016d\u016f\u0003.\u0017\u0000\u016e\u016d\u0001\u0000\u0000\u0000"+
		"\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0188\u0005\u0007\u0000\u0000"+
		"\u0174\u0182\u0005\n\u0000\u0000\u0175\u0183\u0005A\u0000\u0000\u0176"+
		"\u0183\u0003&\u0013\u0000\u0177\u017e\u0005\u0002\u0000\u0000\u0178\u017a"+
		"\u0003,\u0016\u0000\u0179\u017b\u0005\u0001\u0000\u0000\u017a\u0179\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017d\u0001"+
		"\u0000\u0000\u0000\u017c\u0178\u0001\u0000\u0000\u0000\u017d\u0180\u0001"+
		"\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001"+
		"\u0000\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u017e\u0001"+
		"\u0000\u0000\u0000\u0181\u0183\u0005\u0003\u0000\u0000\u0182\u0175\u0001"+
		"\u0000\u0000\u0000\u0182\u0176\u0001\u0000\u0000\u0000\u0182\u0177\u0001"+
		"\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0185\u0005"+
		"\u0002\u0000\u0000\u0185\u0187\u0005\u0003\u0000\u0000\u0186\u0184\u0001"+
		"\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0189\u0001"+
		"\u0000\u0000\u0000\u0188\u0174\u0001\u0000\u0000\u0000\u0188\u0189\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0005"+
		"\u0004\u0000\u0000\u018b\u018d\u00030\u0018\u0000\u018c\u018e\u00038\u001c"+
		"\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u0005\u0000"+
		"\u0000\u0190)\u0001\u0000\u0000\u0000\u0191\u0195\u0005\u0006\u0000\u0000"+
		"\u0192\u0194\u0003.\u0017\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194"+
		"\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197"+
		"\u0195\u0001\u0000\u0000\u0000\u0198\u01ad\u0005\u0007\u0000\u0000\u0199"+
		"\u01a7\u0005\n\u0000\u0000\u019a\u01a8\u0005A\u0000\u0000\u019b\u01a8"+
		"\u0003&\u0013\u0000\u019c\u01a3\u0005\u0002\u0000\u0000\u019d\u019f\u0003"+
		",\u0016\u0000\u019e\u01a0\u0005\u0001\u0000\u0000\u019f\u019e\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a1\u019d\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a8\u0005\u0003\u0000\u0000\u01a7\u019a\u0001\u0000"+
		"\u0000\u0000\u01a7\u019b\u0001\u0000\u0000\u0000\u01a7\u019c\u0001\u0000"+
		"\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005\u0002"+
		"\u0000\u0000\u01aa\u01ac\u0005\u0003\u0000\u0000\u01ab\u01a9\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ad\u0199\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1\u0005\f\u0000"+
		"\u0000\u01b0\u01b2\u0005\u0004\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b5\u00030\u0018\u0000\u01b4\u01b6\u00038\u001c\u0000\u01b5"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b9\u0005\u0005\u0000\u0000\u01b8"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9"+
		"+\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005A\u0000\u0000\u01bb-\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bf\u0003&\u0013\u0000\u01bd\u01be\u0005\n"+
		"\u0000\u0000\u01be\u01c0\u0007\u0004\u0000\u0000\u01bf\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c3\u0005\u0001\u0000\u0000\u01c2\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3/\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c9\u0003 \u0010\u0000\u01c5\u01c9\u00032\u0019\u0000\u01c6"+
		"\u01c9\u00036\u001b\u0000\u01c7\u01c9\u0003V+\u0000\u01c8\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cb1\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cd\u01d5\u0007\u0005\u0000\u0000\u01ce\u01cf\u0005\u000b"+
		"\u0000\u0000\u01cf\u01d1\u0005e\u0000\u0000\u01d0\u01d2\u0005\u000b\u0000"+
		"\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d4\u0001\u0000\u0000\u0000\u01d3\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d7\u0001\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01e0\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01e1\u0003\"\u0011\u0000"+
		"\u01d9\u01db\u00034\u001a\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01db"+
		"\u01de\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc"+
		"\u01dd\u0001\u0000\u0000\u0000\u01dd\u01e1\u0001\u0000\u0000\u0000\u01de"+
		"\u01dc\u0001\u0000\u0000\u0000\u01df\u01e1\u0005\u0015\u0000\u0000\u01e0"+
		"\u01d8\u0001\u0000\u0000\u0000\u01e0\u01dc\u0001\u0000\u0000\u0000\u01e0"+
		"\u01df\u0001\u0000\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e4\u0005\u0017\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e43\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0005\u000b\u0000\u0000\u01e6\u01e8\u0005e\u0000\u0000\u01e7\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001"+
		"\u0000\u0000\u0000\u01e9\u01f4\u0005\u0006\u0000\u0000\u01ea\u01ee\u0003"+
		"&\u0013\u0000\u01eb\u01ee\u0005c\u0000\u0000\u01ec\u01ee\u0003*\u0015"+
		"\u0000\u01ed\u01ea\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f1\u0005\u0001\u0000\u0000\u01f0\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f2\u01ed\u0001\u0000\u0000\u0000\u01f3\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f7\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0005\u0007\u0000\u0000\u01f85\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fa\u0005P\u0000\u0000\u01fa\u01fb\u0005\u000b\u0000\u0000\u01fb"+
		"\u01fc\u0005Q\u0000\u0000\u01fc\u01ff\u0005\u0006\u0000\u0000\u01fd\u0200"+
		"\u0005c\u0000\u0000\u01fe\u0200\u00032\u0019\u0000\u01ff\u01fd\u0001\u0000"+
		"\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0005\u0007\u0000\u0000\u0202\u0203\u0005\u0017"+
		"\u0000\u0000\u02037\u0001\u0000\u0000\u0000\u0204\u0206\u0005&\u0000\u0000"+
		"\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000"+
		"\u0206\u020c\u0001\u0000\u0000\u0000\u0207\u020d\u00032\u0019\u0000\u0208"+
		"\u020d\u0005c\u0000\u0000\u0209\u020d\u0005b\u0000\u0000\u020a\u020d\u0005"+
		"e\u0000\u0000\u020b\u020d\u0003\u001c\u000e\u0000\u020c\u0207\u0001\u0000"+
		"\u0000\u0000\u020c\u0208\u0001\u0000\u0000\u0000\u020c\u0209\u0001\u0000"+
		"\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020b\u0001\u0000"+
		"\u0000\u0000\u020d\u020f\u0001\u0000\u0000\u0000\u020e\u0210\u0005\u0017"+
		"\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000"+
		"\u0000\u0000\u02109\u0001\u0000\u0000\u0000\u0211\u0212\u0005:\u0000\u0000"+
		"\u0212\u0214\u0005^\u0000\u0000\u0213\u0215\u0003@ \u0000\u0214\u0213"+
		"\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0217"+
		"\u0001\u0000\u0000\u0000\u0216\u0218\u0005<\u0000\u0000\u0217\u0216\u0001"+
		"\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0001"+
		"\u0000\u0000\u0000\u0219\u0231\u0005;\u0000\u0000\u021a\u022c\u0003N\'"+
		"\u0000\u021b\u021d\u0003:\u001d\u0000\u021c\u021b\u0001\u0000\u0000\u0000"+
		"\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u022c\u0001\u0000\u0000\u0000"+
		"\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0223\u0005e\u0000\u0000\u0222"+
		"\u0221\u0001\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224"+
		"\u0222\u0001\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225"+
		"\u022a\u0001\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0227"+
		"\u022a\u0003<\u001e\u0000\u0228\u022a\u0003>\u001f\u0000\u0229\u0224\u0001"+
		"\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u0228\u0001"+
		"\u0000\u0000\u0000\u022a\u022c\u0001\u0000\u0000\u0000\u022b\u021a\u0001"+
		"\u0000\u0000\u0000\u022b\u021e\u0001\u0000\u0000\u0000\u022b\u0229\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e\u0005"+
		":\u0000\u0000\u022e\u022f\u0005<\u0000\u0000\u022f\u0230\u0005^\u0000"+
		"\u0000\u0230\u0232\u0005;\u0000\u0000\u0231\u022b\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0001\u0000\u0000\u0000\u0232;\u0001\u0000\u0000\u0000\u0233"+
		"\u0235\u0005\u0004\u0000\u0000\u0234\u0233\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236"+
		"\u0237\u0005e\u0000\u0000\u0237\u0238\u0005\u000b\u0000\u0000\u0238\u023a"+
		"\u0005e\u0000\u0000\u0239\u023b\u0005\u0005\u0000\u0000\u023a\u0239\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b=\u0001\u0000"+
		"\u0000\u0000\u023c\u023e\u0005\u0004\u0000\u0000\u023d\u023c\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000"+
		"\u0000\u0000\u023f\u0241\u0005e\u0000\u0000\u0240\u0242\u0005\u0005\u0000"+
		"\u0000\u0241\u0240\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000"+
		"\u0000\u0242?\u0001\u0000\u0000\u0000\u0243\u0245\u0003F#\u0000\u0244"+
		"\u0243\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245"+
		"\u024a\u0001\u0000\u0000\u0000\u0246\u0249\u0003B!\u0000\u0247\u0249\u0003"+
		"D\"\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0248\u0247\u0001\u0000"+
		"\u0000\u0000\u0249\u024c\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000"+
		"\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024bA\u0001\u0000\u0000"+
		"\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024d\u024f\u0005\u0019\u0000"+
		"\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0251\u0005e\u0000\u0000"+
		"\u0251\u0253\u0005\r\u0000\u0000\u0252\u0254\u0005\u0004\u0000\u0000\u0253"+
		"\u0252\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0001\u0000\u0000\u0000\u0255\u0257\u0003H$\u0000\u0256\u0258\u0005"+
		"\u0005\u0000\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0257\u0258\u0001"+
		"\u0000\u0000\u0000\u0258C\u0001\u0000\u0000\u0000\u0259\u025a\u0005f\u0000"+
		"\u0000\u025a\u025c\u0005\r\u0000\u0000\u025b\u025d\u0005\u0004\u0000\u0000"+
		"\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u0260\u0003H$\u0000\u025f\u0261"+
		"\u0005\u0005\u0000\u0000\u0260\u025f\u0001\u0000\u0000\u0000\u0260\u0261"+
		"\u0001\u0000\u0000\u0000\u0261E\u0001\u0000\u0000\u0000\u0262\u0263\u0005"+
		"e\u0000\u0000\u0263G\u0001\u0000\u0000\u0000\u0264\u026a\u0003J%\u0000"+
		"\u0265\u026a\u0003L&\u0000\u0266\u0267\u0005e\u0000\u0000\u0267\u0268"+
		"\u0005\u000b\u0000\u0000\u0268\u026a\u0005e\u0000\u0000\u0269\u0264\u0001"+
		"\u0000\u0000\u0000\u0269\u0265\u0001\u0000\u0000\u0000\u0269\u0266\u0001"+
		"\u0000\u0000\u0000\u026aI\u0001\u0000\u0000\u0000\u026b\u026c\u0005\u0004"+
		"\u0000\u0000\u026c\u026d\u0003*\u0015\u0000\u026d\u026e\u0005\u0005\u0000"+
		"\u0000\u026e\u0273\u0001\u0000\u0000\u0000\u026f\u0270\u0005\u0004\u0000"+
		"\u0000\u0270\u0271\u0005e\u0000\u0000\u0271\u0273\u0005\u0005\u0000\u0000"+
		"\u0272\u026b\u0001\u0000\u0000\u0000\u0272\u026f\u0001\u0000\u0000\u0000"+
		"\u0273K\u0001\u0000\u0000\u0000\u0274\u0275\u0007\u0006\u0000\u0000\u0275"+
		"M\u0001\u0000\u0000\u0000\u0276\u0279\u0005\u0004\u0000\u0000\u0277\u027a"+
		"\u0003R)\u0000\u0278\u027a\u0003P(\u0000\u0279\u0277\u0001\u0000\u0000"+
		"\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000"+
		"\u0000\u027b\u027c\u0005\u0005\u0000\u0000\u027cO\u0001\u0000\u0000\u0000"+
		"\u027d\u027e\u0005e\u0000\u0000\u027e\u027f\u0005\u0012\u0000\u0000\u027f"+
		"\u0280\u0005\u0006\u0000\u0000\u0280\u0281\u0003:\u001d\u0000\u0281\u0282"+
		"\u0005\u0007\u0000\u0000\u0282Q\u0001\u0000\u0000\u0000\u0283\u0284\u0005"+
		"e\u0000\u0000\u0284\u0286\u0005\u000b\u0000\u0000\u0285\u0283\u0001\u0000"+
		"\u0000\u0000\u0286\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000"+
		"\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u028a\u0001\u0000"+
		"\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u028a\u028b\u0005\\\u0000"+
		"\u0000\u028b\u028c\u0005\u0006\u0000\u0000\u028c\u028e\u0005\u0006\u0000"+
		"\u0000\u028d\u028f\u0003T*\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e"+
		"\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290"+
		"\u0291\u0005\u0007\u0000\u0000\u0291\u0292\u0005\f\u0000\u0000\u0292\u0293"+
		"\u0005\u0006\u0000\u0000\u0293\u0294\u0003:\u001d\u0000\u0294\u0295\u0005"+
		"\u0007\u0000\u0000\u0295\u0296\u0005\u0007\u0000\u0000\u0296S\u0001\u0000"+
		"\u0000\u0000\u0297\u0299\u0005e\u0000\u0000\u0298\u029a\u0005\u0001\u0000"+
		"\u0000\u0299\u0298\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000"+
		"\u0000\u029a\u029c\u0001\u0000\u0000\u0000\u029b\u0297\u0001\u0000\u0000"+
		"\u0000\u029c\u029f\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029eU\u0001\u0000\u0000\u0000"+
		"\u029f\u029d\u0001\u0000\u0000\u0000\u02a0\u02a2\u00059\u0000\u0000\u02a1"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a7\u0001\u0000\u0000\u0000\u02a3\u02a8\u0005e\u0000\u0000\u02a4\u02a5"+
		"\u0005e\u0000\u0000\u02a5\u02a6\u0005\u000b\u0000\u0000\u02a6\u02a8\u0005"+
		"e\u0000\u0000\u02a7\u02a3\u0001\u0000\u0000\u0000\u02a7\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02b5\u0005\u0006"+
		"\u0000\u0000\u02aa\u02af\u0005e\u0000\u0000\u02ab\u02af\u0005c\u0000\u0000"+
		"\u02ac\u02af\u0003\u0018\f\u0000\u02ad\u02af\u0003V+\u0000\u02ae\u02aa"+
		"\u0001\u0000\u0000\u0000\u02ae\u02ab\u0001\u0000\u0000\u0000\u02ae\u02ac"+
		"\u0001\u0000\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b0\u02b2\u0005\u0001\u0000\u0000\u02b1\u02b0"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b4"+
		"\u0001\u0000\u0000\u0000\u02b3\u02ae\u0001\u0000\u0000\u0000\u02b4\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b8\u0001\u0000\u0000\u0000\u02b7\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b8\u02b9\u0005\u0007\u0000\u0000\u02b9\u02ba"+
		"\u0005\u0017\u0000\u0000\u02baW\u0001\u0000\u0000\u0000\u02bb\u02bd\u0007"+
		"\u0007\u0000\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02c0\u0003"+
		"Z-\u0000\u02bf\u02bc\u0001\u0000\u0000\u0000\u02c0\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c4\u0001\u0000\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c8\u0005\u0004\u0000\u0000\u02c5\u02c7\u0003\\.\u0000"+
		"\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c7\u02ca\u0001\u0000\u0000\u0000"+
		"\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000"+
		"\u02c9\u02cb\u0001\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cc\u0005\u0005\u0000\u0000\u02ccY\u0001\u0000\u0000\u0000\u02cd"+
		"\u02d0\u0003F#\u0000\u02ce\u02cf\u0005\u000e\u0000\u0000\u02cf\u02d1\u0003"+
		"F#\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d3\u02d8\u0001\u0000\u0000\u0000\u02d4\u02d8\u0005e\u0000\u0000"+
		"\u02d5\u02d8\u0005Z\u0000\u0000\u02d6\u02d8\u0005^\u0000\u0000\u02d7\u02cd"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d8[\u0001"+
		"\u0000\u0000\u0000\u02d9\u02da\u0003Z-\u0000\u02da\u02e7\u0005\n\u0000"+
		"\u0000\u02db\u02e8\u0005e\u0000\u0000\u02dc\u02de\u0005_\u0000\u0000\u02dd"+
		"\u02df\u0005\u001e\u0000\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02de"+
		"\u02df\u0001\u0000\u0000\u0000\u02df\u02e1\u0001\u0000\u0000\u0000\u02e0"+
		"\u02dc\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e8\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005_\u0000\u0000\u02e5\u02e8"+
		"\u0005\u001f\u0000\u0000\u02e6\u02e8\u0003V+\u0000\u02e7\u02db\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e0\u0001\u0000\u0000\u0000\u02e7\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e8\u02ea\u0001\u0000"+
		"\u0000\u0000\u02e9\u02eb\u0005\u0017\u0000\u0000\u02ea\u02e9\u0001\u0000"+
		"\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb]\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ed\u0005!\u0000\u0000\u02ed\u02ee\u0003F#\u0000\u02ee"+
		"\u02f5\u0005\u0004\u0000\u0000\u02ef\u02f1\u0005e\u0000\u0000\u02f0\u02f2"+
		"\u0005\u0001\u0000\u0000\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f1\u02f2"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f4\u0001\u0000\u0000\u0000\u02f3\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f4\u02f7\u0001\u0000\u0000\u0000\u02f5\u02f3"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f8"+
		"\u0001\u0000\u0000\u0000\u02f7\u02f5\u0001\u0000\u0000\u0000\u02f8\u02f9"+
		"\u0005\u0005\u0000\u0000\u02f9_\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005"+
		"@\u0000\u0000\u02fb\u02fc\u0003F#\u0000\u02fc\u0306\u0005\u0004\u0000"+
		"\u0000\u02fd\u02fe\u0005e\u0000\u0000\u02fe\u0301\u0005\n\u0000\u0000"+
		"\u02ff\u0302\u0005A\u0000\u0000\u0300\u0302\u0003&\u0013\u0000\u0301\u02ff"+
		"\u0001\u0000\u0000\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0302\u0303"+
		"\u0001\u0000\u0000\u0000\u0303\u0305\u0005\u0017\u0000\u0000\u0304\u02fd"+
		"\u0001\u0000\u0000\u0000\u0305\u0308\u0001\u0000\u0000\u0000\u0306\u0304"+
		"\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0309"+
		"\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000\u0000\u0000\u0309\u030a"+
		"\u0005\u0005\u0000\u0000\u030aa\u0001\u0000\u0000\u0000uhjquy|\u0080\u0084"+
		"\u008f\u0097\u00a1\u00a3\u00b8\u00bf\u00c3\u00e7\u00eb\u00f6\u00fb\u00ff"+
		"\u010b\u010f\u0112\u0115\u011e\u0122\u0126\u012a\u012c\u0133\u013d\u0141"+
		"\u0147\u014b\u0150\u0155\u0158\u015c\u0167\u016a\u0170\u017a\u017e\u0182"+
		"\u0186\u0188\u018d\u0195\u019f\u01a3\u01a7\u01ab\u01ad\u01b1\u01b5\u01b8"+
		"\u01bf\u01c2\u01c8\u01ca\u01d1\u01d5\u01dc\u01e0\u01e3\u01e7\u01ed\u01f0"+
		"\u01f4\u01ff\u0205\u020c\u020f\u0214\u0217\u021e\u0224\u0229\u022b\u0231"+
		"\u0234\u023a\u023d\u0241\u0244\u0248\u024a\u024e\u0253\u0257\u025c\u0260"+
		"\u0269\u0272\u0279\u0287\u028e\u0299\u029d\u02a1\u02a7\u02ae\u02b1\u02b5"+
		"\u02bc\u02c1\u02c8\u02d2\u02d7\u02de\u02e2\u02e7\u02ea\u02f1\u02f5\u0301"+
		"\u0306";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}