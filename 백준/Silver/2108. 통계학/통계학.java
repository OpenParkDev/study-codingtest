import java.io.*;

public class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] freqs = new int[8001];
        for (int i = 0; i < size; i++) {
            freqs[Integer.parseInt(br.readLine()) + 4000]++;
        }

        int sum = 0, median = -5000, mode = -5000, range = -5000;
        boolean isSecond = false; int max_freq = 0;
        int count = 0;
        for (int i = 0; i < freqs.length; i++) {
            int curr_freq = freqs[i];
            if (curr_freq > 0) {
                int num = i - 4000;
                if (curr_freq == max_freq && isSecond) {
                    isSecond = false;
                    mode = num;
                }
                if (curr_freq > max_freq) {
                    isSecond = true;
                    max_freq = curr_freq;
                    mode = num;
                }
                count += curr_freq;
                sum += curr_freq * num;
                if (count >= (size/2 + 1) && median == -5000) {
                    median = num;
                }
                if (count >= 1 && range == -5000) {
                    range = -num;
                }
                if (count == size) {
                    range += num;
                    break;
                }
            }
        }
        int avg = Math.round((float) sum/size);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(avg + "\n" + median + "\n" + mode + "\n" + range);
        bw.flush();
        bw.close();
    }
}