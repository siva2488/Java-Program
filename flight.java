import java.util.Scanner;
public class flight {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter date of birth(ex:12/07)");
		String dob=s.nextLine();
		System.out.println("Enter date of tarvel(ex:12/07)");
		String dot=s.nextLine();
		String temp1="",temp2="";
		for(int i=0;i<5;i++) {
			if(dob.charAt(i)!='/') {
				temp1=temp1+dob.charAt(i);
				temp2=temp2+dot.charAt(i);
			}
		}
		if(temp1.equals(temp2)) {
			System.out.println("advance happy birthday!! As a gift you will get 10% discount");
		}
	}
}


//import java.util.Scanner;
//public class flight {
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter date of birth(ex:12/07/2021)");
//		String dob=s.nextLine();
//		System.out.println("Enter date of tarvel(ex:12/07/2021)");
//		String dot=s.nextLine();
//		String arr1[]=dob.split("/");
//		String arr2[]=dot.split("/");
//		int count=0;
//		for(int i=0;i<2;i++) {
//			if(arr1[i].charAt(i)==arr2[i].charAt(i)) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println("advance happy birthday!! As a gift you will get 10% discount");
//		}
//	}
//}























