// Generated from D:/projects/dsl_grammer/dsl/src/main/resources\Hello.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MUL=5, DIV=6, ADD=7, SUB=8, MOD=9, SIN=10, 
		COS=11, ID=12, INT=13, NEWLINE=14, WS=15, FLOAT=16, LINE_COMMENT=17, COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "MUL", "DIV", "ADD", "SUB", "MOD", "SIN", 
			"COS", "ID", "INT", "NEWLINE", "WS", "FLOAT", "DIGIT", "LINE_COMMENT", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'^'", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'%'", 
			"'sin'", "'cos'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "MOD", "SIN", 
			"COS", "ID", "INT", "NEWLINE", "WS", "FLOAT", "LINE_COMMENT", "COMMENT"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

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
		"\u0004\u0000\u0012\u008b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0004\u000bC\b\u000b\u000b\u000b\f\u000bD\u0001"+
		"\f\u0004\fH\b\f\u000b\f\f\fI\u0001\r\u0003\rM\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0004\u000eR\b\u000e\u000b\u000e\f\u000eS\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0004\u000fY\b\u000f\u000b\u000f\f\u000fZ\u0001\u000f\u0001"+
		"\u000f\u0005\u000f_\b\u000f\n\u000f\f\u000fb\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0004\u000ff\b\u000f\u000b\u000f\f\u000fg\u0003\u000fj\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011r\b\u0011\n\u0011\f\u0011u\t\u0011\u0001\u0011\u0003\u0011"+
		"x\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0082\b\u0012\n\u0012"+
		"\f\u0012\u0085\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0002s\u0083\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0000#\u0011"+
		"%\u0012\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0002\u0000\t"+
		"\t  \u0094\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'"+
		"\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001\u0000"+
		"\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000"+
		"\u000b1\u0001\u0000\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f5\u0001"+
		"\u0000\u0000\u0000\u00117\u0001\u0000\u0000\u0000\u00139\u0001\u0000\u0000"+
		"\u0000\u0015=\u0001\u0000\u0000\u0000\u0017B\u0001\u0000\u0000\u0000\u0019"+
		"G\u0001\u0000\u0000\u0000\u001bL\u0001\u0000\u0000\u0000\u001dQ\u0001"+
		"\u0000\u0000\u0000\u001fi\u0001\u0000\u0000\u0000!k\u0001\u0000\u0000"+
		"\u0000#m\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000\u0000\'(\u0005=\u0000"+
		"\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005^\u0000\u0000*\u0004\u0001"+
		"\u0000\u0000\u0000+,\u0005(\u0000\u0000,\u0006\u0001\u0000\u0000\u0000"+
		"-.\u0005)\u0000\u0000.\b\u0001\u0000\u0000\u0000/0\u0005*\u0000\u0000"+
		"0\n\u0001\u0000\u0000\u000012\u0005/\u0000\u00002\f\u0001\u0000\u0000"+
		"\u000034\u0005+\u0000\u00004\u000e\u0001\u0000\u0000\u000056\u0005-\u0000"+
		"\u00006\u0010\u0001\u0000\u0000\u000078\u0005%\u0000\u00008\u0012\u0001"+
		"\u0000\u0000\u00009:\u0005s\u0000\u0000:;\u0005i\u0000\u0000;<\u0005n"+
		"\u0000\u0000<\u0014\u0001\u0000\u0000\u0000=>\u0005c\u0000\u0000>?\u0005"+
		"o\u0000\u0000?@\u0005s\u0000\u0000@\u0016\u0001\u0000\u0000\u0000AC\u0007"+
		"\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\u0018\u0001\u0000"+
		"\u0000\u0000FH\u0007\u0001\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"J\u001a\u0001\u0000\u0000\u0000KM\u0005\r\u0000\u0000LK\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0005\n\u0000"+
		"\u0000O\u001c\u0001\u0000\u0000\u0000PR\u0007\u0002\u0000\u0000QP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0006\u000e\u0000"+
		"\u0000V\u001e\u0001\u0000\u0000\u0000WY\u0003!\u0010\u0000XW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\`\u0005.\u0000\u0000]_"+
		"\u0003!\u0010\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000aj\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000ce\u0005.\u0000\u0000df\u0003!\u0010\u0000"+
		"ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000iX\u0001\u0000"+
		"\u0000\u0000ic\u0001\u0000\u0000\u0000j \u0001\u0000\u0000\u0000kl\u0007"+
		"\u0001\u0000\u0000l\"\u0001\u0000\u0000\u0000mn\u0005/\u0000\u0000no\u0005"+
		"/\u0000\u0000os\u0001\u0000\u0000\u0000pr\t\u0000\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000vx\u0005\r\u0000\u0000wv\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0005\n\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{|\u0006\u0011\u0000\u0000|$\u0001\u0000\u0000\u0000}~\u0005/\u0000"+
		"\u0000~\u007f\u0005*\u0000\u0000\u007f\u0083\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\t\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005*\u0000\u0000\u0087\u0088\u0005"+
		"/\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0006\u0012"+
		"\u0000\u0000\u008a&\u0001\u0000\u0000\u0000\f\u0000DILSZ`gisw\u0083\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}