package poly.ex5;

/**
 * packageName    : poly.ex5
 * fileName       : AbstractAnimal
 * author         : wnsgh
 * date           : 2024-09-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-08        wnsgh       최초 생성
 */
public abstract class AbstractAnimal {
    public abstract void sound();

    public void move() {
        System.out.println("동물이 이동합니다.");
    }
}
