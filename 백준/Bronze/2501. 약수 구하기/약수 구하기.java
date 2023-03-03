import java.io.*;

public class Main {
    private static int getDivisor(String[] cond) {
        int target = Integer.parseInt(cond[0]);
        int order = Integer.parseInt(cond[1]);
        int count = 0;
        int divisor = 0;
        while ((count != order) && (divisor <= target)) {
            divisor++;
            if ((target%divisor) == 0) {
                count++;
            }
        }
        return (count == order) ? divisor : 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cond = br.readLine().split(" ");

        int result = getDivisor(cond);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}