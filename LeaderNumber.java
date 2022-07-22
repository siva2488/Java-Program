import java.util.Scanner;
public class LeaderNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int noOfElements=s.nextInt();
		 int array[]=new int[noOfElements];
		 for(int i=0;i<noOfElements;i++) {
			 array[i]=s.nextInt();
		 }
		 for(int i=0;i<noOfElements;i++) {
			 int flag=0;
			 for(int j=i+1;j<noOfElements;j++) {
				 if(array[i]<array[j]) 
					 flag=1;
			 }
			 if(flag==0) {
				 System.out.print(array[i]+" ");
			 }
			 }		
	}
}

