package interviewPreparation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TCSBase17 {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    String hex="0123456789ABCDEF";
	    String d=br.readLine();
	    int val=0;
	   
	    for(int i=0;i<d.length();i++) {
	    int a=hex.indexOf(d.charAt(i));
	    val=17*val+a;
	    }
	    System.out.println(val);
	}
}
