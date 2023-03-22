import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizes = br.readLine().split(" ");
        int n = Integer.parseInt(sizes[0]);
        int m = Integer.parseInt(sizes[1]);
        int[][] result = new int[n][m];
        for (int i = 0; i < n*2; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                if (i >= n ) {
                    result[i-n][j] += Integer.parseInt(input[j]);
                }
                else {
                    result[i][j] = Integer.parseInt(input[j]);
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bw.write(result[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}