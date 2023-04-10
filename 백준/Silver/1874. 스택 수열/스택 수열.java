import java.io.*;
import java.util.Stack;

public class Main {
    private static String getOps(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int top = 0, min = 0;

        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            if (!stack.isEmpty()) {
                top = stack.peek();
            }
            if (top <= num) {
                for (int i = min+1; i <= num; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
                if (num > min) {
                    min = num;
                }
            }
            else {
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());

        int[] nums = new int[inputSize];
        for (int i = 0; i < inputSize; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(getOps(nums));
        bw.flush();
        bw.close();
    }
}