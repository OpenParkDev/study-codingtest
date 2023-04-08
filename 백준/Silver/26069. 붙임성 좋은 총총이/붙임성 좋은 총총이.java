import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        for (int i = 0; i < size; i++) {
            String[] ids = br.readLine().split(" ");
            if (set.contains(ids[0])) {
                set.add(ids[1]);
            }
            else if (set.contains(ids[1])) {
                set.add(ids[0]);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
    }
}