// Generated from D:/projects/dsl_grammer/hirain-dsl/src/main/resources\Signal.g4 by ANTLR 4.10.1
package com.hirain.dsl.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SignalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DERI=1, MUL=2, DIV=3, ADD=4, SUB=5, MOD=6, MORE_THAN=7, LESS_THAN=8, MT_EQUAL=9, 
		LT_EQUAL=10, EQUAL=11, NOT_EQUAL=12, OR_OP=13, AND_OP=14, OROR_OP=15, 
		ANDAND_OP=16, LEFT_BRACKET=17, RIGHT_BRACKET=18, F_SUM=19, F_COUNT=20, 
		F_AVG=21, F_VAR=22, F_STD=23, F_MIN=24, F_MAX=25, C_SIN=26, C_COS=27, 
		C_TAN=28, SV=29, INT=30, FLOAT=31, BOOL=32, NEWLINE=33, SKIP_=34;
	public static final int
		RULE_signal_input = 0, RULE_stat = 1, RULE_expr = 2, RULE_function = 3, 
		RULE_function_name = 4, RULE_unary_op = 5, RULE_binary_op1 = 6, RULE_binary_op2 = 7, 
		RULE_binary_op3 = 8, RULE_binary_op4 = 9, RULE_binary_op5 = 10, RULE_param = 11, 
		RULE_variable = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"signal_input", "stat", "expr", "function", "function_name", "unary_op", 
			"binary_op1", "binary_op2", "binary_op3", "binary_op4", "binary_op5", 
			"param", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'''", "'*'", "'/'", "'+'", "'-'", "'%'", "'>'", "'<'", "'>='", 
			"'<='", "'='", "'!='", "'|'", "'&'", "'||'", "'&&'", "'('", "')'", "'sum'", 
			"'count'", "'avg'", "'var'", "'std'", "'min'", "'max'", "'sin'", "'cos'", 
			"'tan'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DERI", "MUL", "DIV", "ADD", "SUB", "MOD", "MORE_THAN", "LESS_THAN", 
			"MT_EQUAL", "LT_EQUAL", "EQUAL", "NOT_EQUAL", "OR_OP", "AND_OP", "OROR_OP", 
			"ANDAND_OP", "LEFT_BRACKET", "RIGHT_BRACKET", "F_SUM", "F_COUNT", "F_AVG", 
			"F_VAR", "F_STD", "F_MIN", "F_MAX", "C_SIN", "C_COS", "C_TAN", "SV", 
			"INT", "FLOAT", "BOOL", "NEWLINE", "SKIP_"
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
	public String getGrammarFileName() { return "Signal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SignalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Signal_inputContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Signal_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterSignal_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitSignal_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitSignal_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_inputContext signal_input() throws RecognitionException {
		Signal_inputContext _localctx = new Signal_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_signal_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				stat();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_BRACKET) | (1L << F_SUM) | (1L << F_COUNT) | (1L << F_AVG) | (1L << F_VAR) | (1L << F_STD) | (1L << F_MIN) | (1L << F_MAX) | (1L << C_SIN) | (1L << C_COS) | (1L << C_TAN) | (1L << SV) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(SignalParser.NEWLINE, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				expr(0);
				setState(33);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(NEWLINE);
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
	public static class ParamExprContext extends ExprContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterParamExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitParamExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitParamExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends ExprContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitFunctionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpr2Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Binary_op2Context binary_op2() {
			return getRuleContext(Binary_op2Context.class,0);
		}
		public BinaryExpr2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterBinaryExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitBinaryExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitBinaryExpr2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpr3Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Binary_op3Context binary_op3() {
			return getRuleContext(Binary_op3Context.class,0);
		}
		public BinaryExpr3Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterBinaryExpr3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitBinaryExpr3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitBinaryExpr3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpr4Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Binary_op4Context binary_op4() {
			return getRuleContext(Binary_op4Context.class,0);
		}
		public BinaryExpr4Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterBinaryExpr4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitBinaryExpr4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitBinaryExpr4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprWithBracketContext extends ExprContext {
		public TerminalNode LEFT_BRACKET() { return getToken(SignalParser.LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(SignalParser.RIGHT_BRACKET, 0); }
		public ExprWithBracketContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterExprWithBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitExprWithBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitExprWithBracket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpr5Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Binary_op5Context binary_op5() {
			return getRuleContext(Binary_op5Context.class,0);
		}
		public BinaryExpr5Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterBinaryExpr5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitBinaryExpr5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitBinaryExpr5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExpr1Context extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Binary_op1Context binary_op1() {
			return getRuleContext(Binary_op1Context.class,0);
		}
		public BinaryExpr1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterBinaryExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitBinaryExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitBinaryExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_SUM:
			case F_COUNT:
			case F_AVG:
			case F_VAR:
			case F_STD:
			case F_MIN:
			case F_MAX:
			case C_SIN:
			case C_COS:
			case C_TAN:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				function();
				}
				break;
			case SV:
			case INT:
			case FLOAT:
			case BOOL:
				{
				_localctx = new ParamExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				param();
				}
				break;
			case LEFT_BRACKET:
				{
				_localctx = new ExprWithBracketContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(LEFT_BRACKET);
				setState(42);
				expr(0);
				setState(43);
				match(RIGHT_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpr1Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(47);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(48);
						binary_op1();
						setState(49);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpr2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(52);
						binary_op2();
						setState(53);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpr3Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(55);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(56);
						binary_op3();
						setState(57);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpr4Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(60);
						binary_op4();
						setState(61);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpr5Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(64);
						binary_op5();
						setState(65);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new UnaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(68);
						unary_op();
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(SignalParser.LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(SignalParser.RIGHT_BRACKET, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			function_name();
			setState(75);
			match(LEFT_BRACKET);
			setState(76);
			expr(0);
			setState(77);
			match(RIGHT_BRACKET);
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

	public static class Function_nameContext extends ParserRuleContext {
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	 
		public Function_nameContext() { }
		public void copyFrom(Function_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TanContext extends Function_nameContext {
		public TerminalNode C_TAN() { return getToken(SignalParser.C_TAN, 0); }
		public TanContext(Function_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterTan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitTan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitTan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StdContext extends Function_nameContext {
		public TerminalNode F_STD() { return getToken(SignalParser.F_STD, 0); }
		public StdContext(Function_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterStd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitStd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitStd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AvgContext extends Function_nameContext {
		public TerminalNode F_AVG() { return getToken(SignalParser.F_AVG, 0); }
		public AvgContext(Function_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterAvg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitAvg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitAvg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinContext extends Function_nameContext {
		public TerminalNode F_MIN() { return getToken(SignalParser.F_MIN, 0); }
		public MinContext(Function_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitMin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaxContext extends Function_nameContext {
		public TerminalNode F_MAX() { return getToken(SignalParser.F_MAX, 0); }
		public MaxContext(Function_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitMax(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends Function_nameContext {
		public TerminalNode F_VAR() { return getToken(SignalParser.F_VAR, 0); }
		public VarContext(Function_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosContext extends Function_nameContext {
		public TerminalNode C_COS() { return getToken(SignalParser.C_COS, 0); }
		public CosContext(Function_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitCos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinContext extends Function_nameContext {
		public TerminalNode C_SIN() { return getToken(SignalParser.C_SIN, 0); }
		public SinContext(Function_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitSin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumContext extends Function_nameContext {
		public TerminalNode F_SUM() { return getToken(SignalParser.F_SUM, 0); }
		public SumContext(Function_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CountContext extends Function_nameContext {
		public TerminalNode F_COUNT() { return getToken(SignalParser.F_COUNT, 0); }
		public CountContext(Function_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_name);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case F_SUM:
				_localctx = new SumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(F_SUM);
				}
				break;
			case F_COUNT:
				_localctx = new CountContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(F_COUNT);
				}
				break;
			case F_AVG:
				_localctx = new AvgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(F_AVG);
				}
				break;
			case F_VAR:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(F_VAR);
				}
				break;
			case F_STD:
				_localctx = new StdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(F_STD);
				}
				break;
			case F_MIN:
				_localctx = new MinContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				match(F_MIN);
				}
				break;
			case F_MAX:
				_localctx = new MaxContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				match(F_MAX);
				}
				break;
			case C_SIN:
				_localctx = new SinContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				match(C_SIN);
				}
				break;
			case C_COS:
				_localctx = new CosContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(87);
				match(C_COS);
				}
				break;
			case C_TAN:
				_localctx = new TanContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(88);
				match(C_TAN);
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

	public static class Unary_opContext extends ParserRuleContext {
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
	 
		public Unary_opContext() { }
		public void copyFrom(Unary_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeriContext extends Unary_opContext {
		public TerminalNode DERI() { return getToken(SignalParser.DERI, 0); }
		public DeriContext(Unary_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterDeri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitDeri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitDeri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unary_op);
		try {
			_localctx = new DeriContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(DERI);
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

	public static class Binary_op1Context extends ParserRuleContext {
		public Binary_op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op1; }
	 
		public Binary_op1Context() { }
		public void copyFrom(Binary_op1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends Binary_op1Context {
		public TerminalNode DIV() { return getToken(SignalParser.DIV, 0); }
		public DivContext(Binary_op1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModContext extends Binary_op1Context {
		public TerminalNode MOD() { return getToken(SignalParser.MOD, 0); }
		public ModContext(Binary_op1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends Binary_op1Context {
		public TerminalNode MUL() { return getToken(SignalParser.MUL, 0); }
		public MulContext(Binary_op1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_op1Context binary_op1() throws RecognitionException {
		Binary_op1Context _localctx = new Binary_op1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_binary_op1);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
				_localctx = new MulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(MUL);
				}
				break;
			case DIV:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(DIV);
				}
				break;
			case MOD:
				_localctx = new ModContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(MOD);
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

	public static class Binary_op2Context extends ParserRuleContext {
		public Binary_op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op2; }
	 
		public Binary_op2Context() { }
		public void copyFrom(Binary_op2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends Binary_op2Context {
		public TerminalNode ADD() { return getToken(SignalParser.ADD, 0); }
		public AddContext(Binary_op2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends Binary_op2Context {
		public TerminalNode SUB() { return getToken(SignalParser.SUB, 0); }
		public SubContext(Binary_op2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_op2Context binary_op2() throws RecognitionException {
		Binary_op2Context _localctx = new Binary_op2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_binary_op2);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(ADD);
				}
				break;
			case SUB:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(SUB);
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

	public static class Binary_op3Context extends ParserRuleContext {
		public Binary_op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op3; }
	 
		public Binary_op3Context() { }
		public void copyFrom(Binary_op3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessThanContext extends Binary_op3Context {
		public TerminalNode LESS_THAN() { return getToken(SignalParser.LESS_THAN, 0); }
		public LessThanContext(Binary_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualContext extends Binary_op3Context {
		public TerminalNode NOT_EQUAL() { return getToken(SignalParser.NOT_EQUAL, 0); }
		public NotEqualContext(Binary_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitNotEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends Binary_op3Context {
		public TerminalNode EQUAL() { return getToken(SignalParser.EQUAL, 0); }
		public EqualContext(Binary_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoreThanContext extends Binary_op3Context {
		public TerminalNode MORE_THAN() { return getToken(SignalParser.MORE_THAN, 0); }
		public MoreThanContext(Binary_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterMoreThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitMoreThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitMoreThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoreThanEqualContext extends Binary_op3Context {
		public TerminalNode MT_EQUAL() { return getToken(SignalParser.MT_EQUAL, 0); }
		public MoreThanEqualContext(Binary_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterMoreThanEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitMoreThanEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitMoreThanEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanEqualContext extends Binary_op3Context {
		public TerminalNode LT_EQUAL() { return getToken(SignalParser.LT_EQUAL, 0); }
		public LessThanEqualContext(Binary_op3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterLessThanEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitLessThanEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitLessThanEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_op3Context binary_op3() throws RecognitionException {
		Binary_op3Context _localctx = new Binary_op3Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_binary_op3);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MORE_THAN:
				_localctx = new MoreThanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(MORE_THAN);
				}
				break;
			case LESS_THAN:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(LESS_THAN);
				}
				break;
			case MT_EQUAL:
				_localctx = new MoreThanEqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(MT_EQUAL);
				}
				break;
			case LT_EQUAL:
				_localctx = new LessThanEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(LT_EQUAL);
				}
				break;
			case EQUAL:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(EQUAL);
				}
				break;
			case NOT_EQUAL:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				match(NOT_EQUAL);
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

	public static class Binary_op4Context extends ParserRuleContext {
		public Binary_op4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op4; }
	 
		public Binary_op4Context() { }
		public void copyFrom(Binary_op4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrOperateContext extends Binary_op4Context {
		public TerminalNode OR_OP() { return getToken(SignalParser.OR_OP, 0); }
		public OrOperateContext(Binary_op4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterOrOperate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitOrOperate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitOrOperate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOperateContext extends Binary_op4Context {
		public TerminalNode AND_OP() { return getToken(SignalParser.AND_OP, 0); }
		public AndOperateContext(Binary_op4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterAndOperate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitAndOperate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitAndOperate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_op4Context binary_op4() throws RecognitionException {
		Binary_op4Context _localctx = new Binary_op4Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_binary_op4);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR_OP:
				_localctx = new OrOperateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(OR_OP);
				}
				break;
			case AND_OP:
				_localctx = new AndOperateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(AND_OP);
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

	public static class Binary_op5Context extends ParserRuleContext {
		public Binary_op5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op5; }
	 
		public Binary_op5Context() { }
		public void copyFrom(Binary_op5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrOrOperateContext extends Binary_op5Context {
		public TerminalNode OROR_OP() { return getToken(SignalParser.OROR_OP, 0); }
		public OrOrOperateContext(Binary_op5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterOrOrOperate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitOrOrOperate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitOrOrOperate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndAndOperateContext extends Binary_op5Context {
		public TerminalNode ANDAND_OP() { return getToken(SignalParser.ANDAND_OP, 0); }
		public AndAndOperateContext(Binary_op5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterAndAndOperate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitAndAndOperate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitAndAndOperate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_op5Context binary_op5() throws RecognitionException {
		Binary_op5Context _localctx = new Binary_op5Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_binary_op5);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OROR_OP:
				_localctx = new OrOrOperateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(OROR_OP);
				}
				break;
			case ANDAND_OP:
				_localctx = new AndAndOperateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(ANDAND_OP);
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

	public static class ParamContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode INT() { return getToken(SignalParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SignalParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(SignalParser.BOOL, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SV:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				variable();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(FLOAT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(BOOL);
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SignalVariableContext extends VariableContext {
		public TerminalNode SV() { return getToken(SignalParser.SV, 0); }
		public SignalVariableContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterSignalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitSignalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitSignalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			_localctx = new SignalVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(SV);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002F\b\u0002\n\u0002\f\u0002I\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006a\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0003\u0007e\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\bm\b\b\u0001\t\u0001\t\u0003\tq\b\t\u0001"+
		"\n\u0001\n\u0003\nu\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b{\b\u000b\u0001\f\u0001\f\u0001\f\u0000\u0001\u0004\r\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000"+
		"\u0092\u0000\u001b\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000"+
		"\u0004-\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\bY\u0001"+
		"\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000"+
		"\u000ed\u0001\u0000\u0000\u0000\u0010l\u0001\u0000\u0000\u0000\u0012p"+
		"\u0001\u0000\u0000\u0000\u0014t\u0001\u0000\u0000\u0000\u0016z\u0001\u0000"+
		"\u0000\u0000\u0018|\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001"+
		"\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000"+
		"\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u0001\u0001\u0000\u0000\u0000\u001f%\u0003\u0004\u0002\u0000"+
		" !\u0003\u0004\u0002\u0000!\"\u0005!\u0000\u0000\"%\u0001\u0000\u0000"+
		"\u0000#%\u0005!\u0000\u0000$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000"+
		"\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000"+
		"&\'\u0006\u0002\uffff\uffff\u0000\'.\u0003\u0006\u0003\u0000(.\u0003\u0016"+
		"\u000b\u0000)*\u0005\u0011\u0000\u0000*+\u0003\u0004\u0002\u0000+,\u0005"+
		"\u0012\u0000\u0000,.\u0001\u0000\u0000\u0000-&\u0001\u0000\u0000\u0000"+
		"-(\u0001\u0000\u0000\u0000-)\u0001\u0000\u0000\u0000.G\u0001\u0000\u0000"+
		"\u0000/0\n\b\u0000\u000001\u0003\f\u0006\u000012\u0003\u0004\u0002\t2"+
		"F\u0001\u0000\u0000\u000034\n\u0007\u0000\u000045\u0003\u000e\u0007\u0000"+
		"56\u0003\u0004\u0002\b6F\u0001\u0000\u0000\u000078\n\u0006\u0000\u0000"+
		"89\u0003\u0010\b\u00009:\u0003\u0004\u0002\u0007:F\u0001\u0000\u0000\u0000"+
		";<\n\u0005\u0000\u0000<=\u0003\u0012\t\u0000=>\u0003\u0004\u0002\u0006"+
		">F\u0001\u0000\u0000\u0000?@\n\u0004\u0000\u0000@A\u0003\u0014\n\u0000"+
		"AB\u0003\u0004\u0002\u0005BF\u0001\u0000\u0000\u0000CD\n\t\u0000\u0000"+
		"DF\u0003\n\u0005\u0000E/\u0001\u0000\u0000\u0000E3\u0001\u0000\u0000\u0000"+
		"E7\u0001\u0000\u0000\u0000E;\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0005\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000JK\u0003\b\u0004\u0000KL\u0005\u0011\u0000\u0000"+
		"LM\u0003\u0004\u0002\u0000MN\u0005\u0012\u0000\u0000N\u0007\u0001\u0000"+
		"\u0000\u0000OZ\u0005\u0013\u0000\u0000PZ\u0005\u0014\u0000\u0000QZ\u0005"+
		"\u0015\u0000\u0000RZ\u0005\u0016\u0000\u0000SZ\u0005\u0017\u0000\u0000"+
		"TZ\u0005\u0018\u0000\u0000UZ\u0005\u0019\u0000\u0000VZ\u0005\u001a\u0000"+
		"\u0000WZ\u0005\u001b\u0000\u0000XZ\u0005\u001c\u0000\u0000YO\u0001\u0000"+
		"\u0000\u0000YP\u0001\u0000\u0000\u0000YQ\u0001\u0000\u0000\u0000YR\u0001"+
		"\u0000\u0000\u0000YS\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000"+
		"YU\u0001\u0000\u0000\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0005\u0001"+
		"\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]a\u0005\u0002\u0000\u0000"+
		"^a\u0005\u0003\u0000\u0000_a\u0005\u0006\u0000\u0000`]\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000a\r\u0001\u0000"+
		"\u0000\u0000be\u0005\u0004\u0000\u0000ce\u0005\u0005\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\u000f\u0001\u0000\u0000"+
		"\u0000fm\u0005\u0007\u0000\u0000gm\u0005\b\u0000\u0000hm\u0005\t\u0000"+
		"\u0000im\u0005\n\u0000\u0000jm\u0005\u000b\u0000\u0000km\u0005\f\u0000"+
		"\u0000lf\u0001\u0000\u0000\u0000lg\u0001\u0000\u0000\u0000lh\u0001\u0000"+
		"\u0000\u0000li\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lk\u0001"+
		"\u0000\u0000\u0000m\u0011\u0001\u0000\u0000\u0000nq\u0005\r\u0000\u0000"+
		"oq\u0005\u000e\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000"+
		"\u0000q\u0013\u0001\u0000\u0000\u0000ru\u0005\u000f\u0000\u0000su\u0005"+
		"\u0010\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000"+
		"u\u0015\u0001\u0000\u0000\u0000v{\u0003\u0018\f\u0000w{\u0005\u001e\u0000"+
		"\u0000x{\u0005\u001f\u0000\u0000y{\u0005 \u0000\u0000zv\u0001\u0000\u0000"+
		"\u0000zw\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000"+
		"\u0000\u0000{\u0017\u0001\u0000\u0000\u0000|}\u0005\u001d\u0000\u0000"+
		"}\u0019\u0001\u0000\u0000\u0000\f\u001d$-EGY`dlptz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}