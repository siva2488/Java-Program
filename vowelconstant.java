import java.util.Scanner;
public class vowelconstant {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String word=s.next();
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(i+1!=word.length() && (word.charAt(i)=='a'||word.charAt(i)=='A'||word.charAt(i)=='e'||word.charAt(i)=='E'||word.charAt(i)=='i'||word.charAt(i)=='I'||word.charAt(i)=='o'||word.charAt(i)=='O'||word.charAt(i)=='u'||word.charAt(i)=='U')) {
				if(!(word.charAt(i+1)=='a'||word.charAt(i+1)=='A'||word.charAt(i+1)=='e'||word.charAt(i+1)=='E'||word.charAt(i+1)=='i'||word.charAt(i+1)=='I'||word.charAt(i+1)=='o'||word.charAt(i+1)=='O'||word.charAt(i+1)=='u'||word.charAt(i+1)=='U'))
					count++;
			}
		}
		System.out.println(count);
		}
}
