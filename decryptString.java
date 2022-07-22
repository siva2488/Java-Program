import java.util.Scanner;
public class decryptString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			String word=s.nextLine();
			String check="";
			for(int i=0;i<word.length();) {
				int num='Z';
				System.out.println(num);
				for(int j=0;j<word.charAt(i+1)-'0';j++) {
					check=check+word.charAt(i);
				}
				i=i+2;
			}
			System.out.println(check);
	}
}
