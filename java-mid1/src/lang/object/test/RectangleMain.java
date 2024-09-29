package lang.object.test;

/**
 * packageName    : lang.object.test
 * fileName       : RectangleMain
 * author         : wnsgh
 * date           : 2024-09-29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-29        wnsgh       최초 생성
 */
public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(100,20);
        Rectangle rectangle2 = new Rectangle(100,20);

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle1 == rectangle2);
        System.out.println(rectangle1.equals(rectangle2));
    }
}
