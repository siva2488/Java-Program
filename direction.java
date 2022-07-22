import java.util.Scanner;
public class direction {
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt(),N=0,S=0,E=0,W=0;
		float duration=0;
		String ip[][]=new String[num][3];
		for(int i=0;i<num;i++) {
			for(int j=0;j<3;j++) {
				ip[i][j]=sc.next();	
			}
		}
		for(int i=0;i<num;i++) {
			duration=duration+((Float.parseFloat(ip[i][0])/Float.parseFloat(ip[i][1])*60));
			if(ip[i][2].equals("N"))
				N=N+Integer.parseInt(ip[i][0]);
			else if(ip[i][2].equals("S"))
				S=S+Integer.parseInt(ip[i][0]);
			else if(ip[i][2].equals("E"))
				E=E+Integer.parseInt(ip[i][0]);
			else if(ip[i][2].equals("W"))
				W=W+Integer.parseInt(ip[i][0]);
		}
		System.out.println(Math.round(duration));
		if(N>S) {
			if(E>W)
				System.out.println("NE");
			else if(W>E)
				System.out.println("NW");
			else
				System.out.println("N");
		}
		else {
			if(N==S) {
				if(W>E)
					System.out.println("W");
				else if(E>W)
					System.out.println("E");
			}
			
			else
				if(E==W) {
					if(S>N)
						System.out.println("S");
				}
				else if(E>W)
						System.out.println("SE");
				else if(W>E)
					System.out.println("SW");
			
		}
	}
}
/*4
1 2 S
2 2 W
2 2 E*/
