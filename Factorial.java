import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Factorial {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int num=Integer.parseInt(br.readLine());
		int factorial=1,op=0;
		for(int i=1;i<=num;i++){
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}
}
