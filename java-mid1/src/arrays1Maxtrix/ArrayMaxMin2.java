package arrays1Maxtrix;

import java.io.*;

/**
 * packageName: arrays1Maxtrix
 * fileName: ArrayMaxMin
 * author: 심유석
 * date: 2025-05-24
 * description:
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2025-05-24 심유석 최초 생성
 *
 3
 29
 38
 12
 57
 74
 40
 85
 61
 */
public class ArrayMaxMin2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int i = 0;
        int max = Integer.MIN_VALUE;
        int cnt = 0;

        while (i < 9){
           int n = Integer.parseInt(br.readLine());

            if(n > max){
                max = n;
                cnt = i;
            }

            i++;
        }

        bw.write(max +"\n");
        bw.write((cnt+1)+"\n");
        bw.flush();
        bw.close();

    }
}
/*
 3
 29
 38
 12
 57
 74
 40
 85
 61
*
* */