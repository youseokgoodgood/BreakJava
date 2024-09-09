package poly.car1;

/**
 * packageName    : poly.car0
 * fileName       : CarMai0
 * author         : wnsgh
 * date           : 2024-09-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-09        wnsgh       최초 생성
 */
public class CarMai1 {
    public static void main(String[] args) {
        K3Car car = new K3Car();
        Model3Car model = new Model3Car();
        Driver driver = new Driver(model);

        driver.drive();

    }
}
