package hackerrank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class RecursiveDigitSum {
	public static void main(String[] args) throws Exception{
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    String num[]=br.readLine().split(" ");
	    long sum=0;
	    for(int i=0;i<num[0].length();i++){
	    	sum+=((int)(num[0].charAt(i))-48)*Integer.parseInt(num[1]);
	    }
	     long op = 0;
	     while(sum>0) {
		   long rem=sum%10;
		   sum=sum/10;
		   op+=rem;
		   if(sum==0 && op>=10) {
			   sum=op;
			   op=0;
		   }	
		   }
	    System.out.println(op);
	}
}
