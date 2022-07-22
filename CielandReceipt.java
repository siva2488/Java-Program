import java.util.Scanner;
public class CielandReceipt {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int testcase=s.nextInt();
		if(testcase>=1&&testcase<=5) {
			for(int i=0;i<testcase;i++) {
				int maxprice=2048;
				int count=0;
				int price=s.nextInt();
					if(1<=price && price<=100000) {
						while(price>0) {
							count=count + price/maxprice;
							price=price%maxprice;
							maxprice=maxprice/2;
						}
						System.out.println(count);
					}
			}
		}
}
}
