package static2;

/**
 * packageName    : static2
 * fileName       : DecoDataMain
 * author         : wnsgh
 * date           : 2024-08-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-16        wnsgh       최초 생성
 */
public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        DecoData.staticCall();
        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
    }
}
