import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class braces {
	public static void main(String[] args) throws Exception {
		InputStreamReader ip=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ip);
		String s=br.readLine();
		char arr[]=s.toCharArray();
		int count1=0,count2=0;
		if(s.length()%2==1) {
			System.out.println(-1);
		}
		else {
		int len=s.length()-1;//{}
		for(int i=0;i<arr.length;i++) {
			if((i%2==0 && arr[i]=='{')||(i%2==1 && arr[i]=='}')){
				count1++;
			}
			else {
				while(arr[i]=='}'){
					int k=i;
					if(arr[len]!='}') {
					 for(int j=k+1;j<=len;j++) {
							char temp=arr[k];
							arr[k]=arr[j];
							arr[j]=temp;
							k++;
							count2++;
					 	}
					}
					 len=len-2;
					 if(len<0)
						 break;
					 }
			}
		}
		if(count1==arr.length)
			System.out.println(0);
		else
			System.out.println(count2);
		}
	}
}
