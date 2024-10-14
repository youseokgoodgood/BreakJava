package lang.string;

/**
 * packageName    : lang.string
 * fileName       : StringBasicMain
 * author         : wnsgh
 * date           : 2024-10-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-14        wnsgh       최초 생성
 */
public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = new String("Hello World");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str1 == str2 = " + str1.equals(str2));
    }
}
