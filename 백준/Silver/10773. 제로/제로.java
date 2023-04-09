import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());
        int[] records = new int[inputSize];
        int idx = 0;
        int sum = 0;
        for (int i = 0; i < inputSize; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                sum -= records[--idx];
            }
            else {
                records[idx++] = num;
                sum += num;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}