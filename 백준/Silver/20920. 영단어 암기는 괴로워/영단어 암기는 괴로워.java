import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer cond = new StringTokenizer(br.readLine());
        int inputSize = Integer.parseInt(cond.nextToken());
        int minLength = Integer.parseInt(cond.nextToken());

        Map<String, Integer> freqs = new HashMap<>();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < inputSize; i++) {
            String word = br.readLine();
            if (word.length() >= minLength) {
                if (freqs.containsKey(word)) {
                    freqs.replace(word, freqs.get(word)+1);
                }
                else {
                    freqs.put(word, 1);
                    words.add(word);
                }
            }
        }

        Collections.sort(words, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                int f1 = freqs.get(o1);
                int f2 = freqs.get(o2);
                if (f1 == f2) {
                    int l1 = o1.length();
                    int l2 = o2.length();
                    if (l1 == l2) {
                        return o1.compareTo(o2);
                    }
                    return l2 - l1;
                }
                return f2 - f1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}