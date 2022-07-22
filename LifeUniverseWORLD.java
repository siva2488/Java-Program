import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LifeUniverseWORLD {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		while(true){
			int num=Integer.parseInt(br.readLine());
			if(num==42)
			break;
			else
			System.out.println(num);
		}
	}
}