import java.util.Scanner;

public class aspirepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner ip=new Scanner(System.in);
	        int n=ip.nextInt();
	        int i=2;
	        int s=n;
	        for(int j=0;j<n-1;j++)
	        {
	            System.out.print(" ");
	        }
	        System.out.println(" 1");
	        while(i<=n)
	        {
	            for(int k=s;k>2;k--)
	            {
	                System.out.print(" ");
	            }
	            int sum=0;
	            for(int j=i;j>1;j--)
	            {
	                System.out.print(" "+j);
	                sum+=j;
	            }
	            System.out.print(sum>9?" "+sum:" "+sum);
	            for(int j=2;j<=i;j++)
	            {
	                System.out.print(" "+j);
	            }
	            System.out.print(" ");
	            System.out.println();
	            i++;
	            s--;
	        }
	        int size=n-1;
	        int m=1;
	    while(size>1)
	    {
	        for(int j=0;j<m;j++)
	        {
	            System.out.print(" ");
	        }
	        int sum=0;
	        for(int j=size;j>1;j--)
	        {
	            System.out.print(" "+j);
	            sum+=j;
	        }
	        System.out.print(sum>9?" "+sum:" "+sum);
	        for(int j=size;j>1;j--)
	        {
	            System.out.print(" "+j);
	        }
	        m++;
	        size--;
	        System.out.println();
	    }
	    for(int j=0;j<n-1;j++)
	        {
	            System.out.print(" ");
	        }
	        System.out.println(" 1");

	}

}
