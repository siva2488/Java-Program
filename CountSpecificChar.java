//WRITE AN ALGORITHM TO FIND THE COUNT OF THE SPECIFIC CHARACTER IN THE GIVEN DATA!!!

import java.util.Scanner;
public class CountSpecificChar {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String word=s.nextLine();
	char charToFind=s.nextLine().charAt(0);
	int max=0;
	for(int i=0;i<word.length();i++) {
		if(word.charAt(i)==charToFind) {
			max++;	
		}
	}
	System.out.println(max);
	}
}
