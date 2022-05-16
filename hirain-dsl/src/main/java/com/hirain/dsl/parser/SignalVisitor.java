// Generated from D:/projects/dsl_grammer/hirain-dsl/src/main/resources\Signal.g4 by ANTLR 4.10.1
package com.hirain.dsl.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SignalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SignalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SignalParser#signal_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_input(SignalParser.Signal_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SignalParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SignalParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SignalParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SignalParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(SignalParser.Unary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#binary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_op(SignalParser.Binary_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SignalParser.ParamContext ctx);
}