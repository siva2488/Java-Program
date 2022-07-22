import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class palindromeString {
	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		String s=br.readLine();
		int j=0,flag=0;
		for(int i=s.length()-1;i>0;i--) {
			if(s.charAt(i)!=s.charAt(j)) { 
				flag=1;
				break;
			}
			if(i==s.length()/2)
				break;
				j++;
		}
		System.out.println(flag==0?"YES":"NO");
	}
}
