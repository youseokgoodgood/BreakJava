package poly.basic;

/**
 * packageName    : poly.basic
 * fileName       : CastingMain
 * author         : wnsgh
 * date           : 2024-09-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-01        wnsgh       최초 생성
 */
public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //업캐스팅은 생략 가능, 생략 권장
        Parent parent2 =  child; //업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
