import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class zoo {
	public static void main(String[] args) throws IOException {
//		 Scanner s=new Scanner(System.in);
//		 String word=s.nextLine();
//		 int z=0,o=0;
//		 if(word.length()<=20) {
//			 for(int i=0;i<word.length();i++){
//				 if(word.charAt(i)=='z'||word.charAt(i)=='Z')
//					 z++;
//				 else
//					 o++;
//			 }
//			 System.out.println(2*z==o?"Yes":"No");	 
//		 }
		
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
	 
	        // Reading data using readLine
	        String name = reader.readLine();
	        int a=Integer.parseInt(reader.readLine());
	        // Printing the read line
	        System.out.println(a);
	}
}
