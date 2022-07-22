import java.util.Scanner;
public class maxBorder {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int testCase=s.nextInt();
		 for(int k=0;k<testCase;k++) {
			 int n=s.nextInt(),m=s.nextInt(),max=0;
			 String mat[]=new String[n];
			 for(int i=0;i<n;i++) {
					 mat[i]=s.next();
			 }
			 for(int i=0;i<n;i++) {
				 int count=0;
				 for(int j=0;j<m;j++) {
					 count=mat[i].charAt(j)=='#'?count+1:count; 
				 }
				 max=max>count?max:count;
			 }
			 System.out.println(max);
		 }
	}
}
