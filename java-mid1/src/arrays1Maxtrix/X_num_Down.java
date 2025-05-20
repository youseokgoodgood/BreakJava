package arrays1Maxtrix;

import java.io.*;
import java.util.Arrays;

/**
 * packageName    : arrays1Maxtrix
 * fileName       : XnumDown
 * author         : wnsgh
 * date           : 2025-05-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-05-20        wnsgh       최초 생성
 */

/*
* 10 5
1 10 4 9 2 3 8 5 7 6
*
* */
public class X_num_Down {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = br.readLine().split(" ");

        int n = Integer.parseInt(strs[0]);
        int x = Integer.parseInt(strs[1]);
        String[] nums = br.readLine().split(" ");


        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(nums[i]);
            if(num < x){
                bw.write(num + " ");
            }
        }

        bw.flush();
        bw.close();

    }
}
