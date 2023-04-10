import java.io.*;

public class Main {
    private static int[] stack;
    private static int idx = 0;

    private static void push(int input) {
        stack[idx++] = input;
    }

    private static int pop() {
        if ((idx - 1) < 0) {
            return -1;
        }
        return stack[--idx];
    }

    private static int size() {
        return idx;
    }

    private static int empty() {
        if (idx == 0) {
            return 1;
        }
        return 0;
    }

    private static int top() {
        if ((idx - 1) < 0) {
            return -1;
        }
        return stack[idx-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());
        stack = new int[inputSize];

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputSize; i++) {
            String[] ops = br.readLine().split(" ");
            switch (ops[0]) {
                case "push" :
                    push(Integer.parseInt(ops[1]));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "top" :
                    sb.append(top()).append("\n");
                    break;
                default :
                    break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}