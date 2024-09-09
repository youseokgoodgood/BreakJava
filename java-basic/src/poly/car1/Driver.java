package poly.car1;

/**
 * packageName    : poly.car0
 * fileName       : Driver
 * author         : wnsgh
 * date           : 2024-09-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-09        wnsgh       최초 생성
 */
public class Driver {

    private final Car car;

    public Driver(Car car) {
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전 합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }

}
