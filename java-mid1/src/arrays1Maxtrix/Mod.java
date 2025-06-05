package arrays1Maxtrix;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 * packageName: arrays1Maxtrix
 * fileName: Mod
 * author: 심유석
 * date: 2025-06-05
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-06-05 심유석 최초 생성
 */

/*
39
40
41
42
43
44
82
83
84
85
*
* */

public class Mod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));

        int[] temp = new int[11];
        int size = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            int mod = n % 42;
            boolean isDuplicate = false;

            for (int j = 0; j < size; j++) {
                if (temp[j] == mod) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[size++] = mod;
            }
        }

        bw.write(size + "\n");
        bw.flush();
        bw.close();

    }
}
