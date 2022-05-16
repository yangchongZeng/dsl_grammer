package com.hirain.dsl.express;

import com.hirain.dsl.parser.SignalParser;

import java.util.Map;

public class BracketSignalExpress extends SignalExpress {

    /**
     * 内置表达式
     */
    private SignalExpress innerExpress;

    public BracketSignalExpress(SignalParser.ExprContext exprContext) {
        super(exprContext);
    }

    public SignalExpress getInnerExpress() {
        return innerExpress;
    }

    public void setInnerExpress(SignalExpress innerExpress) {
        this.innerExpress = innerExpress;
    }

    @Override
    public Number calculate(Map<String, Number> paramMap) {
        if (null != innerExpress) {
            return innerExpress.calculate(paramMap);
        }
        return 0;
    }


}
