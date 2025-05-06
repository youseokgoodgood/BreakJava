package iter;

/**
 * packageName    : iter
 * fileName       : Gugudan
 * author         : wnsgh
 * date           : 2025-05-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-05-03        wnsgh       최초 생성
 */
public class Gugudan {
    public static void main(String[] args) {
        int n = 2;

        //구구단 생성
        for (int i = n; i <= n; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
