package String;

import java.io.*;

/**
 * packageName    : String
 * fileName       : FirstAndLastString
 * author         : sim-yuoseok
 * date           : 2025-10-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-10-30        sim-yuoseok       최초 생성
 */
public class FirstAndLastString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            bw.write(s.charAt(0) + "" + s.charAt(s.length() - 1) + "\n");
        }

        bw.flush();
        bw.close();

    }
}
