import java.io.*;

public class Main {
    private static boolean[] col;
    private static boolean[] cross_plus;
    private static boolean[] cross_minus;
    private static int size;

    private static boolean checkCross(int i, int j) {
        return !cross_plus[i + j + size - 1] && !cross_minus[i - j + size - 1];
    }

    private static boolean checkCol(int j) {
        return !col[j];
    }

    private static int solveNQueen(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        for (int j = size; j > 0; j--) {
            if (checkCol(j) && checkCross(n, j)) {
                col[j] = true;
                cross_plus[n+j+size-1] = true;
                cross_minus[n-j+size-1] = true;
                count += solveNQueen(n-1);
                col[j] = false;
                cross_plus[n+j+size-1] = false;
                cross_minus[n-j+size-1] = false;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        col = new boolean[size+1];
        cross_plus = new boolean[size*3];
        cross_minus = new boolean[size*3];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(solveNQueen(size)));
        bw.flush();
        bw.close();
    }
}