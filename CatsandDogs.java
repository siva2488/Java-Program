import java.io.BufferedReader;
import java.io.InputStreamReader;
public class CatsandDogs {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int testcase=Integer.parseInt(br.readLine());
		for(int i=0;i<testcase;i++) {
		String ip[]=br.readLine().split(" ");	
		long cats=Integer.parseInt(ip[0]),dogs=Integer.parseInt(ip[1]),legs=Integer.parseInt(ip[2]);
		long max=(cats+dogs)*4;
		long min= ((cats-dogs)>dogs) ? 4*(cats-dogs) : 4*dogs;
		System.out.println(legs<=max && legs>=min && legs%4==0?"Yes":"No");
		}
	}
}
