import java.io.*;

public class Main {
    private static int numOfCrChar(String str) {
        int count = 0;
        char prev = 0;
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if ((curr == '=') || (curr == '-')) {
                if ((curr == '=') && (prev == '!')) {
                    count--;
                }
            }
            else {
                if ((curr == 'z') && (prev == 'd')) {
                    prev = '!';
                    count++;
                    continue;
                }
                else if (!((curr == 'j') && ((prev == 'l') || (prev == 'n')))) {
                    count++;
                }
            }
            prev = curr;
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int result = numOfCrChar(line);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}