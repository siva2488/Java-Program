import java.util.*;
public class cupcakePacking {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int testcase=in.nextInt();
		for(int i=0;i<testcase;i++)
		{
		  int cupcake=in.nextInt();
			  System.out.println((cupcake/2)+1);
		}
	}
}