import java.io.*;
import java.util.*;

public class Main {
    private static boolean isGroupWord(String str) {
        boolean[] isShow = new boolean[26];
        Arrays.fill(isShow, false);
        char prev = 0;
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if ((curr != prev) && isShow[curr-97]) {
                return false;
            }
            isShow[curr-97] = true;
            prev = curr;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int result = 0;
        String line;
        while ((line = br.readLine()) != null) {
            if (isGroupWord(line)) {
                result++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
