import java.io.*;
import java.util.*;

public class Main {
    private static String getResult(String[] ops, String[] nums) {
        Deque<String> deque = new ArrayDeque<>();
        for (String num : nums) {
            if (!num.equals("")) {
                deque.add(num);
            }
        }

        int countR = 0;
        for (String op : ops) {
            if (op.equals("R")) {
                countR++;
            }
            else if (op.equals("D")) {
                if (deque.isEmpty()) {
                    return "error";
                }

                if (countR % 2 == 0) {
                    deque.pollFirst();
                }
                else {
                    deque.pollLast();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (!deque.isEmpty()) {
            if (countR % 2 != 0) {
                while (deque.size() > 1) {
                    sb.append(deque.pollLast()).append(",");
                }
            }
            else {
                while (deque.size() > 1) {
                    sb.append(deque.pollFirst()).append(",");
                }
            }
            sb.append(deque.poll());
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputSize; i++) {
            String[] ops = br.readLine().split("");
            int numSize = Integer.parseInt(br.readLine());
            String[] nums = br.readLine().split("[,\\[\\]]");
            sb.append(getResult(ops, nums)).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}