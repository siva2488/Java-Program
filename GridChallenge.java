import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class GridChallenge {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		int TestCase=Integer.parseInt(br.readLine());
		if(TestCase>=1 && TestCase<=100){
			for(int i=0;i<TestCase;i++) {
				int RowCol=Integer.parseInt(br.readLine());
				char [][]a=new char[RowCol][RowCol];
				for(int j=0;j<RowCol;j++) {
						String s=br.readLine();
						for(int k=0;k<RowCol;k++) {
							a[j][k]=s.charAt(k);
						}
				}
				for(int j=0;j<RowCol;j++) {
					for(int k=0;k<RowCol;k++) {
						  System.out.print(a[j][k]);
					}
					System.out.println();
			}
				
			}
		}
	}
}

//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {		
//				int T=sc.nextInt();
//				int N;
//				String s;
//				String flag;
//				
//				for(int t=1;t<=T;t++)
//					{
//						N=sc.nextInt();
//						sc.nextLine();
//						char c[][]=new char[N][N];
//	
//						for(int i=0;i<N;i++)	
//							{
//								s=sc.nextLine();
//								for(int j=0;j<N;j++) c[i][j]=s.charAt(j);
//								
//								int j;
//								char p;
//								for(int k=1;k<N;k++)
//									{
//										j=k-1;
//										p=c[i][k];
//										while(j>=0 && p<c[i][j])
//											{
//												c[i][j+1]=c[i][j];
//												j--;
//											}
//										c[i][j+1]=p;
//									}
//							}
//						
//						flag="YES";
//						for(int i=0;i<N;i++)
//							{
//								for(int j=1;j<N;j++)
//									{
//										if(c[j][i]<c[j-1][i]) {flag="NO";break;}
//									}
//								if(flag=="NO") break;
//							}
//						
//						System.out.println(flag);
//					}
//    }
//}