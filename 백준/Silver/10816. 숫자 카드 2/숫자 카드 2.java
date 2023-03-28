import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, Integer> map;

    public static void main(String[] args) throws IOException {
        map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] cards = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (map.containsKey(cards[i])) {
                map.put(cards[i], map.get(cards[i]) + 1);
            }
            else {
                map.put(cards[i], 1);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());
        String[] tests = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            if (map.containsKey(tests[i])) {
                bw.write(map.get(tests[i]) + " ");
            }
            else {
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
    }
}