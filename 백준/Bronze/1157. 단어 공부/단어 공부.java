import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] counts = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'a') {
                counts[c-'a']++;
            }
            else {
                counts[c-'A']++;
            }
        }

        int max = 0;
        char result = '0';
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
                result = (char) (i + 'A');
            }
            else if (counts[i] == max) {
                result = '?';
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result);
        bw.flush();
        bw.close();
    }
}