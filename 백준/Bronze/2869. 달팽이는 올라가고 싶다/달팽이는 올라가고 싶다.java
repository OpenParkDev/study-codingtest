import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cond = br.readLine().split(" ");

        int up = Integer.parseInt(cond[0]);
        int down = Integer.parseInt(cond[1]);
        int height = Integer.parseInt(cond[2]);
        int result = (int) Math.ceil((double) (height - up)/(up - down)) + 1;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}