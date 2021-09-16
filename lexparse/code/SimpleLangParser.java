// Generated from SimpleLang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLangParser extends Parser {
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
	public static final int
		RULE_r = 0, RULE_program = 1, RULE_constDecl = 2, RULE_enumDecl = 3, RULE_varDecl = 4, 
		RULE_classDecl = 5, RULE_interfaceDecl = 6, RULE_interfaceMethodDecl = 7, 
		RULE_methodDecl = 8, RULE_formParams = 9, RULE_type = 10, RULE_statement = 11, 
		RULE_designatorStatement = 12, RULE_actPars = 13, RULE_condition = 14, 
		RULE_condTerm = 15, RULE_condFact = 16, RULE_expr = 17, RULE_term = 18, 
		RULE_factor = 19, RULE_designator = 20, RULE_assignop = 21, RULE_relop = 22, 
		RULE_addop = 23, RULE_mulop = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "program", "constDecl", "enumDecl", "varDecl", "classDecl", "interfaceDecl", 
			"interfaceMethodDecl", "methodDecl", "formParams", "type", "statement", 
			"designatorStatement", "actPars", "condition", "condTerm", "condFact", 
			"expr", "term", "factor", "designator", "assignop", "relop", "addop", 
			"mulop"
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

	@Override
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			program();
			setState(51);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(SimpleLangParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode OCB() { return getToken(SimpleLangParser.OCB, 0); }
		public TerminalNode CCB() { return getToken(SimpleLangParser.CCB, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<EnumDeclContext> enumDecl() {
			return getRuleContexts(EnumDeclContext.class);
		}
		public EnumDeclContext enumDecl(int i) {
			return getRuleContext(EnumDeclContext.class,i);
		}
		public List<InterfaceDeclContext> interfaceDecl() {
			return getRuleContexts(InterfaceDeclContext.class);
		}
		public InterfaceDeclContext interfaceDecl(int i) {
			return getRuleContext(InterfaceDeclContext.class,i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(PROGRAM);
			setState(54);
			match(ID);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INTERFACE) | (1L << ENUM) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(55);
					constDecl();
					}
					break;
				case ID:
					{
					setState(56);
					varDecl();
					}
					break;
				case CLASS:
					{
					setState(57);
					classDecl();
					}
					break;
				case ENUM:
					{
					setState(58);
					enumDecl();
					}
					break;
				case INTERFACE:
					{
					setState(59);
					interfaceDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(OCB);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==ID) {
				{
				{
				setState(66);
				methodDecl();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(CCB);
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SimpleLangParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SimpleLangParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SimpleLangParser.ASSIGN, i);
		}
		public TerminalNode SM() { return getToken(SimpleLangParser.SM, 0); }
		public List<TerminalNode> NUM() { return getTokens(SimpleLangParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(SimpleLangParser.NUM, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(SimpleLangParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(SimpleLangParser.CHAR, i);
		}
		public List<TerminalNode> BOOL() { return getTokens(SimpleLangParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(SimpleLangParser.BOOL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(CONST);
			setState(75);
			type();
			setState(76);
			match(ID);
			setState(77);
			match(ASSIGN);
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NUM) | (1L << CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				match(ID);
				setState(81);
				match(ASSIGN);
				setState(82);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << NUM) | (1L << CHAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(SM);
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

	public static class EnumDeclContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(SimpleLangParser.ENUM, 0); }
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public TerminalNode OCB() { return getToken(SimpleLangParser.OCB, 0); }
		public TerminalNode CCB() { return getToken(SimpleLangParser.CCB, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SimpleLangParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SimpleLangParser.ASSIGN, i);
		}
		public List<TerminalNode> NUM() { return getTokens(SimpleLangParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(SimpleLangParser.NUM, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public EnumDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterEnumDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitEnumDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitEnumDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclContext enumDecl() throws RecognitionException {
		EnumDeclContext _localctx = new EnumDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_enumDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ENUM);
			setState(91);
			match(ID);
			setState(92);
			match(OCB);
			setState(93);
			match(ID);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(94);
				match(ASSIGN);
				setState(95);
				match(NUM);
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				match(ID);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(100);
					match(ASSIGN);
					setState(101);
					match(NUM);
					}
				}

				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(CCB);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public TerminalNode SM() { return getToken(SimpleLangParser.SM, 0); }
		public List<TerminalNode> OB() { return getTokens(SimpleLangParser.OB); }
		public TerminalNode OB(int i) {
			return getToken(SimpleLangParser.OB, i);
		}
		public List<TerminalNode> CB() { return getTokens(SimpleLangParser.CB); }
		public TerminalNode CB(int i) {
			return getToken(SimpleLangParser.CB, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			type();
			setState(112);
			match(ID);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OB) {
				{
				setState(113);
				match(OB);
				setState(114);
				match(CB);
				}
			}

			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117);
				match(COMMA);
				setState(118);
				match(ID);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OB) {
					{
					setState(119);
					match(OB);
					setState(120);
					match(CB);
					}
				}

				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(SM);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SimpleLangParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public List<TerminalNode> OCB() { return getTokens(SimpleLangParser.OCB); }
		public TerminalNode OCB(int i) {
			return getToken(SimpleLangParser.OCB, i);
		}
		public List<TerminalNode> CCB() { return getTokens(SimpleLangParser.CCB); }
		public TerminalNode CCB(int i) {
			return getToken(SimpleLangParser.CCB, i);
		}
		public TerminalNode EXTENDS() { return getToken(SimpleLangParser.EXTENDS, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode IMPLEMENTS() { return getToken(SimpleLangParser.IMPLEMENTS, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(CLASS);
			setState(131);
			match(ID);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(132);
				match(EXTENDS);
				setState(133);
				type();
				}
			}

			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(136);
				match(IMPLEMENTS);
				setState(137);
				type();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(138);
					match(COMMA);
					setState(139);
					type();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(147);
			match(OCB);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(148);
				varDecl();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OCB) {
				{
				setState(154);
				match(OCB);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VOID || _la==ID) {
					{
					{
					setState(155);
					methodDecl();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(CCB);
				}
			}

			setState(164);
			match(CCB);
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

	public static class InterfaceDeclContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(SimpleLangParser.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode OCB() { return getToken(SimpleLangParser.OCB, 0); }
		public TerminalNode CCB() { return getToken(SimpleLangParser.CCB, 0); }
		public List<InterfaceMethodDeclContext> interfaceMethodDecl() {
			return getRuleContexts(InterfaceMethodDeclContext.class);
		}
		public InterfaceMethodDeclContext interfaceMethodDecl(int i) {
			return getRuleContext(InterfaceMethodDeclContext.class,i);
		}
		public InterfaceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInterfaceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInterfaceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInterfaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclContext interfaceDecl() throws RecognitionException {
		InterfaceDeclContext _localctx = new InterfaceDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interfaceDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(INTERFACE);
			setState(167);
			match(ID);
			setState(168);
			match(OCB);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==ID) {
				{
				{
				setState(169);
				interfaceMethodDecl();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(CCB);
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

	public static class InterfaceMethodDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode OP() { return getToken(SimpleLangParser.OP, 0); }
		public TerminalNode CP() { return getToken(SimpleLangParser.CP, 0); }
		public TerminalNode SM() { return getToken(SimpleLangParser.SM, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimpleLangParser.VOID, 0); }
		public FormParamsContext formParams() {
			return getRuleContext(FormParamsContext.class,0);
		}
		public InterfaceMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInterfaceMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInterfaceMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInterfaceMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclContext interfaceMethodDecl() throws RecognitionException {
		InterfaceMethodDeclContext _localctx = new InterfaceMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interfaceMethodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(177);
				type();
				}
				break;
			case VOID:
				{
				setState(178);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(181);
			match(ID);
			setState(182);
			match(OP);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(183);
				formParams();
				}
			}

			setState(186);
			match(CP);
			setState(187);
			match(SM);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TerminalNode OP() { return getToken(SimpleLangParser.OP, 0); }
		public TerminalNode CP() { return getToken(SimpleLangParser.CP, 0); }
		public TerminalNode OCB() { return getToken(SimpleLangParser.OCB, 0); }
		public TerminalNode CCB() { return getToken(SimpleLangParser.CCB, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(SimpleLangParser.VOID, 0); }
		public FormParamsContext formParams() {
			return getRuleContext(FormParamsContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(189);
				type();
				}
				break;
			case VOID:
				{
				setState(190);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
			match(ID);
			setState(194);
			match(OP);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(195);
				formParams();
				}
			}

			setState(198);
			match(CP);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(199);
				varDecl();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(OCB);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << READ) | (1L << RETURN) | (1L << FOR) | (1L << CONTINUE) | (1L << OCB) | (1L << ID))) != 0)) {
				{
				{
				setState(206);
				statement();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(CCB);
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

	public static class FormParamsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public List<TerminalNode> OB() { return getTokens(SimpleLangParser.OB); }
		public TerminalNode OB(int i) {
			return getToken(SimpleLangParser.OB, i);
		}
		public List<TerminalNode> CB() { return getTokens(SimpleLangParser.CB); }
		public TerminalNode CB(int i) {
			return getToken(SimpleLangParser.CB, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public FormParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFormParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFormParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFormParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormParamsContext formParams() throws RecognitionException {
		FormParamsContext _localctx = new FormParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			type();
			setState(215);
			match(ID);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OB) {
				{
				setState(216);
				match(OB);
				setState(217);
				match(CB);
				}
			}

			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220);
				match(COMMA);
				setState(221);
				type();
				setState(222);
				match(ID);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OB) {
					{
					setState(223);
					match(OB);
					setState(224);
					match(CB);
					}
				}

				}
				}
				setState(231);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpleLangParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ID);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(SimpleLangParser.BREAK, 0); }
		public TerminalNode SM() { return getToken(SimpleLangParser.SM, 0); }
		public BreakStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatementContext {
		public TerminalNode IF() { return getToken(SimpleLangParser.IF, 0); }
		public TerminalNode OP() { return getToken(SimpleLangParser.OP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CP() { return getToken(SimpleLangParser.CP, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SimpleLangParser.ELSE, 0); }
		public IfStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DesigStatementContext extends StatementContext {
		public DesignatorStatementContext designatorStatement() {
			return getRuleContext(DesignatorStatementContext.class,0);
		}
		public TerminalNode SM() { return getToken(SimpleLangParser.SM, 0); }
		public DesigStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesigStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesigStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesigStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadStatementContext extends StatementContext {
		public TerminalNode READ() { return getToken(SimpleLangParser.READ, 0); }
		public TerminalNode OP() { return getToken(SimpleLangParser.OP, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode CP() { return getToken(SimpleLangParser.CP, 0); }
		public TerminalNode SM() { return getToken(SimpleLangParser.SM, 0); }
		public ReadStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitReadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatementContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(SimpleLangParser.PRINT, 0); }
		public TerminalNode OP() { return getToken(SimpleLangParser.OP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CP() { return getToken(SimpleLangParser.CP, 0); }
		public TerminalNode SM() { return getToken(SimpleLangParser.SM, 0); }
		public TerminalNode COMMA() { return getToken(SimpleLangParser.COMMA, 0); }
		public TerminalNode NUM() { return getToken(SimpleLangParser.NUM, 0); }
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStatementContext extends StatementContext {
		public TerminalNode OCB() { return getToken(SimpleLangParser.OCB, 0); }
		public TerminalNode CCB() { return getToken(SimpleLangParser.CCB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatementContext {
		public TerminalNode FOR() { return getToken(SimpleLangParser.FOR, 0); }
		public TerminalNode OP() { return getToken(SimpleLangParser.OP, 0); }
		public List<TerminalNode> SM() { return getTokens(SimpleLangParser.SM); }
		public TerminalNode SM(int i) {
			return getToken(SimpleLangParser.SM, i);
		}
		public TerminalNode CP() { return getToken(SimpleLangParser.CP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<DesignatorStatementContext> designatorStatement() {
			return getRuleContexts(DesignatorStatementContext.class);
		}
		public DesignatorStatementContext designatorStatement(int i) {
			return getRuleContext(DesignatorStatementContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementContext extends StatementContext {
		public TerminalNode CONTINUE() { return getToken(SimpleLangParser.CONTINUE, 0); }
		public TerminalNode SM() { return getToken(SimpleLangParser.SM, 0); }
		public ContinueStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RerturnStatementContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(SimpleLangParser.RETURN, 0); }
		public TerminalNode SM() { return getToken(SimpleLangParser.SM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RerturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterRerturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitRerturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitRerturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new DesigStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				designatorStatement();
				setState(235);
				match(SM);
				}
				break;
			case IF:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(IF);
				setState(238);
				match(OP);
				setState(239);
				condition();
				setState(240);
				match(CP);
				setState(241);
				statement();
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(242);
					match(ELSE);
					setState(243);
					statement();
					}
					break;
				}
				}
				break;
			case FOR:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(FOR);
				setState(247);
				match(OP);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(248);
					designatorStatement();
					}
				}

				setState(251);
				match(SM);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << MINUS) | (1L << OP) | (1L << BOOL) | (1L << NUM) | (1L << CHAR) | (1L << ID))) != 0)) {
					{
					setState(252);
					condition();
					}
				}

				setState(255);
				match(SM);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(256);
					designatorStatement();
					}
				}

				setState(259);
				match(CP);
				setState(260);
				statement();
				}
				break;
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(BREAK);
				setState(262);
				match(SM);
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				match(CONTINUE);
				setState(264);
				match(SM);
				}
				break;
			case RETURN:
				_localctx = new RerturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(265);
				match(RETURN);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << MINUS) | (1L << OP) | (1L << BOOL) | (1L << NUM) | (1L << CHAR) | (1L << ID))) != 0)) {
					{
					setState(266);
					expr();
					}
				}

				setState(269);
				match(SM);
				}
				break;
			case READ:
				_localctx = new ReadStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				match(READ);
				setState(271);
				match(OP);
				setState(272);
				designator();
				setState(273);
				match(CP);
				setState(274);
				match(SM);
				}
				break;
			case PRINT:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				match(PRINT);
				setState(277);
				match(OP);
				setState(278);
				expr();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(279);
					match(COMMA);
					setState(280);
					match(NUM);
					}
				}

				setState(283);
				match(CP);
				setState(284);
				match(SM);
				}
				break;
			case OCB:
				_localctx = new BlockStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(286);
				match(OCB);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << IF) | (1L << PRINT) | (1L << READ) | (1L << RETURN) | (1L << FOR) | (1L << CONTINUE) | (1L << OCB) | (1L << ID))) != 0)) {
					{
					{
					setState(287);
					statement();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(293);
				match(CCB);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DesignatorStatementContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public AssignopContext assignop() {
			return getRuleContext(AssignopContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OP() { return getToken(SimpleLangParser.OP, 0); }
		public TerminalNode CP() { return getToken(SimpleLangParser.CP, 0); }
		public TerminalNode PP() { return getToken(SimpleLangParser.PP, 0); }
		public TerminalNode MM() { return getToken(SimpleLangParser.MM, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public DesignatorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignatorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignatorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignatorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorStatementContext designatorStatement() throws RecognitionException {
		DesignatorStatementContext _localctx = new DesignatorStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_designatorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			designator();
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(297);
				assignop();
				setState(298);
				expr();
				}
				break;
			case OP:
				{
				setState(300);
				match(OP);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << MINUS) | (1L << OP) | (1L << BOOL) | (1L << NUM) | (1L << CHAR) | (1L << ID))) != 0)) {
					{
					setState(301);
					actPars();
					}
				}

				setState(304);
				match(CP);
				}
				break;
			case PP:
				{
				setState(305);
				match(PP);
				}
				break;
			case MM:
				{
				setState(306);
				match(MM);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ActParsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleLangParser.COMMA, i);
		}
		public ActParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actPars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterActPars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitActPars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitActPars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActParsContext actPars() throws RecognitionException {
		ActParsContext _localctx = new ActParsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			expr();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(310);
				match(COMMA);
				setState(311);
				expr();
				}
				}
				setState(316);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<CondTermContext> condTerm() {
			return getRuleContexts(CondTermContext.class);
		}
		public CondTermContext condTerm(int i) {
			return getRuleContext(CondTermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SimpleLangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SimpleLangParser.OR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			condTerm();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(318);
				match(OR);
				setState(319);
				condTerm();
				}
				}
				setState(324);
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

	public static class CondTermContext extends ParserRuleContext {
		public List<CondFactContext> condFact() {
			return getRuleContexts(CondFactContext.class);
		}
		public CondFactContext condFact(int i) {
			return getRuleContext(CondFactContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SimpleLangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SimpleLangParser.AND, i);
		}
		public CondTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondTermContext condTerm() throws RecognitionException {
		CondTermContext _localctx = new CondTermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			condFact();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(326);
				match(AND);
				setState(327);
				condFact();
				}
				}
				setState(332);
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

	public static class CondFactContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CondFactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condFact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCondFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCondFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCondFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondFactContext condFact() throws RecognitionException {
		CondFactContext _localctx = new CondFactContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condFact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			expr();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << GT) | (1L << GTOE) | (1L << LT) | (1L << LTOE))) != 0)) {
				{
				setState(334);
				relop();
				setState(335);
				expr();
				}
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(SimpleLangParser.MINUS, 0); }
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(339);
				match(MINUS);
				}
			}

			setState(342);
			term();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(343);
				addop();
				setState(344);
				term();
				}
				}
				setState(350);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			factor();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << REMINDER))) != 0)) {
				{
				{
				setState(352);
				mulop();
				setState(353);
				factor();
				}
				}
				setState(359);
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

	public static class FactorContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode OP() { return getToken(SimpleLangParser.OP, 0); }
		public TerminalNode CP() { return getToken(SimpleLangParser.CP, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public TerminalNode NUM() { return getToken(SimpleLangParser.NUM, 0); }
		public TerminalNode CHAR() { return getToken(SimpleLangParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(SimpleLangParser.BOOL, 0); }
		public TerminalNode NEW() { return getToken(SimpleLangParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OB() { return getToken(SimpleLangParser.OB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CB() { return getToken(SimpleLangParser.CB, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				designator();
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP) {
					{
					setState(361);
					match(OP);
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << MINUS) | (1L << OP) | (1L << BOOL) | (1L << NUM) | (1L << CHAR) | (1L << ID))) != 0)) {
						{
						setState(362);
						actPars();
						}
					}

					setState(365);
					match(CP);
					}
				}

				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				match(NUM);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				match(CHAR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				match(BOOL);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(371);
				match(NEW);
				setState(372);
				type();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OB) {
					{
					setState(373);
					match(OB);
					setState(374);
					expr();
					setState(375);
					match(CB);
					}
				}

				}
				break;
			case OP:
				enterOuterAlt(_localctx, 6);
				{
				setState(379);
				match(OP);
				setState(380);
				expr();
				setState(381);
				match(CP);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DesignatorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpleLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleLangParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(SimpleLangParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SimpleLangParser.DOT, i);
		}
		public List<TerminalNode> OB() { return getTokens(SimpleLangParser.OB); }
		public TerminalNode OB(int i) {
			return getToken(SimpleLangParser.OB, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CB() { return getTokens(SimpleLangParser.CB); }
		public TerminalNode CB(int i) {
			return getToken(SimpleLangParser.CB, i);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(ID);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT || _la==OB) {
				{
				setState(392);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(386);
					match(DOT);
					setState(387);
					match(ID);
					}
					break;
				case OB:
					{
					setState(388);
					match(OB);
					setState(389);
					expr();
					setState(390);
					match(CB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(396);
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

	public static class AssignopContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SimpleLangParser.ASSIGN, 0); }
		public AssignopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAssignop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAssignop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAssignop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignopContext assignop() throws RecognitionException {
		AssignopContext _localctx = new AssignopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(ASSIGN);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(SimpleLangParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(SimpleLangParser.NOT_EQUALS, 0); }
		public TerminalNode GT() { return getToken(SimpleLangParser.GT, 0); }
		public TerminalNode GTOE() { return getToken(SimpleLangParser.GTOE, 0); }
		public TerminalNode LT() { return getToken(SimpleLangParser.LT, 0); }
		public TerminalNode LTOE() { return getToken(SimpleLangParser.LTOE, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << GT) | (1L << GTOE) | (1L << LT) | (1L << LTOE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AddopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SimpleLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SimpleLangParser.MINUS, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAddop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAddop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(SimpleLangParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(SimpleLangParser.DIVIDE, 0); }
		public TerminalNode REMINDER() { return getToken(SimpleLangParser.REMINDER, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitMulop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitMulop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << REMINDER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0198\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3B"+
		"\13\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5c\n\5\3\5\3\5\3\5\3\5\5\5i\n\5\7\5k\n\5\f\5\16\5n\13\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\5\6v\n\6\3\6\3\6\3\6\3\6\5\6|\n\6\7\6~\n\6\f\6\16\6\u0081\13"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0089\n\7\3\7\3\7\3\7\3\7\7\7\u008f\n\7"+
		"\f\7\16\7\u0092\13\7\5\7\u0094\n\7\3\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b"+
		"\13\7\3\7\3\7\7\7\u009f\n\7\f\7\16\7\u00a2\13\7\3\7\5\7\u00a5\n\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\7\b\u00ad\n\b\f\b\16\b\u00b0\13\b\3\b\3\b\3\t\3\t"+
		"\5\t\u00b6\n\t\3\t\3\t\3\t\5\t\u00bb\n\t\3\t\3\t\3\t\3\n\3\n\5\n\u00c2"+
		"\n\n\3\n\3\n\3\n\5\n\u00c7\n\n\3\n\3\n\7\n\u00cb\n\n\f\n\16\n\u00ce\13"+
		"\n\3\n\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\5\13\u00dd\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e4\n\13\7\13\u00e6"+
		"\n\13\f\13\16\13\u00e9\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00f7\n\r\3\r\3\r\3\r\5\r\u00fc\n\r\3\r\3\r\5\r\u0100\n\r\3"+
		"\r\3\r\5\r\u0104\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010e\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011c\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0123\n\r\f\r\16\r\u0126\13\r\3\r\5\r\u0129\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0131\n\16\3\16\3\16\3\16\5\16\u0136\n\16\3"+
		"\17\3\17\3\17\7\17\u013b\n\17\f\17\16\17\u013e\13\17\3\20\3\20\3\20\7"+
		"\20\u0143\n\20\f\20\16\20\u0146\13\20\3\21\3\21\3\21\7\21\u014b\n\21\f"+
		"\21\16\21\u014e\13\21\3\22\3\22\3\22\3\22\5\22\u0154\n\22\3\23\5\23\u0157"+
		"\n\23\3\23\3\23\3\23\3\23\7\23\u015d\n\23\f\23\16\23\u0160\13\23\3\24"+
		"\3\24\3\24\3\24\7\24\u0166\n\24\f\24\16\24\u0169\13\24\3\25\3\25\3\25"+
		"\5\25\u016e\n\25\3\25\5\25\u0171\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u017c\n\25\3\25\3\25\3\25\3\25\5\25\u0182\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u018b\n\26\f\26\16\26\u018e\13\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2-/\3\2\31\36\3\2\24\25\3\2"+
		"\26\30\2\u01bf\2\64\3\2\2\2\4\67\3\2\2\2\6L\3\2\2\2\b\\\3\2\2\2\nq\3\2"+
		"\2\2\f\u0084\3\2\2\2\16\u00a8\3\2\2\2\20\u00b5\3\2\2\2\22\u00c1\3\2\2"+
		"\2\24\u00d8\3\2\2\2\26\u00ea\3\2\2\2\30\u0128\3\2\2\2\32\u012a\3\2\2\2"+
		"\34\u0137\3\2\2\2\36\u013f\3\2\2\2 \u0147\3\2\2\2\"\u014f\3\2\2\2$\u0156"+
		"\3\2\2\2&\u0161\3\2\2\2(\u0181\3\2\2\2*\u0183\3\2\2\2,\u018f\3\2\2\2."+
		"\u0191\3\2\2\2\60\u0193\3\2\2\2\62\u0195\3\2\2\2\64\65\5\4\3\2\65\66\7"+
		"\2\2\3\66\3\3\2\2\2\678\7\3\2\28@\7\60\2\29?\5\6\4\2:?\5\n\6\2;?\5\f\7"+
		"\2<?\5\b\5\2=?\5\16\b\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2"+
		"\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CG\7+\2\2DF\5\22"+
		"\n\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7,"+
		"\2\2K\5\3\2\2\2LM\7\t\2\2MN\5\26\f\2NO\7\60\2\2OP\7!\2\2PW\t\2\2\2QR\7"+
		"%\2\2RS\7\60\2\2ST\7!\2\2TV\t\2\2\2UQ\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3"+
		"\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7$\2\2[\7\3\2\2\2\\]\7\7\2\2]^\7\60\2\2^"+
		"_\7+\2\2_b\7\60\2\2`a\7!\2\2ac\7.\2\2b`\3\2\2\2bc\3\2\2\2cl\3\2\2\2de"+
		"\7%\2\2eh\7\60\2\2fg\7!\2\2gi\7.\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jd\3"+
		"\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7,\2\2p\t\3"+
		"\2\2\2qr\5\26\f\2ru\7\60\2\2st\7)\2\2tv\7*\2\2us\3\2\2\2uv\3\2\2\2v\177"+
		"\3\2\2\2wx\7%\2\2x{\7\60\2\2yz\7)\2\2z|\7*\2\2{y\3\2\2\2{|\3\2\2\2|~\3"+
		"\2\2\2}w\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7$\2\2\u0083\13\3\2\2\2\u0084\u0085"+
		"\7\5\2\2\u0085\u0088\7\60\2\2\u0086\u0087\7\22\2\2\u0087\u0089\5\26\f"+
		"\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0093\3\2\2\2\u008a\u008b"+
		"\7\21\2\2\u008b\u0090\5\26\f\2\u008c\u008d\7%\2\2\u008d\u008f\5\26\f\2"+
		"\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u008a\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0099\7+\2\2\u0096\u0098\5\n"+
		"\6\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u00a4\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a0\7+"+
		"\2\2\u009d\u009f\5\22\n\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a5\7,\2\2\u00a4\u009c\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\7,\2\2\u00a7\r\3\2\2\2\u00a8\u00a9\7\6\2\2"+
		"\u00a9\u00aa\7\60\2\2\u00aa\u00ae\7+\2\2\u00ab\u00ad\5\20\t\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7,\2\2\u00b2\17\3\2\2\2"+
		"\u00b3\u00b6\5\26\f\2\u00b4\u00b6\7\17\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\60\2\2\u00b8\u00ba\7\'\2\2"+
		"\u00b9\u00bb\5\24\13\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\7(\2\2\u00bd\u00be\7$\2\2\u00be\21\3\2\2\2\u00bf"+
		"\u00c2\5\26\f\2\u00c0\u00c2\7\17\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\60\2\2\u00c4\u00c6\7\'\2\2\u00c5"+
		"\u00c7\5\24\13\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3"+
		"\2\2\2\u00c8\u00cc\7(\2\2\u00c9\u00cb\5\n\6\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d3\7+\2\2\u00d0\u00d2\5\30\r\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7"+
		"\23\3\2\2\2\u00d8\u00d9\5\26\f\2\u00d9\u00dc\7\60\2\2\u00da\u00db\7)\2"+
		"\2\u00db\u00dd\7*\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e7"+
		"\3\2\2\2\u00de\u00df\7%\2\2\u00df\u00e0\5\26\f\2\u00e0\u00e3\7\60\2\2"+
		"\u00e1\u00e2\7)\2\2\u00e2\u00e4\7*\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00de\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\25\3\2\2\2\u00e9\u00e7\3\2\2"+
		"\2\u00ea\u00eb\7\60\2\2\u00eb\27\3\2\2\2\u00ec\u00ed\5\32\16\2\u00ed\u00ee"+
		"\7$\2\2\u00ee\u0129\3\2\2\2\u00ef\u00f0\7\n\2\2\u00f0\u00f1\7\'\2\2\u00f1"+
		"\u00f2\5\36\20\2\u00f2\u00f3\7(\2\2\u00f3\u00f6\5\30\r\2\u00f4\u00f5\7"+
		"\b\2\2\u00f5\u00f7\5\30\r\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u0129\3\2\2\2\u00f8\u00f9\7\20\2\2\u00f9\u00fb\7\'\2\2\u00fa\u00fc\5"+
		"\32\16\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\7$\2\2\u00fe\u0100\5\36\20\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\7$\2\2\u0102\u0104\5\32\16\2\u0103"+
		"\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7("+
		"\2\2\u0106\u0129\5\30\r\2\u0107\u0108\7\4\2\2\u0108\u0129\7$\2\2\u0109"+
		"\u010a\7\23\2\2\u010a\u0129\7$\2\2\u010b\u010d\7\16\2\2\u010c\u010e\5"+
		"$\23\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0129\7$\2\2\u0110\u0111\7\r\2\2\u0111\u0112\7\'\2\2\u0112\u0113\5*\26"+
		"\2\u0113\u0114\7(\2\2\u0114\u0115\7$\2\2\u0115\u0129\3\2\2\2\u0116\u0117"+
		"\7\f\2\2\u0117\u0118\7\'\2\2\u0118\u011b\5$\23\2\u0119\u011a\7%\2\2\u011a"+
		"\u011c\7.\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011e\7(\2\2\u011e\u011f\7$\2\2\u011f\u0129\3\2\2\2\u0120\u0124"+
		"\7+\2\2\u0121\u0123\5\30\r\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0129\7,\2\2\u0128\u00ec\3\2\2\2\u0128\u00ef\3\2\2\2\u0128"+
		"\u00f8\3\2\2\2\u0128\u0107\3\2\2\2\u0128\u0109\3\2\2\2\u0128\u010b\3\2"+
		"\2\2\u0128\u0110\3\2\2\2\u0128\u0116\3\2\2\2\u0128\u0120\3\2\2\2\u0129"+
		"\31\3\2\2\2\u012a\u0135\5*\26\2\u012b\u012c\5,\27\2\u012c\u012d\5$\23"+
		"\2\u012d\u0136\3\2\2\2\u012e\u0130\7\'\2\2\u012f\u0131\5\34\17\2\u0130"+
		"\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0136\7("+
		"\2\2\u0133\u0136\7\"\2\2\u0134\u0136\7#\2\2\u0135\u012b\3\2\2\2\u0135"+
		"\u012e\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\33\3\2\2"+
		"\2\u0137\u013c\5$\23\2\u0138\u0139\7%\2\2\u0139\u013b\5$\23\2\u013a\u0138"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\35\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0144\5 \21\2\u0140\u0141\7 \2\2"+
		"\u0141\u0143\5 \21\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\37\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u014c\5\"\22\2\u0148\u0149\7\37\2\2\u0149\u014b\5\"\22\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"!\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0153\5$\23\2\u0150\u0151\5.\30\2"+
		"\u0151\u0152\5$\23\2\u0152\u0154\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0154"+
		"\3\2\2\2\u0154#\3\2\2\2\u0155\u0157\7\25\2\2\u0156\u0155\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015e\5&\24\2\u0159\u015a\5\60"+
		"\31\2\u015a\u015b\5&\24\2\u015b\u015d\3\2\2\2\u015c\u0159\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f%\3\2\2\2"+
		"\u0160\u015e\3\2\2\2\u0161\u0167\5(\25\2\u0162\u0163\5\62\32\2\u0163\u0164"+
		"\5(\25\2\u0164\u0166\3\2\2\2\u0165\u0162\3\2\2\2\u0166\u0169\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\'\3\2\2\2\u0169\u0167\3\2\2\2"+
		"\u016a\u0170\5*\26\2\u016b\u016d\7\'\2\2\u016c\u016e\5\34\17\2\u016d\u016c"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\7(\2\2\u0170"+
		"\u016b\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0182\3\2\2\2\u0172\u0182\7."+
		"\2\2\u0173\u0182\7/\2\2\u0174\u0182\7-\2\2\u0175\u0176\7\13\2\2\u0176"+
		"\u017b\5\26\f\2\u0177\u0178\7)\2\2\u0178\u0179\5$\23\2\u0179\u017a\7*"+
		"\2\2\u017a\u017c\3\2\2\2\u017b\u0177\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u0182\3\2\2\2\u017d\u017e\7\'\2\2\u017e\u017f\5$\23\2\u017f\u0180\7("+
		"\2\2\u0180\u0182\3\2\2\2\u0181\u016a\3\2\2\2\u0181\u0172\3\2\2\2\u0181"+
		"\u0173\3\2\2\2\u0181\u0174\3\2\2\2\u0181\u0175\3\2\2\2\u0181\u017d\3\2"+
		"\2\2\u0182)\3\2\2\2\u0183\u018c\7\60\2\2\u0184\u0185\7&\2\2\u0185\u018b"+
		"\7\60\2\2\u0186\u0187\7)\2\2\u0187\u0188\5$\23\2\u0188\u0189\7*\2\2\u0189"+
		"\u018b\3\2\2\2\u018a\u0184\3\2\2\2\u018a\u0186\3\2\2\2\u018b\u018e\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d+\3\2\2\2\u018e\u018c"+
		"\3\2\2\2\u018f\u0190\7!\2\2\u0190-\3\2\2\2\u0191\u0192\t\3\2\2\u0192/"+
		"\3\2\2\2\u0193\u0194\t\4\2\2\u0194\61\3\2\2\2\u0195\u0196\t\5\2\2\u0196"+
		"\63\3\2\2\2\63>@GWbhlu{\177\u0088\u0090\u0093\u0099\u00a0\u00a4\u00ae"+
		"\u00b5\u00ba\u00c1\u00c6\u00cc\u00d3\u00dc\u00e3\u00e7\u00f6\u00fb\u00ff"+
		"\u0103\u010d\u011b\u0124\u0128\u0130\u0135\u013c\u0144\u014c\u0153\u0156"+
		"\u015e\u0167\u016d\u0170\u017b\u0181\u018a\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}