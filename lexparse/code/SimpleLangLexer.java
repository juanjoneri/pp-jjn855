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
		ID=10, EQ=11, SM=12, OB=13, CB=14, COMMA=15, WS=16, OTHER=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NUM", "CHAR", "BOOL", 
			"ID", "EQ", "SM", "OB", "CB", "COMMA", "WS", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'const'", "'enum'", "'int'", "'char'", "'bool'", 
			null, null, null, null, "'='", "';'", "'{'", "'}'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUM", "CHAR", "BOOL", "ID", 
			"EQ", "SM", "OB", "CB", "COMMA", "WS", "OTHER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\7\bI\n\b\f\b\16\bL\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n[\n\n\3\13\3\13\7\13_\n\13\f\13\16\13b\13\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21o\n\21\r\21\16\21p\3\21\3\21\3"+
		"\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23\3\2\7\3\2\62;\6\2\f\f\17\17))^^\4\2C\\c"+
		"|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5-\3\2\2\2\7\63\3"+
		"\2\2\2\t8\3\2\2\2\13<\3\2\2\2\rA\3\2\2\2\17F\3\2\2\2\21M\3\2\2\2\23Z\3"+
		"\2\2\2\25\\\3\2\2\2\27c\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2\37"+
		"k\3\2\2\2!n\3\2\2\2#t\3\2\2\2%&\7r\2\2&\'\7t\2\2\'(\7q\2\2()\7i\2\2)*"+
		"\7t\2\2*+\7c\2\2+,\7o\2\2,\4\3\2\2\2-.\7e\2\2./\7q\2\2/\60\7p\2\2\60\61"+
		"\7u\2\2\61\62\7v\2\2\62\6\3\2\2\2\63\64\7g\2\2\64\65\7p\2\2\65\66\7w\2"+
		"\2\66\67\7o\2\2\67\b\3\2\2\289\7k\2\29:\7p\2\2:;\7v\2\2;\n\3\2\2\2<=\7"+
		"e\2\2=>\7j\2\2>?\7c\2\2?@\7t\2\2@\f\3\2\2\2AB\7d\2\2BC\7q\2\2CD\7q\2\2"+
		"DE\7n\2\2E\16\3\2\2\2FJ\t\2\2\2GI\t\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2"+
		"\2JK\3\2\2\2K\20\3\2\2\2LJ\3\2\2\2MN\7)\2\2NO\n\3\2\2OP\7)\2\2P\22\3\2"+
		"\2\2QR\7v\2\2RS\7t\2\2ST\7w\2\2T[\7g\2\2UV\7h\2\2VW\7c\2\2WX\7n\2\2XY"+
		"\7u\2\2Y[\7g\2\2ZQ\3\2\2\2ZU\3\2\2\2[\24\3\2\2\2\\`\t\4\2\2]_\t\5\2\2"+
		"^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\26\3\2\2\2b`\3\2\2\2cd\7?\2"+
		"\2d\30\3\2\2\2ef\7=\2\2f\32\3\2\2\2gh\7}\2\2h\34\3\2\2\2ij\7\177\2\2j"+
		"\36\3\2\2\2kl\7.\2\2l \3\2\2\2mo\t\6\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2"+
		"pq\3\2\2\2qr\3\2\2\2rs\b\21\2\2s\"\3\2\2\2tu\13\2\2\2u$\3\2\2\2\7\2JZ"+
		"`p\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}