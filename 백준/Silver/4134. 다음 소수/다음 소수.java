import java.io.*;

public class Main {
    private static boolean isPrime(long input) {
        if (input == 0 || input == 1) {
            return false;
        }
        for (long i = 2; i*i <= input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static long getPrime(long input) {
        long result = input;
        while (!isPrime(result)) {
            result++;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        long[] nums = new long[size];
        for (int i = 0; i < size; i++) {
            nums[i] = Long.parseLong(br.readLine());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (long num : nums) {
            bw.write(getPrime(num) + "\n");
        }
        bw.flush();
        bw.close();
    }
}