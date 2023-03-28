import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static Set<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizes = br.readLine().split(" ");

        set = new HashSet<>();
        int n = Integer.parseInt(sizes[0]);
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        int count = 0;
        int m = Integer.parseInt(sizes[1]);
        for (int i = 0; i < m; i++) {
            if (set.contains(br.readLine())) {
                count++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}