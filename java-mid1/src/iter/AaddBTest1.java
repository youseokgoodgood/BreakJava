package iter;

/**
 * packageName    : iter
 * fileName       : AaddBTest1
 * author         : wnsgh
 * date           : 2025-05-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-05-03        wnsgh       최초 생성
 */
/*
5
        1 1
        2 3
        3 4
        9 8
        5 2
 */
public class AaddBTest1 {
    public static void main(String[] args) {
        int t = 5;
        int a = 1;
        int b = 1;

        for (int i = 1; i <= t; i++) {
            a += b;
            b += i;

            System.out.printf("%d %d\n", a, b);
        }
    }
    
}
