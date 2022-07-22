import java.util.Scanner;
public class StringContainsSpecialChar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String word=s.nextLine();
		int flag=0;
		String op="";
		for(int i=0;i<word.length();i++) {
			int asci=word.charAt(i);
			if(asci!=32 && !(asci>=65 && asci<=95)&&!(asci>=97 && asci<=122)) {
				System.out.println(asci);
				flag=1;
				break;
			}
			else {
			if(i==0 && word.charAt(i)!=' '){
				op=op+word.toLowerCase().charAt(i);
			}
			else if(word.charAt(i-1)==' ' && word.charAt(i)!=' '){
				op=op+word.toUpperCase().charAt(i);
			}
			else if(word.charAt(i)!=' '){
				op=op+word.charAt(i);
			}
			}
		}
		if(flag==1) 
			System.out.println("Invalid input");
		else
			System.out.println(op);
	}

}
