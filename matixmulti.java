import java.util.Scanner;
public class matixmulti {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int [][]a=new int[row][col];
		int [][]b=new int[row][col];
		int [][]c=new int[row][col];
		System.out.println("enter value for 1st matrix :");
		for(int i=0;i<row;i++){
			for(int j=0;i<col;j++){
				a[i][j]=s.nextInt();
			}	
		}
		System.out.println("enter value for 2nd matrix :");
		for(int i=0;i<row;i++){
			for(int j=0;i<col;j++){
				b[i][j]=s.nextInt();
			}	
		}
		for(int i=0;i<row;i++){
			for(int j=0;i<col;j++){
				for(int k=0;k<3;k++)      
				{      
				c[i][j]+=a[i][k]*b[k][j];      
				}
			}
		}
		}
}
