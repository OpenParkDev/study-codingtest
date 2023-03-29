import java.io.*;

public class Main {
    private static int getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n*getFactorial(n-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(getFactorial(n)));
        bw.flush();
        bw.close();
    }
}