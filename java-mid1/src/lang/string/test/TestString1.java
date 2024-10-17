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
public class TestString1 {
    public static void main(String[] args) {
        String url = "http://www.naver.com";
        //http:// 로 시작하는지 확인
        boolean starts = url.startsWith("http://");

        System.out.println("starts = " + starts);
    }
}
