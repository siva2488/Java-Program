import java.util.*;

public class DISPLAY_BASEDONWEIGHT {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int numArray[]=new int[size];
		int weightArray[]=new int[size];
		for(int i=0;i<size;i++) {
			numArray[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(numArray[i]%2==0) {
				weightArray[i]=weightArray[i]+3;
			}
			if(numArray[i]%4==0&& numArray[i]%6==0) {
				weightArray[i]=weightArray[i]+4;
			}
			for(int j=1;(j*j)<=numArray[i];j++) {
				if(numArray[i]%j==0&&numArray[i]/j==j) {
					weightArray[i]=weightArray[i]+5;
			}	
			}
		}
		int temp1,temp2;
		for(int i=0;i<size;i++) {
			int j=i;
			for(j=i+1;j<size;j++) {
				if(weightArray[i]<weightArray[j]) {
					temp1=weightArray[i];
					temp2=numArray[i];
					weightArray[i]=weightArray[j];
					numArray[i]=numArray[j];
					weightArray[j]=temp1;
					numArray[j]=temp2;
				}
			}	
		}
		for(int i=0;i<size;i++) {
			System.out.println(numArray[i]+","+weightArray[i]);
		}
		
	}
}
