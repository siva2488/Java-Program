import java.util.Scanner;
public class NonDuolicateString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String word=s.nextLine();
		char words[]=word.toCharArray();
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				int ascii1=words[i], ascii2=words[j];
				if(words[i]==words[j]) {
				words[j]=' ';
				}
			}	
		}
	for(char x:words) {
		if(x!=' ')
		System.out.print(x);
	}
	}
}
