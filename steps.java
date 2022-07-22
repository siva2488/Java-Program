import java.util.Scanner;
public class steps {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the total no of steps");
        int noOfstep=s.nextInt();
        if(noOfstep<=3){
        	System.out.println(noOfstep);
        }
        if(noOfstep>3) {
        	System.out.println(((noOfstep-1)+(noOfstep-2))+1);//3-1+3-2+1
        }
       // System.out.println("The total no of ways"+staircount(n+1));
    }
}

//import java.util.Scanner;
//public class steps {
//     static int staircount(int n)
//     {
//         if(n<=1)
//            return n;
//         //System.out.println(staircount(n-1) + staircount(n-2));
//         return staircount(n-1) + staircount(n-2);//3-1+3-2
//     }
//    public static void main(String[] args) {
//        Scanner ip=new Scanner(System.in);
//        System.out.println("enter the total no of steps");
//        int n=ip.nextInt();
//        System.out.println("The total no of ways"+staircount(n+1));
//    }
//}