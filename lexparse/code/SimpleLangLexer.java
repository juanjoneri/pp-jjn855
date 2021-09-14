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
		CCB=42, BOOL=43, NUM=44, CHAR=45, ID=46, COMMENT=47, WS=48, OTHER=49;
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
			"NUM", "CHAR", "ID", "COMMENT", "WS", "OTHER"
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
			"BOOL", "NUM", "CHAR", "ID", "COMMENT", "WS", "OTHER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u013c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!"+
		"\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0115\n,\3-\3-\7-\u0119\n-\f-\16-\u011c"+
		"\13-\3.\3.\3.\3.\3/\3/\7/\u0124\n/\f/\16/\u0127\13/\3\60\3\60\3\60\3\60"+
		"\7\60\u012d\n\60\f\60\16\60\u0130\13\60\3\60\3\60\3\61\6\61\u0135\n\61"+
		"\r\61\16\61\u0136\3\61\3\61\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U,W-Y.[/]\60_\61a\62c\63\3\2\b\3\2\62;\6\2\f\f\17\17))^^\4\2C\\c|\6\2"+
		"\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0140\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3"+
		"e\3\2\2\2\5m\3\2\2\2\7s\3\2\2\2\ty\3\2\2\2\13\u0083\3\2\2\2\r\u0088\3"+
		"\2\2\2\17\u008d\3\2\2\2\21\u0093\3\2\2\2\23\u0096\3\2\2\2\25\u009a\3\2"+
		"\2\2\27\u00a0\3\2\2\2\31\u00a5\3\2\2\2\33\u00ac\3\2\2\2\35\u00b1\3\2\2"+
		"\2\37\u00b5\3\2\2\2!\u00c0\3\2\2\2#\u00c8\3\2\2\2%\u00d1\3\2\2\2\'\u00d3"+
		"\3\2\2\2)\u00d5\3\2\2\2+\u00d7\3\2\2\2-\u00d9\3\2\2\2/\u00db\3\2\2\2\61"+
		"\u00de\3\2\2\2\63\u00e1\3\2\2\2\65\u00e3\3\2\2\2\67\u00e6\3\2\2\29\u00e8"+
		"\3\2\2\2;\u00eb\3\2\2\2=\u00ee\3\2\2\2?\u00f1\3\2\2\2A\u00f3\3\2\2\2C"+
		"\u00f6\3\2\2\2E\u00f9\3\2\2\2G\u00fb\3\2\2\2I\u00fd\3\2\2\2K\u00ff\3\2"+
		"\2\2M\u0101\3\2\2\2O\u0103\3\2\2\2Q\u0105\3\2\2\2S\u0107\3\2\2\2U\u0109"+
		"\3\2\2\2W\u0114\3\2\2\2Y\u0116\3\2\2\2[\u011d\3\2\2\2]\u0121\3\2\2\2_"+
		"\u0128\3\2\2\2a\u0134\3\2\2\2c\u013a\3\2\2\2ef\7r\2\2fg\7t\2\2gh\7q\2"+
		"\2hi\7i\2\2ij\7t\2\2jk\7c\2\2kl\7o\2\2l\4\3\2\2\2mn\7d\2\2no\7t\2\2op"+
		"\7g\2\2pq\7c\2\2qr\7m\2\2r\6\3\2\2\2st\7e\2\2tu\7n\2\2uv\7c\2\2vw\7u\2"+
		"\2wx\7u\2\2x\b\3\2\2\2yz\7k\2\2z{\7p\2\2{|\7v\2\2|}\7g\2\2}~\7t\2\2~\177"+
		"\7h\2\2\177\u0080\7c\2\2\u0080\u0081\7e\2\2\u0081\u0082\7g\2\2\u0082\n"+
		"\3\2\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086\7w\2\2\u0086"+
		"\u0087\7o\2\2\u0087\f\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\16\3\2\2\2\u008d\u008e\7e\2\2\u008e"+
		"\u008f\7q\2\2\u008f\u0090\7p\2\2\u0090\u0091\7u\2\2\u0091\u0092\7v\2\2"+
		"\u0092\20\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7h\2\2\u0095\22\3\2\2"+
		"\2\u0096\u0097\7p\2\2\u0097\u0098\7g\2\2\u0098\u0099\7y\2\2\u0099\24\3"+
		"\2\2\2\u009a\u009b\7r\2\2\u009b\u009c\7t\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7f\2\2\u00a4\30\3\2\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7w\2\2"+
		"\u00a9\u00aa\7t\2\2\u00aa\u00ab\7p\2\2\u00ab\32\3\2\2\2\u00ac\u00ad\7"+
		"x\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7f\2\2\u00b0\34"+
		"\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\36\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7r\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7g\2\2"+
		"\u00bc\u00bd\7p\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7u\2\2\u00bf \3\2\2"+
		"\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7z\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4"+
		"\7g\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7f\2\2\u00c6\u00c7\7u\2\2\u00c7"+
		"\"\3\2\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7p\2\2\u00cb"+
		"\u00cc\7v\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7w\2\2"+
		"\u00cf\u00d0\7g\2\2\u00d0$\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2&\3\2\2\2\u00d3"+
		"\u00d4\7/\2\2\u00d4(\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6*\3\2\2\2\u00d7\u00d8"+
		"\7\61\2\2\u00d8,\3\2\2\2\u00d9\u00da\7\'\2\2\u00da.\3\2\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc\u00dd\7?\2\2\u00dd\60\3\2\2\2\u00de\u00df\7#\2\2\u00df\u00e0"+
		"\7?\2\2\u00e0\62\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2\64\3\2\2\2\u00e3\u00e4"+
		"\7@\2\2\u00e4\u00e5\7?\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7>\2\2\u00e78"+
		"\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7?\2\2\u00ea:\3\2\2\2\u00eb\u00ec"+
		"\7(\2\2\u00ec\u00ed\7(\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7~\2\2\u00ef\u00f0"+
		"\7~\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2@\3\2\2\2\u00f3\u00f4\7"+
		"-\2\2\u00f4\u00f5\7-\2\2\u00f5B\3\2\2\2\u00f6\u00f7\7/\2\2\u00f7\u00f8"+
		"\7/\2\2\u00f8D\3\2\2\2\u00f9\u00fa\7=\2\2\u00faF\3\2\2\2\u00fb\u00fc\7"+
		".\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7\60\2\2\u00feJ\3\2\2\2\u00ff\u0100\7"+
		"*\2\2\u0100L\3\2\2\2\u0101\u0102\7+\2\2\u0102N\3\2\2\2\u0103\u0104\7]"+
		"\2\2\u0104P\3\2\2\2\u0105\u0106\7_\2\2\u0106R\3\2\2\2\u0107\u0108\7}\2"+
		"\2\u0108T\3\2\2\2\u0109\u010a\7\177\2\2\u010aV\3\2\2\2\u010b\u010c\7v"+
		"\2\2\u010c\u010d\7t\2\2\u010d\u010e\7w\2\2\u010e\u0115\7g\2\2\u010f\u0110"+
		"\7h\2\2\u0110\u0111\7c\2\2\u0111\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113"+
		"\u0115\7g\2\2\u0114\u010b\3\2\2\2\u0114\u010f\3\2\2\2\u0115X\3\2\2\2\u0116"+
		"\u011a\t\2\2\2\u0117\u0119\t\2\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011bZ\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011d\u011e\7)\2\2\u011e\u011f\n\3\2\2\u011f\u0120\7)\2\2\u0120"+
		"\\\3\2\2\2\u0121\u0125\t\4\2\2\u0122\u0124\t\5\2\2\u0123\u0122\3\2\2\2"+
		"\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126^\3"+
		"\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\61\2\2\u0129\u012a\7\61\2\2\u012a"+
		"\u012e\3\2\2\2\u012b\u012d\n\6\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0132\b\60\2\2\u0132`\3\2\2\2\u0133\u0135\t\7\2\2"+
		"\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b\61\2\2\u0139b\3\2\2\2\u013a"+
		"\u013b\13\2\2\2\u013bd\3\2\2\2\b\2\u0114\u011a\u0125\u012e\u0136\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}