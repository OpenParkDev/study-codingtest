import java.io.*;

public class Main {
    private static String getBuckets(String[] cond, String[] throwing) {
        String[] buckets = new String[Integer.parseInt(cond[0])];
        for (String shot : throwing) {
            String[] range = shot.split(" ");
            int start = Integer.parseInt(range[0])-1;
            int end = Integer.parseInt(range[1])-1;
            for (int i = start; i <= end; i++) {
                buckets[i] = range[2];
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < buckets.length; i++) {
            if (i != 0) {
                result.append(" ");
            }

            if (buckets[i] == null) {
                result.append("0");
            }
            else {
                result.append(buckets[i]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cond = br.readLine().split(" ");
        String[] throwing = new String[Integer.parseInt(cond[1])];
        String line;
        int idx = 0;
        while ((line = br.readLine()) != null) {
            throwing[idx] = line;
            idx++;
        }

        String buckets = getBuckets(cond, throwing);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(buckets + "\n");
        bw.flush();
        bw.close();
    }
}