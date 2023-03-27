import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<String, String> map;

    public static void main(String[] args) throws IOException {
        map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cond = br.readLine().split(" ");
        int n = Integer.parseInt(cond[0]);
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            String idx = Integer.toString(i);
            map.put(idx, name);
            map.put(name, idx);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(cond[1]);
        for (int i = 1; i <= m; i++) {
            bw.write(map.get(br.readLine()) + "\n");
        }
        bw.flush();
        bw.close();
    }
}