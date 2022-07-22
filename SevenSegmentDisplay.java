import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SevenSegmentDisplay {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    int segment[]= {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
	    int testcase=Integer.parseInt(br.readLine());
	    if(testcase>=1 && testcase<=100) {
	    	for(int j=0;j<testcase;j++) {
	    	String num=br.readLine();
	    	int length=num.length(),sum=0;
	    	if(length>=1 && length<=100){
	    		for(int i=0;i<length;i++) {
	    			int value=(int)num.charAt(i)-48;
	    			sum=sum+segment[value];
	    		}
	    	}
	    	if(sum%2==0) {
	    		for(int i=0;i<sum/2;i++) {
	    			System.out.print("1");
	    		}
	    	}
	    	else {
	    		System.out.print("7");
	    		sum=sum-3;
	    		for(int i=0;i<sum/2;i++) {
	    			System.out.print("1");
	    		}
	    		
	    	}
	    	System.out.println();
	    }
	    
	    }
	}
}