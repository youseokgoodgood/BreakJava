package lang.wrapper;

/**
 * packageName    : lang.wrapper
 * fileName       : MyIntegerMethodMain0
 * author         : wnsgh
 * date           : 2024-10-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-21        wnsgh       최초 생성
 */
public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.compareTo(5);

        System.out.println("i1 = " + i1);
    }
}
