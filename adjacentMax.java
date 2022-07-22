//not getting input from the user
//public class adjacentMax {
//	public static void main(String[] args) {
//		int noOfElement=5;
//		int element[]= {10,11,7,12,14};
//		System.out.println(findAdjacentMax(noOfElement,element));
//	}
//	public static int findAdjacentMax(int noOfElement,int []element) {
//		int max=0;
//		for(int i=0;i<5;i++){
//			if(i+1!=5){
//				max=(element[i]-element[i+1])>max?(element[i]-element[i+1]):max;
//			}
//		}
//		return max;
//	}
//}

//getting input from the user
import java.util.Scanner;
public class adjacentMax {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	int noOfElement=s.nextInt();
	int element[]=new int[noOfElement];
	for(int i=0;i<noOfElement;i++) {
		element[i]=s.nextInt();
	}
	System.out.println(findAdjacentMax(noOfElement,element));
	}
	public static int findAdjacentMax(int noOfElement,int []element) {
		int max=0;
		for(int i=0;i<5;i++){
			if(i+1!=5){
				max=(element[i]-element[i+1])>max?(element[i]-element[i+1]):max;
			}
		}
		return max;
	}
}
