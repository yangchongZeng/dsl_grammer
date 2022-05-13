package cggrammer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

public class MyCGrammerParserTest {

    @Test
    public void execTest() {

    }

    public static void exec(String expir){
        CharStream input = CharStreams.fromString(expir);

        // 将内容传递到词法解析器
        MyCGrammerLexer lexer = new MyCGrammerLexer(input);

        // 传递到流
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        //将流传递到语法解析器
        MyCGrammerParser parser = new MyCGrammerParser(tokenStream);



    }
}
