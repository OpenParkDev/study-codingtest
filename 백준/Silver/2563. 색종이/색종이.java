import java.io.*;
import java.util.*;

public class Main {
    private static boolean[][] getMatrix() {
        boolean[][] matrix = new boolean[100][100];
        for (boolean[] row : matrix) {
            Arrays.fill(row, false);
        }
        return matrix;
    }

    private static int[][] getPapers(String[] strings) {
        int[][] papers = new int[strings.length][2];
        for (int i = 0; i < strings.length; i++) {
            String[] pos = strings[i].split(" ");
            papers[i][0] = Integer.parseInt(pos[0]);
            papers[i][1] = Integer.parseInt(pos[1]);
        }
        return papers;
    }

    private static boolean[][] attachPapers(int[][] papers) {
        boolean[][] matrix = getMatrix();
        for (int[] paper : papers) {
            int x = paper[0];
            int y = paper[1];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    matrix[x+i][y+j] = true;
                }
            }
        }
        return matrix;
    }

    private static int getTotalArea(String[] strings) {
        int[][] papers = getPapers(strings);
        boolean[][] canvas = attachPapers(papers);
        int count = 0;
        for (boolean[] row : canvas) {
            for (boolean block : row) {
                if (block) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] strings = new String[Integer.parseInt(line)];
        int idx = 0;
        while ((line = br.readLine()) != null) {
            strings[idx] = line;
            idx++;
        }
        
        int area = getTotalArea(strings);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(area + "\n");
        bw.flush();
        bw.close();
    }
}