import java.util.Scanner;
public class HexToDecimal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String number=s.next().toLowerCase();
		String hex="123456789abcdef";
		int val = 0,j=0;
		for(int i=number.length()-1;i>=0;i--) {
			char ch = number.charAt(i);  
			int d = hex.indexOf(ch)+1;  
			val = val+(int) (d*Math.pow(16,j));
			System.out.println(val);
			j++;
		}
		System.out.println(val);
	}
}
