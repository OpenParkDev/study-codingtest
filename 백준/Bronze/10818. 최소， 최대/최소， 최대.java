import java.io.*;

public class Main {
    private static String getMinMax(String arr) {
        String[] nums = arr.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String num : nums) {
            int number = Integer.parseInt(num);
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        return min + " " + max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();
        String arr = br.readLine();

        String result = getMinMax(arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}