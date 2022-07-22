import java.io.BufferedReader;
import java.io.InputStreamReader;
public class StudyingAlphabet {
	public static void main(String[] args)throws Exception  {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		String s=br.readLine();
		int noOfWord=Integer.parseInt(br.readLine());
		for(int i=0;i<noOfWord;i++) {
			String check=br.readLine();
			int count=0;
			for(int j=0;j<check.length();j++) {
				for(int k=0;k<s.length();k++) {
					if(check.charAt(j)==s.charAt(k)) {
						count++;
						break;
					}
				}				
			}	
				System.out.println(count==check.length()?"Yes":"No");
		}
	}

}
