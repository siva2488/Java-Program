import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class RoyandProfilePicture {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int dimension=Integer.parseInt(br.readLine());
		int noOfPhotos=Integer.parseInt(br.readLine());
		for(int i=0;i<noOfPhotos;i++){
			String []s=br.readLine().split(" ");
			if(Integer.parseInt(s[0])>=dimension && Integer.parseInt(s[1])>=dimension && Integer.parseInt(s[0])==Integer.parseInt(s[1]))
				System.out.println("ACCEPTED");
			else if(Integer.parseInt(s[0])<dimension | Integer.parseInt(s[1])<dimension)
				System.out.println("UPLOAD ANOTHER");
			else 
				System.out.println("CROP IT");
		}
	}
}
