import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[] nums;
    private static int front;

    private static void adjustFront() {
        for (int i = 1; i < nums.length; i++) {
            int idx = front + i;
            if (idx >= nums.length) {
                idx -= nums.length;
            }
            if (nums[idx] != -1) {
                front = idx;
                break;
            }
        }
    }

    private static int getDistLeft(int targetIdx) {
        int dist = 0;
        for (int i = 0; i < nums.length; i++) {
            int idx = front + i;
            if (idx >= nums.length) {
                idx -= nums.length;
            }

            if (nums[idx] == -1) {
                continue;
            }
            if (idx == targetIdx) {
                break;
            }
            dist++;
        }
        return dist;
    }

    private static int getDistRight(int targetIdx) {
        int dist = 0;
        for (int i = 0; i < nums.length; i++) {
            int idx = front - i;
            if (idx < 0) {
                idx += nums.length;
            }

            if (nums[idx] == -1) {
                continue;
            }
            if (idx == targetIdx) {
                break;
            }
            dist++;
        }
        return dist;
    }

    private static int getMinMove(int targetIdx) {
        int move = 0;
        if (targetIdx != front) {
            int left = getDistLeft(targetIdx);
            int right = getDistRight(targetIdx);
            move = Math.min(left, right);
            front = targetIdx;
        }
        nums[front] = -1;
        adjustFront();
        return move;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputSize = Integer.parseInt(st.nextToken());
        int outputSize = Integer.parseInt(st.nextToken());
        nums = new int[inputSize];
        front = 0;

        st = new StringTokenizer(br.readLine());
        int result = 0;
        for (int i = 0; i < outputSize; i++) {
            int targetIdx = Integer.parseInt(st.nextToken())-1;
            result += getMinMove(targetIdx);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}