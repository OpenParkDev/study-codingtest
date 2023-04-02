import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<String> remains = new TreeSet<>(Collections.reverseOrder());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] record = br.readLine().split(" ");
            if (record[1].equals("enter")) {
                remains.add(record[0]);
            }
            else if (record[1].equals("leave")) {
                remains.remove(record[0]);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String remain : remains) {
            bw.write(remain + "\n");
        }
        bw.flush();
        bw.close();
    }
}