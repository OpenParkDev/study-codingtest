import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] words = new String[size];
        int idx = 0;
        String line;
        while ((line = br.readLine()) != null) {
            words[idx] = line;
            idx++;
        }

        Set<Character> characters = new HashSet<>();
        int no_group = 0;
        for (String word : words) {
            char prev = 0;
            for (int i = 0; i < word.length(); i++) {
                char curr = word.charAt(i);
                if (characters.contains(curr) && (curr != prev)) {
                    no_group++;
                    break;
                }
                characters.add(curr);
                prev = curr;
            }
            characters.clear();
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((size-no_group) + "\n");
        bw.flush();
        bw.close();
    }
}