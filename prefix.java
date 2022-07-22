import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class prefix {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		String str[]=br.readLine().split(" ");
		String s[]=new String[3];
		int num=Integer.parseInt(br.readLine()),flag=0;
		for(int i=0;i<num;i++){
			for(int j=i+1;j<num;j++){
				if(str[j].startsWith(str[i])) {
				s[i]=str[i];
				s[j]=str[j];
				flag=1;
				}
			}
		}
for(String x:s) {
	if(flag!=0&& x!=null)
	System.out.print(x+" ");
	else if(flag==0) {
		System.out.println("-1");
	break;
	}
}
	}

}
