import java.io.*;

public class Main {
    private static String getBlank(int n) {
        if (n == 0) {
            return " ";
        }
        return " ".repeat((int) Math.pow(3, n));
    }

    private static String getCantor(int n) {
        if (n == 0) {
            return "-";
        }
        return getCantor(n - 1) + getBlank(n - 1) + getCantor(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            sb.append(getCantor(n)).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}