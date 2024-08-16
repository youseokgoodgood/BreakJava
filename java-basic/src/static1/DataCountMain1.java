package static1;

/**
 * packageName    : static1
 * fileName       : DataCountMain1
 * author         : wnsgh
 * date           : 2024-08-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-16        wnsgh       최초 생성
 */
public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("A .count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B .count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C .count = " + data3.count);
    }
}
