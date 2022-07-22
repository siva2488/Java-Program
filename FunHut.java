import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class FunHut {
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		int testcase=s.nextInt();
		for(int i=0;i<testcase;i++) {
			int breakfast=s.nextInt(),op=0;
			float arr[][]=new float[breakfast][4];
			for(int j=0;j<breakfast;j++) {
				for(int k=0;k<4;k++) {
					arr[j][k]=s.nextInt();
				}
			}
			for(int j=0;j<breakfast;j++) {
				for(int k=j+1;k<4;k++) {					
					if(arr[j][0] > arr[k][0] &&arr[j][1]<arr[k][1]){
						op++;	
						arr[j][0]=arr[j][2];
					}else if(arr[j][0] == arr[k][0] &&arr[j][1]<arr[k][1] ){
						arr[k][0]=(float) (arr[k][0]+0.5);
						op++;
					}
					
				}
			}
			System.out.println(op);
		}
	}
}
