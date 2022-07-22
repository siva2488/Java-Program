import java.util.Scanner;
public class mahasena {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int size=s.nextInt();
		 int soldiers[]=new int[size];
		 int odd=0,even=0;
		 for(int i=0;i<size;i++) {
			 soldiers[i]=s.nextInt();
			 int count=soldiers[i]%2==0?even++:odd++;
		 }
		 System.out.println(even>odd?"READY FOR BATTLE":"NOT READY");
	}
}
