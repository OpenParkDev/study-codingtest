import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] nums = new int[size];

        int sum = 0;
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }
        Arrays.sort(nums);

        List<Integer> freqs = new ArrayList<>();
        int max_freq = 0;
        int max_num = nums[0];
        int curr_freq = 1;
        for (int i = 0; i < size-1; i++) {
            if (nums[i] == nums[i+1]) {
                curr_freq++;
            }
            else {
                curr_freq = 1;
            }
            if (curr_freq > max_freq) {
                freqs.clear();
                max_num = nums[i];
                max_freq = curr_freq;
            }
            else if (curr_freq == max_freq) {
                freqs.add(nums[i]);
            }
        }
        if (!freqs.isEmpty()) {
            Collections.sort(freqs);
            max_num = freqs.get(0);
        }
        
        int avg = Math.round((float) sum/size);
        int median = nums[size/2];
        int range = nums[size-1] - nums[0];
        int mode = max_num;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(avg + "\n" + median + "\n" + mode + "\n" + range);
        bw.flush();
        bw.close();
    }
}