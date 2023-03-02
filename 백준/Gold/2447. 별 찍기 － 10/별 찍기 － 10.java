import java.io.*;
import java.util.*;

public class Main {
    private static char[][] matrix;

    private static void fillBlank() {
        for (char[] row : matrix) {
            Arrays.fill(row, ' ');
        }
    }

    private static void fillStar(int x, int y, int size) {
        if (size == 1) {
            matrix[x][y] = '*';
            return;
        }
        for (int i = x; i < x+size; i += size/3) {
            for (int j = y; j < y+size; j += size/3) {
                if ((i != x+size/3) || (j != y+size/3)) {
                    fillStar(i, j, size/3);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        matrix = new char[size][size];
        fillBlank();
        fillStar(0, 0, size);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (char[] row : matrix) {
            bw.write(row);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}