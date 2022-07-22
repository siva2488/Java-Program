import java.util.*;
public class tcsAutoDoor {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),count=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]==0) {
				a[i]=1;
				count++;
				for(int j=i+1;j<n;j++) {
					if(a[j]==0) 
						a[j]=1;
					else
						a[j]=0;
				}
			}
		}
		System.out.println(count);
	}
}
