// Generated from C:/Users/user/compiler-web-interface/grammar/Parser_Css.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Parser_Css extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STYLE_O=1, STYLE_C=2, DOT=3, COMMA=4, COLON=5, SEMICOLON=6, LEFT_CURLY=7, 
		RIGHT_CURLY=8, UNIT=9, CHARACTERS=10, NUMBERS=11, STRING=12, COLOR=13, 
		WS=14;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_css_definition = 2, RULE_style_body = 3, 
		RULE_css_header = 4, RULE_colon = 5, RULE_style_content = 6, RULE_property = 7, 
		RULE_value = 8, RULE_value_items = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "css_definition", "style_body", "css_header", 
			"colon", "style_content", "property", "value", "value_items"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<style>'", "'</style>'", "'.'", "','", "':'", "';'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STYLE_O", "STYLE_C", "DOT", "COMMA", "COLON", "SEMICOLON", "LEFT_CURLY", 
			"RIGHT_CURLY", "UNIT", "CHARACTERS", "NUMBERS", "STRING", "COLOR", "WS"
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
	public String getGrammarFileName() { return "Parser_Css.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser_Css(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Parser_Css.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_CssVisitor ) return ((Parser_CssVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STYLE_O) {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(EOF);
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
	public static class CssStmtContext extends StatementContext {
		public Css_definitionContext css_definition() {
			return getRuleContext(Css_definitionContext.class,0);
		}
		public CssStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).enterCssStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).exitCssStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_CssVisitor ) return ((Parser_CssVisitor<? extends T>)visitor).visitCssStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			_localctx = new CssStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			css_definition();
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
	public static class Css_definitionContext extends ParserRuleContext {
		public TerminalNode STYLE_O() { return getToken(Parser_Css.STYLE_O, 0); }
		public TerminalNode STYLE_C() { return getToken(Parser_Css.STYLE_C, 0); }
		public List<Style_bodyContext> style_body() {
			return getRuleContexts(Style_bodyContext.class);
		}
		public Style_bodyContext style_body(int i) {
			return getRuleContext(Style_bodyContext.class,i);
		}
		public Css_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).enterCss_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).exitCss_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_CssVisitor ) return ((Parser_CssVisitor<? extends T>)visitor).visitCss_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_definitionContext css_definition() throws RecognitionException {
		Css_definitionContext _localctx = new Css_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_css_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(STYLE_O);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==CHARACTERS) {
				{
				{
				setState(31);
				style_body();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(STYLE_C);
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
	public static class Style_bodyContext extends ParserRuleContext {
		public Css_headerContext css_header() {
			return getRuleContext(Css_headerContext.class,0);
		}
		public TerminalNode LEFT_CURLY() { return getToken(Parser_Css.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(Parser_Css.RIGHT_CURLY, 0); }
		public List<Style_contentContext> style_content() {
			return getRuleContexts(Style_contentContext.class);
		}
		public Style_contentContext style_content(int i) {
			return getRuleContext(Style_contentContext.class,i);
		}
		public Style_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).enterStyle_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).exitStyle_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_CssVisitor ) return ((Parser_CssVisitor<? extends T>)visitor).visitStyle_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Style_bodyContext style_body() throws RecognitionException {
		Style_bodyContext _localctx = new Style_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_style_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			css_header();
			setState(40);
			match(LEFT_CURLY);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTERS) {
				{
				{
				setState(41);
				style_content();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(RIGHT_CURLY);
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
	public static class Css_headerContext extends ParserRuleContext {
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public TerminalNode CHARACTERS() { return getToken(Parser_Css.CHARACTERS, 0); }
		public TerminalNode DOT() { return getToken(Parser_Css.DOT, 0); }
		public Css_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).enterCss_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).exitCss_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_CssVisitor ) return ((Parser_CssVisitor<? extends T>)visitor).visitCss_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_headerContext css_header() throws RecognitionException {
		Css_headerContext _localctx = new Css_headerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_css_header);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				colon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(CHARACTERS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(DOT);
				setState(52);
				match(CHARACTERS);
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
	public static class ColonContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTERS() { return getTokens(Parser_Css.CHARACTERS); }
		public TerminalNode CHARACTERS(int i) {
			return getToken(Parser_Css.CHARACTERS, i);
		}
		public TerminalNode COLON() { return getToken(Parser_Css.COLON, 0); }
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).exitColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_CssVisitor ) return ((Parser_CssVisitor<? extends T>)visitor).visitColon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(CHARACTERS);
			setState(56);
			match(COLON);
			setState(57);
			match(CHARACTERS);
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
	public static class Style_contentContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parser_Css.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parser_Css.SEMICOLON, 0); }
		public Style_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).enterStyle_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).exitStyle_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_CssVisitor ) return ((Parser_CssVisitor<? extends T>)visitor).visitStyle_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Style_contentContext style_content() throws RecognitionException {
		Style_contentContext _localctx = new Style_contentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_style_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			property();
			setState(60);
			match(COLON);
			setState(61);
			value();
			setState(62);
			match(SEMICOLON);
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
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode CHARACTERS() { return getToken(Parser_Css.CHARACTERS, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_CssVisitor ) return ((Parser_CssVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CHARACTERS);
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
		public List<Value_itemsContext> value_items() {
			return getRuleContexts(Value_itemsContext.class);
		}
		public Value_itemsContext value_items(int i) {
			return getRuleContext(Value_itemsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser_Css.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser_Css.COMMA, i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_CssVisitor ) return ((Parser_CssVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			value_items();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(67);
				match(COMMA);
				setState(68);
				value_items();
				}
				}
				setState(73);
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
	public static class Value_itemsContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTERS() { return getTokens(Parser_Css.CHARACTERS); }
		public TerminalNode CHARACTERS(int i) {
			return getToken(Parser_Css.CHARACTERS, i);
		}
		public List<TerminalNode> NUMBERS() { return getTokens(Parser_Css.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(Parser_Css.NUMBERS, i);
		}
		public List<TerminalNode> UNIT() { return getTokens(Parser_Css.UNIT); }
		public TerminalNode UNIT(int i) {
			return getToken(Parser_Css.UNIT, i);
		}
		public List<TerminalNode> COLOR() { return getTokens(Parser_Css.COLOR); }
		public TerminalNode COLOR(int i) {
			return getToken(Parser_Css.COLOR, i);
		}
		public List<TerminalNode> STRING() { return getTokens(Parser_Css.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Parser_Css.STRING, i);
		}
		public Value_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).enterValue_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_CssListener ) ((Parser_CssListener)listener).exitValue_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_CssVisitor ) return ((Parser_CssVisitor<? extends T>)visitor).visitValue_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_itemsContext value_items() throws RecognitionException {
		Value_itemsContext _localctx = new Value_itemsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_value_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(80);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(74);
					match(CHARACTERS);
					}
					break;
				case 2:
					{
					setState(75);
					match(NUMBERS);
					}
					break;
				case 3:
					{
					setState(76);
					match(NUMBERS);
					setState(77);
					match(UNIT);
					}
					break;
				case 4:
					{
					setState(78);
					match(COLOR);
					}
					break;
				case 5:
					{
					setState(79);
					match(STRING);
					}
					break;
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0) );
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
		"\u0004\u0001\u000eU\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002!\b\u0002\n\u0002\f\u0002$\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"+\b\u0003\n\u0003\f\u0003.\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00046\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\bF\b\b\n\b\f\bI\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0004\tQ\b\t\u000b\t\f\tR\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0000\u0000U\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0002\u001c\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000\u0000"+
		"\u0006\'\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n7\u0001\u0000"+
		"\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000e@\u0001\u0000\u0000\u0000"+
		"\u0010B\u0001\u0000\u0000\u0000\u0012P\u0001\u0000\u0000\u0000\u0014\u0016"+
		"\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0000\u0000\u0001\u001b\u0001"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u0003"+
		"\u0001\u0000\u0000\u0000\u001e\"\u0005\u0001\u0000\u0000\u001f!\u0003"+
		"\u0006\u0003\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000"+
		"\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0005\u0002\u0000\u0000&\u0005"+
		"\u0001\u0000\u0000\u0000\'(\u0003\b\u0004\u0000(,\u0005\u0007\u0000\u0000"+
		")+\u0003\f\u0006\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000"+
		",*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000/0\u0005\b\u0000\u00000\u0007\u0001\u0000"+
		"\u0000\u000016\u0003\n\u0005\u000026\u0005\n\u0000\u000034\u0005\u0003"+
		"\u0000\u000046\u0005\n\u0000\u000051\u0001\u0000\u0000\u000052\u0001\u0000"+
		"\u0000\u000053\u0001\u0000\u0000\u00006\t\u0001\u0000\u0000\u000078\u0005"+
		"\n\u0000\u000089\u0005\u0005\u0000\u00009:\u0005\n\u0000\u0000:\u000b"+
		"\u0001\u0000\u0000\u0000;<\u0003\u000e\u0007\u0000<=\u0005\u0005\u0000"+
		"\u0000=>\u0003\u0010\b\u0000>?\u0005\u0006\u0000\u0000?\r\u0001\u0000"+
		"\u0000\u0000@A\u0005\n\u0000\u0000A\u000f\u0001\u0000\u0000\u0000BG\u0003"+
		"\u0012\t\u0000CD\u0005\u0004\u0000\u0000DF\u0003\u0012\t\u0000EC\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000H\u0011\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JQ\u0005\n\u0000\u0000KQ\u0005\u000b\u0000\u0000LM\u0005\u000b"+
		"\u0000\u0000MQ\u0005\t\u0000\u0000NQ\u0005\r\u0000\u0000OQ\u0005\f\u0000"+
		"\u0000PJ\u0001\u0000\u0000\u0000PK\u0001\u0000\u0000\u0000PL\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"S\u0013\u0001\u0000\u0000\u0000\u0007\u0017\",5GPR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}