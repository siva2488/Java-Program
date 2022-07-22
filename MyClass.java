//import java.util.*;
//public class ads {
//	public static void main(String[] args) throws Exception {
//		Scanner s=new Scanner(System.in);
//	  int size=s.nextInt();
//	  int arr[]=new int[size];
//	  for(int i=0;i<size;i++) {
//		  arr[i]=s.nextInt();
//	  }
//	  int k=s.nextInt(),flag=0;
//	  int j=0,count=0;
//	  aa:
//	  for(int i=1;i<=size/3;i++) {
//		 for(;j<size;j++) {
//			 if(arr[j]==k) {
//				 count++;
//				 j=i*3+1;
//				 flag=1;
//				 break;
//			 }
//			 else if(j%3==0) {
//				 flag=0;
//				 break aa;
//			 }
//		 }
//	  }
//	System.out.println(flag==1?1:0);
//	}
//}
import java.util.*;
public class MyClass {
	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		String check=s.nextLine().toLowerCase();
		String op="";
		for(int i=0;i<check.length();i++) {
		  int num=check.charAt(i);
		  if(num<118) {
			  char word=(char)(num+5);
			  op+=word;
		  }
		  else {
			char word=(char)(96+((num+5)%122));
			 op+=word;
		  }
	  }
	System.out.println((op));
	}
}
