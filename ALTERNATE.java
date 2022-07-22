import java.util.Scanner;
public class ALTERNATE {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);	
		int size=s.nextInt();
		int array[]=new int[size];
		int max[]=new int[size];
		int min[]=new int[size];
		for(int i=0;i<size;i++){
			array[i]=s.nextInt();
		}
		int temp2;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++) {
				if(array[i]<array[j]) {
					temp2=array[i];
					array[i]=array[j];
					array[j]=temp2;
				}
			}	
		}
		int k=1,l=0;
		for(int i=0;i<size;i++){
			if(i%2==0) {
			System.out.print(array[l]+" ");
			l++;
			}
			else {
			 System.out.print(array[size-k]+" ");
			 k++;
			}
			}
	}

}
