package lang.object.tostring;

/**
 * packageName    : lang.object.tostring
 * fileName       : ToStringMain1
 * author         : wnsgh
 * date           : 2024-09-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-22        wnsgh       최초 생성
 */
public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1",2);
        Dog dog2 = new Dog("멍멍이2",5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString()); // 클래스측에 toString 미 설정 시 Object에서 기본적으로 제공하는 toString()함수 사용
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");

        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        //객체 참조값 확인
        String hexString = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("i = " + hexString);
    }
}
