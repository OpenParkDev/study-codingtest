import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] divisors = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            divisors[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(divisors);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (size % 2 == 0) {
            bw.write(String.valueOf(divisors[0]*divisors[size-1]));
        }
        else {
            bw.write(String.valueOf(divisors[size/2]*divisors[size/2]));
        }
        bw.flush();
        bw.close();
    }
}