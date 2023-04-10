import java.io.*;
import java.util.Stack;

public class Main {
    private static String isBalanced(String[] inputStr) {
        Stack<String> stack = new Stack<>();
        for (String str : inputStr) {
            if (str.equals("(") || str.equals("[")) {
                stack.push(str);
            }
            else if (str.equals(")")) {
                if (stack.isEmpty() || !stack.peek().equals("(")) {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
            else if (str.equals("]")) {
                if (stack.isEmpty() || !stack.peek().equals("[")) {
                    return "no";
                }
                else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return "yes";
        }
        return "no";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while (!(line = br.readLine()).equals(".")) {
            String[] inputStr = line.split("");
            sb.append(isBalanced(inputStr)).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}