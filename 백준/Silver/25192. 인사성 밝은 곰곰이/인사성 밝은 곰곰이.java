import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int count = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            String id = br.readLine();
            if (id.equals("ENTER")) {
                set.clear();
            }
            else if (!set.contains(id)) {
                set.add(id);
                count++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}