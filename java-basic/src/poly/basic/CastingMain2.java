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
public class CastingMain2 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001
        //단 자식의 기능은 호출 할 수 없다. 컴파일 오류
        //poly.childMethod();

        //다운캐스팅(부모타입 -> 자식 타입)
        Child child = (Child) poly; //x001
        child.childMethod();

        //일시적 다운 캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
        
    }
}