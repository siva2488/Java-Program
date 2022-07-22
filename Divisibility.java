//import java.util.Scanner;
//public class Divisibility {
//	public static void main(String[] args) throws Exception {
//		 Scanner s=new Scanner(System.in);
//		 int size=s.nextInt();
//		 long check=0;
//		 int numArr[]=new int[size];
//		 for(int i=0;i<size;i++) {
//			 numArr[i]=s.nextInt();
//		 }
//		 for(int i=0;i<size;i++) {
//			 int rem=numArr[i]%10;
//			 check=rem;
//		 }
//		 System.out.println(check%10==0?"Yes":"No");
//	}
//}
import java.util.Scanner;
public class Divisibility {
	public static void main(String[] args) throws Exception {
		 Scanner s=new Scanner(System.in);
		 int size=s.nextInt();
		 long check=0;
		 int odd = 0,even = 0;
		 int len=size;
		 while(len>0) {
			int numArr=s.nextInt();
		 for(int i=0;i<size;i++) {
			 if(i<size/2) {
			 int rem=0;
			 while(numArr>0) {
				 rem=numArr%10;
				 numArr=numArr/10;
			 }
			 check=check*10+rem;
			 }
			 else {
				 int rem = numArr%10;
				 check=check*10+rem;
			 }
		 }
		
		 for(int i=size;i>0;i--) {
			 if(i%2==0){
				 even=(int) (even+check%10);
			 }
			 else {
				 odd=(int) (odd+check%10);
				 
			 }
		 }
		 len--;
		 }
		 System.out.println((odd-even)%11==0?"OUI":"NON");
	}
}
