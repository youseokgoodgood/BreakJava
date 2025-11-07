package String;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : String
 * fileName       : DialWordTime
 * author         : sim-yuoseok
 * date           : 2025-11-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-07        sim-yuoseok       최초 생성
 */
public class DialWordTime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = br.readLine().toCharArray();
        int time = 0;

        Map<Character, Integer> dialMap = new HashMap<>();
        dialMap.put('A', 3); dialMap.put('B', 3); dialMap.put('C', 3);
        dialMap.put('D', 4); dialMap.put('E', 4); dialMap.put('F', 4);
        dialMap.put('G', 5); dialMap.put('H', 5); dialMap.put('I', 5);
        dialMap.put('J', 6); dialMap.put('K', 6); dialMap.put('L', 6);
        dialMap.put('M', 7); dialMap.put('N', 7); dialMap.put('O', 7);
        dialMap.put('P', 8); dialMap.put('Q', 8); dialMap.put('R', 8); dialMap.put('S', 8);
        dialMap.put('T', 9); dialMap.put('U', 9); dialMap.put('V', 9);
        dialMap.put('W', 10); dialMap.put('X', 10); dialMap.put('Y', 10); dialMap.put('Z', 10);

        for (char ch : chars) {
            time += dialMap.get(ch);
        }

        bw.write(String.valueOf(time));
        bw.flush();
        bw.close();
    }
}
