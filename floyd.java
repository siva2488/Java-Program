import java.util.Scanner;
public class floyd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int n=1;
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}

}
