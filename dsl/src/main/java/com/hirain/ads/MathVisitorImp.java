package com.hirain.ads;

import com.hirain.ads.dsl.HelloBaseVisitor;
import com.hirain.ads.dsl.HelloParser;
import com.hirain.ads.dsl.HelloVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
public class MathVisitorImp extends HelloBaseVisitor<Integer> {
    // 存储变量的值
    private Map<String, Integer> variable;

    public MathVisitorImp() {
        variable = new HashMap();
    }

    // 当遇到printExpr节点，计算出exrp的值，然后打印出来
    public Integer visitPrintExpr(HelloParser.PrintExprContext ctx) {
        Integer result  = ctx.expr().accept(this);
        System.out.println(result);

        return result;
    }

    // 分别获取子节点expr的值，然后做加减运算
    
    public Integer visitAddSub(HelloParser.AddSubContext ctx) {
        Integer param1 = ctx.expr(0).accept(this);
        Integer param2 = ctx.expr(1).accept(this);
        if (ctx.op.getType() == HelloParser.ADD) {
            return param1 + param2;
        }else {
            return param1 - param2;
        }
    }

    // 分别获取子节点expr的值，然后做乘除运算
    
    public Integer visitMulDiv(HelloParser.MulDivContext ctx) {
        Integer param1 = ctx.expr(0).accept(this);
        Integer param2 = ctx.expr(1).accept(this);
        if (ctx.op.getType() == HelloParser.MUL) {
            return param1 * param2;
        }else {
            return param1 / param2;
        }
    }

    // 当遇到int节点，直接返回数据
    
    public Integer visitInt(HelloParser.IntContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    // 当遇到Id节点，从变量表获取值
    
    public Integer visitId(HelloParser.IdContext ctx) {
        return variable.get(ctx.getText());
    }

    // 当遇到赋值语句，获取右边expr的值，然后将变量的值保存到variable集合
    
    public Integer visitAssign(HelloParser.AssignContext ctx) {
        String name = ctx.ID().getText();
        Integer value = ctx.expr().accept(this);
        variable.put(name, value);
        return null;
    }

    @Override
    public Integer visitMod(HelloParser.ModContext ctx) {
        Integer param1 = ctx.expr(0).accept(this);
        Integer param2 = ctx.expr(1).accept(this);
        return  param1%param2;
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Integer currentResult) {
        if(currentResult==null)
            return true;
        return false;
    }
}
