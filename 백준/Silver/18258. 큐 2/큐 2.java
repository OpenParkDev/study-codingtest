import java.io.*;

public class Main {
    private static int[] queue;
    private static int tail = 0;
    private static int head = 0;

    public static void push(int num) {
        queue[head++] = num;
    }

    public static int pop() {
        if (empty() == 1) {
            return -1;
        }
        return queue[tail++];
    }

    public static int size() {
        return head - tail;
    }

    public static int empty() {
        if (head == tail) {
            return 1;
        }
        return 0;
    }

    public static int front() {
        if (empty() == 1) {
            return -1;
        }
        return queue[tail];
    }

    public static int back() {
        if (empty() == 1) {
            return -1;
        }
        return queue[head-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());
        queue = new int[inputSize];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputSize; i++) {
            String[] ops = br.readLine().split(" ");
            switch (ops[0]) {
                case "push":
                    push(Integer.parseInt(ops[1]));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
                default:
                    break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}