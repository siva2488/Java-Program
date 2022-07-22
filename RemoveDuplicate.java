//write program to remove duplicate elements in array
import java.util.Scanner;
public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int elements=s.nextInt();
		int array1[]=new int[elements];
			for(int i=0;i<elements;i++) {
				array1[i]=s.nextInt();
			}
			for(int i=0;i<elements;i++) {
				int flag=0;
				for(int j=i+1;j<elements;j++) {
					if(array1[i]==array1[j]) {
						array1[j]=-1;
						flag=1;
					}
				}
			}
			for(int i=0;i<elements;i++) {
				if(array1[i]>0)
					System.out.print(array1[i]+" ");
			}
			}
	}

