import java.io.*;

public class Main {
    private static String[] flipNumber(String num1, String num2) {
        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();
        int diff = num1.length() - num2.length();
        if (diff > 0) {
            n1.append(num1);
            n2.append(num2);
        }
        else {
            n1.append(num2);
            n2.append(num1);
            diff *= -1;
        }
        n1.reverse();
        n2.reverse();
        n2.append("0".repeat(diff));
        return new String[] {n1.toString(), n2.toString()};
    }

    private static String getSum(String num1, String num2) {
        String[] nums = flipNumber(num1, num2);
        StringBuilder result = new StringBuilder();
        boolean surplus = false;
        for (int i = 0; i < nums[0].length(); i++) {
            int sum = nums[0].charAt(i) + nums[1].charAt(i) - 96;
            if (surplus) {
                sum++;
                surplus = false;
            }
            if (sum >= 10) {
                surplus = true;
                sum -= 10;
            }
            result.append(sum);
        }
        if (surplus) {
            result.append("1");
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(getSum(nums[0], nums[1]));
        bw.flush();
        bw.close();
    }
}