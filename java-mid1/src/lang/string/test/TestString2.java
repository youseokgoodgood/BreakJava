package lang.string.test;

/**
 * packageName    : lang.string.test
 * fileName       : TestString1
 * author         : wnsgh
 * date           : 2024-10-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-17        wnsgh       최초 생성
 */
public class TestString2 {
    public static void main(String[] args) {
        String [] str = {"hello", "Java", "jvm", "spring", "jpa"};
        int sum = 0;

        for (String s : str) {
            System.out.println(s+" : " + s.length());
            sum += s.length();
        }

        System.out.println("sum = " + sum);
    }
}
