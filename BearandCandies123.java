import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BearandCandies123 {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int testcase=Integer.parseInt(br.readLine());
		for(int i=0;i<testcase;i++) {
			String limit[]=br.readLine().split(" ");
			int limak=Integer.parseInt(limit[0]);
			int bob=Integer.parseInt(limit[1]);
			int j=1;
			while(true) {
				if(j%2==1) 
					limak=limak-j;
				else
					bob=bob-j;
				
				if(limak<0) {
					System.out.println("Bob");
					break;
				}
				else if(bob<0) {
					System.out.println("Limak");
					break;
				}
				j++;
			}
		}
	}
}
