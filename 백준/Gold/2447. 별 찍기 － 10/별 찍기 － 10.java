import java.io.*;
import java.util.*;

public class Main {
    private static void fillBlank(String[][] mat) {
        for (String[] row : mat) {
            Arrays.fill(row, " ");
        }
    }

    private static void fillSquare(String[][] mat, int x, int y, int size) {
        if (size == 3) {
            for (int i = x; i < x+size; i += size/3) {
                for (int j = y; j < y+size; j += size/3) {
                    if ((i != x+size/3) || (j != y+size/3)) {
                        mat[i][j] = "*";
                    }
                }
            }
            return;
        }
        for (int i = x; i < x+size; i += size/3) {
            for (int j = y; j < y+size; j += size/3) {
                if ((i != x+size/3) || (j != y+size/3)) {
                    fillSquare(mat, i, j, size/3);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        String[][] result = new String[size][size];
        fillBlank(result);
        fillSquare(result, 0, 0, size);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String[] row : result) {
            for (String block : row) {
                bw.write(block);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}