/*Find the array element which is closest to the array elements average.
Array elements are integers.

Example 1 :
Enter number of elements in the Array : 5
Enter array elements : 1 2 3 4 5
Average is : 3
Array element closest to the average is : 3*/
import java.util.*;
public class third {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of elements in the Array :"+" ");
        int size=s.nextInt();
        int array[]=new int[size];
        int sum=0;
        System.out.print("Enter array elements :"+" ");
        for(int i=0;i<size;i++) {
            array[i]=s.nextInt();
            sum=sum+array[i];
        }
        int avg=sum/size;
        System.out.println("Average is :"+" "+avg);
        int n=0;
        int found = 0;
        for(int i=0;i<size;i++) {
            if (found == 0) {
                for (int j = 0; j < size; j++) {
                    if (avg + n == array[j] || avg - n == array[j]) {
                        System.out.println(array[j]);
                        found = 1;
                        break;
                    }
                }
                n++;
            }
        }
	}
}
