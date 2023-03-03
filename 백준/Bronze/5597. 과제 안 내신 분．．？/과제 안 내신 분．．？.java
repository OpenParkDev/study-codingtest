import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] students = new boolean[30];
        Arrays.fill(students, false);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            students[Integer.parseInt(line)-1] = true;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < students.length; i++) {
            if (!students[i]) {
                bw.write((i+1) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}