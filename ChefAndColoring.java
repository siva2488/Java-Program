import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ChefAndColoring {
	public static void main(String[] args) throws Exception{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int testcase=Integer.parseInt(br.readLine());
		for(int i=0;i<testcase;i++) {
			int noOfRoom=Integer.parseInt(br.readLine()),R=0,B=0,G=0;
			String S=br.readLine();
			for(int j=0;j<noOfRoom;j++) {
				if(S.charAt(j)=='R')
					R++;
				else if(S.charAt(j)=='B')
					B++;
				else if(S.charAt(j)=='G')
					G++;	
			}
			int max=(R>=G && R>=R)?R:B>=G?B:G;
			System.out.println(noOfRoom-max);
		}
	}
}
