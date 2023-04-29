import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 26; i++) {
            char c = (char) (97 + i);
            bw.write(word.indexOf(c) + " ");
        }
        bw.flush();
        bw.close();
    }
}