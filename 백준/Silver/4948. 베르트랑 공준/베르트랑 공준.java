import java.io.*;

public class Main {
    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int getPrimeCount(int num) {
        int count = 0;
        for (int i = num+1; i <= num*2; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while (!(line = br.readLine()).equals("0")) {
            int count = getPrimeCount(Integer.parseInt(line));
            sb.append(count).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}