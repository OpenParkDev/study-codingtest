import java.io.*;
import java.util.Stack;

public class Main {
    private static String isVPS(String[] inputStr) {
        Stack<String> stack = new Stack<>();
        for (String str : inputStr) {
            if (str.equals("(")) {
                stack.push(str);
            }
            else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputSize; i++) {
            String[] inputStr = br.readLine().split("");
            sb.append(isVPS(inputStr)).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}