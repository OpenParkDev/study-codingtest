import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[][] matrix;
    private static int[][] blanks;
    private static int blankSize;

    private static String toStrFormat() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                sb.append(matrix[i][j]);
                if (j != 8) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static boolean rowCheck(int x, int num) {
        for (int i = 0; i < 9; i++) {
            if (matrix[x][i] == num) {
                return false;
            }
        }
        return true;
    }

    private static boolean colCheck(int y, int num) {
        for (int i = 0; i < 9; i++) {
            if (matrix[i][y] == num) {
                return false;
            }
        }
        return true;
    }

    private static boolean boxCheck(int x, int y, int num) {
        int row = (x/3) * 3;
        int col = (y/3) * 3;
        for (int i = row; i <= row+2; i++) {
            for (int j = col; j <= col+2; j++) {
                if (matrix[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean solveSudoku(int idx) {
        if (idx == blankSize) {
            return true;
        }

        int x = blanks[idx][0];
        int y = blanks[idx][1];


        for (int i = 1; i <= 9; i++) {
            if (rowCheck(x, i) && colCheck(y, i) && boxCheck(x, y, i)) {
                matrix[x][y] = i;
                if (solveSudoku(idx+1)) {
                    return true;
                }
                matrix[x][y] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        matrix = new int[9][9];
        blanks = new int[81][2];
        blankSize = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) {
                    blanks[blankSize] = new int[] {i, j};
                    blankSize++;
                }
                matrix[i][j] = num;
            }
        }

        solveSudoku(0);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(toStrFormat());
        bw.flush();
        bw.close();
    }
}