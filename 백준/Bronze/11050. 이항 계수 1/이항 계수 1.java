import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int getCases(int n, int k) {
        int cases = 1;
        for (int i = 0; i < k; i++) {
            cases *= n - i;
        }
        return cases;
    }

    private static int getFactorial(int n) {
        int facto = 1;
        for (int i = 2; i <= n; i++) {
            facto *= i;
        }
        return facto;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(getCases(n, k)/getFactorial(k)));
        bw.flush();
        bw.close();
    }
}