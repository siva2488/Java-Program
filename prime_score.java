import java.util.Scanner;
public class prime_score {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),op=1;
		String one="";
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				one+=i+" ";
			}
		}
		String arr[]=one.split(" ");
		String prime="";
		for(int i=0;i<arr.length;i++) {
			int temp=Integer.parseInt(arr[i]),flag=0;
			for(int j=2;j<temp;j++) {
				if(temp%j==0) {
					flag=1;
				}
			}
			if(flag==0&&temp!=1) {
				prime+=arr[i]+" ";
			}
		}
		String parr[]=prime.split(" ");
			for(int j=0;j<parr.length;j++) {
			int p=Integer.parseInt(parr[j]),count=0;
			for(int i=0;i<arr.length;i++) {
				int temp=Integer.parseInt(arr[i]);
				if(temp%p==0) {
					count++;
				}
			}
			op*=count;
		}
			System.out.println(op%1000003);
	}

}
