package iter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : iter
 * fileName       : Receipt
 * author         : wnsgh
 * date           : 2025-05-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-05-08        wnsgh       최초 생성
 *
 * 260000
 * 4
 * 20000 5
 * 30000 2
 * 10000 6
 * 5000 8
 */
public class Receipt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Long.parseLong(br.readLine());
        int n = Integer.parseInt(br.readLine());
        long price = 0;

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            price += (long)a * b;
        }

        System.out.println(x == price? "yes":"no");


    }
}
