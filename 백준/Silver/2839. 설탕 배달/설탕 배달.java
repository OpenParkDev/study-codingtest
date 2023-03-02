import java.io.*;

public class Main {
    private static int getMinBag(int weight) {
        int num_five = weight/5;
        while (num_five >= 0) {
            int rest = weight - num_five*5;
            if ((rest % 3) != 0) {
                num_five--;
            }
            else {
                int num_three = rest/3;
                return num_five + num_three;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int weight = Integer.parseInt(br.readLine());

        int result = getMinBag(weight);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}