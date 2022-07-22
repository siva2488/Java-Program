//not getting input from the user
public class oddEvenDifference {
	public static void main(String[] args) {
	int noOfElement=5;
	int element[]= {10,11,7,12,14};
	System.out.println(findOddEvenDifference(noOfElement,element));
	}
	public static int findOddEvenDifference(int noOfElement,int []element) {
		int odd=0,even=0;
		for(int i=0;i<5;i++){
			if(element[i]%2!=0)
				odd+=element[i];
			else
				even+=element[i];
		}
		return odd-even;
	}
}


//getting input from the user
//import java.util.Scanner;
//public class oddEvenDifference {
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//	int noOfElement=s.nextInt();
//	int element[]=new int[noOfElement];
//	for(int i=0;i<noOfElement;i++) {
//		element[i]=s.nextInt();
//	}
//	System.out.println(findOddEvenDifference(noOfElement,element));
//	}
//	public static int findOddEvenDifference(int noOfElement,int []element) {
//		int odd=0,even=0;
//		for(int i=0;i<5;i++){
//			if(element[i]%2!=0)
//				odd+=element[i];
//			else
//				even+=element[i];
//		}
//		return odd-even;
//	}
//}
