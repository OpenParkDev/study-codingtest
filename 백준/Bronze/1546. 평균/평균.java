import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        line = br.readLine();
        String[] grades = line.split(" ");
        int max_score = 0;
        int total_score = 0;
        for (String grade : grades) {
            int score = Integer.parseInt(grade);
            if (score > max_score) {
                max_score = score;
            }
            total_score += score;
        }
        double avg = (double) total_score/max_score*100/grades.length;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(avg + "\n");
        bw.flush();
        bw.close();
    }
}