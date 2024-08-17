package final1;

/**
 * packageName    : final1
 * fileName       : FinalLocalMain
 * author         : wnsgh
 * date           : 2024-08-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-17        wnsgh       최초 생성
 */
public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수1
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 =20; // Variable 'data1' might already have been assigned to | 컴파일 오류

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류
    }

    static void methood(final int parameter) {
        //parameter = 20;
    }
}
