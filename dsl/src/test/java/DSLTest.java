
import org.junit.Test;


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

    @Test
    public void test3(){
        String str ="1+sin(1) \n";
        DslParser.exec(str);
    }

    @Test
    public void test4(){
        String str ="A = 123 \n 1+(A) \n";
        DslParser.exec(str);
    }


}
