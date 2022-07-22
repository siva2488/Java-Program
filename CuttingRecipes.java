import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CuttingRecipes {
	public static void main(String[] args) throws Exception{
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    int testcase=Integer.parseInt(br.readLine());
	    if(testcase>=1 && testcase<=100) {
	    	for(int i=0;i<testcase;i++) {
	    		String s[]=br.readLine().split(" ");
	    		int min=Integer.parseInt(s[0]),g=Integer.parseInt(s[1]),gcd=1;;
	    		for(int j=1;j<min;j++){
	    			if(j+1!=min-1 && Integer.parseInt(s[j])<Integer.parseInt(s[j+1])&&Integer.parseInt(s[j])<g )
	    				g=Integer.parseInt(s[j]);		
	    			else if(j!=min-1&& Integer.parseInt(s[j])>Integer.parseInt(s[j+1]) && Integer.parseInt(s[j+1])<g)
	    				g=Integer.parseInt(s[j+1]);
	    			}
	    		aa: 
	    		for(int j=g;j>0;j--){
	    		int count=0;
	    		for(int k=1;k<=Integer.parseInt(s[0]);k++) {
	    			if(Integer.parseInt(s[k])%j==0) {
	    				count++;
	    				if(count==Integer.parseInt(s[0])) {
	    					gcd=j;
	    					break aa;
	    				}
	    			}
	    		}
	    		}
	    		for(int k=1;k<=Integer.parseInt(s[0]);k++) 
	    			System.out.print(Integer.parseInt(s[k])/gcd+" ");
	    		}
	    	}
	    }
	}


