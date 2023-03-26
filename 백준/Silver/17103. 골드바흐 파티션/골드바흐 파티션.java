import java.io.*;
import java.util.Arrays;

public class Main {
    private static boolean[] prime = new boolean[1000001];

    private static void getPrime() {
        Arrays.fill(prime, true);
        for (int i = 2; i < prime.length; i++) {
            if (prime[i]) {
                for (int j = i*2; j < prime.length; j += i) {
                    prime[j] = false;
                }
            }
        }
    }

    private static int getPartitionCount(int num) {
        int count = 0;
        for (int i = 2; i <= num/2; i++) {
            if (prime[i] && prime[num-i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        getPrime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int count = getPartitionCount(Integer.parseInt(br.readLine()));
            sb.append(count).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}