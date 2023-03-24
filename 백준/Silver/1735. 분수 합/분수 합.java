import java.io.*;

public class Main {
    private static int getGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return getGCD(b%a, a);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        
        int n1 = Integer.parseInt(input1[0]);
        int d1 = Integer.parseInt(input1[1]);
        int n2 = Integer.parseInt(input2[0]);
        int d2 = Integer.parseInt(input2[1]);
        
        int n = n1*d2 + n2*d1;
        int d = d1*d2;
        int gcd = getGCD(n, d);
        n /= gcd;
        d /= gcd;
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(n + " " + d);
        bw.flush();
        bw.close();
    }
}