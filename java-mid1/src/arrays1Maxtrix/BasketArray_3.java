package arrays1Maxtrix;

import java.io.*;

/**
 * packageName    : arrays1Maxtrix
 * fileName       : BasketArray_3
 * author         : sim-yuoseok
 * date           : 2025-07-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-07-20        sim-yuoseok       최초 생성
 */

/*
5 4
1 2
3 4
1 4
2 2
* */

public class BasketArray_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        int [] basket = new  int [n + 1];

        for (int i = 1; i <= n; i++) {
            basket[i] = i;
        }

        for (int t = 1; t <= m; t++) {
            String[] input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]); // 이게 명령에서의 시작
            int j = Integer.parseInt(input[1]); // 이게 명령에서의 끝

            while (i < j) {
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;
            }
        }

        for (int i = 1; i <= n; i++) {
            bw.write(basket[i] + " ");
        }
        bw.flush();
        bw.close();

    }
}

