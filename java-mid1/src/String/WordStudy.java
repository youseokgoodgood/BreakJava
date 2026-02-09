package String;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * packageName    : String
 * fileName       : WordStudy
 * author         : sim-yuoseok
 * date           : 2025-11-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-09        sim-yuoseok       최초 생성
 */
public class WordStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] str = br.readLine().toUpperCase().toCharArray();

       for(Character s: str){
           map.put(s, map.getOrDefault(s, 0) + 1);
       }

        int max = -1;
        char result = '?';

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            } else if (entry.getValue() == max) {
                result = '?';
            }
        }

        bw.write(result + "\n");


       bw.flush();
       bw.close();

    }
}
