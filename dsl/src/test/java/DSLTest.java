import com.hirain.ads.MathVisitorImp;
import com.hirain.ads.dsl.HelloLexer;
import com.hirain.ads.dsl.HelloListener;
import com.hirain.ads.dsl.HelloParser;
import com.hirain.ads.dsl.HelloVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DSLTest {

    @Test
    public void testTree(){

        String str ="1+2*3 \n ";

        DslParser.exec(str);
    }
    @Test
    public void test2(){
        String str ="1+2*(3+1)\n";
        DslParser.exec(str);
    }


}
