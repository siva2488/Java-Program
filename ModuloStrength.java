import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class ModuloStrength {
	public static void main(String[] args)throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    String[] input=br.readLine().split(" ");
	    int num[]=new int[Integer.parseInt(input[1])];
	    int sum=0;
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    for(int i=0;i<Integer.parseInt(input[0]);i++) {
	    	int temp=Integer.parseInt(st.nextToken());
	    	num[temp%Integer.parseInt(input[1])]++;
	    	System.out.println(num[temp%Integer.parseInt(input[1])]);
	    }
	    for(int i=0;i<Integer.parseInt(input[1]);i++) {
	    	if(num[i]>0) {
	    		sum=sum+((num[i])*(num[i]-1));
	    		System.out.println(sum);
	    	}
	    }
	    System.out.println(sum);
	}

}
