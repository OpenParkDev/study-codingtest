import java.io.*;

public class Main {
    private static int count;

    private static int isPalindrome(String str, int l, int r) {
        count++;
        if (l >= r) {
            return 1;
        }
        else if (str.charAt(l) != str.charAt(r)) {
            return 0;
        }
        else {
            return isPalindrome(str, l+1, r-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputSize; i++) {
            String word = br.readLine();
            count = 0;
            sb.append(isPalindrome(word, 0, word.length()-1)).append(" ").append(count).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}