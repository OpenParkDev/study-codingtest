import java.io.*;

public class Main {
    private static double parseGrade(String str) {
        switch (str) {
            case "A+" : return 4.5;
            case "A0" : return 4.0;
            case "B+" : return 3.5;
            case "B0" : return 3.0;
            case "C+" : return 2.5;
            case "C0" : return 2.0;
            case "D+" : return 1.5;
            case "D0" : return 1.0;
            case "F" : return 0.0;
            default : return -1.0;
        }
    }

    private static double getAvgGrade(String[] records) {
        double total_credit = 0;
        double total_grade = 0.0;
        for (String record : records) {
            String[] info = record.split(" ");
            double grade = parseGrade(info[2]);
            if (grade >= 0.0) {
                double credit = Double.parseDouble(info[1]);
                total_grade += credit*grade;
                total_credit += credit;
            }
        }
        return total_grade/total_credit;
    }

    public static void main(String[] args) throws IOException {
        String[] records = new String[20];
        int idx = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null) {
            records[idx] = line;
            idx++;
        }

        double result = getAvgGrade(records);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}