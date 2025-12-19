// Generated from C:/Users/user/compiler-web-interface/grammar/Lexer_CSS_Python.g4 by ANTLR 4.13.2

import java.util.Stack;
import java.util.LinkedList;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonToken;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Lexer_CSS_Python extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, NEWLINE=3, FROM=4, IMPORT=5, LOAD=6, DEF=7, RETURN=8, 
		ROUTE=9, INT=10, FOR=11, IN=12, AS=13, GET=14, POST=15, WITH=16, OPEN=17, 
		IMPORT_JSON=18, IF=19, IS=20, IS_NOT=21, EQUAL_EQUAL=22, DEFAULT=23, BREAK=24, 
		COMMA=25, QUOTES=26, EQUAL=27, NOT_EQUAL=28, OPEN_B=29, CLOSE_B=30, Colon=31, 
		AT=32, DOT=33, LEFT_ANGLE=34, RIGHT_ANGLE=35, RIGHT_ARRAY=36, LEFT_ARRAY=37, 
		LEFT_CURLY=38, RIGHT_CURLY=39, PLUS=40, MINUS=41, MUL=42, DIV=43, PLUSEQUAL=44, 
		NUMBERS=45, CHARACTERS=46, STRING=47, WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INDENT_frag", "DEDENT_frag", "INDENT", "DEDENT", "NEWLINE", "FROM", 
			"IMPORT", "LOAD", "DEF", "RETURN", "ROUTE", "INT", "FOR", "IN", "AS", 
			"GET", "POST", "WITH", "OPEN", "IMPORT_JSON", "IF", "IS", "IS_NOT", "EQUAL_EQUAL", 
			"DEFAULT", "BREAK", "COMMA", "QUOTES", "EQUAL", "NOT_EQUAL", "OPEN_B", 
			"CLOSE_B", "Colon", "AT", "DOT", "LEFT_ANGLE", "RIGHT_ANGLE", "RIGHT_ARRAY", 
			"LEFT_ARRAY", "LEFT_CURLY", "RIGHT_CURLY", "PLUS", "MINUS", "MUL", "DIV", 
			"PLUSEQUAL", "NUMBERS", "CHARACTERS", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'from'", "'import'", "'LOAD'", "'def'", "'return'", 
			"'route'", "'int'", "'for'", "'in'", "'as'", "'GET'", "'POST'", "'with'", 
			"'open'", "'import json'", "'if'", "'is'", "'is not'", "'=='", "'default'", 
			"'break'", "','", "'\"'", "'='", "'!='", "'('", "')'", "':'", "'@'", 
			"'.'", "'<'", "'>'", "']'", "'['", "'{'", "'}'", "'+'", "'-'", "'*'", 
			"'/'", "'+='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "NEWLINE", "FROM", "IMPORT", "LOAD", "DEF", 
			"RETURN", "ROUTE", "INT", "FOR", "IN", "AS", "GET", "POST", "WITH", "OPEN", 
			"IMPORT_JSON", "IF", "IS", "IS_NOT", "EQUAL_EQUAL", "DEFAULT", "BREAK", 
			"COMMA", "QUOTES", "EQUAL", "NOT_EQUAL", "OPEN_B", "CLOSE_B", "Colon", 
			"AT", "DOT", "LEFT_ANGLE", "RIGHT_ANGLE", "RIGHT_ARRAY", "LEFT_ARRAY", 
			"LEFT_CURLY", "RIGHT_CURLY", "PLUS", "MINUS", "MUL", "DIV", "PLUSEQUAL", 
			"NUMBERS", "CHARACTERS", "STRING", "WS"
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


	    Stack<Integer> indents = new Stack<>();
	    LinkedList<Token> queue = new LinkedList<>();
	    Token lastToken = null;

	    void emitIndent() { queue.add(new CommonToken(INDENT, "<INDENT>")); }
	    void emitDedent() { queue.add(new CommonToken(DEDENT, "<DEDENT>")); }

	    int countSpaces(String text) {
	        int count = 0;
	        for (char c : text.toCharArray()) {
	            if (c == ' ') count++;
	            else if (c == '\t') count += 4; // أو حسب convention
	        }
	        return count;
	    }

	    @Override
	    public Token nextToken() {
	        if (!queue.isEmpty()) return queue.poll();

	        Token next = super.nextToken();

	if (next.getType() == NEWLINE) {
	    String after = getTextAfterNewline();
	    int newIndent = countSpaces(after);
	    int prevIndent = indents.isEmpty() ? 0 : indents.peek();

	    if (newIndent > prevIndent) {
	        indents.push(newIndent);
	        emitIndent();
	    } else if (newIndent < prevIndent) {
	        while (!indents.isEmpty() && indents.peek() > newIndent) {
	            indents.pop();
	            emitDedent();
	        }
	    }
	}


	        lastToken = next;
	        return queue.isEmpty() ? next : queue.poll();
	    }

	    String getTextAfterNewline() {
	        int start = _input.index();
	        int stop = start;

	        while (_input.LA(1) == ' ' || _input.LA(1) == '\t') {
	            _input.consume();
	            stop++;
	        }

	        return _input.getText(new Interval(start, stop - 1));
	    }


	public Lexer_CSS_Python(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexer_CSS_Python.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u00000\u0125\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004o\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001"+
		",\u0001-\u0001-\u0001-\u0001.\u0004.\u010b\b.\u000b.\f.\u010c\u0001/\u0001"+
		"/\u0005/\u0111\b/\n/\f/\u0114\t/\u00010\u00010\u00050\u0118\b0\n0\f0\u011b"+
		"\t0\u00010\u00010\u00011\u00041\u0120\b1\u000b1\f1\u0121\u00011\u0001"+
		"1\u0000\u00002\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003"+
		"\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019"+
		"\u000b\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013"+
		"+\u0014-\u0015/\u00161\u00173\u00185\u00197\u001a9\u001b;\u001c=\u001d"+
		"?\u001eA\u001fC E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c0\u0001\u0000\u0005\u0001"+
		"\u000009\u0003\u0000AZ__az\u0005\u0000--09AZ__az\u0003\u0000\n\n\r\r\""+
		"\"\u0002\u0000\t\t  \u0127\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000"+
		"E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001"+
		"\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000"+
		"\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000"+
		"S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001"+
		"\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000"+
		"\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000"+
		"a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0001e\u0001"+
		"\u0000\u0000\u0000\u0003g\u0001\u0000\u0000\u0000\u0005i\u0001\u0000\u0000"+
		"\u0000\u0007k\u0001\u0000\u0000\u0000\tn\u0001\u0000\u0000\u0000\u000b"+
		"r\u0001\u0000\u0000\u0000\rw\u0001\u0000\u0000\u0000\u000f~\u0001\u0000"+
		"\u0000\u0000\u0011\u0083\u0001\u0000\u0000\u0000\u0013\u0087\u0001\u0000"+
		"\u0000\u0000\u0015\u008e\u0001\u0000\u0000\u0000\u0017\u0094\u0001\u0000"+
		"\u0000\u0000\u0019\u0098\u0001\u0000\u0000\u0000\u001b\u009c\u0001\u0000"+
		"\u0000\u0000\u001d\u009f\u0001\u0000\u0000\u0000\u001f\u00a2\u0001\u0000"+
		"\u0000\u0000!\u00a6\u0001\u0000\u0000\u0000#\u00ab\u0001\u0000\u0000\u0000"+
		"%\u00b0\u0001\u0000\u0000\u0000\'\u00b5\u0001\u0000\u0000\u0000)\u00c1"+
		"\u0001\u0000\u0000\u0000+\u00c4\u0001\u0000\u0000\u0000-\u00c7\u0001\u0000"+
		"\u0000\u0000/\u00ce\u0001\u0000\u0000\u00001\u00d1\u0001\u0000\u0000\u0000"+
		"3\u00d9\u0001\u0000\u0000\u00005\u00df\u0001\u0000\u0000\u00007\u00e1"+
		"\u0001\u0000\u0000\u00009\u00e3\u0001\u0000\u0000\u0000;\u00e5\u0001\u0000"+
		"\u0000\u0000=\u00e8\u0001\u0000\u0000\u0000?\u00ea\u0001\u0000\u0000\u0000"+
		"A\u00ec\u0001\u0000\u0000\u0000C\u00ee\u0001\u0000\u0000\u0000E\u00f0"+
		"\u0001\u0000\u0000\u0000G\u00f2\u0001\u0000\u0000\u0000I\u00f4\u0001\u0000"+
		"\u0000\u0000K\u00f6\u0001\u0000\u0000\u0000M\u00f8\u0001\u0000\u0000\u0000"+
		"O\u00fa\u0001\u0000\u0000\u0000Q\u00fc\u0001\u0000\u0000\u0000S\u00fe"+
		"\u0001\u0000\u0000\u0000U\u0100\u0001\u0000\u0000\u0000W\u0102\u0001\u0000"+
		"\u0000\u0000Y\u0104\u0001\u0000\u0000\u0000[\u0106\u0001\u0000\u0000\u0000"+
		"]\u010a\u0001\u0000\u0000\u0000_\u010e\u0001\u0000\u0000\u0000a\u0115"+
		"\u0001\u0000\u0000\u0000c\u011f\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000f\u0002\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000"+
		"h\u0004\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0006\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\b\u0001\u0000\u0000\u0000"+
		"mo\u0005\r\u0000\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0005\n\u0000\u0000q\n\u0001\u0000\u0000"+
		"\u0000rs\u0005f\u0000\u0000st\u0005r\u0000\u0000tu\u0005o\u0000\u0000"+
		"uv\u0005m\u0000\u0000v\f\u0001\u0000\u0000\u0000wx\u0005i\u0000\u0000"+
		"xy\u0005m\u0000\u0000yz\u0005p\u0000\u0000z{\u0005o\u0000\u0000{|\u0005"+
		"r\u0000\u0000|}\u0005t\u0000\u0000}\u000e\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005L\u0000\u0000\u007f\u0080\u0005O\u0000\u0000\u0080\u0081\u0005A"+
		"\u0000\u0000\u0081\u0082\u0005D\u0000\u0000\u0082\u0010\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005d\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085"+
		"\u0086\u0005f\u0000\u0000\u0086\u0012\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005r\u0000\u0000\u0088\u0089\u0005e\u0000\u0000\u0089\u008a\u0005t"+
		"\u0000\u0000\u008a\u008b\u0005u\u0000\u0000\u008b\u008c\u0005r\u0000\u0000"+
		"\u008c\u008d\u0005n\u0000\u0000\u008d\u0014\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005r\u0000\u0000\u008f\u0090\u0005o\u0000\u0000\u0090\u0091\u0005"+
		"u\u0000\u0000\u0091\u0092\u0005t\u0000\u0000\u0092\u0093\u0005e\u0000"+
		"\u0000\u0093\u0016\u0001\u0000\u0000\u0000\u0094\u0095\u0005i\u0000\u0000"+
		"\u0095\u0096\u0005n\u0000\u0000\u0096\u0097\u0005t\u0000\u0000\u0097\u0018"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0005f\u0000\u0000\u0099\u009a\u0005"+
		"o\u0000\u0000\u009a\u009b\u0005r\u0000\u0000\u009b\u001a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005i\u0000\u0000\u009d\u009e\u0005n\u0000\u0000\u009e"+
		"\u001c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005a\u0000\u0000\u00a0\u00a1"+
		"\u0005s\u0000\u0000\u00a1\u001e\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"G\u0000\u0000\u00a3\u00a4\u0005E\u0000\u0000\u00a4\u00a5\u0005T\u0000"+
		"\u0000\u00a5 \u0001\u0000\u0000\u0000\u00a6\u00a7\u0005P\u0000\u0000\u00a7"+
		"\u00a8\u0005O\u0000\u0000\u00a8\u00a9\u0005S\u0000\u0000\u00a9\u00aa\u0005"+
		"T\u0000\u0000\u00aa\"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005w\u0000"+
		"\u0000\u00ac\u00ad\u0005i\u0000\u0000\u00ad\u00ae\u0005t\u0000\u0000\u00ae"+
		"\u00af\u0005h\u0000\u0000\u00af$\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"o\u0000\u0000\u00b1\u00b2\u0005p\u0000\u0000\u00b2\u00b3\u0005e\u0000"+
		"\u0000\u00b3\u00b4\u0005n\u0000\u0000\u00b4&\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0005i\u0000\u0000\u00b6\u00b7\u0005m\u0000\u0000\u00b7\u00b8\u0005"+
		"p\u0000\u0000\u00b8\u00b9\u0005o\u0000\u0000\u00b9\u00ba\u0005r\u0000"+
		"\u0000\u00ba\u00bb\u0005t\u0000\u0000\u00bb\u00bc\u0005 \u0000\u0000\u00bc"+
		"\u00bd\u0005j\u0000\u0000\u00bd\u00be\u0005s\u0000\u0000\u00be\u00bf\u0005"+
		"o\u0000\u0000\u00bf\u00c0\u0005n\u0000\u0000\u00c0(\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005i\u0000\u0000\u00c2\u00c3\u0005f\u0000\u0000\u00c3"+
		"*\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005i\u0000\u0000\u00c5\u00c6\u0005"+
		"s\u0000\u0000\u00c6,\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005i\u0000"+
		"\u0000\u00c8\u00c9\u0005s\u0000\u0000\u00c9\u00ca\u0005 \u0000\u0000\u00ca"+
		"\u00cb\u0005n\u0000\u0000\u00cb\u00cc\u0005o\u0000\u0000\u00cc\u00cd\u0005"+
		"t\u0000\u0000\u00cd.\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005=\u0000"+
		"\u0000\u00cf\u00d0\u0005=\u0000\u0000\u00d00\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0005d\u0000\u0000\u00d2\u00d3\u0005e\u0000\u0000\u00d3\u00d4\u0005"+
		"f\u0000\u0000\u00d4\u00d5\u0005a\u0000\u0000\u00d5\u00d6\u0005u\u0000"+
		"\u0000\u00d6\u00d7\u0005l\u0000\u0000\u00d7\u00d8\u0005t\u0000\u0000\u00d8"+
		"2\u0001\u0000\u0000\u0000\u00d9\u00da\u0005b\u0000\u0000\u00da\u00db\u0005"+
		"r\u0000\u0000\u00db\u00dc\u0005e\u0000\u0000\u00dc\u00dd\u0005a\u0000"+
		"\u0000\u00dd\u00de\u0005k\u0000\u0000\u00de4\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005,\u0000\u0000\u00e06\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\"\u0000\u0000\u00e28\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005=\u0000"+
		"\u0000\u00e4:\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005!\u0000\u0000\u00e6"+
		"\u00e7\u0005=\u0000\u0000\u00e7<\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005"+
		"(\u0000\u0000\u00e9>\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005)\u0000"+
		"\u0000\u00eb@\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005:\u0000\u0000\u00ed"+
		"B\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005@\u0000\u0000\u00efD\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005.\u0000\u0000\u00f1F\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0005<\u0000\u0000\u00f3H\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005>\u0000\u0000\u00f5J\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005"+
		"]\u0000\u0000\u00f7L\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005[\u0000"+
		"\u0000\u00f9N\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005{\u0000\u0000\u00fb"+
		"P\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005}\u0000\u0000\u00fdR\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0005+\u0000\u0000\u00ffT\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0005-\u0000\u0000\u0101V\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0005*\u0000\u0000\u0103X\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"/\u0000\u0000\u0105Z\u0001\u0000\u0000\u0000\u0106\u0107\u0005+\u0000"+
		"\u0000\u0107\u0108\u0005=\u0000\u0000\u0108\\\u0001\u0000\u0000\u0000"+
		"\u0109\u010b\u0007\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d^\u0001\u0000\u0000\u0000\u010e"+
		"\u0112\u0007\u0001\u0000\u0000\u010f\u0111\u0007\u0002\u0000\u0000\u0110"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113"+
		"`\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0119"+
		"\u0005\"\u0000\u0000\u0116\u0118\b\u0003\u0000\u0000\u0117\u0116\u0001"+
		"\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011c\u0001"+
		"\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u011d\u0005"+
		"\"\u0000\u0000\u011db\u0001\u0000\u0000\u0000\u011e\u0120\u0007\u0004"+
		"\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000"+
		"\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u00061\u0000"+
		"\u0000\u0124d\u0001\u0000\u0000\u0000\u0006\u0000n\u010c\u0112\u0119\u0121"+
		"\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}