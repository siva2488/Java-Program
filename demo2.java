//package own;
//import java.util.Scanner;
//public class demo2 {
//    public static void main(String[] args) {
//        Scanner ip=new Scanner(System.in);
//        String str=ip.nextLine();
//        String str2="";
//        int count=1;
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)<='z' && str.charAt(i)>='a'||str.charAt(i)==' ')
//            {
//                str2=str2+str.charAt(i);
//            }
//            if(str.charAt(i)==' ')
//            {
//                count++;
//            }
//        }
//        System.out.println(count);
//        int count1=0,j=0;
//        String str4[]=new String[count];
//        int n=str2.length();
//        for(int i=0;i<n;i++)
//        {
//            if(str2.charAt(i)==' '|| str2.charAt(i)==str2.charAt(n-1))
//            {
//                String str3="";
//                for(int k=count1;k<i;k++)
//                {
//                    str3=str3+str2.charAt(k);
//                }
//                str4[j++]=str3;
//                count1=i+1;
//            }
//        }
//        for(int i=0;i<count;i++)
//        {
//            System.out.println(str4[i]);
//        }
//        
//    }
//}
package own;
import java.util.*;
class demo2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        for(int i=0;i<word.length();i++) {
        	 for(int j=i+1;j<word.length();j++) {
             	System.out.println(word.substring(i, j));
             }
        }
        System.out.println("Hello, World!"); 
    }
}
