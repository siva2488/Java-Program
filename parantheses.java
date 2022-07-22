//a string containing only parenthese is balances if the followinf is true

import java.util.Scanner;
public class parantheses {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int noOfInput=s.nextInt();
		for(int i=0;i<noOfInput;i++) {
			int flag=0;
			String words=s.next();
			if(words.length()%2==1) {
				System.out.println("false");
			}
			  else {
				    int x=0,m=words.charAt(x),n=words.charAt(x+1);;
					if(m+1==n|| m+2==n) {
						for(int y=0;y<words.length();) {
							if(m+2!=n && m+1!=n) {
								flag=1;
								break;
							}
							y+=2;
						}
					}
					else {
						int mid = words.length() / 2;
					    int[] left = new  int[mid];
					    int[] right = new  int[words.length()- mid];
					    for (int k = 0; k < mid; k++) {
					        left[k] = words.charAt(k);
					    }
					    for (int k = mid; k < words.length(); k++) {
					        right[k-mid] = words.charAt(k);
					    }
						int k=0,l=right.length-1;
						while(k<mid) {
			    	int temp=left[k]=='('?left[k]+1:left[k]+2;
			    	if(temp!=right[l]) {
			    		flag=1;
			    		break;
			    	}
			    	k++;l--;
			    }
			}
					System.out.println(flag==1?"false":"true");
			}
		}	
	}
}
		
	

