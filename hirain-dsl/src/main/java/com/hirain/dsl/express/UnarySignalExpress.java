package com.hirain.dsl.express;

import com.hirain.dsl.parser.SignalParser;

import java.util.Map;

public class UnarySignalExpress extends SignalExpress {

    /**
     * 一目运算符
     */
    private String operate;

    /**
     * 运算表达式
     */
    private SignalExpress leftExpress;

    public UnarySignalExpress(SignalParser.ExprContext exprContext) {
        super(exprContext);
    }

    @Override
    public Number calculate(Map<String, Number> paramMap) {
        if (null == leftExpress || null == operate) {
            return 0;
        }
        return null;
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

    @Override
    public String toString() {
        return "UnarySignalExpress{" +
                "exprContext=" + exprContext +
                ", operate='" + operate + '\'' +
                ", leftExpress=" + leftExpress +
                '}';
    }
}
