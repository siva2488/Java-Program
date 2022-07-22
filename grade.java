import java.util.Scanner;
public class grade {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<0) {
			System.out.println("Invalid Input");
		}
		else {
		String grade[]=new String[n];
		for(int i=0;i<n;i++) {
			grade[i]=s.next();
		}
		loopBreak:
		for(int i=0;i<n;i++) {
			int total=0;
			String []temp=grade[i].split(":");
			for(int j=1;j<temp.length;j++){
				if(Integer.parseInt(temp[j])<=100) {
				total=total+Integer.parseInt(temp[j]);
				}
				else {
					System.out.println(temp[0]+":"+" "+"wh");
					break loopBreak;
				}
			}
			if(total>=400 && total<=500) {
				System.out.println(temp[0]+":"+" "+"O");
			}
			else if(total>=300 && total<=399) {
				System.out.println(temp[0]+":"+" "+"A");
			}
			else if(total>=250 && total<=299) {
				System.out.println(temp[0]+":"+" "+"B");
			}
			else if(total>=200 && total<=249) {
				System.out.println(temp[0]+":"+" "+"C");
			}
			else if(total>=0 && total<=199) {
				System.out.println(temp[0]+":"+" "+"E");
			}
			}
		}
		}
	}


