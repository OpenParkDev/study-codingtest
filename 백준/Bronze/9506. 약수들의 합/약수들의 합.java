import java.io.*;

public class Main {
    private static String getPara(int num) {
        StringBuilder paragraph = new StringBuilder();
        paragraph.append(num).append(" = ");
        
        int divisor = 1;
        int sum_divisor = 0;
        while (divisor < num) {
            if ((num%divisor) == 0) {
                if (sum_divisor != 0) {
                    paragraph.append(" + ");
                }
                paragraph.append(divisor);
                sum_divisor += divisor;
            }
            divisor++;
        }
        
        if (sum_divisor != num) {
            return num + " is NOT perfect.";
        }
        return paragraph.toString();
    }

    private static String[] getResults(String str) {
        String[] nums = str.split(" ");
        String[] results = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            results[i] = getPara(Integer.parseInt(nums[i]));
        }
        return results;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while (!(line = br.readLine()).equals("-1")) {
            sb.append(line).append(" ");
        }

        String[] results = getResults(sb.toString());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String result : results) {
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}