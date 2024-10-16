package lang.string.immutable;

/**
 * packageName    : lang.string.immutable
 * fileName       : StringImmutable1
 * author         : wnsgh
 * date           : 2024-10-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-16        wnsgh       최초 생성
 */
public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
