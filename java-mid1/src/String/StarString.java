package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packagename    : String
 * filename       : StarString
 * author         : sim-yuoseok
 * date           : 2025-11-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             nOTE
 * -----------------------------------------------------------
 * 2025-11-15        sim-yuoseok       최초 생성
 */
public class StarString {
    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            // 공백
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            // 별
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
