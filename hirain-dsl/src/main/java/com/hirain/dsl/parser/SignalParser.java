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
		SV=1, DERI=2, MUL=3, DIV=4, ADD=5, SUB=6, MOD=7, MORE_THAN=8, LESS_THAN=9, 
		MT_EQUAL=10, LT_EQUAL=11, EQUAL=12, NOT_EQUAL=13, OR_OP=14, AND_OP=15, 
		OROR_OP=16, ANDAND_OP=17, INT=18, FLOAT=19, BOOL=20, LEFT_BRACKET=21, 
		RIGHT_BRACKET=22, F_SUM=23, F_COUNT=24, F_AVG=25, F_VAR=26, F_STD=27, 
		F_MIN=28, F_MAX=29, C_SIN=30, C_COS=31, C_TAN=32, NEWLINE=33, SKIP_=34;
	public static final int
		RULE_signal_input = 0, RULE_stat = 1, RULE_expr = 2, RULE_function = 3, 
		RULE_function_name = 4, RULE_unary_op = 5, RULE_binary_op = 6, RULE_param = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"signal_input", "stat", "expr", "function", "function_name", "unary_op", 
			"binary_op", "param"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'''", "'*'", "'/'", "'+'", "'-'", "'%'", "'>'", "'<'", "'>='", 
			"'<='", "'='", "'!='", "'|'", "'&'", "'||'", "'&&'", null, null, null, 
			"'('", "')'", "'sum'", "'count'", "'avg'", "'var'", "'std'", "'min'", 
			"'max'", "'sin'", "'cos'", "'tan'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SV", "DERI", "MUL", "DIV", "ADD", "SUB", "MOD", "MORE_THAN", "LESS_THAN", 
			"MT_EQUAL", "LT_EQUAL", "EQUAL", "NOT_EQUAL", "OR_OP", "AND_OP", "OROR_OP", 
			"ANDAND_OP", "INT", "FLOAT", "BOOL", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"F_SUM", "F_COUNT", "F_AVG", "F_VAR", "F_STD", "F_MIN", "F_MAX", "C_SIN", 
			"C_COS", "C_TAN", "NEWLINE", "SKIP_"
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
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				stat();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SV) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << LEFT_BRACKET) | (1L << F_SUM) | (1L << F_COUNT) | (1L << F_AVG) | (1L << F_VAR) | (1L << F_STD) | (1L << F_MIN) | (1L << F_MAX) | (1L << C_SIN) | (1L << C_COS) | (1L << C_TAN) | (1L << NEWLINE))) != 0) );
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
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				expr();
				setState(23);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
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
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public Binary_opContext binary_op() {
			return getRuleContext(Binary_opContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(SignalParser.LEFT_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(SignalParser.RIGHT_BRACKET, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				param();
				setState(29);
				unary_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				param();
				setState(32);
				binary_op();
				setState(33);
				param();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				match(LEFT_BRACKET);
				setState(37);
				expr();
				setState(38);
				match(RIGHT_BRACKET);
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
			setState(42);
			function_name();
			setState(43);
			match(LEFT_BRACKET);
			setState(44);
			expr();
			setState(45);
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
		public TerminalNode F_SUM() { return getToken(SignalParser.F_SUM, 0); }
		public TerminalNode F_COUNT() { return getToken(SignalParser.F_COUNT, 0); }
		public TerminalNode F_AVG() { return getToken(SignalParser.F_AVG, 0); }
		public TerminalNode F_VAR() { return getToken(SignalParser.F_VAR, 0); }
		public TerminalNode F_STD() { return getToken(SignalParser.F_STD, 0); }
		public TerminalNode F_MIN() { return getToken(SignalParser.F_MIN, 0); }
		public TerminalNode F_MAX() { return getToken(SignalParser.F_MAX, 0); }
		public TerminalNode C_SIN() { return getToken(SignalParser.C_SIN, 0); }
		public TerminalNode C_COS() { return getToken(SignalParser.C_COS, 0); }
		public TerminalNode C_TAN() { return getToken(SignalParser.C_TAN, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << F_SUM) | (1L << F_COUNT) | (1L << F_AVG) | (1L << F_VAR) | (1L << F_STD) | (1L << F_MIN) | (1L << F_MAX) | (1L << C_SIN) | (1L << C_COS) | (1L << C_TAN))) != 0)) ) {
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

	public static class Unary_opContext extends ParserRuleContext {
		public TerminalNode DERI() { return getToken(SignalParser.DERI, 0); }
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitUnary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unary_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
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

	public static class Binary_opContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(SignalParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SignalParser.DIV, 0); }
		public TerminalNode ADD() { return getToken(SignalParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(SignalParser.SUB, 0); }
		public TerminalNode MOD() { return getToken(SignalParser.MOD, 0); }
		public TerminalNode MORE_THAN() { return getToken(SignalParser.MORE_THAN, 0); }
		public TerminalNode LESS_THAN() { return getToken(SignalParser.LESS_THAN, 0); }
		public TerminalNode MT_EQUAL() { return getToken(SignalParser.MT_EQUAL, 0); }
		public TerminalNode LT_EQUAL() { return getToken(SignalParser.LT_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(SignalParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SignalParser.NOT_EQUAL, 0); }
		public TerminalNode OR_OP() { return getToken(SignalParser.OR_OP, 0); }
		public TerminalNode AND_OP() { return getToken(SignalParser.AND_OP, 0); }
		public TerminalNode OROR_OP() { return getToken(SignalParser.OROR_OP, 0); }
		public TerminalNode ANDAND_OP() { return getToken(SignalParser.ANDAND_OP, 0); }
		public Binary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).enterBinary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SignalListener ) ((SignalListener)listener).exitBinary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SignalVisitor ) return ((SignalVisitor<? extends T>)visitor).visitBinary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_opContext binary_op() throws RecognitionException {
		Binary_opContext _localctx = new Binary_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << MOD) | (1L << MORE_THAN) | (1L << LESS_THAN) | (1L << MT_EQUAL) | (1L << LT_EQUAL) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << OR_OP) | (1L << AND_OP) | (1L << OROR_OP) | (1L << ANDAND_OP))) != 0)) ) {
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode SV() { return getToken(SignalParser.SV, 0); }
		public TerminalNode INT() { return getToken(SignalParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(SignalParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(SignalParser.BOOL, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(SignalParser.LEFT_BRACKET, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(SignalParser.RIGHT_BRACKET, 0); }
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
		enterRule(_localctx, 14, RULE_param);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SV:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(SV);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(FLOAT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(BOOL);
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(LEFT_BRACKET);
				setState(58);
				param();
				setState(59);
				match(RIGHT_BRACKET);
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

	public static final String _serializedATN =
		"\u0004\u0001\"@\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002)\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007>\b\u0007\u0001\u0007"+
		"\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0002\u0001\u0000"+
		"\u0017 \u0001\u0000\u0003\u0011A\u0000\u0011\u0001\u0000\u0000\u0000\u0002"+
		"\u001a\u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006*\u0001"+
		"\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000\n1\u0001\u0000\u0000\u0000"+
		"\f3\u0001\u0000\u0000\u0000\u000e=\u0001\u0000\u0000\u0000\u0010\u0012"+
		"\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0001\u0000\u0000\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u001b"+
		"\u0003\u0004\u0002\u0000\u0016\u0017\u0003\u0004\u0002\u0000\u0017\u0018"+
		"\u0005!\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u001b\u0005"+
		"!\u0000\u0000\u001a\u0015\u0001\u0000\u0000\u0000\u001a\u0016\u0001\u0000"+
		"\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0003\u000e\u0007\u0000\u001d\u001e\u0003\n\u0005"+
		"\u0000\u001e)\u0001\u0000\u0000\u0000\u001f \u0003\u000e\u0007\u0000 "+
		"!\u0003\f\u0006\u0000!\"\u0003\u000e\u0007\u0000\")\u0001\u0000\u0000"+
		"\u0000#)\u0003\u0006\u0003\u0000$%\u0005\u0015\u0000\u0000%&\u0003\u0004"+
		"\u0002\u0000&\'\u0005\u0016\u0000\u0000\')\u0001\u0000\u0000\u0000(\u001c"+
		"\u0001\u0000\u0000\u0000(\u001f\u0001\u0000\u0000\u0000(#\u0001\u0000"+
		"\u0000\u0000($\u0001\u0000\u0000\u0000)\u0005\u0001\u0000\u0000\u0000"+
		"*+\u0003\b\u0004\u0000+,\u0005\u0015\u0000\u0000,-\u0003\u0004\u0002\u0000"+
		"-.\u0005\u0016\u0000\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0007\u0000"+
		"\u0000\u00000\t\u0001\u0000\u0000\u000012\u0005\u0002\u0000\u00002\u000b"+
		"\u0001\u0000\u0000\u000034\u0007\u0001\u0000\u00004\r\u0001\u0000\u0000"+
		"\u00005>\u0005\u0001\u0000\u00006>\u0005\u0012\u0000\u00007>\u0005\u0013"+
		"\u0000\u00008>\u0005\u0014\u0000\u00009:\u0005\u0015\u0000\u0000:;\u0003"+
		"\u000e\u0007\u0000;<\u0005\u0016\u0000\u0000<>\u0001\u0000\u0000\u0000"+
		"=5\u0001\u0000\u0000\u0000=6\u0001\u0000\u0000\u0000=7\u0001\u0000\u0000"+
		"\u0000=8\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000>\u000f\u0001"+
		"\u0000\u0000\u0000\u0004\u0013\u001a(=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}