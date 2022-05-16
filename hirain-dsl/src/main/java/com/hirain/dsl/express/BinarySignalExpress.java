package com.hirain.dsl.express;

import com.hirain.dsl.parser.SignalParser;
import com.hirain.dsl.util.NumberUtil;

import java.text.MessageFormat;
import java.util.Map;

public class BinarySignalExpress extends SignalExpress {

    /**
     * 操作符
     */
    private String operate;

    /**
     * 左边表达式
     */
    private SignalExpress leftExpress;

    /**
     * 右边表达式
     */
    private SignalExpress rightExpress;

    public BinarySignalExpress(SignalParser.ExprContext exprContext) {
        super(exprContext);
    }

    @Override
    public Number calculate(Map<String, Number> paramMap) {

        if (null == leftExpress || null == rightExpress || null == operate) {
            return 0;
        }
        System.out.println(MessageFormat.format("calculate: {0} {1} {2}",
                leftExpress.exprContext.getText(), operate, rightExpress.exprContext.getText()));
        switch (operate) {
            case "+":
                return NumberUtil.doAdd(leftExpress.calculate(paramMap), rightExpress.calculate(paramMap));
            case "-":
                return NumberUtil.doSub(leftExpress.calculate(paramMap), rightExpress.calculate(paramMap));
            case "*":
                return NumberUtil.doMul(leftExpress.calculate(paramMap), rightExpress.calculate(paramMap));
            case "/":
                return NumberUtil.doDiv(leftExpress.calculate(paramMap), rightExpress.calculate(paramMap));
            default:
                break;
        }
        return 0;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public SignalExpress getLeftExpress() {
        return leftExpress;
    }

    public void setLeftExpress(SignalExpress leftExpress) {
        this.leftExpress = leftExpress;
    }

    public SignalExpress getRightExpress() {
        return rightExpress;
    }

    public void setRightExpress(SignalExpress rightExpress) {
        this.rightExpress = rightExpress;
    }

    @Override
    public String toString() {
        return "BinarySignalExpress{" +
                "operate='" + operate + '\'' +
                ", leftExpress=" + leftExpress +
                ", rightExpress=" + rightExpress +
                ", exprContext=" + exprContext +
                '}';
    }
}
