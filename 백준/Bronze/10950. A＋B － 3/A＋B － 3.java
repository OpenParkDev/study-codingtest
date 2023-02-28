import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String[] results = new String[size];
        for (int i = 0; i < size; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            results[i] = Integer.toString(a+b);
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}