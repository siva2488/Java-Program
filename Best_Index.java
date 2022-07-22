import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Best_Index {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
		int size=Integer.parseInt(br.readLine());long max = 0;
		int[] num=new int[size];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<size;i++) {
			num[i]= Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<size;i++) {
			int len=1+i,temp=2; long sum=0;//0
			while(len+temp<=size){
				len=len+temp;
				temp++;
			}
			int j=i;
			while(len-i>0){
				sum=sum+num[j];
				j++;len--;
			}
			if(i==0) {
				max=sum;
			}
			else if(max<sum) {
				max=sum;
			}
		}
		System.out.println(max);
	}
}
