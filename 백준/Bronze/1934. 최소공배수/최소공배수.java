import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int mul_a = a;
            int mul_b = b;
            while (mul_a != mul_b) {
                if (mul_a > mul_b) {
                    mul_b += b;
                }
                else {
                    mul_a += a;
                }
            }
            output[i] = mul_a;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int num : output) {
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
    }
}