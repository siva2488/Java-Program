import java.util.Scanner;
public class stock {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int noOfProducts=s.nextInt();
		int flag=0;
		int productId[]=new int[noOfProducts];
		for(int i=0;i<noOfProducts;i++) {
			productId[i]=s.nextInt();//111 0
			String check=Integer.toString(productId[i]);
			if(check.charAt(1)=='0') {
				productId[i]=0;
				flag++;
			}
		}
		System.out.println("new stock:");
		if(flag==noOfProducts) {
			System.out.println("no new stocks");
		}
		for(int x:productId) {
			if(x!=0) {
				System.out.println(x);
			}
		}
	}
}









//import java.util.Scanner;
//public class stock {
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		int noOfProducts=s.nextInt();
//		int flag=0;
//		String productId[]=new String[noOfProducts];
//		for(int i=0;i<noOfProducts;i++) {
//			productId[i]=s.next();
//			if(productId[i].charAt(1)=='0') {
//				productId[i]="";
//			}
//		}
//		System.out.println("new stock:");
//		if(flag==noOfProducts) {
//			System.out.println("no new stocks");
//		}
//		for(String x:productId) {
//			if(x!="") {
//				System.out.println(x);
//			}
//		}
//	}
//}
