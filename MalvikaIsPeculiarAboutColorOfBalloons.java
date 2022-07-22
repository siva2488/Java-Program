import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MalvikaIsPeculiarAboutColorOfBalloons {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int testcase=Integer.parseInt(br.readLine());
		for(int i=0;i<testcase;i++) {
		String s=br.readLine();
		int a=0,b=0;
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)=='a')
				a++;
			else
				b++;
		}
		System.out.println(a<b?a:b);
		}
	}
}
