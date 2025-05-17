package iter;

import java.io.*;

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
1 1
2 3
3 4
9 8
5 2
0 0
 */
public class AaddBTest5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";

        while ((line = br.readLine()) != null){
            String[] strs = line.split(" ");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);

            bw.write((a+b) + "\n");
        }

        bw.flush();
        bw.close();
    }
    
}
