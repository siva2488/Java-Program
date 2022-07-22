//name match
import java.util.Scanner;
public class nameMatch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name1=s.nextLine();
		String name2=s.nextLine();
		String temp1="",temp2="";
		for(int i=0;i<name2.length();i++) {
			if(name2.charAt(i)=='.' && name2.charAt(i+1)==' ' ) {
				int n=i+2,len=name2.length()-1;
					while(n<=len && name2.charAt(n)!=' '){
						temp2=temp2+name2.charAt(n);
						n++;
					} 
			}
			if(name2.charAt(i)!='.'&& i!=name2.length()-1 &&name2.charAt(i+1)==' ') {
			int n=i+2,len=name2.length()-1;
				while(n<=len){
					temp1=temp1+name2.charAt(n);
					n++;
				} 
				}
		}
		name2=temp1+" "+temp2;
		if(name1.length()!=name2.length()) {
			System.out.println("no match");
		}
		else {
			int count=0;
			for(int i=0;i<name1.length();i++) {
				if(name1.charAt(i)==name2.charAt(i)) {
					count++;
				}
				else {
					break;
				}
			}
		System.out.println(count==name1.length()?"match":"nomatch");
		}
	}
}


