import java.io.*;

public class Main {
    private static String getChange(String price) {
        int remain = Integer.parseInt(price);
        int[] coin = new int[] {25, 10, 5, 1};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int change = remain / coin[i];
            remain -= change * coin[i];
            sb.append(change).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(getChange(br.readLine())).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}