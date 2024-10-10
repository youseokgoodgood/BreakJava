package lang.immutable.address;

/**
 * packageName    : lang.immutable.address
 * fileName       : RefMain1_1
 * author         : wnsgh
 * date           : 2024-10-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-10        wnsgh       최초 생성
 */
public class RefMain1_2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        //참조형은 하나의 객체를 참조값을 통해 여러 변수에서 공유할 수 있다.

        Adress a = new Adress("서울");
        Adress b = new Adress("부산"); //사이드이펙트 해결

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        
    }
}
