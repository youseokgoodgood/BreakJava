package iter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : iter
 * fileName       : Stars1
 * author         : wnsgh
 * date           : 2025-05-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-05-17        wnsgh       최초 생성
 */
public class Stars2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n-(i+1); k++){
                System.out.print(" ");
            }
           for (int j = 0; j < i+1; j++){
               System.out.print("*");
           }
            System.out.println();
        }

    }
}
