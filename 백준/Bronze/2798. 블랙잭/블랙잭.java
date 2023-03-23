import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.parseInt(br.readLine().split(" ")[1]);
        String[] cards = br.readLine().split(" ");

        int result = 0;
        for (int i = 0; i < cards.length; i++) {
            int a = Integer.parseInt(cards[i]);
            if (a > max) {
                continue;
            }
            for (int j = i+1; j < cards.length; j++) {
                int b = Integer.parseInt(cards[j]);
                if (a + b > max) {
                    continue;
                }
                for (int k = j+1; k < cards.length; k++) {
                    int sum = a + b + Integer.parseInt(cards[k]);
                    if (sum <= max && sum > result) {
                        result = sum;
                    }
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}