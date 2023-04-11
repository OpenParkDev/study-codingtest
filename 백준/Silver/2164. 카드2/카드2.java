import java.io.*;
import java.util.*;

public class Main {
    static int f(int m){
        if(m<=2) return m;
        if(m%2==0) return 2*f(m/2);
        return (2*f(m/2)+1)%(m-1)+1;
    }
    public static void main(String args[]) throws Exception {
        int n = readInt();
        System.out.println(f(n));
    }

    static int readInt() throws IOException {
        int sum = 0;
        boolean isNegative = false;
        while (true) {
            int input = System.in.read();
            if (input == '\n' || input == ' ')
                return isNegative ? sum * -1 : sum;
            else if (input == '-')
                isNegative = true;
            else
                sum = (sum * 10) + input - '0';
        }
    }
}