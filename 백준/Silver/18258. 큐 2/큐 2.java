import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[] queue;
    private static int tail = 0;
    private static int head = 0;

    public static void push(int num) {
        queue[head++] = num;
    }

    public static int pop() {
        return (head == tail) ? -1 : queue[tail++];
    }

    public static int size() {
        return head - tail;
    }

    public static int empty() {
        return (head == tail) ? 1 : 0;
    }

    public static int front() {
        return (head == tail) ? -1 : queue[tail];
    }

    public static int back() {
        return (head == tail) ? -1 : queue[head-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());
        queue = new int[inputSize];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputSize; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
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