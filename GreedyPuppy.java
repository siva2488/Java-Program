import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GreedyPuppy {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int testcase=Integer.parseInt(br.readLine());
		for(int i=0;i<testcase;i++) {
			String s[]=br.readLine().split(" ");
			int max=0;
			for(int j=1;j<=Integer.parseInt(s[1]);j++){
				max=Integer.parseInt(s[0])%j>max?Integer.parseInt(s[0])%j:max;
			}
			System.out.println(max);
		}
	}
}
