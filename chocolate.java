import java.util.Scanner;
public class chocolate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("total no of chocolate");
		int chocolateCount=s.nextInt();
		System.out.println("total no of Persons");
		int Noofpersons=s.nextInt();
		int PersonRS[]=new int[Noofpersons];
		for(int i=0;i<Noofpersons;i++) {
			PersonRS[i]=s.nextInt();
		}
		for(int i=0;i<Noofpersons;i++) {
			PersonRS[i]=PersonRS[i]/2;
			if(chocolateCount!=0) {
			if(PersonRS[i]<=chocolateCount) {
				chocolateCount=chocolateCount-PersonRS[i];
				System.out.println("you can have"+" "+PersonRS[i]);
			}
			else{
				System.out.println("insufficient");	
			}
		}
			else {
				System.out.println("sorry no chocolate");	
				break;
			}
	}
	}
}
