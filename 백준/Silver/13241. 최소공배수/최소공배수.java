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
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(a*b / getGCD(a, b)));
        bw.flush();
        bw.close();
    }
}