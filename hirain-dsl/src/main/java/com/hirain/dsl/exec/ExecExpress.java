package com.hirain.dsl.exec;

import com.hirain.dsl.express.SignalExpress;

import java.util.HashMap;
import java.util.Map;

public class ExecExpress {

    /**
     * 最终执行的表达式
     */
    private SignalExpress express;

    /**
     * 表达式中的变量
     */
    private String[] variables;

    private Map<String, Number> variableMap;

    public ExecExpress(SignalExpress express, String[] variables) {
        this.express = express;
        this.variables = variables;
        variableMap = new HashMap<>();
        // 将变量初始化为0
        for (String variable : variables) {
            variableMap.put(variable, 0);
        }
    }

    public Number calculate(Number[] variableValues) {
        if (null == express) {
            return 0;
        }
        if (null != variableValues) {
            for (int i = 0; i < variableValues.length && i < variables.length; i++) {
                variableMap.put(variables[i], variableValues[i]);
            }
        }
        return express.calculate(variableMap);
    }

    public SignalExpress getExpress() {
        return express;
    }

    public void setExpress(SignalExpress express) {
        this.express = express;
    }

    public String[] getVariables() {
        return variables;
    }

    public void setVariables(String[] variables) {
        this.variables = variables;
    }
}
