import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        int alarm = hour*60 + minute - 45;
        if (alarm < 0) {
            alarm += 24*60;
        }
        int n_hour = alarm/60;
        int n_minute = alarm%60;
        
        System.out.println(n_hour + " " + n_minute);
    }
}