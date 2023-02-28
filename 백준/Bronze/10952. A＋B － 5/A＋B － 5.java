import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "";
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if ((a == 0) && (b == 0)) {
                break;
            }
            str += (a+b) + " ";
        }

        String[] results = str.split(" ");
        for (String result : results) {
            System.out.println(result);
        }
    }
}