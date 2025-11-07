package String;

import java.io.*;

/**
 * packageName    : String
 * fileName       : RepeatToString
 * author         : sim-yuoseok
 * date           : 2025-11-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-05        sim-yuoseok       최초 생성
 */
public class RepeatToString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] strs = br.readLine().split(" ");
            int r = Integer.parseInt(strs[0]);
            String s = strs[1];

            for(char p : s.toCharArray()){
                bw.write(String.valueOf(p).repeat(r));
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
