import java.io.*;

public class Main {
    private static StringBuilder sb;
    
    private static void move(int start, int to) {
        sb.append(start).append(" ").append(to).append("\n");
    }

    private static void hanoi(int n, int start, int to, int via) {
        if (n == 1) {
            move(start, to);
        }
        else {
            hanoi(n-1, start, via, to);
            move(start, to);
            hanoi(n-1, via, to, start);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        
        sb.append((int) Math.pow(2, n) - 1).append("\n");
        hanoi(n, 1, 3, 2);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}