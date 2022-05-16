
import com.hirain.dsl.exec.ExecExpress;
import org.junit.Test;

import java.util.Arrays;


public class DSLTest {

    @Test
    public void testTree(){

//        String str ="sin(a+b)+3";
        String str ="sin(a+b) + 5*4";

        ExecExpress express = DslParser.exec(str);
        System.out.println("variables: " + Arrays.toString(express.getVariables()));
        int[] a = new int[] {1,3,4,6,8};
        int[] b = new int[] {32,12,53,10,9};
        Number[] result = new Number[5];
        for (int i = 0; i < 5; i++) {
            result[i] = express.calculate(new Number[]{a[i], b[i]});
        }
        System.out.println("result: " + Arrays.toString(result));
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
