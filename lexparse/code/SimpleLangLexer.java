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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NUM=8, CHAR=9, 
		BOOL=10, ID=11, EQ=12, SM=13, OB=14, CB=15, OCB=16, CCB=17, COMMA=18, 
		WS=19, OTHER=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NUM", "CHAR", 
			"BOOL", "ID", "EQ", "SM", "OB", "CB", "OCB", "CCB", "COMMA", "WS", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'const'", "'enum'", "'class'", "'extends'", "'implements'", 
			"'someMethods'", null, null, null, null, "'='", "';'", "'['", "']'", 
			"'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NUM", "CHAR", "BOOL", 
			"ID", "EQ", "SM", "OB", "CB", "OCB", "CCB", "COMMA", "WS", "OTHER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\tf\n\t\f"+
		"\t\16\ti\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13x\n\13\3\f\3\f\7\f|\n\f\f\f\16\f\177\13\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24\u0090\n\24"+
		"\r\24\16\24\u0091\3\24\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"\3\2\7\3\2\62;\6\2\f\f\17\17))^^\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2\u009a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\63\3\2"+
		"\2\2\79\3\2\2\2\t>\3\2\2\2\13D\3\2\2\2\rL\3\2\2\2\17W\3\2\2\2\21c\3\2"+
		"\2\2\23j\3\2\2\2\25w\3\2\2\2\27y\3\2\2\2\31\u0080\3\2\2\2\33\u0082\3\2"+
		"\2\2\35\u0084\3\2\2\2\37\u0086\3\2\2\2!\u0088\3\2\2\2#\u008a\3\2\2\2%"+
		"\u008c\3\2\2\2\'\u008f\3\2\2\2)\u0095\3\2\2\2+,\7r\2\2,-\7t\2\2-.\7q\2"+
		"\2./\7i\2\2/\60\7t\2\2\60\61\7c\2\2\61\62\7o\2\2\62\4\3\2\2\2\63\64\7"+
		"e\2\2\64\65\7q\2\2\65\66\7p\2\2\66\67\7u\2\2\678\7v\2\28\6\3\2\2\29:\7"+
		"g\2\2:;\7p\2\2;<\7w\2\2<=\7o\2\2=\b\3\2\2\2>?\7e\2\2?@\7n\2\2@A\7c\2\2"+
		"AB\7u\2\2BC\7u\2\2C\n\3\2\2\2DE\7g\2\2EF\7z\2\2FG\7v\2\2GH\7g\2\2HI\7"+
		"p\2\2IJ\7f\2\2JK\7u\2\2K\f\3\2\2\2LM\7k\2\2MN\7o\2\2NO\7r\2\2OP\7n\2\2"+
		"PQ\7g\2\2QR\7o\2\2RS\7g\2\2ST\7p\2\2TU\7v\2\2UV\7u\2\2V\16\3\2\2\2WX\7"+
		"u\2\2XY\7q\2\2YZ\7o\2\2Z[\7g\2\2[\\\7O\2\2\\]\7g\2\2]^\7v\2\2^_\7j\2\2"+
		"_`\7q\2\2`a\7f\2\2ab\7u\2\2b\20\3\2\2\2cg\t\2\2\2df\t\2\2\2ed\3\2\2\2"+
		"fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\22\3\2\2\2ig\3\2\2\2jk\7)\2\2kl\n\3\2"+
		"\2lm\7)\2\2m\24\3\2\2\2no\7v\2\2op\7t\2\2pq\7w\2\2qx\7g\2\2rs\7h\2\2s"+
		"t\7c\2\2tu\7n\2\2uv\7u\2\2vx\7g\2\2wn\3\2\2\2wr\3\2\2\2x\26\3\2\2\2y}"+
		"\t\4\2\2z|\t\5\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\30\3\2"+
		"\2\2\177}\3\2\2\2\u0080\u0081\7?\2\2\u0081\32\3\2\2\2\u0082\u0083\7=\2"+
		"\2\u0083\34\3\2\2\2\u0084\u0085\7]\2\2\u0085\36\3\2\2\2\u0086\u0087\7"+
		"_\2\2\u0087 \3\2\2\2\u0088\u0089\7}\2\2\u0089\"\3\2\2\2\u008a\u008b\7"+
		"\177\2\2\u008b$\3\2\2\2\u008c\u008d\7.\2\2\u008d&\3\2\2\2\u008e\u0090"+
		"\t\6\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\24\2\2\u0094(\3\2\2\2"+
		"\u0095\u0096\13\2\2\2\u0096*\3\2\2\2\7\2gw}\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}