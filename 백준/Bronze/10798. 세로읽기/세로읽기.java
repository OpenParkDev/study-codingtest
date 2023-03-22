import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder[] arr = new StringBuilder[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = new StringBuilder();
        }

        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                arr[j].append(c);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 15; i++) {
            bw.write(arr[i].toString());
        }
        bw.flush();
        bw.close();
    }
}