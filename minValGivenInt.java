
import java.util.Scanner;
public class minValGivenInt {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp=num;
		int numarray[]=new int[10];
		while(num>0) {
			int rem=num%10;
			numarray[rem]++;
			num=num/10;
		}
		int op=0;
		for(int i=0;i<10;i++) {
			if(i!=0 && numarray[i]!=0) {
				op=i;
				numarray[i]--;
				break;
			}
		}
	for(int i=0;i<10;i++) {
		if(numarray[i]!=0) {
		for(int j=0;j<numarray[i];j++) {
			op=(op*10)+i;
		}
		}
	}
	System.out.println(op);
	}
}
