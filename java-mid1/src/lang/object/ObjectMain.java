package lang.object;

/**
 * packageName    : lang.object
 * fileName       : ObjectMain
 * author         : wnsgh
 * date           : 2024-09-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-18        wnsgh       최초 생성
 */
public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        Object object = new Parent();
        child.childMethod();
        child.parentMethod();

        //toString()은 object 클래스의 메서드
        String childString = child.toString();
        System.out.println("childString = " + childString);
        System.out.println("child.getClass() = " + child.getClass());
        System.out.println("object.getClass() = " + object.getClass());
        
    }
}
