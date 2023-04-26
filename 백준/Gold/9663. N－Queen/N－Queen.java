import java.io.*;

public class Main {
    private static int[] matrix;

    private static boolean checkCross(int i, int j) {
        for (int row = matrix.length-1; row > i; row--) {
            int col = matrix[row];
            if ((row - col == i - j) || (row + col == i + j)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCol(int i, int j) {
        for (int row = matrix.length-1; row > i; row--) {
            int col = matrix[row];
            if (col == j) {
                return false;
            }
        }
        return true;
    }

    private static int solveNQueen(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        for (int j = 1; j < matrix.length; j++) {
            if (checkCol(n, j) && checkCross(n, j)) {
                matrix[n] = j;
                count += solveNQueen(n-1);
                matrix[n] = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        matrix = new int[n+1];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(solveNQueen(n)));
        bw.flush();
        bw.close();
    }
}