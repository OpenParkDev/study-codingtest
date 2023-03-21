import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] records = new String[n];
        for (int i = 0; i < n; i++) {
            records[i] = br.readLine();
        }

        float[] averages = new float[n];
        for (int i = 0; i < n; i++) {
            String[] grades = records[i].split(" ");
            int num = Integer.parseInt(grades[0]);
            int sum = 0;
            for (int j = 1; j < grades.length; j++) {
                sum += Integer.parseInt(grades[j]);
            }
            averages[i] = (float) sum/num;
        }

        String[] rates = new String[n];
        for (int i = 0; i < n; i++) {
            String[] grades = records[i].split(" ");
            int num = Integer.parseInt(grades[0]);
            int sum = 0;
            for (int j = 1; j < grades.length; j++) {
                if (averages[i] < Integer.parseInt(grades[j])) {
                    sum += 1;
                }
            }
            rates[i] = String.format("%.3f", (float) sum/num*100);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String rate : rates) {
            bw.write(rate + "%\n");
        }
        bw.flush();
        bw.close();
    }
}