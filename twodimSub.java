import java.util.Scanner;
public class twodimSub {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);	
	String word=s.nextLine();
	String sub=s.nextLine();
	char[][] towdim=new char[5][5];
	int count=0;
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++){
			towdim[i][j]=word.charAt(count);
			count++;
			if(count==word.length())
				break;
		}
	}
//	for(int i=0;i<5;i++) {
//		for(int j=0;j<5;j++){
//			System.out.print(towdim[i][j]);
//		}
//		System.out.println();
//	}
	int k=0;
	for(int i=0;i<5;i++) {
	for(int j=0;j<5;j++){
		if(towdim[i][j]==sub.charAt(k)) {
			int l=j+1,count1=2;
			if(towdim[i][l]==sub.charAt(k)) {
				int inc=2;
				while(inc<sub.length()) {
					l++;
					if(towdim[i][l]==sub.charAt(k)) {
						count1++;
					}
					inc++;
				}
				if(count1==sub.length()) {
					System.out.println("St index"+i+" "+j);
					System.out.println("end index"+(i)+" "+(j+(sub.length()-1)));
				}
			}
		}
		if(towdim[i][j]==sub.charAt(k)) {
			int l=i+1,count1=2;
			if(towdim[l][j]==sub.charAt(k)) {
				int inc=2;
				while(inc<sub.length()) {
					l++;
					if(towdim[l][j]==sub.charAt(k)) {
						count1++;
					}
					inc++;
				}
				if(count1==sub.length()) {
					System.out.println("St index"+i+" "+j);
					System.out.println("end index"+(i+(sub.length()-1))+" "+(j));
				}
			}
		}
	}
	}
	}

}
