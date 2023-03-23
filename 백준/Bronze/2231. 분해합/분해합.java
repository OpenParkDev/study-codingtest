import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());

        int result = 1;
        while (result < target) {
            int sum = result;
            for (int i = 10; i <= result*10; i *= 10) {
                sum += (result % i) / (i / 10);
            }
            if (sum == target) {
                break;
            }
            result++;
        }
        if (result == target) {
            result = 0;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}