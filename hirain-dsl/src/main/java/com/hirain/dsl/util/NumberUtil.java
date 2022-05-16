package com.hirain.dsl.util;

public class NumberUtil {

    public static Number doAdd(Number left, Number right) {
        System.out.println("doAdd: " + left + " + " + right);
        if (left instanceof Double || right instanceof Double) {
            return left.doubleValue() + right.doubleValue();
        }
        return left.intValue() + right.intValue();
    }

    public static Number doSub(Number left, Number right) {
        System.out.println("doSub");
        if (left instanceof Double || right instanceof Double) {
            return left.doubleValue() - right.doubleValue();
        }
        return left.intValue() - right.intValue();
    }

    public static Number doMul(Number left, Number right) {
        System.out.println("doMul: " + left + " * " + right);
        if (left instanceof Double || right instanceof Double) {
            return left.doubleValue() * right.doubleValue();
        }
        return left.intValue() * right.intValue();
    }

    public static Number doDiv(Number left, Number right) {
        if (right instanceof Integer && right.intValue() == 0) {
            return 0;
        }
        if (left instanceof Double || right instanceof Double) {
            return left.doubleValue() / right.doubleValue();
        }
        return left.intValue() / right.intValue();
    }

    public static Number doSin(Number value) {
        System.out.println("doSin: " + value);
        return Math.sin(value.doubleValue());
    }

    public static Number doCos(Number value) {
        return Math.cos(value.doubleValue());
    }
}
