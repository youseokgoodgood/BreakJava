package arrays1Maxtrix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * packageName: arrays1Maxtrix
 * fileName: BasketArray_1
 * author: 심유석
 * date: 2025-05-28
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-05-28 심유석 최초 생성
 */

/*
* 5 4
1 2 3
3 4 4
1 4 1
2 2 2
*
* */
public class BasketArray_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] basket = new int[n+1];

        for (int t = 0; t < m; t++) {
            String[] input = br.readLine().split(" ");
            int i = Integer.parseInt(input[0]);
            int j = Integer.parseInt(input[1]);
            int k = Integer.parseInt(input[2]);

            for (int x = i; x <= j; x++) {
                basket[x] = k;
            }
        }

        for (int i = 1; i <= n; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
