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
	 * Enter a parse tree produced by the {@code ParamExpr}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParamExpr(SignalParser.ParamExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamExpr}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParamExpr(SignalParser.ParamExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpr}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(SignalParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpr}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(SignalParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr2}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr2(SignalParser.BinaryExpr2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr2}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr2(SignalParser.BinaryExpr2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr3}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr3(SignalParser.BinaryExpr3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr3}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr3(SignalParser.BinaryExpr3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr4}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr4(SignalParser.BinaryExpr4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr4}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr4(SignalParser.BinaryExpr4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprWithBracket}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprWithBracket(SignalParser.ExprWithBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprWithBracket}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprWithBracket(SignalParser.ExprWithBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr5}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr5(SignalParser.BinaryExpr5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr5}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr5(SignalParser.BinaryExpr5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(SignalParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(SignalParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr1}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr1(SignalParser.BinaryExpr1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr1}
	 * labeled alternative in {@link SignalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr1(SignalParser.BinaryExpr1Context ctx);
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
	 * Enter a parse tree produced by the {@code Sum}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterSum(SignalParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sum}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitSum(SignalParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Count}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterCount(SignalParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Count}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitCount(SignalParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Avg}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterAvg(SignalParser.AvgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Avg}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitAvg(SignalParser.AvgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterVar(SignalParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitVar(SignalParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Std}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterStd(SignalParser.StdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Std}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitStd(SignalParser.StdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Min}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterMin(SignalParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Min}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitMin(SignalParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Max}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterMax(SignalParser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Max}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitMax(SignalParser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterSin(SignalParser.SinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sin}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitSin(SignalParser.SinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cos}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterCos(SignalParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cos}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitCos(SignalParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tan}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterTan(SignalParser.TanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tan}
	 * labeled alternative in {@link SignalParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitTan(SignalParser.TanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Deri}
	 * labeled alternative in {@link SignalParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterDeri(SignalParser.DeriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Deri}
	 * labeled alternative in {@link SignalParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitDeri(SignalParser.DeriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SignalParser#binary_op1}.
	 * @param ctx the parse tree
	 */
	void enterMul(SignalParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SignalParser#binary_op1}.
	 * @param ctx the parse tree
	 */
	void exitMul(SignalParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link SignalParser#binary_op1}.
	 * @param ctx the parse tree
	 */
	void enterDiv(SignalParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link SignalParser#binary_op1}.
	 * @param ctx the parse tree
	 */
	void exitDiv(SignalParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link SignalParser#binary_op1}.
	 * @param ctx the parse tree
	 */
	void enterMod(SignalParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link SignalParser#binary_op1}.
	 * @param ctx the parse tree
	 */
	void exitMod(SignalParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link SignalParser#binary_op2}.
	 * @param ctx the parse tree
	 */
	void enterAdd(SignalParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link SignalParser#binary_op2}.
	 * @param ctx the parse tree
	 */
	void exitAdd(SignalParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link SignalParser#binary_op2}.
	 * @param ctx the parse tree
	 */
	void enterSub(SignalParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link SignalParser#binary_op2}.
	 * @param ctx the parse tree
	 */
	void exitSub(SignalParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoreThan}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void enterMoreThan(SignalParser.MoreThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoreThan}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void exitMoreThan(SignalParser.MoreThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(SignalParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(SignalParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoreThanEqual}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void enterMoreThanEqual(SignalParser.MoreThanEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoreThanEqual}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void exitMoreThanEqual(SignalParser.MoreThanEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanEqual}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEqual(SignalParser.LessThanEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanEqual}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEqual(SignalParser.LessThanEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void enterEqual(SignalParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void exitEqual(SignalParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(SignalParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link SignalParser#binary_op3}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(SignalParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrOperate}
	 * labeled alternative in {@link SignalParser#binary_op4}.
	 * @param ctx the parse tree
	 */
	void enterOrOperate(SignalParser.OrOperateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrOperate}
	 * labeled alternative in {@link SignalParser#binary_op4}.
	 * @param ctx the parse tree
	 */
	void exitOrOperate(SignalParser.OrOperateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOperate}
	 * labeled alternative in {@link SignalParser#binary_op4}.
	 * @param ctx the parse tree
	 */
	void enterAndOperate(SignalParser.AndOperateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOperate}
	 * labeled alternative in {@link SignalParser#binary_op4}.
	 * @param ctx the parse tree
	 */
	void exitAndOperate(SignalParser.AndOperateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrOrOperate}
	 * labeled alternative in {@link SignalParser#binary_op5}.
	 * @param ctx the parse tree
	 */
	void enterOrOrOperate(SignalParser.OrOrOperateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrOrOperate}
	 * labeled alternative in {@link SignalParser#binary_op5}.
	 * @param ctx the parse tree
	 */
	void exitOrOrOperate(SignalParser.OrOrOperateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndAndOperate}
	 * labeled alternative in {@link SignalParser#binary_op5}.
	 * @param ctx the parse tree
	 */
	void enterAndAndOperate(SignalParser.AndAndOperateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndAndOperate}
	 * labeled alternative in {@link SignalParser#binary_op5}.
	 * @param ctx the parse tree
	 */
	void exitAndAndOperate(SignalParser.AndAndOperateContext ctx);
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
	/**
	 * Enter a parse tree produced by the {@code SignalVariable}
	 * labeled alternative in {@link SignalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterSignalVariable(SignalParser.SignalVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignalVariable}
	 * labeled alternative in {@link SignalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitSignalVariable(SignalParser.SignalVariableContext ctx);
}