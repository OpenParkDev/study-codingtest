import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cond = br.readLine().split(" ");

        int x = Integer.parseInt(cond[0]);
        int y = Integer.parseInt(cond[1]);
        int w = Integer.parseInt(cond[2]);
        int h = Integer.parseInt(cond[3]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Math.min(Math.min(x, y), Math.min(w-x, h-y))));
        bw.flush();
        bw.close();
    }
}