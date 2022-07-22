//Find the longest string between two vowels

import java.util.Scanner;
public class SmallStringBetweenVowels {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String word=s.next();
		String wordarr[]=new String[word.length()];
		int max=0;
		for(int i=0;i<word.length();i++) {
			String temp="";
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='A'||word.charAt(i)=='E'||word.charAt(i)=='I'||word.charAt(i)=='O'||word.charAt(i)=='U') {
				for(int j=i+1;j<word.length();j++) {
					if(word.charAt(j)=='a'||word.charAt(j)=='e'||word.charAt(j)=='i'||word.charAt(j)=='o'||word.charAt(j)=='u'||word.charAt(j)=='A'||word.charAt(j)=='E'||word.charAt(j)=='I'||word.charAt(j)=='O'||word.charAt(j)=='U') {
						break;
					}
					else {
						temp=temp+word.charAt(j);
					}
				}
			}
			max=max<temp.length()?temp.length():max;
			wordarr[i]=temp;
		}
		for(String x:wordarr) {
			if(x.length()==max && x!="") 
			System.out.print(x+" ");
		}
	}
}
