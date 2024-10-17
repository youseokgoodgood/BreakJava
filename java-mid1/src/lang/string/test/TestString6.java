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
public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        System.out.println("index = " + index);

        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);
    }
}
