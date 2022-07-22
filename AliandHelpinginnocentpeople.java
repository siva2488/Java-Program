import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AliandHelpinginnocentpeople {
	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		String tag=br.readLine();
		int flag=0;
			if(((int)tag.charAt(0)-48+(int)tag.charAt(1)-48)%2==0 && ((int)tag.charAt(3)-48+(int)tag.charAt(4)-48)%2==0 &&((int)tag.charAt(4)-48+(int)tag.charAt(5)-48)%2==0 && ((int)tag.charAt(7)-48+(int)tag.charAt(8)-48)%2==0){
					flag=1;
			}
			if(tag.charAt(2)=='A'||tag.charAt(2)=='E'||tag.charAt(2)=='I'||tag.charAt(2)=='O'||tag.charAt(2)=='U'||tag.charAt(2)=='Y'){
				flag=0;
			}
		System.out.println(
);
	}

}
