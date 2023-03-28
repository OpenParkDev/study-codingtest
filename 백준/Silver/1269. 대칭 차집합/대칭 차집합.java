import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static Set<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizes = br.readLine().split(" ");
        int sum = Integer.parseInt(sizes[0]) + Integer.parseInt(sizes[1]);

        set = new HashSet<>();
        String[] setA = br.readLine().split(" ");
        for (int i = 0; i < setA.length; i++) {
            set.add(setA[i]);
        }

        int comm = 0;
        String[] setB = br.readLine().split(" ");
        for (int i = 0; i < setB.length; i++) {
            if (set.contains(setB[i])) {
                comm += 2;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum - comm));
        bw.flush();
        bw.close();
    }
}