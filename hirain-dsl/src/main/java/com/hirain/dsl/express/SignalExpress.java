package com.hirain.dsl.express;

import com.hirain.dsl.lexer.SignalLexer;
import com.hirain.dsl.parser.SignalParser;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class SignalExpress {

    private SignalParser.ExprContext exprContext; // 表达式的上下文

    private Token token;

    private List<SignalExpress> preExpressList = new ArrayList<>();

    public SignalExpress() {}

    public SignalExpress(SignalParser.ExprContext exprContext, Token token) {
        this.exprContext = exprContext;
        this.token = token;
    }

    public SignalParser.ExprContext getExprContext() {
        return exprContext;
    }

    public void setExprContext(SignalParser.ExprContext exprContext) {
        this.exprContext = exprContext;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public List<SignalExpress> getPreExpressList() {
        return preExpressList;
    }

    public void addPreExpress(SignalExpress signalExpress) {
        this.preExpressList.add(signalExpress);
    }

    @Override
    public String toString() {
        return "SignalExpress{" +
                "exprContext.class=" + exprContext.getClass().getSimpleName() +
                ", text=" + exprContext.getText() +
                ", token=" + token +
                ", preList=" + preExpressList +
                '}';
    }
}
