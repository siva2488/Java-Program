import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ChefAndTheWildcardMatching {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int testcase=Integer.parseInt(br.readLine());
		for(int i=0;i<testcase;i++) {
			String s1=br.readLine();
			String s2=br.readLine();
			int count=0;
			for(int j=0;j<s1.length();j++) {
				if (s1.charAt(j)=='?'|| s2.charAt(j)=='?' || s1.charAt(j)==s2.charAt(j))
					count++;
				else
					break;
			}
			System.out.println(count==s1.length()?"Yes":"No");
		}
	}
}
