package iter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : iter
 * fileName       : Nbyte
 * author         : wnsgh
 * date           : 2025-05-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-05-08        wnsgh       최초 생성
 */
public class N_byte {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder s = new StringBuilder("long");

        for(int i = 1; i < n/4; i++) {
            s.append(" long");
        }
        System.out.println(s.append(" int"));
    }
}
