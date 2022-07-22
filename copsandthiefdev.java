import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class copsandthiefdev {
	public static void main(String[] args)throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int testcase=Integer.parseInt(br.readLine());
		for(int k=0;k<testcase;k++) {
		String []ip=br.readLine().split(" ");
		String cops[]=br.readLine().split(" ");
		int houses[]=new int[100];
		int distance=Integer.parseInt(ip[1])*Integer.parseInt(ip[2]);
		for(int i=0;i<Integer.parseInt(ip[0]);i++){
			int start=Integer.parseInt(cops[i])-1-distance;
			int end=Integer.parseInt(cops[i])-1+distance;
			 start = (start > 1) ? start : 0;
		     end = (end < 100) ? end+1 : 100;
		     Arrays.fill(houses, start, end, 1);	
		}
		int count=0;
		for(int x:houses) {
			if(x==0)
				count++;
		}
		System.out.println(count);
	}
	}
}
