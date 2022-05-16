package com.hirain.dsl.util;

import java.util.regex.Pattern;

public class RegexUtil {

    static final Pattern INTEGER_PATTERN = Pattern.compile("0|[-]?[1-9][0-9]*");

    static final Pattern DOUBLE_PATTERN = Pattern.compile("[-]?[1-9][0-9]*\\.[0-9]+");

    public static boolean isInteger(String str) {
        return INTEGER_PATTERN.matcher(str).matches();
    }

    public static boolean isDouble(String str) {
        return DOUBLE_PATTERN.matcher(str).matches();
    }
}
