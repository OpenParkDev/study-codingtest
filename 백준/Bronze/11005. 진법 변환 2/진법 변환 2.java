import java.io.*;

public class Main {
    private static String parseArithmetic(String input, String arith) {
        int decimal = Integer.parseInt(input);
        int base = Integer.parseInt(arith);
        int digit = 1;
        while (decimal >= Math.pow(base, digit)) {
            digit++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = digit-1; i >= 0; i--) {
            int multi = (int) Math.pow(base, i);
            int num = decimal / multi;
            decimal -= num * multi;
            if (num >= 10) {
                num += 55;
            }
            else {
                num += 48;
            }
            char c = (char) num;
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(parseArithmetic(input[0], input[1]));
        bw.flush();
        bw.close();
    }
}