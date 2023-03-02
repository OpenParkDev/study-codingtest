import java.io.*;

public class Main {
    private static boolean isPrime(int number) {
        int m = number-1;
        while (m > 1) {
            if ((number%m) == 0) {
                return false;
            }
            m--;
        }
        return true;
    }

    private static String getPair(String num) {
        int target = Integer.parseInt(num);
        int big = target/2;
        int small = big;
        while (!isPrime(big) || !isPrime(small)) {
            big++;
            small--;
        }
        String result = Integer.toString(small);
        result += " " + big;
        return result;
    }

    private static String[] getResults(String[] nums) {
        String[] results = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            results[i] = getPair(nums[i]);
        }
        return results;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] nums = new String[Integer.parseInt(line)];
        int idx = 0;
        while ((line = br.readLine()) != null) {
            nums[idx] = line;
            idx++;
        }

        String[] results = getResults(nums);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String result : results) {
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}