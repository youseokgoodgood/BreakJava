package lang.object;

/**
 * packageName    : lang.object
 * fileName       : Parent
 * author         : wnsgh
 * date           : 2024-09-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-18        wnsgh       최초 생성
 */
//부모가 없으면 묵시적으로 Object 클래스를 상속 받는다.
public class Parent {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
