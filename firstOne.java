import java.util.*;
public class firstOne {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int l=s.nextInt();
	int arr[][]=new int[n][n];
	Random r=new Random();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			arr[i][j]=r.nextInt(l+1);
		}	
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(arr[i][j]+" ");
		}	
		System.out.println();
	}
	recur(arr,n);
	}
	public static void recur(int[][] arr,int n) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your option:");
		int option=s.nextInt();
		if( option==1){
			System.out.println("Enter your position:-");
			int row=s.nextInt();
			int col=s.nextInt();
			System.out.println("Enter label number:-");
			int c=s.nextInt();
			arr[row][col]=c;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(arr[i][j]+" ");
				}	
				System.out.println();
			}
			recur(arr,n );
		}
	}
}
