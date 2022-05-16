package com.hirain.dsl.express;

import com.hirain.dsl.parser.SignalParser;
import com.hirain.dsl.util.NumberUtil;

import java.text.MessageFormat;
import java.util.Map;

public class FunctionSignalExpress extends SignalExpress {

    /**
     * 函数名
     */
    private String functionName;

    /**
     * 函数内表达式
     */
    private SignalExpress innerExpress;

    public FunctionSignalExpress(SignalParser.ExprContext exprContext) {
        super(exprContext);
    }

    @Override
    public Number calculate(Map<String, Number> paramMap) {
        if (null == innerExpress || null == functionName) {
            return 0;
        }
        System.out.println(MessageFormat.format("calculate: {0} {1}",
                functionName, innerExpress.exprContext.getText()));
        switch (functionName) {
            case "sin":
                return NumberUtil.doSin(innerExpress.calculate(paramMap));
            case "cos":
                return NumberUtil.doCos(innerExpress.calculate(paramMap));
            default:
                break;
        }
        return 0;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public SignalExpress getInnerExpress() {
        return innerExpress;
    }

    public void setInnerExpress(SignalExpress innerExpress) {
        this.innerExpress = innerExpress;
    }

    @Override
    public String toString() {
        return "FunctionSignalExpress{" +
                "functionName='" + functionName + '\'' +
                ", innerExpress=" + innerExpress +
                ", exprContext=" + exprContext +
                '}';
    }
}
