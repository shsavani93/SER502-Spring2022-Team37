// Generated from /home/dennis/Desktop/LaxScript/parser/LaxScript.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LaxScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, String=41, Identifier=42, SpecialCharacter=43, Number=44, 
		Spacing=45;
	public static final int
		RULE_p = 0, RULE_k = 1, RULE_d = 2, RULE_init = 3, RULE_print = 4, RULE_int = 5, 
		RULE_str = 6, RULE_bool = 7, RULE_unaryOp = 8, RULE_ternaryOp = 9, RULE_cond = 10, 
		RULE_assignOp = 11, RULE_synthSugar = 12, RULE_ifCond = 13, RULE_whileLoop = 14, 
		RULE_forLoop = 15, RULE_option = 16, RULE_forRangeLoop = 17, RULE_expr = 18, 
		RULE_element = 19, RULE_value = 20, RULE_line = 21, RULE_sentenceOp = 22, 
		RULE_sentence = 23, RULE_iden = 24, RULE_specialChar = 25, RULE_num = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"p", "k", "d", "init", "print", "int", "str", "bool", "unaryOp", "ternaryOp", 
			"cond", "assignOp", "synthSugar", "ifCond", "whileLoop", "forLoop", "option", 
			"forRangeLoop", "expr", "element", "value", "line", "sentenceOp", "sentence", 
			"iden", "specialChar", "num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'int'", "'str'", "'boolean'", "'print'", "'('", 
			"')'", "'='", "'\"'", "'true'", "'false'", "'++'", "'--'", "'?'", "':'", 
			"'=='", "'<'", "'>'", "'<='", "'>='", "'!='", "'+='", "'-='", "'*='", 
			"'/='", "'if'", "'then'", "'{'", "'}'", "'else'", "'while'", "'for'", 
			"'in'", "'range'", "','", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "String", "Identifier", "SpecialCharacter", 
			"Number", "Spacing"
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
	public String getGrammarFileName() { return "LaxScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LaxScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PContext extends ParserRuleContext {
		public KContext k() {
			return getRuleContext(KContext.class,0);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_p);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			k();
			setState(55);
			match(T__0);
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

	public static class KContext extends ParserRuleContext {
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public KContext k() {
			return getRuleContext(KContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public TernaryOpContext ternaryOp() {
			return getRuleContext(TernaryOpContext.class,0);
		}
		public AssignOpContext assignOp() {
			return getRuleContext(AssignOpContext.class,0);
		}
		public SynthSugarContext synthSugar() {
			return getRuleContext(SynthSugarContext.class,0);
		}
		public IfCondContext ifCond() {
			return getRuleContext(IfCondContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ForRangeLoopContext forRangeLoop() {
			return getRuleContext(ForRangeLoopContext.class,0);
		}
		public KContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterK(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitK(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitK(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KContext k() throws RecognitionException {
		KContext _localctx = new KContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_k);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				d();
				setState(58);
				match(T__1);
				setState(59);
				k();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				d();
				setState(62);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				init();
				setState(65);
				match(T__1);
				setState(66);
				k();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				init();
				setState(69);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				print();
				setState(72);
				match(T__1);
				setState(73);
				k();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				print();
				setState(76);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				unaryOp();
				setState(79);
				match(T__1);
				setState(80);
				k();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				unaryOp();
				setState(83);
				match(T__1);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				ternaryOp();
				setState(86);
				match(T__1);
				setState(87);
				k();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				ternaryOp();
				setState(90);
				match(T__1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(92);
				assignOp();
				setState(93);
				match(T__1);
				setState(94);
				k();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(96);
				assignOp();
				setState(97);
				match(T__1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(99);
				synthSugar();
				setState(100);
				match(T__1);
				setState(101);
				k();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(103);
				synthSugar();
				setState(104);
				match(T__1);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(106);
				ifCond();
				setState(107);
				k();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(109);
				ifCond();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(110);
				whileLoop();
				setState(111);
				k();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(113);
				whileLoop();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(114);
				forLoop();
				setState(115);
				k();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(117);
				forLoop();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(118);
				forRangeLoop();
				setState(119);
				k();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(121);
				forRangeLoop();
				}
				break;
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

	public static class DContext extends ParserRuleContext {
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
	 
		public DContext() { }
		public void copyFrom(DContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationBooleanContext extends DContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public DeclarationBooleanContext(DContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterDeclarationBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitDeclarationBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitDeclarationBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationStringContext extends DContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public DeclarationStringContext(DContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterDeclarationString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitDeclarationString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitDeclarationString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationIntegerContext extends DContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public DeclarationIntegerContext(DContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterDeclarationInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitDeclarationInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitDeclarationInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_d);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new DeclarationIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__2);
				setState(125);
				iden();
				}
				break;
			case T__3:
				_localctx = new DeclarationStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__3);
				setState(127);
				iden();
				}
				break;
			case T__4:
				_localctx = new DeclarationBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(T__4);
				setState(129);
				iden();
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

	public static class InitContext extends ParserRuleContext {
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_init);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				int_();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				str();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				bool();
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStrContext extends PrintContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public PrintStrContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterPrintStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitPrintStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitPrintStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends PrintContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintExprContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__5);
				setState(138);
				match(T__6);
				setState(139);
				line();
				setState(140);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__5);
				setState(143);
				match(T__6);
				setState(144);
				expr();
				setState(145);
				match(T__7);
				}
				break;
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

	public static class IntContext extends ParserRuleContext {
		public IntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int; }
	 
		public IntContext() { }
		public void copyFrom(IntContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierIntInitContext extends IntContext {
		public List<IdenContext> iden() {
			return getRuleContexts(IdenContext.class);
		}
		public IdenContext iden(int i) {
			return getRuleContext(IdenContext.class,i);
		}
		public IdentifierIntInitContext(IntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterIdentifierIntInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitIdentifierIntInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitIdentifierIntInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberIntInitContext extends IntContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NumberIntInitContext(IntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterNumberIntInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitNumberIntInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitNumberIntInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionIntInitContext extends IntContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionIntInitContext(IntContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterExpressionIntInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitExpressionIntInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitExpressionIntInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntContext int_() throws RecognitionException {
		IntContext _localctx = new IntContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_int);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new NumberIntInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(T__2);
				setState(150);
				iden();
				setState(151);
				match(T__8);
				setState(152);
				num();
				}
				break;
			case 2:
				_localctx = new IdentifierIntInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__2);
				setState(155);
				iden();
				setState(156);
				match(T__8);
				setState(157);
				iden();
				}
				break;
			case 3:
				_localctx = new ExpressionIntInitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__2);
				setState(160);
				iden();
				setState(161);
				match(T__8);
				setState(162);
				expr();
				}
				break;
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

	public static class StrContext extends ParserRuleContext {
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
	 
		public StrContext() { }
		public void copyFrom(StrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SentenceStrInitContext extends StrContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public SentenceStrInitContext(StrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterSentenceStrInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitSentenceStrInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitSentenceStrInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierStrInitContext extends StrContext {
		public List<IdenContext> iden() {
			return getRuleContexts(IdenContext.class);
		}
		public IdenContext iden(int i) {
			return getRuleContext(IdenContext.class,i);
		}
		public IdentifierStrInitContext(StrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterIdentifierStrInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitIdentifierStrInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitIdentifierStrInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_str);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IdentifierStrInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__3);
				setState(167);
				iden();
				setState(168);
				match(T__8);
				setState(169);
				iden();
				}
				break;
			case 2:
				_localctx = new SentenceStrInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(T__3);
				setState(172);
				iden();
				setState(173);
				match(T__8);
				setState(174);
				match(T__9);
				setState(175);
				line();
				setState(176);
				match(T__9);
				}
				break;
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierBoolValContext extends BoolContext {
		public Token boolVal;
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public IdentifierBoolValContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterIdentifierBoolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitIdentifierBoolVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitIdentifierBoolVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierBoolInitContext extends BoolContext {
		public List<IdenContext> iden() {
			return getRuleContexts(IdenContext.class);
		}
		public IdenContext iden(int i) {
			return getRuleContext(IdenContext.class,i);
		}
		public IdentifierBoolInitContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterIdentifierBoolInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitIdentifierBoolInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitIdentifierBoolInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IdentifierBoolInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__4);
				setState(181);
				iden();
				setState(182);
				match(T__8);
				setState(183);
				iden();
				}
				break;
			case 2:
				_localctx = new IdentifierBoolValContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__4);
				setState(186);
				iden();
				setState(187);
				match(T__8);
				setState(188);
				((IdentifierBoolValContext)_localctx).boolVal = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((IdentifierBoolValContext)_localctx).boolVal = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
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

	public static class UnaryOpContext extends ParserRuleContext {
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
	 
		public UnaryOpContext() { }
		public void copyFrom(UnaryOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreDecrementContext extends UnaryOpContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public PreDecrementContext(UnaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterPreDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitPreDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitPreDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostDecrementContext extends UnaryOpContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public PostDecrementContext(UnaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterPostDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitPostDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitPostDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncrementContext extends UnaryOpContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public PostIncrementContext(UnaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterPostIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitPostIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitPostIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreIncrementContext extends UnaryOpContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public PreIncrementContext(UnaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterPreIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitPreIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitPreIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryOp);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new PreIncrementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(T__12);
				setState(193);
				iden();
				}
				break;
			case 2:
				_localctx = new PostIncrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				iden();
				setState(195);
				match(T__12);
				}
				break;
			case 3:
				_localctx = new PreDecrementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				match(T__13);
				setState(198);
				iden();
				}
				break;
			case 4:
				_localctx = new PostDecrementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				iden();
				setState(200);
				match(T__13);
				}
				break;
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

	public static class TernaryOpContext extends ParserRuleContext {
		public TernaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryOp; }
	 
		public TernaryOpContext() { }
		public void copyFrom(TernaryOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryBoolContext extends TernaryOpContext {
		public Token boolVal;
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TernaryBoolContext(TernaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterTernaryBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitTernaryBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitTernaryBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryStrContext extends TernaryOpContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public TernaryStrContext(TernaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterTernaryStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitTernaryStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitTernaryStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryIntContext extends TernaryOpContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryIntContext(TernaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterTernaryInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitTernaryInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitTernaryInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryOpContext ternaryOp() throws RecognitionException {
		TernaryOpContext _localctx = new TernaryOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ternaryOp);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new TernaryIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(T__2);
				setState(205);
				iden();
				setState(206);
				match(T__8);
				setState(207);
				cond();
				setState(208);
				match(T__14);
				setState(209);
				expr();
				setState(210);
				match(T__15);
				setState(211);
				expr();
				}
				break;
			case T__3:
				_localctx = new TernaryStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__3);
				setState(214);
				iden();
				setState(215);
				match(T__8);
				setState(216);
				cond();
				setState(217);
				match(T__14);
				setState(218);
				match(T__9);
				setState(219);
				line();
				setState(220);
				match(T__9);
				setState(221);
				match(T__15);
				setState(222);
				match(T__9);
				setState(223);
				line();
				setState(224);
				match(T__9);
				}
				break;
			case T__4:
				_localctx = new TernaryBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(T__4);
				setState(227);
				iden();
				setState(228);
				match(T__8);
				setState(229);
				cond();
				setState(230);
				match(T__14);
				setState(231);
				((TernaryBoolContext)_localctx).boolVal = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((TernaryBoolContext)_localctx).boolVal = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
				match(T__15);
				setState(233);
				((TernaryBoolContext)_localctx).boolVal = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((TernaryBoolContext)_localctx).boolVal = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionBoolOpContext extends CondContext {
		public Token boolVal;
		public ConditionBoolOpContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterConditionBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitConditionBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitConditionBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionOpContext extends CondContext {
		public Token condOp;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionOpContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterConditionOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitConditionOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitConditionOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cond);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
			case Number:
				_localctx = new ConditionOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				expr();
				setState(238);
				((ConditionOpContext)_localctx).condOp = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
					((ConditionOpContext)_localctx).condOp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(239);
				expr();
				}
				break;
			case T__10:
			case T__11:
				_localctx = new ConditionBoolOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				((ConditionBoolOpContext)_localctx).boolVal = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((ConditionBoolOpContext)_localctx).boolVal = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class AssignOpContext extends ParserRuleContext {
		public AssignOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignOp; }
	 
		public AssignOpContext() { }
		public void copyFrom(AssignOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberAssignmentContext extends AssignOpContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public NumberAssignmentContext(AssignOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterNumberAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitNumberAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitNumberAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionAssignmentContext extends AssignOpContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionAssignmentContext(AssignOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterExpressionAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitExpressionAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitExpressionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAssignmentContext extends AssignOpContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public StringAssignmentContext(AssignOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterStringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitStringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitStringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAssignmentContext extends AssignOpContext {
		public Token boolVal;
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public BooleanAssignmentContext(AssignOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterBooleanAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitBooleanAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitBooleanAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignOpContext assignOp() throws RecognitionException {
		AssignOpContext _localctx = new AssignOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignOp);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new NumberAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				iden();
				setState(245);
				match(T__8);
				setState(246);
				num();
				}
				break;
			case 2:
				_localctx = new BooleanAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				iden();
				setState(249);
				match(T__8);
				setState(250);
				((BooleanAssignmentContext)_localctx).boolVal = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((BooleanAssignmentContext)_localctx).boolVal = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new StringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				iden();
				setState(253);
				match(T__8);
				setState(254);
				match(T__9);
				setState(255);
				line();
				setState(256);
				match(T__9);
				}
				break;
			case 4:
				_localctx = new ExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				iden();
				setState(259);
				match(T__8);
				setState(260);
				expr();
				}
				break;
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

	public static class SynthSugarContext extends ParserRuleContext {
		public SynthSugarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synthSugar; }
	 
		public SynthSugarContext() { }
		public void copyFrom(SynthSugarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationEqualNumContext extends SynthSugarContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public MultiplicationEqualNumContext(SynthSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterMultiplicationEqualNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitMultiplicationEqualNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitMultiplicationEqualNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionEqualNumContext extends SynthSugarContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public DivisionEqualNumContext(SynthSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterDivisionEqualNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitDivisionEqualNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitDivisionEqualNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionEqualIDContext extends SynthSugarContext {
		public List<IdenContext> iden() {
			return getRuleContexts(IdenContext.class);
		}
		public IdenContext iden(int i) {
			return getRuleContext(IdenContext.class,i);
		}
		public SubtractionEqualIDContext(SynthSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterSubtractionEqualID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitSubtractionEqualID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitSubtractionEqualID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionEqualNumContext extends SynthSugarContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public AdditionEqualNumContext(SynthSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterAdditionEqualNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitAdditionEqualNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitAdditionEqualNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationEqualIDContext extends SynthSugarContext {
		public List<IdenContext> iden() {
			return getRuleContexts(IdenContext.class);
		}
		public IdenContext iden(int i) {
			return getRuleContext(IdenContext.class,i);
		}
		public MultiplicationEqualIDContext(SynthSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterMultiplicationEqualID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitMultiplicationEqualID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitMultiplicationEqualID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionEqualIDContext extends SynthSugarContext {
		public List<IdenContext> iden() {
			return getRuleContexts(IdenContext.class);
		}
		public IdenContext iden(int i) {
			return getRuleContext(IdenContext.class,i);
		}
		public DivisionEqualIDContext(SynthSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterDivisionEqualID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitDivisionEqualID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitDivisionEqualID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionEqualNumContext extends SynthSugarContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public SubtractionEqualNumContext(SynthSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterSubtractionEqualNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitSubtractionEqualNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitSubtractionEqualNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionEqualIDContext extends SynthSugarContext {
		public List<IdenContext> iden() {
			return getRuleContexts(IdenContext.class);
		}
		public IdenContext iden(int i) {
			return getRuleContext(IdenContext.class,i);
		}
		public AdditionEqualIDContext(SynthSugarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterAdditionEqualID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitAdditionEqualID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitAdditionEqualID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthSugarContext synthSugar() throws RecognitionException {
		SynthSugarContext _localctx = new SynthSugarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_synthSugar);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new AdditionEqualNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				iden();
				setState(265);
				match(T__22);
				setState(266);
				num();
				}
				break;
			case 2:
				_localctx = new SubtractionEqualNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				iden();
				setState(269);
				match(T__23);
				setState(270);
				num();
				}
				break;
			case 3:
				_localctx = new MultiplicationEqualNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				iden();
				setState(273);
				match(T__24);
				setState(274);
				num();
				}
				break;
			case 4:
				_localctx = new DivisionEqualNumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				iden();
				setState(277);
				match(T__25);
				setState(278);
				num();
				}
				break;
			case 5:
				_localctx = new AdditionEqualIDContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				iden();
				setState(281);
				match(T__22);
				setState(282);
				iden();
				}
				break;
			case 6:
				_localctx = new SubtractionEqualIDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				iden();
				setState(285);
				match(T__23);
				setState(286);
				iden();
				}
				break;
			case 7:
				_localctx = new MultiplicationEqualIDContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				iden();
				setState(289);
				match(T__24);
				setState(290);
				iden();
				}
				break;
			case 8:
				_localctx = new DivisionEqualIDContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(292);
				iden();
				setState(293);
				match(T__25);
				setState(294);
				iden();
				}
				break;
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

	public static class IfCondContext extends ParserRuleContext {
		public IfCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCond; }
	 
		public IfCondContext() { }
		public void copyFrom(IfCondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfThenCondContext extends IfCondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public KContext k() {
			return getRuleContext(KContext.class,0);
		}
		public IfThenCondContext(IfCondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterIfThenCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitIfThenCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitIfThenCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenElseCondContext extends IfCondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<KContext> k() {
			return getRuleContexts(KContext.class);
		}
		public KContext k(int i) {
			return getRuleContext(KContext.class,i);
		}
		public IfThenElseCondContext(IfCondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterIfThenElseCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitIfThenElseCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitIfThenElseCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCondContext ifCond() throws RecognitionException {
		IfCondContext _localctx = new IfCondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifCond);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new IfThenCondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(T__26);
				setState(299);
				match(T__6);
				setState(300);
				cond();
				setState(301);
				match(T__7);
				setState(302);
				match(T__27);
				setState(303);
				match(T__28);
				setState(304);
				k();
				setState(305);
				match(T__29);
				}
				break;
			case 2:
				_localctx = new IfThenElseCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(T__26);
				setState(308);
				match(T__6);
				setState(309);
				cond();
				setState(310);
				match(T__7);
				setState(311);
				match(T__27);
				setState(312);
				match(T__28);
				setState(313);
				k();
				setState(314);
				match(T__29);
				setState(315);
				match(T__30);
				setState(316);
				match(T__28);
				setState(317);
				k();
				setState(318);
				match(T__29);
				}
				break;
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

	public static class WhileLoopContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public KContext k() {
			return getRuleContext(KContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__31);
			setState(323);
			match(T__6);
			setState(324);
			cond();
			setState(325);
			match(T__7);
			setState(326);
			match(T__28);
			setState(327);
			k();
			setState(328);
			match(T__29);
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

	public static class ForLoopContext extends ParserRuleContext {
		public IntContext int_() {
			return getRuleContext(IntContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public KContext k() {
			return getRuleContext(KContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__32);
			setState(331);
			match(T__6);
			setState(332);
			int_();
			setState(333);
			match(T__1);
			setState(334);
			cond();
			setState(335);
			match(T__1);
			setState(336);
			option();
			setState(337);
			match(T__7);
			setState(338);
			match(T__28);
			setState(339);
			k();
			setState(340);
			match(T__29);
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

	public static class OptionContext extends ParserRuleContext {
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public SynthSugarContext synthSugar() {
			return getRuleContext(SynthSugarContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_option);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				unaryOp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				synthSugar();
				}
				break;
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

	public static class ForRangeLoopContext extends ParserRuleContext {
		public ForRangeLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRangeLoop; }
	 
		public ForRangeLoopContext() { }
		public void copyFrom(ForRangeLoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StepRangeFormatContext extends ForRangeLoopContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public KContext k() {
			return getRuleContext(KContext.class,0);
		}
		public StepRangeFormatContext(ForRangeLoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterStepRangeFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitStepRangeFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitStepRangeFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicRangeFormatContext extends ForRangeLoopContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public KContext k() {
			return getRuleContext(KContext.class,0);
		}
		public BasicRangeFormatContext(ForRangeLoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterBasicRangeFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitBasicRangeFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitBasicRangeFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeLoopContext forRangeLoop() throws RecognitionException {
		ForRangeLoopContext _localctx = new ForRangeLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forRangeLoop);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new BasicRangeFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(T__32);
				setState(347);
				iden();
				setState(348);
				match(T__33);
				setState(349);
				match(T__34);
				setState(350);
				match(T__6);
				setState(351);
				num();
				setState(352);
				match(T__35);
				setState(353);
				num();
				setState(354);
				match(T__7);
				setState(355);
				match(T__28);
				setState(356);
				k();
				setState(357);
				match(T__29);
				}
				break;
			case 2:
				_localctx = new StepRangeFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				match(T__32);
				setState(360);
				iden();
				setState(361);
				match(T__33);
				setState(362);
				match(T__34);
				setState(363);
				match(T__6);
				setState(364);
				num();
				setState(365);
				match(T__35);
				setState(366);
				num();
				setState(367);
				match(T__35);
				setState(368);
				num();
				setState(369);
				match(T__7);
				setState(370);
				match(T__28);
				setState(371);
				k();
				setState(372);
				match(T__29);
				}
				break;
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExprContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractContext extends ExprContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubtractContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitSubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitSubtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpPrecedenceContext extends ExprContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ExpPrecedenceContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterExpPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitExpPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitExpPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				element();
				setState(377);
				match(T__36);
				setState(378);
				expr();
				}
				break;
			case 2:
				_localctx = new SubtractContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				element();
				setState(381);
				match(T__37);
				setState(382);
				expr();
				}
				break;
			case 3:
				_localctx = new ExpPrecedenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				element();
				}
				break;
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

	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivideContext extends ElementContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public DivideContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyContext extends ElementContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public MultiplyContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorizationContext extends ElementContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FactorizationContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterFactorization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitFactorization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitFactorization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_element);
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new MultiplyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				value();
				setState(388);
				match(T__38);
				setState(389);
				element();
				}
				break;
			case 2:
				_localctx = new DivideContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				value();
				setState(392);
				match(T__39);
				setState(393);
				element();
				}
				break;
			case 3:
				_localctx = new FactorizationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				value();
				}
				break;
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprIDContext extends ValueContext {
		public IdenContext iden() {
			return getRuleContext(IdenContext.class,0);
		}
		public ExprIDContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitExprID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitExprID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumContext extends ValueContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ExprNumContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterExprNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitExprNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitExprNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new ExprIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				iden();
				}
				break;
			case Number:
				_localctx = new ExprNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				num();
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

	public static class LineContext extends ParserRuleContext {
		public List<SentenceOpContext> sentenceOp() {
			return getRuleContexts(SentenceOpContext.class);
		}
		public SentenceOpContext sentenceOp(int i) {
			return getRuleContext(SentenceOpContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << String) | (1L << SpecialCharacter) | (1L << Number))) != 0)) {
				{
				{
				setState(402);
				sentenceOp();
				}
				}
				setState(407);
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

	public static class SentenceOpContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public SpecialCharContext specialChar() {
			return getRuleContext(SpecialCharContext.class,0);
		}
		public SentenceOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenceOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterSentenceOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitSentenceOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitSentenceOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceOpContext sentenceOp() throws RecognitionException {
		SentenceOpContext _localctx = new SentenceOpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sentenceOp);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				num();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				sentence();
				}
				break;
			case SpecialCharacter:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
				specialChar();
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

	public static class SentenceContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(LaxScriptParser.String, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(String);
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

	public static class IdenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LaxScriptParser.Identifier, 0); }
		public IdenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterIden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitIden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitIden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdenContext iden() throws RecognitionException {
		IdenContext _localctx = new IdenContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_iden);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(Identifier);
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

	public static class SpecialCharContext extends ParserRuleContext {
		public TerminalNode SpecialCharacter() { return getToken(LaxScriptParser.SpecialCharacter, 0); }
		public SpecialCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterSpecialChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitSpecialChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitSpecialChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialCharContext specialChar() throws RecognitionException {
		SpecialCharContext _localctx = new SpecialCharContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_specialChar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(SpecialCharacter);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(LaxScriptParser.Number, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LaxScriptListener ) ((LaxScriptListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LaxScriptVisitor ) return ((LaxScriptVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(Number);
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
		"\u0004\u0001-\u01a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001{\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0083\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0088\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0094\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00a5\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00b3\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00bf\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00cb"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ec\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00f3\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0107\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0129\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0141\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0159\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0177\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0182\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u018d"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0191\b\u0014\u0001\u0015"+
		"\u0005\u0015\u0194\b\u0015\n\u0015\f\u0015\u0197\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u019c\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0000\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0002\u0001\u0000"+
		"\u000b\f\u0001\u0000\u0011\u0016\u01c3\u00006\u0001\u0000\u0000\u0000"+
		"\u0002z\u0001\u0000\u0000\u0000\u0004\u0082\u0001\u0000\u0000\u0000\u0006"+
		"\u0087\u0001\u0000\u0000\u0000\b\u0093\u0001\u0000\u0000\u0000\n\u00a4"+
		"\u0001\u0000\u0000\u0000\f\u00b2\u0001\u0000\u0000\u0000\u000e\u00be\u0001"+
		"\u0000\u0000\u0000\u0010\u00ca\u0001\u0000\u0000\u0000\u0012\u00eb\u0001"+
		"\u0000\u0000\u0000\u0014\u00f2\u0001\u0000\u0000\u0000\u0016\u0106\u0001"+
		"\u0000\u0000\u0000\u0018\u0128\u0001\u0000\u0000\u0000\u001a\u0140\u0001"+
		"\u0000\u0000\u0000\u001c\u0142\u0001\u0000\u0000\u0000\u001e\u014a\u0001"+
		"\u0000\u0000\u0000 \u0158\u0001\u0000\u0000\u0000\"\u0176\u0001\u0000"+
		"\u0000\u0000$\u0181\u0001\u0000\u0000\u0000&\u018c\u0001\u0000\u0000\u0000"+
		"(\u0190\u0001\u0000\u0000\u0000*\u0195\u0001\u0000\u0000\u0000,\u019b"+
		"\u0001\u0000\u0000\u0000.\u019d\u0001\u0000\u0000\u00000\u019f\u0001\u0000"+
		"\u0000\u00002\u01a1\u0001\u0000\u0000\u00004\u01a3\u0001\u0000\u0000\u0000"+
		"67\u0003\u0002\u0001\u000078\u0005\u0001\u0000\u00008\u0001\u0001\u0000"+
		"\u0000\u00009:\u0003\u0004\u0002\u0000:;\u0005\u0002\u0000\u0000;<\u0003"+
		"\u0002\u0001\u0000<{\u0001\u0000\u0000\u0000=>\u0003\u0004\u0002\u0000"+
		">?\u0005\u0002\u0000\u0000?{\u0001\u0000\u0000\u0000@A\u0003\u0006\u0003"+
		"\u0000AB\u0005\u0002\u0000\u0000BC\u0003\u0002\u0001\u0000C{\u0001\u0000"+
		"\u0000\u0000DE\u0003\u0006\u0003\u0000EF\u0005\u0002\u0000\u0000F{\u0001"+
		"\u0000\u0000\u0000GH\u0003\b\u0004\u0000HI\u0005\u0002\u0000\u0000IJ\u0003"+
		"\u0002\u0001\u0000J{\u0001\u0000\u0000\u0000KL\u0003\b\u0004\u0000LM\u0005"+
		"\u0002\u0000\u0000M{\u0001\u0000\u0000\u0000NO\u0003\u0010\b\u0000OP\u0005"+
		"\u0002\u0000\u0000PQ\u0003\u0002\u0001\u0000Q{\u0001\u0000\u0000\u0000"+
		"RS\u0003\u0010\b\u0000ST\u0005\u0002\u0000\u0000T{\u0001\u0000\u0000\u0000"+
		"UV\u0003\u0012\t\u0000VW\u0005\u0002\u0000\u0000WX\u0003\u0002\u0001\u0000"+
		"X{\u0001\u0000\u0000\u0000YZ\u0003\u0012\t\u0000Z[\u0005\u0002\u0000\u0000"+
		"[{\u0001\u0000\u0000\u0000\\]\u0003\u0016\u000b\u0000]^\u0005\u0002\u0000"+
		"\u0000^_\u0003\u0002\u0001\u0000_{\u0001\u0000\u0000\u0000`a\u0003\u0016"+
		"\u000b\u0000ab\u0005\u0002\u0000\u0000b{\u0001\u0000\u0000\u0000cd\u0003"+
		"\u0018\f\u0000de\u0005\u0002\u0000\u0000ef\u0003\u0002\u0001\u0000f{\u0001"+
		"\u0000\u0000\u0000gh\u0003\u0018\f\u0000hi\u0005\u0002\u0000\u0000i{\u0001"+
		"\u0000\u0000\u0000jk\u0003\u001a\r\u0000kl\u0003\u0002\u0001\u0000l{\u0001"+
		"\u0000\u0000\u0000m{\u0003\u001a\r\u0000no\u0003\u001c\u000e\u0000op\u0003"+
		"\u0002\u0001\u0000p{\u0001\u0000\u0000\u0000q{\u0003\u001c\u000e\u0000"+
		"rs\u0003\u001e\u000f\u0000st\u0003\u0002\u0001\u0000t{\u0001\u0000\u0000"+
		"\u0000u{\u0003\u001e\u000f\u0000vw\u0003\"\u0011\u0000wx\u0003\u0002\u0001"+
		"\u0000x{\u0001\u0000\u0000\u0000y{\u0003\"\u0011\u0000z9\u0001\u0000\u0000"+
		"\u0000z=\u0001\u0000\u0000\u0000z@\u0001\u0000\u0000\u0000zD\u0001\u0000"+
		"\u0000\u0000zG\u0001\u0000\u0000\u0000zK\u0001\u0000\u0000\u0000zN\u0001"+
		"\u0000\u0000\u0000zR\u0001\u0000\u0000\u0000zU\u0001\u0000\u0000\u0000"+
		"zY\u0001\u0000\u0000\u0000z\\\u0001\u0000\u0000\u0000z`\u0001\u0000\u0000"+
		"\u0000zc\u0001\u0000\u0000\u0000zg\u0001\u0000\u0000\u0000zj\u0001\u0000"+
		"\u0000\u0000zm\u0001\u0000\u0000\u0000zn\u0001\u0000\u0000\u0000zq\u0001"+
		"\u0000\u0000\u0000zr\u0001\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000"+
		"zv\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u0003\u0001\u0000"+
		"\u0000\u0000|}\u0005\u0003\u0000\u0000}\u0083\u00030\u0018\u0000~\u007f"+
		"\u0005\u0004\u0000\u0000\u007f\u0083\u00030\u0018\u0000\u0080\u0081\u0005"+
		"\u0005\u0000\u0000\u0081\u0083\u00030\u0018\u0000\u0082|\u0001\u0000\u0000"+
		"\u0000\u0082~\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0083\u0005\u0001\u0000\u0000\u0000\u0084\u0088\u0003\n\u0005\u0000\u0085"+
		"\u0088\u0003\f\u0006\u0000\u0086\u0088\u0003\u000e\u0007\u0000\u0087\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0007\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005\u0006\u0000\u0000\u008a\u008b\u0005\u0007\u0000\u0000\u008b\u008c"+
		"\u0003*\u0015\u0000\u008c\u008d\u0005\b\u0000\u0000\u008d\u0094\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u0006\u0000\u0000\u008f\u0090\u0005"+
		"\u0007\u0000\u0000\u0090\u0091\u0003$\u0012\u0000\u0091\u0092\u0005\b"+
		"\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0089\u0001\u0000"+
		"\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0094\t\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005\u0003\u0000\u0000\u0096\u0097\u00030\u0018\u0000"+
		"\u0097\u0098\u0005\t\u0000\u0000\u0098\u0099\u00034\u001a\u0000\u0099"+
		"\u00a5\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0003\u0000\u0000\u009b"+
		"\u009c\u00030\u0018\u0000\u009c\u009d\u0005\t\u0000\u0000\u009d\u009e"+
		"\u00030\u0018\u0000\u009e\u00a5\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"\u0003\u0000\u0000\u00a0\u00a1\u00030\u0018\u0000\u00a1\u00a2\u0005\t"+
		"\u0000\u0000\u00a2\u00a3\u0003$\u0012\u0000\u00a3\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a4\u0095\u0001\u0000\u0000\u0000\u00a4\u009a\u0001\u0000\u0000"+
		"\u0000\u00a4\u009f\u0001\u0000\u0000\u0000\u00a5\u000b\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0004\u0000\u0000\u00a7\u00a8\u00030\u0018\u0000"+
		"\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u00aa\u00030\u0018\u0000\u00aa"+
		"\u00b3\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0004\u0000\u0000\u00ac"+
		"\u00ad\u00030\u0018\u0000\u00ad\u00ae\u0005\t\u0000\u0000\u00ae\u00af"+
		"\u0005\n\u0000\u0000\u00af\u00b0\u0003*\u0015\u0000\u00b0\u00b1\u0005"+
		"\n\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00a6\u0001\u0000"+
		"\u0000\u0000\u00b2\u00ab\u0001\u0000\u0000\u0000\u00b3\r\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0005\u0000\u0000\u00b5\u00b6\u00030\u0018\u0000"+
		"\u00b6\u00b7\u0005\t\u0000\u0000\u00b7\u00b8\u00030\u0018\u0000\u00b8"+
		"\u00bf\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba"+
		"\u00bb\u00030\u0018\u0000\u00bb\u00bc\u0005\t\u0000\u0000\u00bc\u00bd"+
		"\u0007\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00b4"+
		"\u0001\u0000\u0000\u0000\u00be\u00b9\u0001\u0000\u0000\u0000\u00bf\u000f"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\r\u0000\u0000\u00c1\u00cb\u0003"+
		"0\u0018\u0000\u00c2\u00c3\u00030\u0018\u0000\u00c3\u00c4\u0005\r\u0000"+
		"\u0000\u00c4\u00cb\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u000e\u0000"+
		"\u0000\u00c6\u00cb\u00030\u0018\u0000\u00c7\u00c8\u00030\u0018\u0000\u00c8"+
		"\u00c9\u0005\u000e\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c0\u0001\u0000\u0000\u0000\u00ca\u00c2\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c5\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00cb"+
		"\u0011\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0003\u0000\u0000\u00cd"+
		"\u00ce\u00030\u0018\u0000\u00ce\u00cf\u0005\t\u0000\u0000\u00cf\u00d0"+
		"\u0003\u0014\n\u0000\u00d0\u00d1\u0005\u000f\u0000\u0000\u00d1\u00d2\u0003"+
		"$\u0012\u0000\u00d2\u00d3\u0005\u0010\u0000\u0000\u00d3\u00d4\u0003$\u0012"+
		"\u0000\u00d4\u00ec\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0004\u0000"+
		"\u0000\u00d6\u00d7\u00030\u0018\u0000\u00d7\u00d8\u0005\t\u0000\u0000"+
		"\u00d8\u00d9\u0003\u0014\n\u0000\u00d9\u00da\u0005\u000f\u0000\u0000\u00da"+
		"\u00db\u0005\n\u0000\u0000\u00db\u00dc\u0003*\u0015\u0000\u00dc\u00dd"+
		"\u0005\n\u0000\u0000\u00dd\u00de\u0005\u0010\u0000\u0000\u00de\u00df\u0005"+
		"\n\u0000\u0000\u00df\u00e0\u0003*\u0015\u0000\u00e0\u00e1\u0005\n\u0000"+
		"\u0000\u00e1\u00ec\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0005\u0000"+
		"\u0000\u00e3\u00e4\u00030\u0018\u0000\u00e4\u00e5\u0005\t\u0000\u0000"+
		"\u00e5\u00e6\u0003\u0014\n\u0000\u00e6\u00e7\u0005\u000f\u0000\u0000\u00e7"+
		"\u00e8\u0007\u0000\u0000\u0000\u00e8\u00e9\u0005\u0010\u0000\u0000\u00e9"+
		"\u00ea\u0007\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00eb\u00d5\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e2\u0001\u0000\u0000\u0000\u00ec\u0013\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0003$\u0012\u0000\u00ee\u00ef\u0007\u0001\u0000\u0000\u00ef\u00f0"+
		"\u0003$\u0012\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00f3\u0007"+
		"\u0000\u0000\u0000\u00f2\u00ed\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f3\u0015\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003"+
		"0\u0018\u0000\u00f5\u00f6\u0005\t\u0000\u0000\u00f6\u00f7\u00034\u001a"+
		"\u0000\u00f7\u0107\u0001\u0000\u0000\u0000\u00f8\u00f9\u00030\u0018\u0000"+
		"\u00f9\u00fa\u0005\t\u0000\u0000\u00fa\u00fb\u0007\u0000\u0000\u0000\u00fb"+
		"\u0107\u0001\u0000\u0000\u0000\u00fc\u00fd\u00030\u0018\u0000\u00fd\u00fe"+
		"\u0005\t\u0000\u0000\u00fe\u00ff\u0005\n\u0000\u0000\u00ff\u0100\u0003"+
		"*\u0015\u0000\u0100\u0101\u0005\n\u0000\u0000\u0101\u0107\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u00030\u0018\u0000\u0103\u0104\u0005\t\u0000"+
		"\u0000\u0104\u0105\u0003$\u0012\u0000\u0105\u0107\u0001\u0000\u0000\u0000"+
		"\u0106\u00f4\u0001\u0000\u0000\u0000\u0106\u00f8\u0001\u0000\u0000\u0000"+
		"\u0106\u00fc\u0001\u0000\u0000\u0000\u0106\u0102\u0001\u0000\u0000\u0000"+
		"\u0107\u0017\u0001\u0000\u0000\u0000\u0108\u0109\u00030\u0018\u0000\u0109"+
		"\u010a\u0005\u0017\u0000\u0000\u010a\u010b\u00034\u001a\u0000\u010b\u0129"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u00030\u0018\u0000\u010d\u010e\u0005"+
		"\u0018\u0000\u0000\u010e\u010f\u00034\u001a\u0000\u010f\u0129\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u00030\u0018\u0000\u0111\u0112\u0005\u0019\u0000"+
		"\u0000\u0112\u0113\u00034\u001a\u0000\u0113\u0129\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u00030\u0018\u0000\u0115\u0116\u0005\u001a\u0000\u0000\u0116"+
		"\u0117\u00034\u001a\u0000\u0117\u0129\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u00030\u0018\u0000\u0119\u011a\u0005\u0017\u0000\u0000\u011a\u011b\u0003"+
		"0\u0018\u0000\u011b\u0129\u0001\u0000\u0000\u0000\u011c\u011d\u00030\u0018"+
		"\u0000\u011d\u011e\u0005\u0018\u0000\u0000\u011e\u011f\u00030\u0018\u0000"+
		"\u011f\u0129\u0001\u0000\u0000\u0000\u0120\u0121\u00030\u0018\u0000\u0121"+
		"\u0122\u0005\u0019\u0000\u0000\u0122\u0123\u00030\u0018\u0000\u0123\u0129"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u00030\u0018\u0000\u0125\u0126\u0005"+
		"\u001a\u0000\u0000\u0126\u0127\u00030\u0018\u0000\u0127\u0129\u0001\u0000"+
		"\u0000\u0000\u0128\u0108\u0001\u0000\u0000\u0000\u0128\u010c\u0001\u0000"+
		"\u0000\u0000\u0128\u0110\u0001\u0000\u0000\u0000\u0128\u0114\u0001\u0000"+
		"\u0000\u0000\u0128\u0118\u0001\u0000\u0000\u0000\u0128\u011c\u0001\u0000"+
		"\u0000\u0000\u0128\u0120\u0001\u0000\u0000\u0000\u0128\u0124\u0001\u0000"+
		"\u0000\u0000\u0129\u0019\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u001b"+
		"\u0000\u0000\u012b\u012c\u0005\u0007\u0000\u0000\u012c\u012d\u0003\u0014"+
		"\n\u0000\u012d\u012e\u0005\b\u0000\u0000\u012e\u012f\u0005\u001c\u0000"+
		"\u0000\u012f\u0130\u0005\u001d\u0000\u0000\u0130\u0131\u0003\u0002\u0001"+
		"\u0000\u0131\u0132\u0005\u001e\u0000\u0000\u0132\u0141\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0005\u001b\u0000\u0000\u0134\u0135\u0005\u0007\u0000"+
		"\u0000\u0135\u0136\u0003\u0014\n\u0000\u0136\u0137\u0005\b\u0000\u0000"+
		"\u0137\u0138\u0005\u001c\u0000\u0000\u0138\u0139\u0005\u001d\u0000\u0000"+
		"\u0139\u013a\u0003\u0002\u0001\u0000\u013a\u013b\u0005\u001e\u0000\u0000"+
		"\u013b\u013c\u0005\u001f\u0000\u0000\u013c\u013d\u0005\u001d\u0000\u0000"+
		"\u013d\u013e\u0003\u0002\u0001\u0000\u013e\u013f\u0005\u001e\u0000\u0000"+
		"\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u012a\u0001\u0000\u0000\u0000"+
		"\u0140\u0133\u0001\u0000\u0000\u0000\u0141\u001b\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0005 \u0000\u0000\u0143\u0144\u0005\u0007\u0000\u0000\u0144"+
		"\u0145\u0003\u0014\n\u0000\u0145\u0146\u0005\b\u0000\u0000\u0146\u0147"+
		"\u0005\u001d\u0000\u0000\u0147\u0148\u0003\u0002\u0001\u0000\u0148\u0149"+
		"\u0005\u001e\u0000\u0000\u0149\u001d\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0005!\u0000\u0000\u014b\u014c\u0005\u0007\u0000\u0000\u014c\u014d\u0003"+
		"\n\u0005\u0000\u014d\u014e\u0005\u0002\u0000\u0000\u014e\u014f\u0003\u0014"+
		"\n\u0000\u014f\u0150\u0005\u0002\u0000\u0000\u0150\u0151\u0003 \u0010"+
		"\u0000\u0151\u0152\u0005\b\u0000\u0000\u0152\u0153\u0005\u001d\u0000\u0000"+
		"\u0153\u0154\u0003\u0002\u0001\u0000\u0154\u0155\u0005\u001e\u0000\u0000"+
		"\u0155\u001f\u0001\u0000\u0000\u0000\u0156\u0159\u0003\u0010\b\u0000\u0157"+
		"\u0159\u0003\u0018\f\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0157"+
		"\u0001\u0000\u0000\u0000\u0159!\u0001\u0000\u0000\u0000\u015a\u015b\u0005"+
		"!\u0000\u0000\u015b\u015c\u00030\u0018\u0000\u015c\u015d\u0005\"\u0000"+
		"\u0000\u015d\u015e\u0005#\u0000\u0000\u015e\u015f\u0005\u0007\u0000\u0000"+
		"\u015f\u0160\u00034\u001a\u0000\u0160\u0161\u0005$\u0000\u0000\u0161\u0162"+
		"\u00034\u001a\u0000\u0162\u0163\u0005\b\u0000\u0000\u0163\u0164\u0005"+
		"\u001d\u0000\u0000\u0164\u0165\u0003\u0002\u0001\u0000\u0165\u0166\u0005"+
		"\u001e\u0000\u0000\u0166\u0177\u0001\u0000\u0000\u0000\u0167\u0168\u0005"+
		"!\u0000\u0000\u0168\u0169\u00030\u0018\u0000\u0169\u016a\u0005\"\u0000"+
		"\u0000\u016a\u016b\u0005#\u0000\u0000\u016b\u016c\u0005\u0007\u0000\u0000"+
		"\u016c\u016d\u00034\u001a\u0000\u016d\u016e\u0005$\u0000\u0000\u016e\u016f"+
		"\u00034\u001a\u0000\u016f\u0170\u0005$\u0000\u0000\u0170\u0171\u00034"+
		"\u001a\u0000\u0171\u0172\u0005\b\u0000\u0000\u0172\u0173\u0005\u001d\u0000"+
		"\u0000\u0173\u0174\u0003\u0002\u0001\u0000\u0174\u0175\u0005\u001e\u0000"+
		"\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u015a\u0001\u0000\u0000"+
		"\u0000\u0176\u0167\u0001\u0000\u0000\u0000\u0177#\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0003&\u0013\u0000\u0179\u017a\u0005%\u0000\u0000\u017a\u017b"+
		"\u0003$\u0012\u0000\u017b\u0182\u0001\u0000\u0000\u0000\u017c\u017d\u0003"+
		"&\u0013\u0000\u017d\u017e\u0005&\u0000\u0000\u017e\u017f\u0003$\u0012"+
		"\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u0182\u0003&\u0013\u0000"+
		"\u0181\u0178\u0001\u0000\u0000\u0000\u0181\u017c\u0001\u0000\u0000\u0000"+
		"\u0181\u0180\u0001\u0000\u0000\u0000\u0182%\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0003(\u0014\u0000\u0184\u0185\u0005\'\u0000\u0000\u0185\u0186"+
		"\u0003&\u0013\u0000\u0186\u018d\u0001\u0000\u0000\u0000\u0187\u0188\u0003"+
		"(\u0014\u0000\u0188\u0189\u0005(\u0000\u0000\u0189\u018a\u0003&\u0013"+
		"\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u018d\u0003(\u0014\u0000"+
		"\u018c\u0183\u0001\u0000\u0000\u0000\u018c\u0187\u0001\u0000\u0000\u0000"+
		"\u018c\u018b\u0001\u0000\u0000\u0000\u018d\'\u0001\u0000\u0000\u0000\u018e"+
		"\u0191\u00030\u0018\u0000\u018f\u0191\u00034\u001a\u0000\u0190\u018e\u0001"+
		"\u0000\u0000\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191)\u0001\u0000"+
		"\u0000\u0000\u0192\u0194\u0003,\u0016\u0000\u0193\u0192\u0001\u0000\u0000"+
		"\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196+\u0001\u0000\u0000\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u019c\u00034\u001a\u0000\u0199"+
		"\u019c\u0003.\u0017\u0000\u019a\u019c\u00032\u0019\u0000\u019b\u0198\u0001"+
		"\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019b\u019a\u0001"+
		"\u0000\u0000\u0000\u019c-\u0001\u0000\u0000\u0000\u019d\u019e\u0005)\u0000"+
		"\u0000\u019e/\u0001\u0000\u0000\u0000\u019f\u01a0\u0005*\u0000\u0000\u01a0"+
		"1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005+\u0000\u0000\u01a23\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u0005,\u0000\u0000\u01a45\u0001\u0000\u0000"+
		"\u0000\u0014z\u0082\u0087\u0093\u00a4\u00b2\u00be\u00ca\u00eb\u00f2\u0106"+
		"\u0128\u0140\u0158\u0176\u0181\u018c\u0190\u0195\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}