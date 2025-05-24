package arrays1Maxtrix;

import java.io.*;
import java.util.Arrays;

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
 * 5
 * 20 10 35 30 7
 */
public class ArrayMaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < strs.length; i++){
            int num = Integer.parseInt(strs[i]);
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}
