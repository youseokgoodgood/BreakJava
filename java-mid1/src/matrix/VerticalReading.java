package matrix;

import java.io.*;

/**
 * packageName    : matrix
 * fileName       : VerticalReading
 * author         : sim-yuoseok
 * date           : 2025-11-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-19        sim-yuoseok       최초 생성
 */
public class VerticalReading {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = new String[5];  // 1차원 배열

        for (int i = 0; i < 5; i++) {
            lines[i] = br.readLine();
        }

        for (int j = 0; j < 15; j++) { // 세로 인덱스
            for (int i = 0; i < 5; i++) { // 줄 순서
                if (j < lines[i].length()) {
                    System.out.print(lines[i].charAt(j));
                }
            }
        }
    }
}
