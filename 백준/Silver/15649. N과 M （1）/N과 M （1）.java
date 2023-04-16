import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static char[] series;
    private static boolean[] isChecked;

    private static String getSeries(int n, int m, int idx) {
        if (idx == m) {
            series[2*m - 1] = '\n';
            return String.valueOf(series);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (!isChecked[i]) {
                isChecked[i] = true;
                series[2*idx] = (char) (i + '0');
                series[2*idx + 1] = ' ';
                sb.append(getSeries(n, m, idx+1));
                isChecked[i] = false;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        series = new char[2*m];
        isChecked = new boolean[n+1];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(getSeries(n, m, 0));
        bw.flush();
        bw.close();
    }
}