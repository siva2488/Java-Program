import java.util.Scanner;
public class pair{
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	int n=ip.nextInt();
	int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=ip.nextInt();
		}
		int x=ip.nextInt();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if((a[i]+a[j])==x){
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
}
}
