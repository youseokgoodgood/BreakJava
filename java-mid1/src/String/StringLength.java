package String;

import java.io.*;

/**
 * packageName    : String
 * fileName       : StringLength
 * author         : sim-yuoseok
 * date           : 2025-07-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-07-26        sim-yuoseok       최초 생성
 */
public class StringLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        bw.write(s.length()+"\n");
        bw.flush();
        bw.close();

    }
}
