package com.hirain.dsl;

import com.hirain.dsl.express.SignalExpress;
import com.hirain.dsl.parser.SignalBaseVisitor;
import com.hirain.dsl.parser.SignalParser;

import java.util.ArrayList;
import java.util.List;

public class SignalVisitorImpl extends SignalBaseVisitor<SignalExpress> {

    private List<String> variables = new ArrayList<>();
    private List<SignalExpress> express = new ArrayList<>();

    @Override
    public SignalExpress visitParamExpr(SignalParser.ParamExprContext ctx) {
        SignalExpress childExpress = visitChildren(ctx);

        SignalExpress signalExpress = new SignalExpress(ctx, null);
        if (null != childExpress) {
            signalExpress.addPreExpress(childExpress);
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitParamExpr(ctx);
    }

    @Override
    public SignalExpress visitFunctionExpr(SignalParser.FunctionExprContext ctx) {
        SignalExpress childExpress = visitChildren(ctx);

        SignalExpress signalExpress = new SignalExpress(ctx, null);
        if (null != childExpress) {
            signalExpress.addPreExpress(childExpress);
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitFunctionExpr(ctx);
    }

    @Override
    public SignalExpress visitBinaryExpr2(SignalParser.BinaryExpr2Context ctx) {
        SignalExpress childExpress = visitChildren(ctx);

        SignalExpress signalExpress = new SignalExpress(ctx, null);
        if (null != childExpress) {
            signalExpress.addPreExpress(childExpress);
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitBinaryExpr2(ctx);
    }

    @Override
    public SignalExpress visitBinaryExpr3(SignalParser.BinaryExpr3Context ctx) {
        SignalExpress childExpress = visitChildren(ctx);

        SignalExpress signalExpress = new SignalExpress(ctx, null);
        if (null != childExpress) {
            signalExpress.addPreExpress(childExpress);
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitBinaryExpr3(ctx);
    }

    @Override
    public SignalExpress visitBinaryExpr4(SignalParser.BinaryExpr4Context ctx) {
        SignalExpress childExpress = visitChildren(ctx);

        SignalExpress signalExpress = new SignalExpress(ctx, null);
        if (null != childExpress) {
            signalExpress.addPreExpress(childExpress);
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitBinaryExpr4(ctx);
    }

    @Override
    public SignalExpress visitExprWithBracket(SignalParser.ExprWithBracketContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public SignalExpress visitBinaryExpr5(SignalParser.BinaryExpr5Context ctx) {
        SignalExpress childExpress = visitChildren(ctx);

        SignalExpress signalExpress = new SignalExpress(ctx, null);
        if (null != childExpress) {
            signalExpress.addPreExpress(childExpress);
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitBinaryExpr5(ctx);
    }

    @Override
    public SignalExpress visitUnaryExpr(SignalParser.UnaryExprContext ctx) {
        SignalExpress childExpress = visitChildren(ctx);

        SignalExpress signalExpress = new SignalExpress(ctx, null);
        if (null != childExpress) {
            signalExpress.addPreExpress(childExpress);
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitUnaryExpr(ctx);
    }

    @Override
    public SignalExpress visitBinaryExpr1(SignalParser.BinaryExpr1Context ctx) {
        SignalExpress childExpress = visitChildren(ctx);

        SignalExpress signalExpress = new SignalExpress(ctx, null);
        if (null != childExpress) {
            signalExpress.addPreExpress(childExpress);
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitBinaryExpr1(ctx);
    }

    @Override
    public SignalExpress visitSignalVariable(SignalParser.SignalVariableContext ctx) {
        visitChildren(ctx);
        variables.add(ctx.getText());
        return super.visitSignalVariable(ctx);
    }

    public void print() {
        System.out.println("variables:");
        variables.forEach(System.out::println);
        System.out.println("express:");
        System.out.println(express.get(express.size() - 1));
        //express.forEach(System.out::println);
    }
}
