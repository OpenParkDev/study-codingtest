import java.io.*;

public class Main {
    private static String getSmaller(String cond, String arr) {
        String[] info = cond.split(" ");
        int x = Integer.parseInt(info[1]);
        String[] nums = arr.split(" ");
        StringBuilder result = new StringBuilder();
        boolean isFirst = true;
        for (int i = 0; i < nums.length; i++) {
            int elem = Integer.parseInt(nums[i]);
            if (elem < x) {
                if (!isFirst) {
                    result.append(" ");
                }
                result.append(elem);
                isFirst = false;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cond = br.readLine();
        String arr = br.readLine();

        String result = getSmaller(cond, arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}