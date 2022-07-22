//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//public class twovsten {
//	public static void main(String[] args) throws Exception {
//		InputStreamReader r=new InputStreamReader(System.in);    
//	    BufferedReader br=new BufferedReader(r);
//	    int testcase=Integer.parseInt(br.readLine());
//	    for(int i=0;i<testcase;i++){
//	    	int number=Integer.parseInt(br.readLine()),count=0,flag=0;
//	    	if(number%10!=0) {
//	    	while(true) {
//	    		number=number*10;
//	    		count++;
//	    		if(number%10==0) 
//	    			break;
//	    	}
//	    }
//	    	else 
//	    		System.out.println(0);
//	    	
//	    }
//	}
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;
class Codechef
{
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    int testcase=Integer.parseInt(br.readLine());
	    for(int i=0;i<testcase;i++){
	    	int number=Integer.parseInt(br.readLine()),count=0,flag=0;
	    	System.out.println(number%10==0?0:number%5==0?1:-1);
	    }
	}
}
