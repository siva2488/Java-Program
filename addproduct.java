import java.util.Scanner;
public class addproduct {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int add=s.nextInt();
		int product=s.nextInt();
		aa:
			for(int i=1;i<add;i++) {
			for(int j=1;j<add;j++) {
				int temp=i+j;
				if(temp==add) {
					int temp2=i*j;
					if(temp2==product) {
						System.out.println(i<j?i+" "+j:j+" "+i);
						break aa;
					}
				}
			}
		}
	}

}
