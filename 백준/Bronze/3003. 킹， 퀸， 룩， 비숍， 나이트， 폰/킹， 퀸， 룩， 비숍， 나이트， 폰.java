import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] origin = new int[]{1, 1, 2, 2, 2, 8};

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < input.length; i++) {
            int answer = origin[i] - Integer.parseInt(input[i]);
            bw.write(answer + " ");
        }
        bw.flush();
        bw.close();
    }
}