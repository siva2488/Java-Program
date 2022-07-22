import java.util.*;
class Unlucky13 {
    public static void main(String args[] ) {
       Scanner s=new Scanner(System.in);
       int T=s.nextInt();
       for(int i=0;i<T;i++) {
    	   int N=s.nextInt();
    	   int number=1,count=1;
    	   		while(true) {
    	   			int numberOfDigits = (int) (Math.log10(number) + 1);
    	   			if(numberOfDigits==N+1) {
    	   				break;
    	   			}
    	   			else {
    	   				int temp=number,tot=0;
    	   				for(int j=0;j<2;j++) {
    	   					int rem=temp%10;
    	   					temp=temp/10;
    	   					tot=tot*10 +rem;
    	   				}
    	   			if(tot!=31) 
    	   				count++;
    	   			number++; 
    	   			}
    	   		}
    	   		System.out.println(count);
       	} 
    }
}




//triplets in an array
//leaders in an array  16,17,4,3,5,2(17,5,2)
//
