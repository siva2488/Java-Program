import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TheLargestSubnumber {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    int testcase=Integer.parseInt(br.readLine());
	   for(int i=0;i<testcase;i++) {
		   String []ip=br.readLine().split(" ");
		   StringBuilder sb=new StringBuilder(br.readLine()); 
		   long xor=0,result=0;
		   for(int j=0;j<sb.length();j++) {
			  if(sb.charAt(0)=='0') 
				  sb=sb.deleteCharAt(0);
			  else
				  break;
		   }
		   char []num=sb.toString().toCharArray();
		   long temp=0;
		   for(int j=0;j<sb.length();j++) {
			   long sum=0;
				  xor = (Character.getNumericValue(num[j]))^xor;
				  sb=sb.deleteCharAt(0);
				  for(int k=0;k<sb.length();k++) {
					  if(sb.charAt(0)=='0') 
						  sb=sb.deleteCharAt(0);
					  else
						  break;
				   }
				  sum=Long.parseLong(sb.toString());
				 if(xor>temp && sum%Integer.parseInt(ip[1])==0 &&sum>0) {
					 temp=xor;
					 result=sum;
					 
				 }
					 else {
						 result=result;
						
					 }
		   }
			System.out.println(result==0?-1:result);  
	   }
	}
}
