package matrix;

import java.io.*;

/**
 * packageName    : matrix
 * fileName       : MatrixPlus
 * author         : sim-yuoseok
 * date           : 2025-11-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-16        sim-yuoseok       최초 생성
 */
import java.io.*;

public class MatrixAddition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //n*m 2차원배열 생성을 위한 입력 받기
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]);
        int m = Integer.parseInt(strs[1]);

        //2차원 배열 생성
        int[][] a = readMatrix(br, n, m);
        int[][] b = readMatrix(br, n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write((a[i][j] + b[i][j]) + " ");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    //행렬을 입력 받아주는 메서드
    private static int[][] readMatrix(BufferedReader br, int n, int m) throws IOException {
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        return matrix;
    }
}

