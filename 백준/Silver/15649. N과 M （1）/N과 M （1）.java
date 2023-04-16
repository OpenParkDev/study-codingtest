import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static String getSeries(int n, int m, String prev) {
        if (m == 0) {
            return prev + "\n";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (!prev.contains(Integer.toString(i))) {
                sb.append(getSeries(n, m-1, prev + i + " "));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(getSeries(n, m, ""));
        bw.flush();
        bw.close();
    }
}