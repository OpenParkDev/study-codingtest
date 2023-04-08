import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] ar) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer st = new StringTokenizer(in.readLine());
		int max = 0;
		int min = 1000000;
		
		for(int i=0; i<n; i++){
			int temp = Integer.parseInt(st.nextToken());
			if(max<temp) max = temp;
			if(min>temp) min = temp;
		}
		
		System.out.print(min*max);
	}
}
