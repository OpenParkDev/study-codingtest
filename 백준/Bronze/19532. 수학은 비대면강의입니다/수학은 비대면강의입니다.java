import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int f = Integer.parseInt(input[5]);

        int x = ((c * e) - (f * b)) / ((a * e) - (d * b));
        int y = ((c * d) - (f * a)) / ((b * d) - (e * a));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }
}