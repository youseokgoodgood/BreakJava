package String;

import java.io.*;

/**
 * packageName    : String
 * fileName       : NumSum
 * author         : sim-yuoseok
 * date           : 2025-11-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-01        sim-yuoseok       최초 생성
 */
public class NumSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(str[i]);
            sum += num;
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}
