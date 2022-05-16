import com.hirain.dsl.SignalVisitorImpl;
import com.hirain.dsl.exec.ExecExpress;
import com.hirain.dsl.lexer.SignalLexer;
import com.hirain.dsl.parser.SignalParser;
import com.hirain.dsl.parser.SignalVisitor;
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
    public static ExecExpress exec(String expir){
        CharStream input = CharStreams.fromString(expir);
        // 将内容传递到词法解析器
        SignalLexer signalLexer = new SignalLexer(input);
        // 传递到流
        CommonTokenStream tokenStream = new CommonTokenStream(signalLexer);
        //将流传递到语法解析器
        SignalParser signalParser = new SignalParser(tokenStream);
        signalParser.setBuildParseTree(true);
        SignalParser.Signal_inputContext root = signalParser.signal_input();

        // visitor = new
        SignalVisitorImpl visitor = new SignalVisitorImpl();
        root.accept(visitor);

        visitor.print();
        return new ExecExpress(visitor.getExpress().get(visitor.getExpress().size() - 1),
                visitor.getVariables().toArray(new String[visitor.getVariables().size()]));
    }

    public static void main(String[] args) {
        String str ="1+2*(3+1) \n ";

        DslParser.exec(str);
    }

}
