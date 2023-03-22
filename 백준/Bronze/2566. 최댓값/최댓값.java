import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        String pos = "";
        for (int i = 1; i <= 9; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 1; j <= 9; j++) {
                int target = Integer.parseInt(row[j-1]);
                if (target > max) {
                    max = target;
                    pos = i + " " + j;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(max + "\n");
        bw.write(pos);
        bw.flush();
        bw.close();
    }
}