import java.io.*;

public class Main {
    private static boolean isPrime(int num) {
        int divisor = 2;
        while (divisor < num) {
            if ((num%divisor) == 0) {
                return false;
            }
            divisor++;
        }
        return (num == 1) ? false : true;
    }

    private static String getNumOfPrime(String[] nums) {
        int count = 0;
        for (String num : nums) {
            if (isPrime(Integer.parseInt(num))) {
                count++;
            }
        }
        return Integer.toString(count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();
        String[] nums = br.readLine().split(" ");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(getNumOfPrime(nums));
        bw.flush();
        bw.close();
    }
}