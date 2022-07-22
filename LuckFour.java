//LUCK FOUR
import java.util.Scanner;
class luckFour
{
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++){
	       arr[i]=s.nextInt();
	    }
	    fourCount(size,arr);
	    for(int output:arr){
		   System.out.println(output);
	    }
	    }
		public static int[] fourCount(int size,int arr[]){
	    	for(int i=0;i<size;i++){ 
	    		int op=0;
	    	while(arr[i]>0){
	         int rem=arr[i]%10;
	            if(rem==4)
	            	op++;
	            arr[i]=arr[i]/10;
	        }
	        arr[i]=op;
	    	}
			return arr;	
	}
}