import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class SuperPalindrome{
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s[]=br.readLine().split(" ");
		int count=0;
		StringBuilder one=new StringBuilder(s[0]);
		StringBuilder two=new StringBuilder(s[1]);
		long first=Long.parseLong(one.toString());
		long last=Long.parseLong(two.toString());
		for(long i=first;i<=last;) {
			String l=Long.toString(i);
			StringBuilder rev=new StringBuilder(l);
			rev.reverse();
			if(rev.toString().equals(Long.toString(i))) {
				double d=(Math.sqrt(i));
				String l2[]=Double.toString(d).split("\\.");
				StringBuilder rev2=new StringBuilder(l2[0]);
				rev2.reverse();
				//System.out.println(Long.parseLong(rev2.toString())+" "+d);
				if(Long.parseLong(rev2.toString())-d==0) {
					count++;
				}		
		}
			//System.out.println(i);
			if(i>10)
			i+=10;
			else
				i++;
	}
		System.out.println(count);
	}
}