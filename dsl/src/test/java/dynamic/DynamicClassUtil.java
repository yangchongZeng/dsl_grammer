package dynamic;

import com.alibaba.fastjson2.JSONObject;
import com.itranswarp.compiler.JavaStringCompiler;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * 动态类工具 ，依赖
 * yy
 * <dependency>
 *     <groupId>com.itranswarp</groupId>
 *     <artifactId>compiler</artifactId>
 *     <version>1.0</version>
 * </dependency>
 */
public class DynamicClassUtil {


    /**
     *  编译文本为class
     * @param className source
     * @return class
     * @throws Exception
     */
    public static Class compileClass(String className,String source) throws  Exception{
        // 声明类名
        String packageName = "com.dynamic.source";
        // 声明包名：package top.fomeiherz;
        String prefix = String.format("package %s;", packageName);
        // 全类名：top.fomeiherz.Main
        String fullName = String.format("%s.%s", packageName, className);

        // 编译器
        JavaStringCompiler compiler = new JavaStringCompiler();
        // 编译：compiler.compile("Main.java", source)
        Map<String, byte[]> results = compiler.compile(className + ".java", prefix + source);
        // 加载内存中byte到Class<?>对象
        Class<?> clazz = compiler.loadClass(fullName, results);
        return clazz;
    }

    /**
     * 构建POJO
     * @return String
     */
    public static String gentorPojoSource(){

        StringBuilder sb = new StringBuilder();
        sb.append("import java.lang.*;\n" +
                "import java.math.BigDecimal;\n" +
                "import java.util.*;");
        String type="Long";
        String varName="tt";
        sb.append(String.format("private %s %s",type,varName));
//        sb

        return null;

    }

    public static void main(String[] args) throws Exception {
        // 传入String类型的代码
        String source = "import java.util.Arrays;" +
                "public class Main" +
                "{" +
                "private String name;" +
                "public void setName(String name){this.name=name;}"+
                "public String getName(String name){return this.name;}"+
                "}" ;
        Class c=compileClass("Main",source);
        String json = "{'name':'张三'}";
        Object object=JSONObject.parseObject(json,c);

    }
}
