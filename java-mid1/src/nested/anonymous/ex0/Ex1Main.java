package nested.anonymous.ex0;

import java.util.Random;

/**
 * author         : SYS
 * date           : 2025-01-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-26        SYS       최초 생성
 */
public class Ex1Main {

    public static void helloDice() {
        System.out.println("프로그램 시작");

        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " +randomValue);

        System.out.println("프로그램 종료");
    }

    public static void helloSum() {
        System.out.println("프로그램 시작");

        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }

}
