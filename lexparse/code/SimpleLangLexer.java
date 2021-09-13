// Generated from SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUM=7, CHAR=8, BOOL=9, 
		ID=10, EQ=11, SM=12, OB=13, CB=14, OCB=15, CCB=16, COMMA=17, WS=18, OTHER=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NUM", "CHAR", "BOOL", 
			"ID", "EQ", "SM", "OB", "CB", "OCB", "CCB", "COMMA", "WS", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'const'", "'enum'", "'int'", "'char'", "'bool'", 
			null, null, null, null, "'='", "';'", "'['", "']'", "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUM", "CHAR", "BOOL", "ID", 
			"EQ", "SM", "OB", "CB", "OCB", "CCB", "COMMA", "WS", "OTHER"
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


	public SimpleLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\7\13c\n\13\f\13\16\13f\13"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\6\23w\n\23\r\23\16\23x\3\23\3\23\3\24\3\24\2\2\25\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25\3\2\7\3\2\62;\6\2\f\f\17\17))^^\4\2C\\c|\6\2\62;C\\aac|\5\2"+
		"\13\f\17\17\"\"\2\u0081\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\61\3\2"+
		"\2\2\7\67\3\2\2\2\t<\3\2\2\2\13@\3\2\2\2\rE\3\2\2\2\17J\3\2\2\2\21Q\3"+
		"\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35"+
		"m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%v\3\2\2\2\'|\3\2\2\2)*\7r\2"+
		"\2*+\7t\2\2+,\7q\2\2,-\7i\2\2-.\7t\2\2./\7c\2\2/\60\7o\2\2\60\4\3\2\2"+
		"\2\61\62\7e\2\2\62\63\7q\2\2\63\64\7p\2\2\64\65\7u\2\2\65\66\7v\2\2\66"+
		"\6\3\2\2\2\678\7g\2\289\7p\2\29:\7w\2\2:;\7o\2\2;\b\3\2\2\2<=\7k\2\2="+
		">\7p\2\2>?\7v\2\2?\n\3\2\2\2@A\7e\2\2AB\7j\2\2BC\7c\2\2CD\7t\2\2D\f\3"+
		"\2\2\2EF\7d\2\2FG\7q\2\2GH\7q\2\2HI\7n\2\2I\16\3\2\2\2JN\t\2\2\2KM\t\2"+
		"\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\20\3\2\2\2PN\3\2\2\2QR\7"+
		")\2\2RS\n\3\2\2ST\7)\2\2T\22\3\2\2\2UV\7v\2\2VW\7t\2\2WX\7w\2\2X_\7g\2"+
		"\2YZ\7h\2\2Z[\7c\2\2[\\\7n\2\2\\]\7u\2\2]_\7g\2\2^U\3\2\2\2^Y\3\2\2\2"+
		"_\24\3\2\2\2`d\t\4\2\2ac\t\5\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2"+
		"\2e\26\3\2\2\2fd\3\2\2\2gh\7?\2\2h\30\3\2\2\2ij\7=\2\2j\32\3\2\2\2kl\7"+
		"]\2\2l\34\3\2\2\2mn\7_\2\2n\36\3\2\2\2op\7}\2\2p \3\2\2\2qr\7\177\2\2"+
		"r\"\3\2\2\2st\7.\2\2t$\3\2\2\2uw\t\6\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2yz\3\2\2\2z{\b\23\2\2{&\3\2\2\2|}\13\2\2\2}(\3\2\2\2\7\2N^d"+
		"x\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}