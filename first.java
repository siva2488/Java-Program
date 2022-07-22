/*Accept values m and n from user and print every nth perfect square lesser than or equal to m.
A perfect square is a number that can be expressed as the product of two equal integers. [ for example 9 = 3*3 or 25 = 5*5]

Test case 1
Enter values for n and m: 3 300

Output
9, 36, 80, 144, 225


Test case 2
Enter values for n and m: 2 100
4, 16, 36, 64, 100*/

import java.util.*;
public class first {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);  
		int n=s.nextInt();
		int m=s.nextInt();
		for(int i=n;i<=m;) {
			if(i*i<=m) {
			System.out.print(i*i+" ");
			i=i+n;
			}
			else
				break;		
		}
	}
}
