// Generated from D:/projects/dsl_grammer/hirain-dsl/src/main/resources\Signal.g4 by ANTLR 4.10.1
package com.hirain.dsl.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SignalParser}.
 */
public interface SignalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SignalParser#signal_input}.
	 * @param ctx the parse tree
	 */
	void enterSignal_input(SignalParser.Signal_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#signal_input}.
	 * @param ctx the parse tree
	 */
	void exitSignal_input(SignalParser.Signal_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SignalParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SignalParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SignalParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SignalParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SignalParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SignalParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SignalParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SignalParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(SignalParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(SignalParser.Unary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_op(SignalParser.Binary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#binary_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_op(SignalParser.Binary_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SignalParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(SignalParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SignalParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(SignalParser.ParamContext ctx);
}