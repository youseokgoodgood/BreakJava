package extends1.overriding;

public class ElectricCar extends Car {

    /*
    *
    * 오버로딩(과적): 메서드 이름이 같고, 파라미터 갯수가 다른 메서드를 여러개 정의하는 것을 메서드 오버로딩이라 함.
    *
    * 오버라이딩(재정의): 하위 클래스에서 상위 클래스의 메서드를 재정의하는 과정을 의미.
    * */


    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동 합니다.");
    }

    public void charge() {
        System.out.println("충전 합니다.");
    }
}
