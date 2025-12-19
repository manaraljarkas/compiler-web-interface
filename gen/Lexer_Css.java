// Generated from C:/MANAR/ITE/4th year/Compilers/compiler-web-interface/grammar/Lexer_Css.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Lexer_Css extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STYLE_O=1, STYLE_C=2, DOT=3, COMMA=4, COLON=5, SEMICOLON=6, LEFT_CURLY=7, 
		RIGHT_CURLY=8, UNIT=9, CHARACTERS=10, NUMBERS=11, STRING=12, COLOR=13, 
		WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STYLE_O", "STYLE_C", "DOT", "COMMA", "COLON", "SEMICOLON", "LEFT_CURLY", 
			"RIGHT_CURLY", "UNIT", "CHARACTERS", "NUMBERS", "STRING", "COLOR", "WS"
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


	public Lexer_Css(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexer_Css.g4"; }

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
		"\u0004\u0000\u000ef\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\bC\b\b\u0001\t\u0001\t\u0005\tG\b\t\n\t"+
		"\f\tJ\t\t\u0001\n\u0004\nM\b\n\u000b\n\f\nN\u0001\u000b\u0001\u000b\u0005"+
		"\u000bS\b\u000b\n\u000b\f\u000bV\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0004\f\\\b\f\u000b\f\f\f]\u0001\r\u0004\ra\b\r\u000b\r\f\r"+
		"b\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0006\u0003\u0000AZ__a"+
		"z\u0005\u0000--09AZ__az\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000"+
		"09AFaf\u0003\u0000\t\n\r\r  m\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003%\u0001\u0000"+
		"\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000"+
		"\t2\u0001\u0000\u0000\u0000\u000b4\u0001\u0000\u0000\u0000\r6\u0001\u0000"+
		"\u0000\u0000\u000f8\u0001\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000"+
		"\u0013D\u0001\u0000\u0000\u0000\u0015L\u0001\u0000\u0000\u0000\u0017P"+
		"\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b`\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005<\u0000\u0000\u001e\u001f\u0005s\u0000\u0000"+
		"\u001f \u0005t\u0000\u0000 !\u0005y\u0000\u0000!\"\u0005l\u0000\u0000"+
		"\"#\u0005e\u0000\u0000#$\u0005>\u0000\u0000$\u0002\u0001\u0000\u0000\u0000"+
		"%&\u0005<\u0000\u0000&\'\u0005/\u0000\u0000\'(\u0005s\u0000\u0000()\u0005"+
		"t\u0000\u0000)*\u0005y\u0000\u0000*+\u0005l\u0000\u0000+,\u0005e\u0000"+
		"\u0000,-\u0005>\u0000\u0000-\u0004\u0001\u0000\u0000\u0000./\u0005.\u0000"+
		"\u0000/\u0006\u0001\u0000\u0000\u000001\u0005,\u0000\u00001\b\u0001\u0000"+
		"\u0000\u000023\u0005:\u0000\u00003\n\u0001\u0000\u0000\u000045\u0005;"+
		"\u0000\u00005\f\u0001\u0000\u0000\u000067\u0005{\u0000\u00007\u000e\u0001"+
		"\u0000\u0000\u000089\u0005}\u0000\u00009\u0010\u0001\u0000\u0000\u0000"+
		":;\u0005p\u0000\u0000;C\u0005x\u0000\u0000<C\u0005%\u0000\u0000=>\u0005"+
		"e\u0000\u0000>C\u0005m\u0000\u0000?@\u0005r\u0000\u0000@A\u0005e\u0000"+
		"\u0000AC\u0005m\u0000\u0000B:\u0001\u0000\u0000\u0000B<\u0001\u0000\u0000"+
		"\u0000B=\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000C\u0012\u0001"+
		"\u0000\u0000\u0000DH\u0007\u0000\u0000\u0000EG\u0007\u0001\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000KM\u0007\u0002\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000O\u0016\u0001\u0000\u0000\u0000PT\u0005\"\u0000\u0000QS\b\u0003"+
		"\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WX\u0005\"\u0000\u0000X\u0018\u0001\u0000\u0000"+
		"\u0000Y[\u0005#\u0000\u0000Z\\\u0007\u0004\u0000\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^\u001a\u0001\u0000\u0000\u0000_a\u0007\u0005\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0006\r\u0000"+
		"\u0000e\u001c\u0001\u0000\u0000\u0000\u0007\u0000BHNT]b\u0001\u0000\u0001"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}