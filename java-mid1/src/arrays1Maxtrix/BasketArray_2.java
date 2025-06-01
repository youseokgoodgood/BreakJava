package arrays1Maxtrix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * packageName: arrays1Maxtrix
 * fileName: BasketArray_2
 * author: 심유석
 * date: 2025-06-01
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-06-01 심유석 최초 생성
 */

/*
5 4
1 2
3 4
1 4
2 2


3 1 4 2 5
*
* */
public class BasketArray_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");

        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        int[] basket = new int[n+1];

        for (int t = 1; t <= n; t++) {
            basket[t] = t;
        }

        for (int k = 1; k <= m; k++) {
            String[] input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);

            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;
        }

        for (int i = 1; i <= n; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
