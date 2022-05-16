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
	 * Visit a parse tree produced by the {@code ParamExpr}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamExpr(SignalParser.ParamExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpr}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(SignalParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr2}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr2(SignalParser.BinaryExpr2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr3}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr3(SignalParser.BinaryExpr3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr4}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr4(SignalParser.BinaryExpr4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprWithBracket}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprWithBracket(SignalParser.ExprWithBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr5}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr5(SignalParser.BinaryExpr5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(SignalParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr1}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr1(SignalParser.BinaryExpr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SignalParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sum}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(SignalParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Count}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCount(SignalParser.CountContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Avg}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvg(SignalParser.AvgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SignalParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Std}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStd(SignalParser.StdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Min}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin(SignalParser.MinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Max}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax(SignalParser.MaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(SignalParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cos}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(SignalParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tan}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTan(SignalParser.TanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Deri}
	 * labeled alternative in {@link SignalParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeri(SignalParser.DeriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SignalParser#binary_op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(SignalParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link SignalParser#binary_op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(SignalParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link SignalParser#binary_op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(SignalParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link SignalParser#binary_op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(SignalParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link SignalParser#binary_op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(SignalParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreThan}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreThan(SignalParser.MoreThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(SignalParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreThanEqual}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreThanEqual(SignalParser.MoreThanEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanEqual}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEqual(SignalParser.LessThanEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(SignalParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(SignalParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrOperate}
	 * labeled alternative in {@link SignalParser#binary_op4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperate(SignalParser.OrOperateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOperate}
	 * labeled alternative in {@link SignalParser#binary_op4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperate(SignalParser.AndOperateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrOrOperate}
	 * labeled alternative in {@link SignalParser#binary_op5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOrOperate(SignalParser.OrOrOperateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndAndOperate}
	 * labeled alternative in {@link SignalParser#binary_op5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndAndOperate(SignalParser.AndAndOperateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SignalParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(SignalParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignalVariable}
	 * labeled alternative in {@link SignalParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalVariable(SignalParser.SignalVariableContext ctx);
}