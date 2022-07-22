import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CountDivisors {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    String num[]=br.readLine().split(" ");
	    int count=0;
	    for(int i=Integer.parseInt(num[0]);i<=Integer.parseInt(num[1]);i++){
	    	if(i%Integer.parseInt(num[2])==0)
	    		count++;
	    }
	    System.out.println(count);
	}
}
