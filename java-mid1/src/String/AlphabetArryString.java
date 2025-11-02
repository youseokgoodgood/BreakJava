package String;

import java.io.*;
import java.util.*;

/**
 * packageName    : String
 * fileName       : AlphabetArryString
 * author         : sim-yuoseok
 * date           : 2025-11-02
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-02        sim-yuoseok       최초 생성
 */
public class AlphabetArryString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int[] indexArr = new int[26];
        Arrays.fill(indexArr, -1);

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int idx = ch - 'a';

            if (indexArr[idx] == -1) {
                indexArr[idx] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            bw.write(indexArr[i] + " ");
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
