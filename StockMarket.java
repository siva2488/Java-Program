import java.util.Scanner;
public class StockMarket {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int NoOfDays=s.nextInt(),max=0;
		 int arr[]=new int[NoOfDays];
		 for(int i=0;i<NoOfDays;i++) {
			 arr[i]=s.nextInt();
		 }
		 for(int i=0;i<NoOfDays;i++) {
			 for(int j=i+1;j<NoOfDays;j++) {
				 if(max<arr[j]-arr[i]) {
					 max=arr[j]-arr[i];
				 }
			 }	 
		 }
		 System.out.println(max);
	}
}




//	1,2,4,2,6
//