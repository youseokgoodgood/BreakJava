package nested.local;

/**
 * author         : SYS
 * date           : 2025-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-24        SYS       최초 생성
 */
public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        class LocalPrinter{
            int value = 0;

            public void printData(){
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(1);
    }
}
