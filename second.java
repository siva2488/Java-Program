/*Given an array, reverse the elements present in odd index of the array.
 Note: Don’t use new array. Modify the existing input array.

Test Case 1:
Enter the array size: 7
Enter the array elements: 1 3 2 5 6 4 7
Output array: 1 4 2 5 6 3 7
Explanation: 3,5,4 are the elements in odd index (1,3 and 5)
 of array. They are reversed. 1,2,6,7 are the elements in even 
 index (0,2,4 and 6) of array which are not changed.*/
import java.util.*;
public class second {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int array[]=new int[size];
		int temp=0;
		for(int i=0;i<size;i++) {
			array[i]=s.nextInt();
		}
		int len=size-1;
		for(int i=0;i<size;i++){
			if(i%2!=0) {
				temp=(temp*10)+array[i];//2
			}
		}
		for(int i=0;i<size;i++){
			if(i%2!=0) {
				array[i]=temp%10;
				temp=temp/10;	
			}
		}
		for(int x:array) {
			System.out.print(x+" ");
		}
		}
}


