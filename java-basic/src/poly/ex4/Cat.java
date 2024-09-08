package poly.ex4;

import poly.ex2.Animal;

/**
 * packageName    : poly.ex4
 * fileName       : Cat
 * author         : wnsgh
 * date           : 2024-09-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-08        wnsgh       최초 생성
 */
public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
