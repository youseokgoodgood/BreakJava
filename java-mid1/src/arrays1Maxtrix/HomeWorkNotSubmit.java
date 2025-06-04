package arrays1Maxtrix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName: arrays1Maxtrix
 * fileName: HomeWorkNotSubmit
 * author: 심유석
 * date: 2025-06-03
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-06-03        심유석       최초 생성
 */

/*
*
3
1
4
5
7
9
6
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
*/
public class HomeWorkNotSubmit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));

        boolean[] submitted = new boolean[31];

        for(int i = 1; i <= 28; i++){
            int n = Integer.parseInt(br.readLine());
            submitted[n] = true;

        }

        for (int i = 1; i < submitted.length; i++) {
            if (!submitted[i]) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
