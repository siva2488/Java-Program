import java.io.BufferedReader;
import java.io.InputStreamReader;
public class FarmerFeb {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    int testcase=Integer.parseInt(br.readLine());
	    for(int i=0;i<testcase;i++){
	    	String OneTwo[]=br.readLine().split(" ");
	    	int sum=Integer.parseInt(OneTwo[0])+Integer.parseInt(OneTwo[1]);
	    	int sum2=sum;
	    	while(true) {
	    	sum2=sum2+1;
	    	int count=0,flag=0,j=2;
	    	for(;j<sum2;j++) {
	    		if(sum2%j==0) {
	    			count++;
	    			flag=1;
	    			break;
	    		}
	    	}
	    	if(flag==0) {
	    		System.out.println(sum2-sum);
	    		break;
	    	}
	    }
	    }
}
}
