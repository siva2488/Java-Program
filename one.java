package interview;
import java.util.Scanner;
public class one {
	public static void recur(int count) {
		if(count>0) {
			System.out.println(count+" "+"siva");
			count--;
			recur(count);
		}	
	}
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=s.nextInt();
		recur(count);
	}
}
