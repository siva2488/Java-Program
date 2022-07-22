import java.util.Scanner;
public class triplet {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int n=s.nextInt(),count=0;
		 int array[]=new int[n];
		 for(int i=0;i<n;i++) {
			 array[i]=s.nextInt();
		 }
		 for(int i=0;i<n;i++) {
			 int temp=0;
			 for(int j=i+1;j<n;j++) {
				 temp=array[i]+array[j];
				 for(int k=0;k<n;k++) {
					 if(array[k]==temp)
						 count++;
				 }
			 }
		 }
		 System.out.println(count);
	}

}
//1352
//7 10 4 3 20 15