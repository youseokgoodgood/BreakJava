package static2;

/**
 * packageName    : static2
 * fileName       : DecoMain1
 * author         : wnsgh
 * date           : 2024-08-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-16        wnsgh       최초 생성
 */
public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello Java";
        String deco = DecoUtil2.deco(s); //클래스 메서드

        System.out.println("before = " + s);
        System.out.println("after = " + deco);
    }
}
