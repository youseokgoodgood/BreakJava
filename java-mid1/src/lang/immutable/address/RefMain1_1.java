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
public class RefMain1_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        //참조형은 하나의 객체를 참조값을 통해 여러 변수에서 공유할 수 있다.

        Adress a = new Adress("서울");
        Adress b = a;

        System.out.println("a = " + a.toString());
        System.out.println("b = " + b.toString());

        b.setValue("부산");
        System.out.println("부산 -> b");

        //사이드이펙트: 프로그래밍에서 어떤 계산이 주된 작업 외에 추가적인 부수 효과를 일으키는 것을 말함
        System.out.println("a = " + a.toString()); // 사이드이펙트 발생
        System.out.println("b = " + b.toString());


    }
}
