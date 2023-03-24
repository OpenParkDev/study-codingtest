import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long t = Long.parseLong(br.readLine());

        long num, sq;
        boolean isSosu;
        while (t-- > 0) {
            num = Long.parseLong(br.readLine());

            if (num < 2L) {
                sb.append("2").append("\n");
                continue;
            }

            while (true) {
                isSosu = true;
                for (long l=2L; l*l<=num; l++) {
                    if (num % l == 0L) {
                        isSosu = false;
                        break;
                    }
                }
                if (isSosu) {
                    sb.append(num).append("\n");
                    break;
                }
                ++num;
            }
        }
        System.out.print(sb.toString());
    }
}