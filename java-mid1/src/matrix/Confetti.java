package matrix;

import java.io.*;
import java.util.*;

/**
 * packageName    : matrix
 * fileName       : Confetti
 * author         : sim-yuoseok
 * date           : 2026-02-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2026-02-08        sim-yuoseok       최초 생성
 */
public class Confetti {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine().trim());

       // 도화지 100x100 (0~99)
       int[][] paper = new int[100][100];

       for (int k = 0; k < n; k++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           int x = Integer.parseInt(st.nextToken()); // 가로(열)
           int y = Integer.parseInt(st.nextToken()); // 세로(행)

           // (x, y)가 왼쪽 아래. 10x10 영역을 1로 표시
           for (int i = y; i < y + 10; i++) {          // 세로(y) -> 행
               for (int j = x; j < x + 10; j++) {      // 가로(x) -> 열
                   paper[i][j] = 1;
               }
           }
       }

       int area = 0;
       for (int i = 0; i < 100; i++) {
           for (int j = 0; j < 100; j++) {
               if (paper[i][j] == 1) area++;
           }
       }

       System.out.println(area);
    }
}
