import java.io.*;

public class Main {
    private static long getGCD(long a, long b) {
        if (a == 0) {
            return b;
        }
        return getGCD(b%a, a);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        long[] trees = new long[size];
        for (int i = 0; i < size; i++) {
            trees[i] = Long.parseLong(br.readLine());
        }

        long[] dists = new long[size-1];
        for (int i = 1; i < size; i++) {
            dists[i-1] = trees[i]-trees[i-1];
        }

        long interval = dists[0];
        for (long dist : dists) {
            interval = getGCD(interval, dist);
        }

        long count = ((trees[size-1]-trees[0])/interval + 1) - size;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}