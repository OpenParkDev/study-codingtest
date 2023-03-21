import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int height = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < height; i++) {
            for (int j = 1; j < height-i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 1+2*i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = height-2; i >= 0; i--) {
            for (int j = 1; j < height-i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < 1+2*i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}