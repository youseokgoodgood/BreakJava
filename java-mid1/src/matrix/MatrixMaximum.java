package matrix;

import java.io.*;

/**
 * packageName    : matrix
 * fileName       : MatrixMaximum
 * author         : sim-yuoseok
 * date           : 2025-11-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-11-16        sim-yuoseok       최초 생성
 */
public class MatrixMaximum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] matrixMaximum = readMatrix(br,9,9);
        int temp = Integer.MIN_VALUE;
        int a = 0;
        int b = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(temp < matrixMaximum[i][j]) {
                    temp = matrixMaximum[i][j];
                    a = i;
                    b = j;
                }

            }
        }
        bw.write(temp+"\n");
        bw.write((a+1) + " " + (b+1) + "\n");

        bw.flush();
        bw.close();

    }

    public static int[][] readMatrix(BufferedReader br, int n, int m) throws IOException {
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
