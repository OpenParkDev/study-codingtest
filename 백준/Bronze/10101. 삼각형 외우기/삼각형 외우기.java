import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if ((a+b+c) != 180) {
            bw.write("Error");
        }
        else if ((a == 60) && (b == 60) && (c == 60)) {
            bw.write("Equilateral");
        }
        else if ((a != b) && (b != c) && (a != c)) {
            bw.write("Scalene");
        }
        else {
            bw.write("Isosceles");
        }
        bw.flush();
        bw.close();
    }
}