import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputSize = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputSize; i++) {
            String[] cond = br.readLine().split(" ");
            int docSize = Integer.parseInt(cond[0]);
            int targetIdx = Integer.parseInt(cond[1]);
            String[] docs = br.readLine().split(" ");

            Queue<Document> queue = new ArrayDeque<>();
            Integer[] priority = new Integer[docSize];
            for (int j = 0; j < docSize; j++) {
                int currPriority = Integer.parseInt(docs[j]);
                queue.add(new Document(j, currPriority));
                priority[j] = currPriority;
            }
            Arrays.sort(priority, Collections.reverseOrder());

            int count = 0;
            while (!queue.isEmpty()) {
                Document document = queue.poll();
                if (document.getPriority() < priority[count]) {
                    queue.add(document);
                }
                else {
                    count++;
                    if (document.getId() == targetIdx) {
                        break;
                    }
                }
            }
            sb.append(count).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

class Document {
    private final int id;
    private final int priority;

    public Document(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int getId() {
        return this.id;
    }

    public int getPriority() {
        return this.priority;
    }
}