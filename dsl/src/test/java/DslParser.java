import com.hirain.ads.ArrayVisitorIml;
import com.hirain.ads.MathVisitorImp;
import com.hirain.ads.TVisitorIml;
import com.hirain.ads.dsl.HelloLexer;
import com.hirain.ads.dsl.HelloParser;
import com.hirain.ads.dsl.HelloVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * 解析dsl
 */
public class DslParser {

    /**
     * 执行表达式
     * @param expir 表达式
     */
    public static void exec(String expir){
        CharStream input = CharStreams.fromString(expir);
        // 将内容传递到词法解析器
        HelloLexer lexer = new HelloLexer(input);
        // 传递到流
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        //将流传递到语法解析器
        HelloParser parser = new HelloParser(tokenStream);
        parser.setBuildParseTree(true);
        HelloParser.ProgContext root =parser.prog();

        // HelloVisitor visitor = new MathVisitorImp();
        HelloVisitor visitor = new ArrayVisitorIml();
        // HelloVisitor visitor = new TVisitorIml();
        root.accept(visitor);

    }

    public static void main(String[] args) {
        String str ="1+2*(3+1) \n ";

        DslParser.exec(str);
    }

}
