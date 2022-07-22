import java.util.Scanner;
class brackets {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		String s[]=new String[n];
		String op="";
		for(int i=0;i<n;i++) {
			s[i]=ip.next();
		}
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				for(int j=0;j<s[i].length();j++) {
					char temp=s[i].charAt(j);
					if(!(op.contains(Character.toString(temp)))){
						op+=temp+" ";
						break;
					}
				}
			}
			else {
				for(int j=s[i].length()-1;j>0;j--) {
					char temp=s[i].charAt(j);
					if(!(op.contains(Character.toString(temp)))){
						op+=temp+" ";
						break;
					}
				}
			}
		}
		System.out.println(op);
	}
}
