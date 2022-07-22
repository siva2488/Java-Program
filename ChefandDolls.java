import java.util.*;
public class ChefandDolls {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++) {
			int noOfDolls=sc.nextInt();
			int DollsLeft[]=new int[noOfDolls];
			for(int j=0;j<noOfDolls;j++) {
				DollsLeft[j]=sc.nextInt();
			}
			Arrays.sort(DollsLeft);
			for(int j=0;j<noOfDolls;j++) {
				int nopair=0;
				for(int k=0;k<noOfDolls;k++) {
					if(DollsLeft[k]==DollsLeft[j]) {
						nopair++;
					}
				}
				if(nopair%2!=0)
					System.out.println(DollsLeft[j]);
			}
		}
	}
}
