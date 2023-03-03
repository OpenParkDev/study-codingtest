import java.io.*;
import java.util.*;

public class Main {
    private static List<Integer> getFactors(int num) {
        List<Integer> factors = new ArrayList<>();
        int target = num;
        int divisor = 2;
        while (target != 1) {
            if ((target%divisor) == 0) {
                factors.add(divisor);
                target /= divisor;
            }
            else {
                divisor++;
            }
        }
        return factors;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        List<Integer> factors = getFactors(num);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int factor : factors) {
            bw.write(factor + "\n");
        }
        bw.flush();
        bw.close();
    }
}