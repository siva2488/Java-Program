import java.util.Scanner;
public class encryption {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String msg=s.nextLine();
		String encrypt="";
		for(int i=0;i<msg.length();i++) {
			if(Character.isDigit(msg.charAt(i))) {
				int a=Character.getNumericValue(msg.charAt(i));
				if(a<=5) {
					a=a*3;
					encrypt=encrypt+a;
				}
				else{
					a=a*5;
					encrypt=encrypt+a;
				}
			}
			else if(Character.isAlphabetic(msg.charAt(i))){
				int a=msg.charAt(i);
				if(a>=65 && a<=90) {
					int b=Character.toLowerCase(msg.charAt(i));
					b=b+3;
					encrypt=encrypt+(char)b;
				}
				int c=msg.charAt(i);
				if(c>=97 && c<=122) {
					int b=Character.toUpperCase(msg.charAt(i));
					b=b+4;
					encrypt=encrypt+(char)b;
				}
			}
			else {
				encrypt=encrypt+msg.charAt(i);
			}
			
		}
		System.out.println(encrypt);
	}

}
