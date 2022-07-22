import java.util.Scanner;
public class ARRAYPROBVIRTU {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		for(int i=0;i<size;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
			b[i]=s.nextInt();
		}
		int min=a[0]+a[1];
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				int sum=0;
				if(i!=j) {
					sum=a[i]+b[j];
					min=sum<min?sum:min;
				}
			}
		}
		System.out.println(min);
	}
}
