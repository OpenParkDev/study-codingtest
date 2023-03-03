import java.io.*;

public class Main {
    private static int[] getFraction(int order) {
        int[] result = new int[2];
        int level = 1;
        int ceiling = 1;
        while (ceiling < order) {
            level++;
            ceiling = level*(level+1)/2;
        }

        if ((level%2) == 0) {
            result[0] = level - (ceiling - order);
            result[1] = 1 + (ceiling - order);
        }
        else {
            result[0] = 1 + (ceiling - order);
            result[1] = level - (ceiling - order);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int order = Integer.parseInt(br.readLine());

        int[] result = getFraction(order);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result[0] + "/" + result[1] + "\n");
        bw.flush();
        bw.close();
    }
}