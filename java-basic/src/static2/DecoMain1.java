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
public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello Java";
        DecoUtil1 decoUtil = new DecoUtil1();
        String deco = decoUtil.deco(s); //인스턴스 메서드

        System.out.println("before = " + s);
        System.out.println("after = " + deco);
    }
}
