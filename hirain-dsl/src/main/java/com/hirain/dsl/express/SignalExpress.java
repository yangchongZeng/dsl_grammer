package com.hirain.dsl.express;

import com.hirain.dsl.lexer.SignalLexer;
import com.hirain.dsl.parser.SignalParser;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class SignalExpress {

    protected SignalParser.ExprContext exprContext; // 表达式的上下文

    protected List<SignalExpress> childExpressList;

    public SignalExpress(SignalParser.ExprContext exprContext) {
        this.exprContext = exprContext;
        this.childExpressList = new ArrayList<>();
    }

    public void addChildExpress(SignalExpress childExpress) {
        this.childExpressList.add(childExpress);
    }

    public List<SignalExpress> getChildExpressList() {
        return childExpressList;
    }

    public abstract Number calculate(Map<String, Number> paramMap);

    @Override
    public String toString() {
        return "SignalExpress{" +
                "exprContext=" + exprContext.getText() +
                ", class=" + this.getClass().getSimpleName() +
                ", childExpressList=" + childExpressList +
                '}';
    }
}
