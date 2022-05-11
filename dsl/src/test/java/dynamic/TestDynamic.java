package dynamic;



public class TestDynamic {

    private String CAN;//2/ALG;

    public String getCAN() {
        return CAN;
    }

    public void setCAN(String CAN) {
        this.CAN = CAN;
    }

    public TestDynamic(String can) {
        CAN = can;
    }

    public static void main(String[] args) {
        TestDynamic testDynamic =new TestDynamic("aa");
        System.out.println(testDynamic);
    }
}


