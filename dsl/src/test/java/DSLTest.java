
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

    @Test
    public void test5(){
        String str ="sin([1, 3, 4, 5, 6, 7, 8, 9, 10])\n";
        System.out.println("输入表达式：" + str);
        DslParser.exec(str);
    }

    @Test
    public void test6(){
        String str ="A = [1, 3, 4, 5, 6, 7, 8, 9, 10]\nsin(A)\n";
        System.out.println("输入表达式：" + str);
        DslParser.exec(str);
    }

    @Test
    public void test7(){
        String str ="a=[1, 4, 9]\nb=[4,4,4]\nsin(a)+b\n";
        System.out.println("输入表达式：" + str);
        DslParser.exec(str);
    }


}
