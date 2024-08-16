package static1;

/**
 * packageName    : static1
 * fileName       : DataCountMain3
 * author         : wnsgh
 * date           : 2024-08-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-16        wnsgh       최초 생성
 */
public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.counter);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.counter);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.counter);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + data4.counter);

        //클래스를 통한 접근
        System.out.println(Data3.counter);

    }
}
