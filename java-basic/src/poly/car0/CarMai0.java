package poly.car0;

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
public class CarMai0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car car = new K3Car();

        driver.setK3Car(car);
        driver.drive();

        //추가
        Model3Car model = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model);
        driver.drive();
    }
}
