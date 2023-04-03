import java.io.*;

public class Main {
    private static int parseDecimal(String input, String arith) {
        double base = Double.parseDouble(arith);
        double digit = 0;
        int result = 0;
        for (int i = input.length() - 1 ; i >= 0; i--) {
            char c = input.charAt(i);
            if (c >= 65) {
                c -= 55;
            }
            else {
                c -= 48;
            }
            result += c * Math.pow(base, digit);
            digit++;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(parseDecimal(input[0], input[1])));
        bw.flush();
        bw.close();
    }
}