import java.util.Scanner;
public class primefac {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=2;i<=num;i++){
			int temp=0;
			if(num%i==0){
				for(int j=1;j<=i;j++){
					if(i%j==0) {
						temp++;
					}
				}
			}
			if(temp==2) {
				System.out.println(i);
			}
		}

	}

}
