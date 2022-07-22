//import java.io.BufferedReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//public class MonkandRotation {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		InputStreamReader r=new InputStreamReader(System.in);    
//	    BufferedReader br=new BufferedReader(r);
//		int Testcase=Integer.parseInt(br.readLine());
//		for(int i=Testcase;i>0;i--) {
//			int Size=Integer.parseInt(br.readLine());
//			int Steps=Integer.parseInt(br.readLine());
//			Steps=Steps%Size;
//			System.out.println(Steps);
//			int a[]=new int[Size];
//			for(int j=0;j<Size;j++) {
//				StringTokenizer st1 = new StringTokenizer(br.readLine());
//				a[j]=Integer.parseInt(st1.nextToken());
//			}
//			for(int j=0;j<Steps;j++) {
//				int temp2=a[Size-1];
//				for(int k=Size-1;k>0;k--) {
//					a[k]=a[k-1];
//				}
//				a[0]=temp2;
//			}
//			for(int x:a) {
//				System.out.print(x+" ");
//			}
//			System.out.println();
//		}

//	}
//}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class MonkandRotation {
	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
		int Testcase=Integer.parseInt(br.readLine());
		for(int i=Testcase;i>0;i--) {
		String []ip=br.readLine().split(" ");
		int size=Integer.parseInt(ip[0]);
		int step=Integer.parseInt(ip[1])%Integer.parseInt(ip[0]);
		String []num=br.readLine().split(" ");
		String first=String.join(" ",(Arrays.copyOfRange(num, size-step, size)));
		String second=String.join(" ",(Arrays.copyOfRange(num, 0, size-step)));
		
		System.out.println(step==0?second:first+" "+second);
		}
	}
}