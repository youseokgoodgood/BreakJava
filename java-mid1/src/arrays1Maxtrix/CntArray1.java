package arrays1Maxtrix;

import java.io.*;

/**
 * packageName    : arrays1Maxtrix
 * fileName       : CntArray1
 * author         : wnsgh
 * date           : 2025-05-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-05-18        wnsgh       최초 생성
 */
public class CntArray1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        String[] strs = br.readLine().split(" ");
        String v = br.readLine();

        for(int i = 0; i < n; i++){
            if(strs[i].equals(v)){
                cnt++;
            }
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();


    }
}
