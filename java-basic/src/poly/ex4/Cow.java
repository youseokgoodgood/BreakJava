package poly.ex4;

/**
 * packageName    : poly.ex4
 * fileName       : Cow
 * author         : wnsgh
 * date           : 2024-09-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-08        wnsgh       최초 생성
 */
public class Cow implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
