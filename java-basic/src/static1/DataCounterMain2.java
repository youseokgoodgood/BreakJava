package static1;

/**
 * packageName    : static1
 * fileName       : DataCounterMain2
 * author         : wnsgh
 * date           : 2024-08-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-16        wnsgh       최초 생성
 */
public class DataCounterMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A counter = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B counter = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C counter = " + counter.count);
    }
}
