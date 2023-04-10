import java.io.*;

public class Main {
    private static int[] deque;
    private static int capacity;
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    public static void pushFront(int num) {
        deque[head] = num;
        if (++head >= capacity) {
            head -= capacity;
        }
        size++;
    }

    public static void pushBack(int num) {
        if (--tail < 0) {
            tail += capacity;
        }
        deque[tail] = num;
        size++;
    }

    public static int popFront() {
        if (empty() == 1) {
            return -1;
        }
        if (--head < 0) {
            head += capacity;
        }
        size--;
        return deque[head];
    }

    public static int popBack() {
        if (empty() == 1) {
            return -1;
        }
        int back = tail;
        if (++tail >= capacity) {
            tail -= capacity;
        }
        size--;
        return deque[back];
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        }
        return 0;
    }

    public static int front() {
        if (empty() == 1) {
            return -1;
        }
        int front = head-1;
        if (front < 0) {
            front += capacity;
        }
        return deque[front];
    }

    public static int back() {
        if (empty() == 1) {
            return -1;
        }
        return deque[tail];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());
        deque = new int[inputSize];
        capacity = inputSize;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputSize; i++) {
            String[] ops = br.readLine().split(" ");
            switch (ops[0]) {
                case "push_front":
                    pushFront(Integer.parseInt(ops[1]));
                    break;
                case "push_back":
                    pushBack(Integer.parseInt(ops[1]));
                    break;
                case "pop_front":
                    sb.append(popFront()).append("\n");
                    break;
                case "pop_back":
                    sb.append(popBack()).append("\n");
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