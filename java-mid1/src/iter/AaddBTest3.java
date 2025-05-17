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
5
1 1
2 3
3 4
9 8
5 2
 */
public class AaddBTest3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            String[] strs = br.readLine().split(" ");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);

            bw.write("Case #"+(i+1)+": "+ ""+a+" + "+""+b+" = " +(a+b) + "\n");
        }

        bw.flush();
        bw.close();
    }
    
}
