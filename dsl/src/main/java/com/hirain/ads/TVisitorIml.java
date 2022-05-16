package com.hirain.ads;

import com.hirain.ads.dsl.HelloBaseVisitor;
import com.hirain.ads.dsl.HelloParser;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author Jarrett Luo
 * @Date 2022/5/16 15:41
 * @Version 1.0
 */


public class TVisitorIml extends HelloBaseVisitor<Object> {

    public TVisitorIml() {}

    @Override
    public Object visitAssign(HelloParser.AssignContext ctx) {
        String name = ctx.ID().getText();
        // Object value = ctx.expr().accept(this);
        // System.out.println("Assign+================");
        // System.out.println(value);
        System.out.println(ctx.expr().accept(this));

        return null;
    }


    @Override
    public Object visitId(HelloParser.IdContext ctx) {
        System.out.println("dsfjdsljfdsljdslfj");
        return new ArrayList<>();
    }


    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        if(currentResult==null) {
            return true;
        }
        return false;
    }


}
