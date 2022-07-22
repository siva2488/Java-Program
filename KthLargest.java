//WRITE A JAVA PROGRAM TO FIND THE KTH LARGEST NUMBER IN A GIVEN ARRAY

import java.util.Scanner;
public class KthLargest {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		int numberOfElements=s.nextInt();
		int NumberArray[]=new int[numberOfElements];
		for(int i=0;i<NumberArray.length;i++) {
			NumberArray[i]=s.nextInt();
		}
		int k=s.nextInt();
		for(int i=0;i<NumberArray.length;i++) {
			for(int j=i+1;j<NumberArray.length;j++) {
				if(NumberArray[i]<NumberArray[j]) {
					int temp=NumberArray[i];
					NumberArray[i]=NumberArray[j];
					NumberArray[j]=temp;
				}
			}
		}
		System.out.println(NumberArray[k-1]);
	}
}

