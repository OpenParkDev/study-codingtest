import java.io.*;

public class Main {
    private static int[] matrix;
    private static int size;

    private static boolean checkCross(int i, int j) {
        for (int row = size; row > i; row--) {
            int col = matrix[row];
            if ((row - col == i - j) || (row + col == i + j)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCol(int i, int j) {
        for (int row = size; row > i; row--) {
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
        for (int j = size; j > 0; j--) {
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
        size = Integer.parseInt(br.readLine());
        matrix = new int[size+1];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(solveNQueen(size)));
        bw.flush();
        bw.close();
    }
}