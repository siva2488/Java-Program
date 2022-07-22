import java.util.*;
class numberOfSteps{
    public static void main(String args[]){
     Scanner s=new Scanner(System.in);
    int size=s.nextInt(),count=0;
    int a[]=new int[size];
    int b[]=new int[size];
    for(int i=0;i<size;i++){
        a[i]=s.nextInt();
    }
    int min=a[0];
    for(int i=0;i<size;i++){
        b[i]=s.nextInt();
        if(a[i]<min)
        	min=a[i];
    }
    boolean b1=true;
//    while(b1) {
//    	b1=false;
//    for(int i=0;i<size;i++){
//        while(a[i]>min && b[i]!=0){
//           a[i]=a[i]-b[i];
//           count++;
//           b1=true;
//        }
//        if(min>a[i]) min=a[i];
//        if(min<0) break;
//    	}
//    }
    while(b1) {
    	b1 = false;
    		for(int i=0; i<size; i++) {
    			while(a[i]>min && b[i]!=0) {
    					a[i] = a[i]-b[i];
    					b1 = true;
    					count++;
    }
    if(min>a[i]) min = a[i];
    if(min<0) break; 
    }
    }
    System.out.println(min<0?count:-1);
    }
}
