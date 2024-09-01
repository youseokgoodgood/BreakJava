package poly.basic;

/**
 * packageName    : poly.basic
 * fileName       : PolyMain
 * author         : wnsgh
 * date           : 2024-09-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-01        wnsgh       최초 생성
 */
public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //자식은 부모를 담을 수 없다.
        //Child poly2 = new Parent();

        //자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

    }
}
