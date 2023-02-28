import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        int[] results = new int[Integer.parseInt(line)];
        int idx = 0;
        while ((line = br.readLine()) != null) {
            String[] num = line.split(" ");
            results[idx] = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
            idx++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int result : results) {
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}