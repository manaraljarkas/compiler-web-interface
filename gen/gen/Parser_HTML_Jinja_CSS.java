// Generated from grammar/Parser_HTML_Jinja_CSS.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Parser_HTML_Jinja_CSS extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENTIFIER=1, LT=2, JINJA_OPEN_EXPR=3, JINJA_OPEN_STMT=4, TEXT=5, STYLE_OPEN=6, 
		STYLE_CLOSE=7, GT=8, SLASH=9, EQ=10, STRING=11, ATTR_VALUE=12, DOCTYPE=13, 
		TAG_WS=14, JINJA_CLOSE_EXPR=15, JINJA_CLOSE_STMT=16, FOR=17, IN=18, ENDFOR=19, 
		IF=20, ENDIF=21, NOT=22, DOT=23, JINJA_WS=24, CSS_STYLE_CLOSE=25, LEFT_CURLY=26, 
		RIGHT_CURLY=27, COLON=28, SEMICOLON=29, COMMA=30, CSS_DOT=31, COLOR=32, 
		UNIT=33, NUMBERS=34, CSS_STRING=35, CHARACTERS=36, CSS_WS=37;
	public static final int
		RULE_document = 0, RULE_node = 1, RULE_htmlElement = 2, RULE_doctype = 3, 
		RULE_styleElement = 4, RULE_htmlVoidElement = 5, RULE_jinjaStatement = 6, 
		RULE_jinjaForStatement = 7, RULE_jinjaIfStatement = 8, RULE_ifCondition = 9, 
		RULE_jinjaExpression = 10, RULE_css_rule = 11, RULE_css_selector = 12, 
		RULE_css_property = 13, RULE_css_value = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "node", "htmlElement", "doctype", "styleElement", "htmlVoidElement", 
			"jinjaStatement", "jinjaForStatement", "jinjaIfStatement", "ifCondition", 
			"jinjaExpression", "css_rule", "css_selector", "css_property", "css_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<'", "'{{'", "'{%'", null, "'<style>'", null, "'>'", "'/'", 
			"'='", null, null, null, null, "'}}'", "'%}'", "'for'", "'in'", "'endfor'", 
			"'if'", "'endif'", "'not'", null, null, null, "'{'", "'}'", "':'", "';'", 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENTIFIER", "LT", "JINJA_OPEN_EXPR", "JINJA_OPEN_STMT", "TEXT", 
			"STYLE_OPEN", "STYLE_CLOSE", "GT", "SLASH", "EQ", "STRING", "ATTR_VALUE", 
			"DOCTYPE", "TAG_WS", "JINJA_CLOSE_EXPR", "JINJA_CLOSE_STMT", "FOR", "IN", 
			"ENDFOR", "IF", "ENDIF", "NOT", "DOT", "JINJA_WS", "CSS_STYLE_CLOSE", 
			"LEFT_CURLY", "RIGHT_CURLY", "COLON", "SEMICOLON", "COMMA", "CSS_DOT", 
			"COLOR", "UNIT", "NUMBERS", "CSS_STRING", "CHARACTERS", "CSS_WS"
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
	public String getGrammarFileName() { return "Parser_HTML_Jinja_CSS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser_HTML_Jinja_CSS(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Parser_HTML_Jinja_CSS.EOF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 124L) != 0)) {
				{
				{
				setState(30);
				node();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
	public static class NodeContext extends ParserRuleContext {
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
	 
		public NodeContext() { }
		public void copyFrom(NodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidElements_img_input_br_hrContext extends NodeContext {
		public HtmlVoidElementContext htmlVoidElement() {
			return getRuleContext(HtmlVoidElementContext.class,0);
		}
		public VoidElements_img_input_br_hrContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterVoidElements_img_input_br_hr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitVoidElements_img_input_br_hr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitVoidElements_img_input_br_hr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprNodeContext extends NodeContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaExprNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterJinjaExprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitJinjaExprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitJinjaExprNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNodeContext extends NodeContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterHtmlNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitHtmlNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitHtmlNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStmtNodeContext extends NodeContext {
		public JinjaStatementContext jinjaStatement() {
			return getRuleContext(JinjaStatementContext.class,0);
		}
		public JinjaStmtNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterJinjaStmtNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitJinjaStmtNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitJinjaStmtNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleNodeContext extends NodeContext {
		public StyleElementContext styleElement() {
			return getRuleContext(StyleElementContext.class,0);
		}
		public StyleNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterStyleNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitStyleNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitStyleNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextNodeContext extends NodeContext {
		public TerminalNode TEXT() { return getToken(Parser_HTML_Jinja_CSS.TEXT, 0); }
		public TextNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterTextNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitTextNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitTextNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoctypeNodeContext extends NodeContext {
		public DoctypeContext doctype() {
			return getRuleContext(DoctypeContext.class,0);
		}
		public DoctypeNodeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterDoctypeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitDoctypeNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitDoctypeNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DoctypeNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				doctype();
				}
				break;
			case 2:
				_localctx = new HtmlNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				htmlElement();
				}
				break;
			case 3:
				_localctx = new VoidElements_img_input_br_hrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				htmlVoidElement();
				}
				break;
			case 4:
				_localctx = new StyleNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				styleElement();
				}
				break;
			case 5:
				_localctx = new JinjaStmtNodeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				jinjaStatement();
				}
				break;
			case 6:
				_localctx = new JinjaExprNodeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				jinjaExpression();
				}
				break;
			case 7:
				_localctx = new TextNodeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				match(TEXT);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> LT() { return getTokens(Parser_HTML_Jinja_CSS.LT); }
		public TerminalNode LT(int i) {
			return getToken(Parser_HTML_Jinja_CSS.LT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser_HTML_Jinja_CSS.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser_HTML_Jinja_CSS.IDENTIFIER, i);
		}
		public List<TerminalNode> GT() { return getTokens(Parser_HTML_Jinja_CSS.GT); }
		public TerminalNode GT(int i) {
			return getToken(Parser_HTML_Jinja_CSS.GT, i);
		}
		public TerminalNode SLASH() { return getToken(Parser_HTML_Jinja_CSS.SLASH, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(Parser_HTML_Jinja_CSS.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(Parser_HTML_Jinja_CSS.EQ, i);
		}
		public List<TerminalNode> STRING() { return getTokens(Parser_HTML_Jinja_CSS.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Parser_HTML_Jinja_CSS.STRING, i);
		}
		public List<TerminalNode> ATTR_VALUE() { return getTokens(Parser_HTML_Jinja_CSS.ATTR_VALUE); }
		public TerminalNode ATTR_VALUE(int i) {
			return getToken(Parser_HTML_Jinja_CSS.ATTR_VALUE, i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(LT);
			setState(48);
			match(IDENTIFIER);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(49);
				match(IDENTIFIER);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(50);
					match(EQ);
					setState(51);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==ATTR_VALUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(GT);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(60);
					node();
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(66);
			match(LT);
			setState(67);
			match(SLASH);
			setState(68);
			match(IDENTIFIER);
			setState(69);
			match(GT);
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
	public static class DoctypeContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Parser_HTML_Jinja_CSS.LT, 0); }
		public TerminalNode DOCTYPE() { return getToken(Parser_HTML_Jinja_CSS.DOCTYPE, 0); }
		public DoctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doctype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterDoctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitDoctype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitDoctype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoctypeContext doctype() throws RecognitionException {
		DoctypeContext _localctx = new DoctypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_doctype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(LT);
			setState(72);
			match(DOCTYPE);
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
	public static class StyleElementContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(Parser_HTML_Jinja_CSS.STYLE_OPEN, 0); }
		public TerminalNode CSS_STYLE_CLOSE() { return getToken(Parser_HTML_Jinja_CSS.CSS_STYLE_CLOSE, 0); }
		public List<Css_ruleContext> css_rule() {
			return getRuleContexts(Css_ruleContext.class);
		}
		public Css_ruleContext css_rule(int i) {
			return getRuleContext(Css_ruleContext.class,i);
		}
		public StyleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleElementContext styleElement() throws RecognitionException {
		StyleElementContext _localctx = new StyleElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_styleElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(STYLE_OPEN);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CSS_DOT || _la==CHARACTERS) {
				{
				{
				setState(75);
				css_rule();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(CSS_STYLE_CLOSE);
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
	public static class HtmlVoidElementContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(Parser_HTML_Jinja_CSS.LT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser_HTML_Jinja_CSS.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser_HTML_Jinja_CSS.IDENTIFIER, i);
		}
		public TerminalNode GT() { return getToken(Parser_HTML_Jinja_CSS.GT, 0); }
		public List<TerminalNode> EQ() { return getTokens(Parser_HTML_Jinja_CSS.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(Parser_HTML_Jinja_CSS.EQ, i);
		}
		public List<TerminalNode> STRING() { return getTokens(Parser_HTML_Jinja_CSS.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(Parser_HTML_Jinja_CSS.STRING, i);
		}
		public List<TerminalNode> ATTR_VALUE() { return getTokens(Parser_HTML_Jinja_CSS.ATTR_VALUE); }
		public TerminalNode ATTR_VALUE(int i) {
			return getToken(Parser_HTML_Jinja_CSS.ATTR_VALUE, i);
		}
		public HtmlVoidElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlVoidElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterHtmlVoidElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitHtmlVoidElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitHtmlVoidElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlVoidElementContext htmlVoidElement() throws RecognitionException {
		HtmlVoidElementContext _localctx = new HtmlVoidElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlVoidElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(LT);
			setState(84);
			match(IDENTIFIER);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(85);
				match(IDENTIFIER);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(86);
					match(EQ);
					setState(87);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==ATTR_VALUE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(GT);
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
	public static class JinjaStatementContext extends ParserRuleContext {
		public JinjaForStatementContext jinjaForStatement() {
			return getRuleContext(JinjaForStatementContext.class,0);
		}
		public JinjaIfStatementContext jinjaIfStatement() {
			return getRuleContext(JinjaIfStatementContext.class,0);
		}
		public JinjaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterJinjaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitJinjaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitJinjaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStatementContext jinjaStatement() throws RecognitionException {
		JinjaStatementContext _localctx = new JinjaStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jinjaStatement);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				jinjaForStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				jinjaIfStatement();
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
	public static class JinjaForStatementContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_OPEN_STMT() { return getTokens(Parser_HTML_Jinja_CSS.JINJA_OPEN_STMT); }
		public TerminalNode JINJA_OPEN_STMT(int i) {
			return getToken(Parser_HTML_Jinja_CSS.JINJA_OPEN_STMT, i);
		}
		public TerminalNode FOR() { return getToken(Parser_HTML_Jinja_CSS.FOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser_HTML_Jinja_CSS.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser_HTML_Jinja_CSS.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(Parser_HTML_Jinja_CSS.IN, 0); }
		public List<TerminalNode> JINJA_CLOSE_STMT() { return getTokens(Parser_HTML_Jinja_CSS.JINJA_CLOSE_STMT); }
		public TerminalNode JINJA_CLOSE_STMT(int i) {
			return getToken(Parser_HTML_Jinja_CSS.JINJA_CLOSE_STMT, i);
		}
		public TerminalNode ENDFOR() { return getToken(Parser_HTML_Jinja_CSS.ENDFOR, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public JinjaForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterJinjaForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitJinjaForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitJinjaForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForStatementContext jinjaForStatement() throws RecognitionException {
		JinjaForStatementContext _localctx = new JinjaForStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jinjaForStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(JINJA_OPEN_STMT);
			setState(102);
			match(FOR);
			setState(103);
			match(IDENTIFIER);
			setState(104);
			match(IN);
			setState(105);
			match(IDENTIFIER);
			setState(106);
			match(JINJA_CLOSE_STMT);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					node();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(113);
			match(JINJA_OPEN_STMT);
			setState(114);
			match(ENDFOR);
			setState(115);
			match(JINJA_CLOSE_STMT);
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
	public static class JinjaIfStatementContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_OPEN_STMT() { return getTokens(Parser_HTML_Jinja_CSS.JINJA_OPEN_STMT); }
		public TerminalNode JINJA_OPEN_STMT(int i) {
			return getToken(Parser_HTML_Jinja_CSS.JINJA_OPEN_STMT, i);
		}
		public TerminalNode IF() { return getToken(Parser_HTML_Jinja_CSS.IF, 0); }
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public List<TerminalNode> JINJA_CLOSE_STMT() { return getTokens(Parser_HTML_Jinja_CSS.JINJA_CLOSE_STMT); }
		public TerminalNode JINJA_CLOSE_STMT(int i) {
			return getToken(Parser_HTML_Jinja_CSS.JINJA_CLOSE_STMT, i);
		}
		public TerminalNode ENDIF() { return getToken(Parser_HTML_Jinja_CSS.ENDIF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public JinjaIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterJinjaIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitJinjaIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitJinjaIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIfStatementContext jinjaIfStatement() throws RecognitionException {
		JinjaIfStatementContext _localctx = new JinjaIfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jinjaIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(JINJA_OPEN_STMT);
			setState(118);
			match(IF);
			setState(119);
			ifCondition();
			setState(120);
			match(JINJA_CLOSE_STMT);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					node();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(127);
			match(JINJA_OPEN_STMT);
			setState(128);
			match(ENDIF);
			setState(129);
			match(JINJA_CLOSE_STMT);
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
	public static class IfConditionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser_HTML_Jinja_CSS.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser_HTML_Jinja_CSS.IDENTIFIER, i);
		}
		public TerminalNode NOT() { return getToken(Parser_HTML_Jinja_CSS.NOT, 0); }
		public List<TerminalNode> DOT() { return getTokens(Parser_HTML_Jinja_CSS.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser_HTML_Jinja_CSS.DOT, i);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(131);
				match(NOT);
				}
			}

			setState(134);
			match(IDENTIFIER);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(135);
				match(DOT);
				setState(136);
				match(IDENTIFIER);
				}
				}
				setState(141);
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
	public static class JinjaExpressionContext extends ParserRuleContext {
		public TerminalNode JINJA_OPEN_EXPR() { return getToken(Parser_HTML_Jinja_CSS.JINJA_OPEN_EXPR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parser_HTML_Jinja_CSS.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parser_HTML_Jinja_CSS.IDENTIFIER, i);
		}
		public TerminalNode JINJA_CLOSE_EXPR() { return getToken(Parser_HTML_Jinja_CSS.JINJA_CLOSE_EXPR, 0); }
		public List<TerminalNode> DOT() { return getTokens(Parser_HTML_Jinja_CSS.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parser_HTML_Jinja_CSS.DOT, i);
		}
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jinjaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(JINJA_OPEN_EXPR);
			setState(143);
			match(IDENTIFIER);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(144);
				match(DOT);
				setState(145);
				match(IDENTIFIER);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(JINJA_CLOSE_EXPR);
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
	public static class Css_ruleContext extends ParserRuleContext {
		public Css_selectorContext css_selector() {
			return getRuleContext(Css_selectorContext.class,0);
		}
		public TerminalNode LEFT_CURLY() { return getToken(Parser_HTML_Jinja_CSS.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(Parser_HTML_Jinja_CSS.RIGHT_CURLY, 0); }
		public List<Css_propertyContext> css_property() {
			return getRuleContexts(Css_propertyContext.class);
		}
		public Css_propertyContext css_property(int i) {
			return getRuleContext(Css_propertyContext.class,i);
		}
		public Css_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterCss_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitCss_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitCss_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_ruleContext css_rule() throws RecognitionException {
		Css_ruleContext _localctx = new Css_ruleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_css_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			css_selector();
			setState(154);
			match(LEFT_CURLY);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARACTERS) {
				{
				{
				setState(155);
				css_property();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
	public static class Css_selectorContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTERS() { return getTokens(Parser_HTML_Jinja_CSS.CHARACTERS); }
		public TerminalNode CHARACTERS(int i) {
			return getToken(Parser_HTML_Jinja_CSS.CHARACTERS, i);
		}
		public TerminalNode COLON() { return getToken(Parser_HTML_Jinja_CSS.COLON, 0); }
		public TerminalNode CSS_DOT() { return getToken(Parser_HTML_Jinja_CSS.CSS_DOT, 0); }
		public Css_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterCss_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitCss_selector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitCss_selector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_selectorContext css_selector() throws RecognitionException {
		Css_selectorContext _localctx = new Css_selectorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_css_selector);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(CHARACTERS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(CHARACTERS);
				setState(165);
				match(COLON);
				setState(166);
				match(CHARACTERS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(CSS_DOT);
				setState(168);
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
	public static class Css_propertyContext extends ParserRuleContext {
		public TerminalNode CHARACTERS() { return getToken(Parser_HTML_Jinja_CSS.CHARACTERS, 0); }
		public TerminalNode COLON() { return getToken(Parser_HTML_Jinja_CSS.COLON, 0); }
		public Css_valueContext css_value() {
			return getRuleContext(Css_valueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parser_HTML_Jinja_CSS.SEMICOLON, 0); }
		public Css_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterCss_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitCss_property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitCss_property(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_propertyContext css_property() throws RecognitionException {
		Css_propertyContext _localctx = new Css_propertyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_css_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(CHARACTERS);
			setState(172);
			match(COLON);
			setState(173);
			css_value();
			setState(174);
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
	public static class Css_valueContext extends ParserRuleContext {
		public List<TerminalNode> CHARACTERS() { return getTokens(Parser_HTML_Jinja_CSS.CHARACTERS); }
		public TerminalNode CHARACTERS(int i) {
			return getToken(Parser_HTML_Jinja_CSS.CHARACTERS, i);
		}
		public List<TerminalNode> NUMBERS() { return getTokens(Parser_HTML_Jinja_CSS.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(Parser_HTML_Jinja_CSS.NUMBERS, i);
		}
		public List<TerminalNode> UNIT() { return getTokens(Parser_HTML_Jinja_CSS.UNIT); }
		public TerminalNode UNIT(int i) {
			return getToken(Parser_HTML_Jinja_CSS.UNIT, i);
		}
		public List<TerminalNode> COLOR() { return getTokens(Parser_HTML_Jinja_CSS.COLOR); }
		public TerminalNode COLOR(int i) {
			return getToken(Parser_HTML_Jinja_CSS.COLOR, i);
		}
		public List<TerminalNode> CSS_STRING() { return getTokens(Parser_HTML_Jinja_CSS.CSS_STRING); }
		public TerminalNode CSS_STRING(int i) {
			return getToken(Parser_HTML_Jinja_CSS.CSS_STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser_HTML_Jinja_CSS.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser_HTML_Jinja_CSS.COMMA, i);
		}
		public Css_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).enterCss_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser_HTML_Jinja_CSSListener ) ((Parser_HTML_Jinja_CSSListener)listener).exitCss_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser_HTML_Jinja_CSSVisitor ) return ((Parser_HTML_Jinja_CSSVisitor<? extends T>)visitor).visitCss_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_valueContext css_value() throws RecognitionException {
		Css_valueContext _localctx = new Css_valueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_css_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 134217728000L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 134217728000L) != 0) );
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
		"\u0004\u0001%\u00b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00025\b\u0002\u0005\u00027\b\u0002\n\u0002\f\u0002"+
		":\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002>\b\u0002\n\u0002\f\u0002"+
		"A\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004"+
		"M\b\u0004\n\u0004\f\u0004P\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005Y\b\u0005"+
		"\u0005\u0005[\b\u0005\n\u0005\f\u0005^\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006d\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"m\b\u0007\n\u0007\f\u0007p\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b{\b\b\n\b"+
		"\f\b~\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0003\t\u0085\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u008a\b\t\n\t\f\t\u008d\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u0093\b\n\n\n\f\n\u0096\t\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u009d\b\u000b\n\u000b\f\u000b"+
		"\u00a0\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u00aa\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0004\u000e\u00b2\b\u000e\u000b\u000e\f\u000e\u00b3\u0001"+
		"\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u0000\u0002\u0001\u0000\u000b\f\u0002\u0000"+
		"\u001e\u001e $\u00bd\u0000!\u0001\u0000\u0000\u0000\u0002-\u0001\u0000"+
		"\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000"+
		"\bJ\u0001\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000\fc\u0001\u0000"+
		"\u0000\u0000\u000ee\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000"+
		"\u0012\u0084\u0001\u0000\u0000\u0000\u0014\u008e\u0001\u0000\u0000\u0000"+
		"\u0016\u0099\u0001\u0000\u0000\u0000\u0018\u00a9\u0001\u0000\u0000\u0000"+
		"\u001a\u00ab\u0001\u0000\u0000\u0000\u001c\u00b1\u0001\u0000\u0000\u0000"+
		"\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #"+
		"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0000\u0000\u0001%\u0001\u0001\u0000\u0000\u0000&.\u0003\u0006\u0003"+
		"\u0000\'.\u0003\u0004\u0002\u0000(.\u0003\n\u0005\u0000).\u0003\b\u0004"+
		"\u0000*.\u0003\f\u0006\u0000+.\u0003\u0014\n\u0000,.\u0005\u0005\u0000"+
		"\u0000-&\u0001\u0000\u0000\u0000-\'\u0001\u0000\u0000\u0000-(\u0001\u0000"+
		"\u0000\u0000-)\u0001\u0000\u0000\u0000-*\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0003\u0001\u0000\u0000"+
		"\u0000/0\u0005\u0002\u0000\u000008\u0005\u0001\u0000\u000014\u0005\u0001"+
		"\u0000\u000023\u0005\n\u0000\u000035\u0007\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000061\u0001"+
		"\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000;?\u0005\b\u0000\u0000<>\u0003\u0002\u0001\u0000=<\u0001\u0000\u0000"+
		"\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BC\u0005"+
		"\u0002\u0000\u0000CD\u0005\t\u0000\u0000DE\u0005\u0001\u0000\u0000EF\u0005"+
		"\b\u0000\u0000F\u0005\u0001\u0000\u0000\u0000GH\u0005\u0002\u0000\u0000"+
		"HI\u0005\r\u0000\u0000I\u0007\u0001\u0000\u0000\u0000JN\u0005\u0006\u0000"+
		"\u0000KM\u0003\u0016\u000b\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0019\u0000\u0000"+
		"R\t\u0001\u0000\u0000\u0000ST\u0005\u0002\u0000\u0000T\\\u0005\u0001\u0000"+
		"\u0000UX\u0005\u0001\u0000\u0000VW\u0005\n\u0000\u0000WY\u0007\u0000\u0000"+
		"\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000"+
		"\u0000\u0000ZU\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000_`\u0005\b\u0000\u0000`\u000b\u0001\u0000\u0000"+
		"\u0000ad\u0003\u000e\u0007\u0000bd\u0003\u0010\b\u0000ca\u0001\u0000\u0000"+
		"\u0000cb\u0001\u0000\u0000\u0000d\r\u0001\u0000\u0000\u0000ef\u0005\u0004"+
		"\u0000\u0000fg\u0005\u0011\u0000\u0000gh\u0005\u0001\u0000\u0000hi\u0005"+
		"\u0012\u0000\u0000ij\u0005\u0001\u0000\u0000jn\u0005\u0010\u0000\u0000"+
		"km\u0003\u0002\u0001\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000qr\u0005\u0004\u0000\u0000rs\u0005"+
		"\u0013\u0000\u0000st\u0005\u0010\u0000\u0000t\u000f\u0001\u0000\u0000"+
		"\u0000uv\u0005\u0004\u0000\u0000vw\u0005\u0014\u0000\u0000wx\u0003\u0012"+
		"\t\u0000x|\u0005\u0010\u0000\u0000y{\u0003\u0002\u0001\u0000zy\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\u0004\u0000\u0000\u0080\u0081\u0005\u0015\u0000"+
		"\u0000\u0081\u0082\u0005\u0010\u0000\u0000\u0082\u0011\u0001\u0000\u0000"+
		"\u0000\u0083\u0085\u0005\u0016\u0000\u0000\u0084\u0083\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u008b\u0005\u0001\u0000\u0000\u0087\u0088\u0005\u0017\u0000"+
		"\u0000\u0088\u008a\u0005\u0001\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0013\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0003\u0000"+
		"\u0000\u008f\u0094\u0005\u0001\u0000\u0000\u0090\u0091\u0005\u0017\u0000"+
		"\u0000\u0091\u0093\u0005\u0001\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u000f\u0000"+
		"\u0000\u0098\u0015\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0018\f\u0000"+
		"\u009a\u009e\u0005\u001a\u0000\u0000\u009b\u009d\u0003\u001a\r\u0000\u009c"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005\u001b\u0000\u0000\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3"+
		"\u00aa\u0005$\u0000\u0000\u00a4\u00a5\u0005$\u0000\u0000\u00a5\u00a6\u0005"+
		"\u001c\u0000\u0000\u00a6\u00aa\u0005$\u0000\u0000\u00a7\u00a8\u0005\u001f"+
		"\u0000\u0000\u00a8\u00aa\u0005$\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a4\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u0019\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005$\u0000\u0000"+
		"\u00ac\u00ad\u0005\u001c\u0000\u0000\u00ad\u00ae\u0003\u001c\u000e\u0000"+
		"\u00ae\u00af\u0005\u001d\u0000\u0000\u00af\u001b\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0007\u0001\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u001d\u0001\u0000\u0000\u0000"+
		"\u0011!-48?NX\\cn|\u0084\u008b\u0094\u009e\u00a9\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}