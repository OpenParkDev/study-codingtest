import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static Set<String> set;

    public static void main(String[] args) throws IOException {
        set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cond = br.readLine().split(" ");
        int n = Integer.parseInt(cond[0]);
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        int m = Integer.parseInt(cond[1]);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            if (set.contains(name)) {
                names.add(name);
            }
        }
        names.sort(Comparator.naturalOrder());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(names.size() + "\n");
        for (String name : names) {
            bw.write(name + "\n");
        }
        bw.flush();
        bw.close();
    }
}