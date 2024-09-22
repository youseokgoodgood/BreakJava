package lang.object.poly;

/**
 * packageName    : lang.object.poly
 * fileName       : ObjectPolyExample1
 * author         : wnsgh
 * date           : 2024-09-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-22        wnsgh       최초 생성
 */
public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = {dog, car, object};

        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: "+objects.length);
    }
}
