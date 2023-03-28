import java.io.*;

public class Main {
    private static String[] array, temp;
    private static int target, count;
    private static String answer;

    private static void mergeSort(int start, int end) {
        if (start < end) {
            int mid = (start+end)/2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);
            if (count >= target) {
                return;
            }
            merge(start, mid, end);
        }
    }

    private static void merge(int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int t = 1;
        while (i <= mid && j <= end) {
            if (Integer.parseInt(array[i]) <= Integer.parseInt(array[j])) {
                temp[t++] = array[i++];
            }
            else {
                temp[t++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = array[i++];
        }
        while (j <= end) {
            temp[t++] = array[j++];
        }
        i = start;
        t = 1;
        while (i <= end) {
            count++;
            if (count == target) {
                answer = temp[t];
                break;
            }
            array[i++] = temp[t++];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cond = br.readLine().split(" ");
        array = br.readLine().split(" ");
        temp = new String[array.length+1];
        target = Integer.parseInt(cond[1]);
        count = 0;

        mergeSort(0, Integer.parseInt(cond[0])-1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (count < target) {
            bw.write("-1");
        }
        else {
            bw.write(answer);
        }
        bw.flush();
        bw.close();
    }
}