import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TanuAndHeadBob {
	public static void main(String[] args) throws Exception{
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    int testcase=Integer.parseInt(br.readLine());
	    for(int i=0;i<testcase;i++) {
	    	int noOfPersons=Integer.parseInt(br.readLine()),flag=0,flag1=0;
	    	String s=br.readLine();
	    	for(int j=0;j<noOfPersons;j++) {
	    		if(s.charAt(j)=='I') {
	    			flag1=1;
	    			break;
	    		}
	    		else if(s.charAt(j)=='Y') {
	    			flag=1;	
	    		}
	    	}
	    	System.out.println(flag1==1?"Indian":(flag1==0 && flag==1)?"NOT INDIAN":"NOT SURE");
	    }
	}
}
