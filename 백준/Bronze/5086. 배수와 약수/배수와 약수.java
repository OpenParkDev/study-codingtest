import java.io.*;
import java.util.*;

public class Main {
    private static String getPara(String[] nums) {
        int n1 = Integer.parseInt(nums[0]);
        int n2 = Integer.parseInt(nums[1]);
        if ((n2%n1) == 0) {
            return "factor";
        }
        else if ((n1%n2) == 0) {
            return "multiple";
        }
        return "neither";
    }

    private static String[] getResults(List<String> arr) {
        String[] results = new String[arr.size()];
        for (int i = 0; i < results.length; i++) {
            String[] nums = arr.get(i).split(" ");
            results[i] = getPara(nums);
        }
        return results;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> arr = new ArrayList<>();
        String line;
        while (!(line = br.readLine()).equals("0 0")) {
            arr.add(line);
        }

        String[] results = getResults(arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String result : results) {
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}