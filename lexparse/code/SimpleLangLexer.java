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
		PROGRAM=1, BREAK=2, CLASS=3, INTERFACE=4, ENUM=5, ELSE=6, CONST=7, IF=8, 
		NEW=9, PRINT=10, READ=11, RETURN=12, VOID=13, FOR=14, IMPLEMENTS=15, EXTENDS=16, 
		CONTINUE=17, PLUS=18, MINUS=19, TIMES=20, DIVIDE=21, REMINDER=22, EQUALS=23, 
		NOT_EQUALS=24, GT=25, GTOE=26, LT=27, LTOE=28, AND=29, OR=30, ASSIGN=31, 
		PP=32, MM=33, SM=34, COMMA=35, DOT=36, OP=37, CP=38, OB=39, CB=40, OCB=41, 
		CCB=42, BOOL=43, NUM=44, CHAR=45, ID=46, COMMENT=47, WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROGRAM", "BREAK", "CLASS", "INTERFACE", "ENUM", "ELSE", "CONST", "IF", 
			"NEW", "PRINT", "READ", "RETURN", "VOID", "FOR", "IMPLEMENTS", "EXTENDS", 
			"CONTINUE", "PLUS", "MINUS", "TIMES", "DIVIDE", "REMINDER", "EQUALS", 
			"NOT_EQUALS", "GT", "GTOE", "LT", "LTOE", "AND", "OR", "ASSIGN", "PP", 
			"MM", "SM", "COMMA", "DOT", "OP", "CP", "OB", "CB", "OCB", "CCB", "BOOL", 
			"NUM", "CHAR", "ID", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'break'", "'class'", "'interface'", "'enum'", "'else'", 
			"'const'", "'if'", "'new'", "'print'", "'read'", "'return'", "'void'", 
			"'for'", "'implements'", "'extends'", "'continue'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
			"'='", "'++'", "'--'", "';'", "','", "'.'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "BREAK", "CLASS", "INTERFACE", "ENUM", "ELSE", "CONST", 
			"IF", "NEW", "PRINT", "READ", "RETURN", "VOID", "FOR", "IMPLEMENTS", 
			"EXTENDS", "CONTINUE", "PLUS", "MINUS", "TIMES", "DIVIDE", "REMINDER", 
			"EQUALS", "NOT_EQUALS", "GT", "GTOE", "LT", "LTOE", "AND", "OR", "ASSIGN", 
			"PP", "MM", "SM", "COMMA", "DOT", "OP", "CP", "OB", "CB", "OCB", "CCB", 
			"BOOL", "NUM", "CHAR", "ID", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0138\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\5,\u0113\n,\3-\3-\7-\u0117\n-\f-\16-\u011a\13-"+
		"\3.\3.\3.\3.\3/\3/\7/\u0122\n/\f/\16/\u0125\13/\3\60\3\60\3\60\3\60\7"+
		"\60\u012b\n\60\f\60\16\60\u012e\13\60\3\60\3\60\3\61\6\61\u0133\n\61\r"+
		"\61\16\61\u0134\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62\3\2\b\3\2\62;\6\2\f\f\17\17))^^\4\2C\\c|\6\2\62;C\\aac|\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\2\u013c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5k\3\2\2\2\7q\3\2"+
		"\2\2\tw\3\2\2\2\13\u0081\3\2\2\2\r\u0086\3\2\2\2\17\u008b\3\2\2\2\21\u0091"+
		"\3\2\2\2\23\u0094\3\2\2\2\25\u0098\3\2\2\2\27\u009e\3\2\2\2\31\u00a3\3"+
		"\2\2\2\33\u00aa\3\2\2\2\35\u00af\3\2\2\2\37\u00b3\3\2\2\2!\u00be\3\2\2"+
		"\2#\u00c6\3\2\2\2%\u00cf\3\2\2\2\'\u00d1\3\2\2\2)\u00d3\3\2\2\2+\u00d5"+
		"\3\2\2\2-\u00d7\3\2\2\2/\u00d9\3\2\2\2\61\u00dc\3\2\2\2\63\u00df\3\2\2"+
		"\2\65\u00e1\3\2\2\2\67\u00e4\3\2\2\29\u00e6\3\2\2\2;\u00e9\3\2\2\2=\u00ec"+
		"\3\2\2\2?\u00ef\3\2\2\2A\u00f1\3\2\2\2C\u00f4\3\2\2\2E\u00f7\3\2\2\2G"+
		"\u00f9\3\2\2\2I\u00fb\3\2\2\2K\u00fd\3\2\2\2M\u00ff\3\2\2\2O\u0101\3\2"+
		"\2\2Q\u0103\3\2\2\2S\u0105\3\2\2\2U\u0107\3\2\2\2W\u0112\3\2\2\2Y\u0114"+
		"\3\2\2\2[\u011b\3\2\2\2]\u011f\3\2\2\2_\u0126\3\2\2\2a\u0132\3\2\2\2c"+
		"d\7r\2\2de\7t\2\2ef\7q\2\2fg\7i\2\2gh\7t\2\2hi\7c\2\2ij\7o\2\2j\4\3\2"+
		"\2\2kl\7d\2\2lm\7t\2\2mn\7g\2\2no\7c\2\2op\7m\2\2p\6\3\2\2\2qr\7e\2\2"+
		"rs\7n\2\2st\7c\2\2tu\7u\2\2uv\7u\2\2v\b\3\2\2\2wx\7k\2\2xy\7p\2\2yz\7"+
		"v\2\2z{\7g\2\2{|\7t\2\2|}\7h\2\2}~\7c\2\2~\177\7e\2\2\177\u0080\7g\2\2"+
		"\u0080\n\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7p\2\2\u0083\u0084\7w"+
		"\2\2\u0084\u0085\7o\2\2\u0085\f\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088"+
		"\7n\2\2\u0088\u0089\7u\2\2\u0089\u008a\7g\2\2\u008a\16\3\2\2\2\u008b\u008c"+
		"\7e\2\2\u008c\u008d\7q\2\2\u008d\u008e\7p\2\2\u008e\u008f\7u\2\2\u008f"+
		"\u0090\7v\2\2\u0090\20\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7h\2\2\u0093"+
		"\22\3\2\2\2\u0094\u0095\7p\2\2\u0095\u0096\7g\2\2\u0096\u0097\7y\2\2\u0097"+
		"\24\3\2\2\2\u0098\u0099\7r\2\2\u0099\u009a\7t\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d\26\3\2\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7f\2\2\u00a2\30\3\2\2\2\u00a3"+
		"\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7w\2\2"+
		"\u00a7\u00a8\7t\2\2\u00a8\u00a9\7p\2\2\u00a9\32\3\2\2\2\u00aa\u00ab\7"+
		"x\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7f\2\2\u00ae\34"+
		"\3\2\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7t\2\2\u00b2"+
		"\36\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7r\2\2\u00b6"+
		"\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7o\2\2\u00b9\u00ba\7g\2\2"+
		"\u00ba\u00bb\7p\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7u\2\2\u00bd \3\2\2"+
		"\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7z\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7u\2\2\u00c5"+
		"\"\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7w\2\2"+
		"\u00cd\u00ce\7g\2\2\u00ce$\3\2\2\2\u00cf\u00d0\7-\2\2\u00d0&\3\2\2\2\u00d1"+
		"\u00d2\7/\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7,\2\2\u00d4*\3\2\2\2\u00d5\u00d6"+
		"\7\61\2\2\u00d6,\3\2\2\2\u00d7\u00d8\7\'\2\2\u00d8.\3\2\2\2\u00d9\u00da"+
		"\7?\2\2\u00da\u00db\7?\2\2\u00db\60\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd\u00de"+
		"\7?\2\2\u00de\62\3\2\2\2\u00df\u00e0\7@\2\2\u00e0\64\3\2\2\2\u00e1\u00e2"+
		"\7@\2\2\u00e2\u00e3\7?\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7>\2\2\u00e58"+
		"\3\2\2\2\u00e6\u00e7\7>\2\2\u00e7\u00e8\7?\2\2\u00e8:\3\2\2\2\u00e9\u00ea"+
		"\7(\2\2\u00ea\u00eb\7(\2\2\u00eb<\3\2\2\2\u00ec\u00ed\7~\2\2\u00ed\u00ee"+
		"\7~\2\2\u00ee>\3\2\2\2\u00ef\u00f0\7?\2\2\u00f0@\3\2\2\2\u00f1\u00f2\7"+
		"-\2\2\u00f2\u00f3\7-\2\2\u00f3B\3\2\2\2\u00f4\u00f5\7/\2\2\u00f5\u00f6"+
		"\7/\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7=\2\2\u00f8F\3\2\2\2\u00f9\u00fa\7"+
		".\2\2\u00faH\3\2\2\2\u00fb\u00fc\7\60\2\2\u00fcJ\3\2\2\2\u00fd\u00fe\7"+
		"*\2\2\u00feL\3\2\2\2\u00ff\u0100\7+\2\2\u0100N\3\2\2\2\u0101\u0102\7]"+
		"\2\2\u0102P\3\2\2\2\u0103\u0104\7_\2\2\u0104R\3\2\2\2\u0105\u0106\7}\2"+
		"\2\u0106T\3\2\2\2\u0107\u0108\7\177\2\2\u0108V\3\2\2\2\u0109\u010a\7v"+
		"\2\2\u010a\u010b\7t\2\2\u010b\u010c\7w\2\2\u010c\u0113\7g\2\2\u010d\u010e"+
		"\7h\2\2\u010e\u010f\7c\2\2\u010f\u0110\7n\2\2\u0110\u0111\7u\2\2\u0111"+
		"\u0113\7g\2\2\u0112\u0109\3\2\2\2\u0112\u010d\3\2\2\2\u0113X\3\2\2\2\u0114"+
		"\u0118\t\2\2\2\u0115\u0117\t\2\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119Z\3\2\2\2\u011a\u0118"+
		"\3\2\2\2\u011b\u011c\7)\2\2\u011c\u011d\n\3\2\2\u011d\u011e\7)\2\2\u011e"+
		"\\\3\2\2\2\u011f\u0123\t\4\2\2\u0120\u0122\t\5\2\2\u0121\u0120\3\2\2\2"+
		"\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124^\3"+
		"\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\61\2\2\u0127\u0128\7\61\2\2\u0128"+
		"\u012c\3\2\2\2\u0129\u012b\n\6\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0130\b\60\2\2\u0130`\3\2\2\2\u0131\u0133\t\7\2\2"+
		"\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b\61\2\2\u0137b\3\2\2\2\b\2\u0112"+
		"\u0118\u0123\u012c\u0134\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}