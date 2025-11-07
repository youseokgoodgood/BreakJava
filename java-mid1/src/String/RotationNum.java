package String;

import java.io.*;

/**
 * packageName    : String
 * fileName       : RotationNum
 * author         : sim-yuoseok
 * date           : 2025-11-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-06        sim-yuoseok       최초 생성
 */
public class RotationNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(new StringBuilder(str[0]).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(str[0]).reverse().toString());

        bw.write("" + (Math.max(a, b)));

        bw.flush();
        bw.close();


    }
}
