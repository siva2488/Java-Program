import java.util.Scanner;
public class LeftOrRight {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int testcase=s.nextInt(),left=0,right=0;
		for(int i=0;i<testcase;i++) {
			String ip=s.next();
			for(int j=0;j<ip.length();j++) {
				if(ip.charAt(j)=='L')
					left++;
				else
					right++;
			}
			//int min=left>right?left-right:right-left;
			if(left>=right){
				int min=left-right;
				if(min%4==0 || min%4==4)
					System.out.println("Starting position");
				else if(min%4==1)
					System.out.println("left");
				else if(min%4==2)
					System.out.println("opposite to start");
				else if(min%4==3)
					System.out.println("right");
			}
			else {
				int min=right-left;
				if(min%4==0 || min%4==4)
					System.out.println("Starting position");
				else if(min%4==1)
					System.out.println("right");
				else if(min%4==2)
					System.out.println("opposite to start");
				else if(min%4==3)
					System.out.println("left");
			}		
		}	
	}

}
