import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Set<String> set = new HashSet<>();
        for (int length = 1; length <= input.length(); length++) {
            for (int start = 0; start <= input.length() - length; start++) {
                set.add(input.substring(start, start+length));
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
    }
}