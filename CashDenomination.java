import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CashDenomination {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int noOfItem=Integer.parseInt(br.readLine());
		String ip[][]=new String[noOfItem][3];
		for(int i=0;i<noOfItem;i++) {
			String s[]=br.readLine().split("\\|");
			for(int j=0;j<3;j++) {
				ip[i][j]=s[j];	
			}
		}
		int purItem=Integer.parseInt(br.readLine());
		String [][]purarr=new String[purItem][2];
		for(int i=0;i<purItem;i++) {
			String s[]=br.readLine().split("\\|");
			for(int j=0;j<2;j++) {
				purarr[i][j]=s[j];	
			}
		}
		int typeCoin=Integer.parseInt(br.readLine());
		String denoarr[][]=new String[typeCoin][2];
		for(int i=0;i<typeCoin;i++) {
			String s[]=br.readLine().split("\\|");
			for(int j=0;j<2;j++) {
				denoarr[i][j]=s[j];	
			}
		}
		float pay=Float.parseFloat(br.readLine());
			for(int i=0;i<purItem;i++) {
				for(int j=0;j<noOfItem;j++) {
					if((ip[j][0]).equals(purarr[i][0])) {
						System.out.println("==START_BILL==");
						System.out.println(ip[j][0]+"|"+ip[j][1]+"|"+purarr[i][1]+"|"+(Float.parseFloat(ip[j][1])*Float.parseFloat(purarr[i][1]))+"|"+ip[j][2]+"|"+Float.parseFloat((ip[j][2]))*Float.parseFloat(purarr[i][1])+"|"+(Float.parseFloat(ip[j][1])*Float.parseFloat(purarr[i][1]))+(Float.parseFloat(ip[j][2])*Float.parseFloat(purarr[i][1])));
						System.out.printf("%.2f\n",Float.parseFloat(ip[j][1])*Float.parseFloat(purarr[i][1]));
						System.out.printf("%.2f\n",Float.parseFloat((ip[j][2]))*Float.parseFloat(purarr[i][1]));
						System.out.printf("%.2f\n",Float.parseFloat(ip[j][1])*Float.parseFloat(purarr[i][1])+Float.parseFloat((ip[j][2]))*Float.parseFloat(purarr[i][1]));
						float round=Math.round(Float.parseFloat(ip[j][1])*Float.parseFloat(purarr[i][1])+Float.parseFloat((ip[j][2]))*Float.parseFloat(purarr[i][1]));
						System.out.printf("%.2f\n",round);
						System.out.printf("%.2f\n",pay-Float.parseFloat(ip[j][1])*Float.parseFloat(purarr[i][1])+Float.parseFloat((ip[j][2]))*Float.parseFloat(purarr[i][1]));
						System.out.println("==END_BILL==");
					}
				}
			}
	}
}
/*2
100|30.00|12.0
101|20.00|5.0
1
101|5
9
2000|10
500|10
200|10
100|10
50|10
10|10
5|10
2|10
1|10
100.00*/