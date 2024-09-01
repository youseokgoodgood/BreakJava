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
public class CastingMain4 {

    public static void main(String[] args) {
       Parent parent1 = new Child();
       Child child1 = (Child) parent1;
       child1.childMethod(); //문제없음
       
       Parent parent2 = new Parent();
       Child child2 = (Child) parent2; //런타임 오류 - ClassCastException
        /*
        * 부모객체를 생성했기 때문에 메모리상 자식 인스턴스는 존재하지 않음
        * 그러므로, 런타임 오류가 발생됨
        * */

        child2.childMethod(); //실행불가
    }
}
