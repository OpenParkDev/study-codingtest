import java.io.*;

public class Main {
    private static int getCount(int k, int n) {
        if (k == 0) {
            return n;
        }

        int count = 0;
        for (int i = 1; i <=n ; i++) {
            count += getCount(k-1, i);
        }
        return count;
    }

    private static int[] getResult(int[] arr) {
        int[] results = new int[arr.length/2];
        int k = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((i%2) == 0) {
                k = arr[i];
            }
            else {
                n = arr[i];
                results[i/2] = getCount(k, n);
            }
        }
        return results;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] arr = new int[Integer.parseInt(line)*2];
        int idx = 0;
        while ((line = br.readLine()) != null) {
            arr[idx] = Integer.parseInt(line);
            idx++;
        }

        int[] results = getResult(arr);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int result : results) {
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}