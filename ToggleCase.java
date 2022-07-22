//toggle case
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToggleCase {
	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		String word=br.readLine();
		String op="";
		for(int i=0;i<word.length();i++){
			int temp=word.charAt(i);
			if(temp>=65 && temp<=90)
				op=op+(char)(temp+32);
			 if(temp>=97 && temp<=122)
				op=op+(char)(temp-32);	
		}
		System.out.println(op);
	}
}
