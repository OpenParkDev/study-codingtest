import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int interval = scanner.nextInt();

        int end = hour*60 + minute + interval;
        if (end >= 24*60) {
            end -= 24*60;
        }
        int n_hour = end/60;
        int n_minute = end%60;

        System.out.println(n_hour + " " + n_minute);
    }
}