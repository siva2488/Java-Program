//ATM
import java.io.*;;
public class ATM {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	     BufferedReader br=new BufferedReader(r); 
		int withdraw=Integer.parseInt(br.readLine());
		if(withdraw>0 && withdraw<=2000) {
			double balance=Double.parseDouble(br.readLine());
		if(balance>0 && balance<=2000) {
			System.out.format("%.2f",Output(withdraw,balance));
		}
	}
	}
	public static double Output(int withdraw, double balance) {
		double op;
		if(withdraw%5!=0) {
			return balance;
		}
		else if(withdraw>=(balance-0.50)) {
			return balance;
		}
		else {
			return balance;
		}
	}		
}

