package com.hirain.dsl;

import com.hirain.dsl.express.*;
import com.hirain.dsl.parser.SignalBaseVisitor;
import com.hirain.dsl.parser.SignalParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SignalVisitorImpl extends SignalBaseVisitor<SignalExpress> {

    private List<String> variables = new ArrayList<>();
    private List<SignalExpress> express = new ArrayList<>();

    private Map<String, SignalExpress> expressMap = new HashMap<>();

    @Override
    public SignalExpress visitParamExpr(SignalParser.ParamExprContext ctx) {
        ParamSignalExpress signalExpress = new ParamSignalExpress(ctx);
        setParentExpress(ctx, signalExpress);
        signalExpress.setParam(ctx.param().getText());
        visitChildren(ctx);
        express.add(signalExpress);
        return signalExpress;
        //return super.visitParamExpr(ctx);
    }

    @Override
    public SignalExpress visitFunctionExpr(SignalParser.FunctionExprContext ctx) {
        FunctionSignalExpress signalExpress = new FunctionSignalExpress(ctx);
        setParentExpress(ctx, signalExpress);
        visitChildren(ctx);
        signalExpress.setFunctionName(ctx.function().function_name().getText());
        if (signalExpress.getChildExpressList().size() == 1) {
            signalExpress.setInnerExpress(signalExpress.getChildExpressList().get(0));
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitFunctionExpr(ctx);
    }

    @Override
    public SignalExpress visitBinaryExpr2(SignalParser.BinaryExpr2Context ctx) {
        BinarySignalExpress signalExpress = new BinarySignalExpress(ctx);
        setParentExpress(ctx, signalExpress);

        visitChildren(ctx);

        signalExpress.setOperate(ctx.binary_op2().getText());
        if (signalExpress.getChildExpressList().size() == 2) {
            signalExpress.setLeftExpress(signalExpress.getChildExpressList().get(0));
            signalExpress.setRightExpress(signalExpress.getChildExpressList().get(1));
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitBinaryExpr2(ctx);
    }

    @Override
    public SignalExpress visitBinaryExpr3(SignalParser.BinaryExpr3Context ctx) {
        BinarySignalExpress signalExpress = new BinarySignalExpress(ctx);
        setParentExpress(ctx, signalExpress);
        signalExpress.setOperate(ctx.binary_op3().getText());
        visitChildren(ctx);

        if (signalExpress.getChildExpressList().size() == 2) {
            signalExpress.setLeftExpress(signalExpress.getChildExpressList().get(0));
            signalExpress.setRightExpress(signalExpress.getChildExpressList().get(1));
        }

        express.add(signalExpress);
        return signalExpress;
        //return super.visitBinaryExpr3(ctx);
    }

    @Override
    public SignalExpress visitBinaryExpr4(SignalParser.BinaryExpr4Context ctx) {
        BinarySignalExpress signalExpress = new BinarySignalExpress(ctx);
        setParentExpress(ctx, signalExpress);
        signalExpress.setOperate(ctx.binary_op4().getText());
        visitChildren(ctx);
        if (signalExpress.getChildExpressList().size() == 2) {
            signalExpress.setLeftExpress(signalExpress.getChildExpressList().get(0));
            signalExpress.setRightExpress(signalExpress.getChildExpressList().get(1));
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitBinaryExpr4(ctx);
    }

    @Override
    public SignalExpress visitExprWithBracket(SignalParser.ExprWithBracketContext ctx) {
        BracketSignalExpress signalExpress = new BracketSignalExpress(ctx);
        setParentExpress(ctx, signalExpress);
        visitChildren(ctx);
        if (signalExpress.getChildExpressList().size() == 1) {
            signalExpress.setInnerExpress(signalExpress.getChildExpressList().get(0));
        }
        return signalExpress;
    }

    @Override
    public SignalExpress visitBinaryExpr5(SignalParser.BinaryExpr5Context ctx) {
        BinarySignalExpress signalExpress = new BinarySignalExpress(ctx);
        setParentExpress(ctx, signalExpress);
        signalExpress.setOperate(ctx.binary_op5().getText());
        visitChildren(ctx);
        if (signalExpress.getChildExpressList().size() == 2) {
            signalExpress.setLeftExpress(signalExpress.getChildExpressList().get(0));
            signalExpress.setRightExpress(signalExpress.getChildExpressList().get(1));
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitBinaryExpr5(ctx);
    }

    @Override
    public SignalExpress visitUnaryExpr(SignalParser.UnaryExprContext ctx) {
        UnarySignalExpress signalExpress = new UnarySignalExpress(ctx);
        setParentExpress(ctx, signalExpress);
        visitChildren(ctx);
        if (signalExpress.getChildExpressList().size() == 1) {
            signalExpress.setLeftExpress(signalExpress.getChildExpressList().get(0));
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitUnaryExpr(ctx);
    }

    @Override
    public SignalExpress visitBinaryExpr1(SignalParser.BinaryExpr1Context ctx) {
        BinarySignalExpress signalExpress = new BinarySignalExpress(ctx);
        setParentExpress(ctx, signalExpress);
        signalExpress.setOperate(ctx.binary_op1().getText());
        visitChildren(ctx);
        if (signalExpress.getChildExpressList().size() == 2) {
            signalExpress.setLeftExpress(signalExpress.getChildExpressList().get(0));
            signalExpress.setRightExpress(signalExpress.getChildExpressList().get(1));
        }
        express.add(signalExpress);
        return signalExpress;
        //return super.visitBinaryExpr1(ctx);
    }

    @Override
    public SignalExpress visitSignalVariable(SignalParser.SignalVariableContext ctx) {
        variables.add(ctx.getText());
        return super.visitSignalVariable(ctx);
    }

    public void print() {
        System.out.println("variables:");
        variables.forEach(System.out::println);
        System.out.println("express:");
        //System.out.println(express.get(express.size() - 1));
        express.forEach(System.out::println);
    }

    private void setParentExpress(SignalParser.ExprContext ctx, SignalExpress signalExpress) {
        expressMap.put(ctx.getPayload().toString(), signalExpress);
        ParserRuleContext parentContext = ctx.getParent();
        while (parentContext != null) {
            String parentId = parentContext.getPayload().toString();
            SignalExpress parentExpress = expressMap.get(parentId);
            if (null != parentExpress) {
                parentExpress.addChildExpress(signalExpress);
                return;
            }
            parentContext = parentContext.getParent();
        }
    }

    public List<String> getVariables() {
        return variables;
    }

    public List<SignalExpress> getExpress() {
        return express;
    }
}
