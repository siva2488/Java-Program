//WRITE A JAVA PROGRAM TO REVERSE EACH WORD IN THE GIVEN STRING

import java.util.Scanner;
public class StringReverse {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		String name=s.nextLine();
			int i=0,k=0;
			while(i<name.length()) {
				if(name.charAt(i) ==' ' || i==name.length()-1) {
					int j=name.charAt(i) ==' '?i-1:i;
					for(;j>=k;j--) {
						System.out.print(name.charAt(j));
					}
					System.out.print(" ");
					k=i+1;
				}
				i++;
			}
	}
}