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
public class RefMain2 {
    public static void main(String[] args) {
        //불변이라는 단순한 제약을 사용해서 사이드 이펙트라는 큰 문제를 막을 수 있다.
        //객체의 공유 참조는 막을 수 없어, 객체의 값을 변경하면 다른 곳에서 참조하는 변수의 값도 함께 변경되는 사이트 이펙트가 발생
        //이러한 문제를 해결 하기 위해선 불변 객체를 사용

        /*
        * Adress 객체는 가변 클래스이며, 처음 만든 이후 상태가 변할 수 있음
        * ImmutableAdress 객체는 불변 클래스이며, 처음 만든 이후 상태가 변하지 않는다
        * */
        
        
        ImmutableAdress a = new ImmutableAdress("서울");
        ImmutableAdress b = a;

        System.out.println("a = " + a.toString());
        System.out.println("b = " + b.toString());

        //b.setValue("부산");
        b = new ImmutableAdress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a.toString());
        System.out.println("b = " + b.toString());


    }
}
