import java.util.Scanner;
public class missing {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=10;
		int arr[]=new int[size];
		int k=1;
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
			int flag=0;
			for(int j=0;j<size;j++) {
				if(arr[j]==k) {
					flag=1;
				}
			}
			if(flag==0)
				System.out.println(k);
			k++;	
		}
	}
}
