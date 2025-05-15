package iter;

import java.io.*;

/**
 * packageName    : iter
 * fileName       : FastAPlusB
 * author         : wnsgh
 * date           : 2025-05-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-05-15        wnsgh       최초 생성
 */

/*
* 5
1 1
12 34
5 500
40 60
1000 1000

*
* */
public class FastAPlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            String[] strs = br.readLine().split(" ");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);
            bw.write((a + b) + "\n");
        }
        bw.flush();
        bw.close();

    }
}
