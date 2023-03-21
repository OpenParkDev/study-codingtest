import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] info = br.readLine().split(" ");
        int[] buckets = new int[Integer.parseInt(info[0])];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = i+1;
        }

        for (int i = 0; i < Integer.parseInt(info[1]); i++) {
            String[] cond = br.readLine().split(" ");
            int start = Integer.parseInt(cond[0])-1;
            int end = Integer.parseInt(cond[1])-1;
            int mid = Integer.parseInt(cond[2])-1;

            int[] temp = new int[mid-start];
            System.arraycopy(buckets, start, temp, 0, mid-start);
            System.arraycopy(buckets, mid, buckets, start, end-mid+1);
            System.arraycopy(temp, 0, buckets, start+end-mid+1, mid-start);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int num : buckets) {
            bw.write(num + " ");
        }
        bw.flush();
        bw.close();
    }
}