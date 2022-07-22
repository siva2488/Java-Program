import java.util.*;
public class crisscross {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String word=s.nextLine();
	int first=0,last=word.length()-1;
	for(int i=0;i<word.length();i++) {
		for(int j=0;j<word.length();j++) {
			if(j==first || j==last) {
				System.out.print(word.charAt(j));
			}
			else {
				System.out.print(" ");
			}
		}
		first++;last--;
		System.out.println();
	}
	}
}
