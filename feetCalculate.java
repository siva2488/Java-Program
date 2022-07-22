//*findTotalFeet(not getting input from the user)*
//public class feetCalculate {
//	public static void main(String[] args) {
//		int noOfElement=5;
//		int inch[]= {18,11,27,12,14};
//		System.out.println(findTotalFeet(noOfElement,inch));
//	}		
//	public static int findTotalFeet(int noOfElement,int[] inch) {	
//		int totalFeet=0;
//		for(int i=0;i<noOfElement;i++) {
//			totalFeet=totalFeet+inch[i]/12;
//		}
//		return totalFeet;
//	}
//}

//getting input from the user
import java.util.Scanner;
public class feetCalculate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int noOfElement=s.nextInt();
		int inch[]=new int[noOfElement];
		for(int i=0;i<noOfElement;i++) {
			inch[i]=s.nextInt();
		}
		System.out.println(findTotalFeet(noOfElement,inch));
	}		
	public static int findTotalFeet(int noOfElement,int[] inch) {	
		int totalFeet=0;
		for(int i=0;i<noOfElement;i++) {
			totalFeet=totalFeet+inch[i]/12;
		}
		return totalFeet;
	}
}