import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int idx = 0;
        int num = 665;
        while (idx < n) {
            num++;
            if (Integer.toString(num).contains("666")) {
                idx++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
    }
}