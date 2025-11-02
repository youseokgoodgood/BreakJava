package String;

import java.io.*;

/**
 * packageName    : String
 * fileName       : WordCnt
 * author         : sim-yuoseok
 * date           : 2025-11-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-02        sim-yuoseok       최초 생성
 */

public class WordCnt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine().trim();

        if (line.isEmpty()) {
            bw.write("0");
        } else {
            String[] words = line.split("\\s+");
            bw.write(String.valueOf(words.length));
        }

        bw.flush();
        bw.close();
    }
}

