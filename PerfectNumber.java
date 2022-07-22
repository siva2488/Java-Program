import java.util.*;
class PerfectNumber{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int lower=s.nextInt();
int upper=s.nextInt();
int flag=0;
if(lower>0 && upper>0){
System.out.println("perfect numbers are:");
	for(int i=lower;i<upper;i++){
	int j=1,sum=0;
	while(i!=0 && j<i) {
		if(i%j==0)
			sum=sum+j;
		j++;
	}
	if(sum==i) {
		System.out.print(i+" ");
	}
}
}
else {
	System.out.println("Invalid Input");
}
}
}

