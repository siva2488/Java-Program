import java.util.Scanner;
public class para {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String str=ip.next();
		int open=0,close=0;
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='(')
			{
				open++;
			}
			else
			{
				close++;
			}
		}
		if(open%2==1)
		{
			for(int i=n-1;i>=0;i--)
			{
				if(str.charAt(i)==')')
				{
					System.out.println(str.substring(0,i)+str.substring(i+1));
					break;
				}
			}
		}
		else if(close%2==1)
		{
			for(int i=n-1;i>=0;i--)
			{
				if(str.charAt(i)=='(')
				{
					System.out.println(str.substring(0,i)+str.substring(i+1));
					break;
				}
			}
		}
	}
}
/*
 (())(()
 
 op:
 
(())() */
