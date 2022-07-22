import java.io.BufferedReader;
import java.io.InputStreamReader;
public class FindProduct {
	public static void main(String[] args) throws Exception{
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    int size=Integer.parseInt(br.readLine());
	    String s=br.readLine();
	    String num[]=s.split(" ");
	    long answer=1;
	    for(int i=0;i<size;i++) {
	    	answer=(answer*Integer.parseInt(num[i]))%1000000007;
	    }
	    System.out.println(answer);
	}
}
