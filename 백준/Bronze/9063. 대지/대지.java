import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int x_min = 10000;
        int y_min = 10000;
        int x_max = -10000;
        int y_max = -10000;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] pos = br.readLine().split(" ");
            int x_curr = Integer.parseInt(pos[0]);
            int y_curr = Integer.parseInt(pos[1]);

            if (x_curr > x_max) {
                x_max = x_curr;
            }
            if (x_curr < x_min) {
                x_min = x_curr;
            }
            if (y_curr > y_max) {
                y_max = y_curr;
            }
            if (y_curr < y_min) {
                y_min = y_curr;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (x_max == x_min && y_max == y_min) {
            bw.write(String.valueOf(0));
        }
        else {
            bw.write(String.valueOf((x_max - x_min) * (y_max - y_min)));
        }
        bw.flush();
        bw.close();
    }
}