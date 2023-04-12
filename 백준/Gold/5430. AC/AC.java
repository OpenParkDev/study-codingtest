import java.io.*;

public class Main {
    private static String toStrFormat(int front, int tail, int[] nums, boolean isReverse) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (tail >= front) {
            if (isReverse) {
                for (int i = tail; i > front; i--) {
                    sb.append(nums[i]).append(",");
                }
                sb.append(nums[front]);
            }
            else {
                for (int i = front; i < tail; i++) {
                    sb.append(nums[i]).append(",");
                }
                sb.append(nums[tail]);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static int[] toArray(int numSize, String nums) {
        int[] arr = new int[numSize];
        if (numSize == 0) {
            return arr;
        }
        int num = 0;
        for (int i = 1, j = 0; i < nums.length(); i++) {
            char c = nums.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            }
            else {
                arr[j++] = num;
                num = 0;
            }
        }
        return arr;
    }

    private static String getResult(String ops, int[] nums) {
        int front = 0;
        int tail = nums.length - 1;
        int countR = 0;
        for (int i = 0; i < ops.length(); i++) {
            char c = ops.charAt(i);
            if (c == 'R') {
                countR++;
            }
            else if (c == 'D') {
                if (tail < front) {
                    return "error";
                }

                if (countR % 2 == 0) {
                    front++;
                }
                else {
                    tail--;
                }
            }
        }
        return toStrFormat(front, tail, nums, (countR % 2 != 0));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputSize; i++) {
            String ops = br.readLine();
            int numSize = Integer.parseInt(br.readLine());
            int[] nums = toArray(numSize, br.readLine());
            sb.append(getResult(ops, nums)).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}