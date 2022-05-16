package com.hirain.ads;

import com.hirain.ads.dsl.HelloBaseVisitor;
import com.hirain.ads.dsl.HelloParser;
import com.hirain.ads.dsl.HelloVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author Jarrett Luo
 * @Date 2022/5/16 15:41
 * @Version 1.0
 */


public class ArrayVisitorIml extends HelloBaseVisitor<List<Object>> {

    private Map<String, List<Object>> args;

    public ArrayVisitorIml() {
        // String ids =
        args = new HashMap<>(8);
    }

    @Override
    public List<Object> visitPrintExpr(HelloParser.PrintExprContext ctx) {
        System.out.println("打印结果：" + ctx.expr().accept(this));
        return null;
    }

    @Override
    public List<Object> visitAssign(HelloParser.AssignContext ctx) {
        String name = ctx.ID().getText();
        List<Object> value = ctx.expr().accept(this);
        args.put(name, value);

        return null;
    }

    @Override
    public List<Object> visitArray(HelloParser.ArrayContext ctx) {
        String arrayText = ctx.getText();
        arrayText = arrayText.substring(1, arrayText.indexOf("]"));
        String str[] = arrayText.split(",");
        List<String> al = Arrays.asList(str);
        List<Object> a = al.stream().map(Float::valueOf).collect(Collectors.toList());
        System.out.println(a);
        return a;
    }

    @Override
    public List<Object> visitSin(HelloParser.SinContext ctx) {
        List<Object> param1 = ctx.expr().accept(this);
        // List<Float> result = param1.stream().reduce((Float) item -> item*10.0);
        List<Object> result = new ArrayList<>();
        for (Object o : param1) {
            Float f = (Float) o;
            Float x = (f * 10.0f);
            result.add(x);
        }
        System.out.println("输出Sin结果" + result);
        return result;
    }

    @Override
    public List<Object> visitAddSub(HelloParser.AddSubContext ctx) {
        List<Object> param1 = ctx.expr(0).accept(this);
        List<Object> param2 = ctx.expr(1).accept(this);
        List<Object> result = new ArrayList<>();
        if(param1.size() == param2.size()) {
            for(int index = 0; index < param1.size(); index ++ ){
                Float x1 = (Float) param1.get(index);
                Float x2 = (Float) param2.get(index);
                Float tmp = x1 + x2;
                result.add((Object) tmp);
            }
        }
        return result;
    }

    @Override
    public List<Object> visitId(HelloParser.IdContext ctx) {
        String name = ctx.getText();
        System.out.println(name);
        return args.get(name);
    }

    @Override
    public List<Object> visitInt(HelloParser.IntContext ctx) {
        return null;
    }


    @Override
    protected boolean shouldVisitNextChild(RuleNode node, List<Object> currentResult) {
        if(currentResult==null) {
            return true;
        }
        return false;
    }


}
