package arrays1Maxtrix;

import java.io.*;
import java.util.Arrays;

/**
 * packageName    : arrays1Maxtrix
 * fileName       : ArrayAvg
 * author         : sim-yuoseok
 * date           : 2025-07-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-07-23        sim-yuoseok       최초 생성
 */
/*
* 3
40 80 60
75.0
* */

public class ArrayAvg {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");

        int max = Arrays.stream(strs)
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            int score = Integer.parseInt(strs[i]);
            sum += ((double) score / max) * 100;
        }

        double avg = sum / n;

        bw.write(String.format("%.6f", avg));
        bw.flush();
        bw.close();
    }

}
