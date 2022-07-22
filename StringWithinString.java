//string within string

import java.util.Scanner;
public class StringWithinString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String x=s.nextLine();
		String y=s.nextLine();
		int flag=0;
		if(x.length()>=1 && y.length()<=1000 && x.length()>y.length()) {
		for(int i=0;i<x.length();i++) {
			int count=0;
			if(x.charAt(i)==y.charAt(0)) {
				int k=i;
				for(int j=0;j<y.length();j++) {
					if(x.charAt(k)==y.charAt(j)) {
						k++;
						count++;
					}
				}
			}
			if(count==y.length()) {
				flag=1;
				System.out.println("yes");
			}
		}
		}
		if(flag==0) {
			System.out.println("no");
		}
	}
}
