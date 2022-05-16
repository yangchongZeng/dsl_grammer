// Generated from E:/B--Java_Project/github/dsl_grammer/dsl/src/main/resources\Hello.g4 by ANTLR 4.10.1
package com.hirain.ads.dsl;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, MUL=6, DIV=7, ADD=8, SUB=9, MOD=10, 
		ARRAY=11, SIN=12, COS=13, ID=14, INT=15, NEWLINE=16, WS=17, FLOAT=18, 
		LINE_COMMENT=19, COMMENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "MUL", "DIV", "ADD", "SUB", "MOD", 
			"ARRAY", "SIN", "COS", "ID", "INT", "NEWLINE", "WS", "FLOAT", "DIGIT", 
			"LINE_COMMENT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'^'", "'('", "')'", "'sin('", "'*'", "'/'", "'+'", "'-'", 
			"'%'", null, "'sin'", "'cos'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "MOD", 
			"ARRAY", "SIN", "COS", "ID", "INT", "NEWLINE", "WS", "FLOAT", "LINE_COMMENT", 
			"COMMENT"
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
		"\u0004\u0000\u0014\u009d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005\nE"+
		"\b\n\n\n\f\nH\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004\rU\b\r\u000b"+
		"\r\f\rV\u0001\u000e\u0004\u000eZ\b\u000e\u000b\u000e\f\u000e[\u0001\u000f"+
		"\u0003\u000f_\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010"+
		"d\b\u0010\u000b\u0010\f\u0010e\u0001\u0010\u0001\u0010\u0001\u0011\u0004"+
		"\u0011k\b\u0011\u000b\u0011\f\u0011l\u0001\u0011\u0001\u0011\u0005\u0011"+
		"q\b\u0011\n\u0011\f\u0011t\t\u0011\u0001\u0011\u0001\u0011\u0004\u0011"+
		"x\b\u0011\u000b\u0011\f\u0011y\u0003\u0011|\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0084"+
		"\b\u0013\n\u0013\f\u0013\u0087\t\u0013\u0001\u0013\u0003\u0013\u008a\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0094\b\u0014\n\u0014\f\u0014"+
		"\u0097\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003F\u0085\u0095\u0000\u0015\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0000"+
		"\'\u0013)\u0014\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0002"+
		"\u0000\t\t  \u00a7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001"+
		"\u0000\u0000\u0000\u0003-\u0001\u0000\u0000\u0000\u0005/\u0001\u0000\u0000"+
		"\u0000\u00071\u0001\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b"+
		"8\u0001\u0000\u0000\u0000\r:\u0001\u0000\u0000\u0000\u000f<\u0001\u0000"+
		"\u0000\u0000\u0011>\u0001\u0000\u0000\u0000\u0013@\u0001\u0000\u0000\u0000"+
		"\u0015B\u0001\u0000\u0000\u0000\u0017K\u0001\u0000\u0000\u0000\u0019O"+
		"\u0001\u0000\u0000\u0000\u001bT\u0001\u0000\u0000\u0000\u001dY\u0001\u0000"+
		"\u0000\u0000\u001f^\u0001\u0000\u0000\u0000!c\u0001\u0000\u0000\u0000"+
		"#{\u0001\u0000\u0000\u0000%}\u0001\u0000\u0000\u0000\'\u007f\u0001\u0000"+
		"\u0000\u0000)\u008f\u0001\u0000\u0000\u0000+,\u0005=\u0000\u0000,\u0002"+
		"\u0001\u0000\u0000\u0000-.\u0005^\u0000\u0000.\u0004\u0001\u0000\u0000"+
		"\u0000/0\u0005(\u0000\u00000\u0006\u0001\u0000\u0000\u000012\u0005)\u0000"+
		"\u00002\b\u0001\u0000\u0000\u000034\u0005s\u0000\u000045\u0005i\u0000"+
		"\u000056\u0005n\u0000\u000067\u0005(\u0000\u00007\n\u0001\u0000\u0000"+
		"\u000089\u0005*\u0000\u00009\f\u0001\u0000\u0000\u0000:;\u0005/\u0000"+
		"\u0000;\u000e\u0001\u0000\u0000\u0000<=\u0005+\u0000\u0000=\u0010\u0001"+
		"\u0000\u0000\u0000>?\u0005-\u0000\u0000?\u0012\u0001\u0000\u0000\u0000"+
		"@A\u0005%\u0000\u0000A\u0014\u0001\u0000\u0000\u0000BF\u0005[\u0000\u0000"+
		"CE\t\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IJ\u0005]\u0000\u0000J\u0016\u0001\u0000"+
		"\u0000\u0000KL\u0005s\u0000\u0000LM\u0005i\u0000\u0000MN\u0005n\u0000"+
		"\u0000N\u0018\u0001\u0000\u0000\u0000OP\u0005c\u0000\u0000PQ\u0005o\u0000"+
		"\u0000QR\u0005s\u0000\u0000R\u001a\u0001\u0000\u0000\u0000SU\u0007\u0000"+
		"\u0000\u0000TS\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u001c\u0001\u0000\u0000"+
		"\u0000XZ\u0007\u0001\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u001e"+
		"\u0001\u0000\u0000\u0000]_\u0005\r\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005\n\u0000\u0000"+
		"a \u0001\u0000\u0000\u0000bd\u0007\u0002\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0006\u0010\u0000\u0000h\"\u0001"+
		"\u0000\u0000\u0000ik\u0003%\u0012\u0000ji\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000nr\u0005.\u0000\u0000oq\u0003%\u0012\u0000p"+
		"o\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000s|\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000uw\u0005.\u0000\u0000vx\u0003%\u0012\u0000wv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z|\u0001\u0000\u0000\u0000{j\u0001\u0000\u0000\u0000{u\u0001"+
		"\u0000\u0000\u0000|$\u0001\u0000\u0000\u0000}~\u0007\u0001\u0000\u0000"+
		"~&\u0001\u0000\u0000\u0000\u007f\u0080\u0005/\u0000\u0000\u0080\u0081"+
		"\u0005/\u0000\u0000\u0081\u0085\u0001\u0000\u0000\u0000\u0082\u0084\t"+
		"\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0088\u008a\u0005\r\u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\n\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0006\u0013\u0000\u0000\u008e(\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005/\u0000\u0000\u0090\u0091\u0005*\u0000\u0000\u0091\u0095"+
		"\u0001\u0000\u0000\u0000\u0092\u0094\t\u0000\u0000\u0000\u0093\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0098\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"*\u0000\u0000\u0099\u009a\u0005/\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0006\u0014\u0000\u0000\u009c*\u0001\u0000\u0000\u0000"+
		"\r\u0000FV[^elry{\u0085\u0089\u0095\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}