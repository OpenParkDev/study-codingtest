import java.io.*;

public class Main {
    private static String[][] matrix;

    private static int getMin(int x, int y) {
        int count_origin = 0;
        int count_reverse = 0;
        String start_origin = matrix[x][y];
        String start_reverse = (start_origin.equals("B")) ? "W" : "B";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (((i+j) % 2 == 0 && !start_origin.equals(matrix[i+x][j+y]))
                    || ((i+j) % 2 != 0 && start_origin.equals(matrix[i+x][j+y]))) {
                    count_origin++;
                }
                if (((i+j) % 2 == 0 && !start_reverse.equals(matrix[i+x][j+y]))
                        || ((i+j) % 2 != 0 && start_reverse.equals(matrix[i+x][j+y]))) {
                    count_reverse++;
                }
            }
        }
        return Math.min(count_origin, count_reverse);
    }

    private static int getAnswer() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= matrix.length-8; i++) {
            for (int j = 0; j <= matrix[0].length-8; j++) {
                int recolor = getMin(i, j);
                if (min > recolor) {
                    min = recolor;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        matrix = new String[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = br.readLine().split("");
        }

        int answer = getAnswer();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}