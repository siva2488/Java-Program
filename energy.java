import java.util.Scanner;
public class energy {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int Energy=s.nextInt();
		int EnergyAdded=s.nextInt(),Seconds=s.nextInt(),total=Energy;
		for(int i=0;i<(Seconds-1);i++) {
			Energy=(Energy+Seconds);
			total=total+Energy;
		}
		System.out.println(total);
	}
}
