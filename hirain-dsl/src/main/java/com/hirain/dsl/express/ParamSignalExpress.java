package com.hirain.dsl.express;

import com.hirain.dsl.parser.SignalParser;
import com.hirain.dsl.util.RegexUtil;

import java.util.Map;

public class ParamSignalExpress extends SignalExpress {

    /**
     * 参数值（或变量名）
     */
    private String param;

    public ParamSignalExpress(SignalParser.ExprContext exprContext) {
        super(exprContext);
    }

    @Override
    public Number calculate(Map<String, Number> paramMap) {
        if (null != paramMap && paramMap.containsKey(param)) {
            return paramMap.get(param);
        } else {
            if (RegexUtil.isInteger(param)) {
                return Integer.valueOf(param);
            }
            if (RegexUtil.isDouble(param)) {
                return Double.valueOf(param);
            }
        }
        return 0;
    }


    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return "ParamSignalExpress{" +
                "param='" + param + '\'' +
                ", exprContext=" + exprContext +
                '}';
    }
}
