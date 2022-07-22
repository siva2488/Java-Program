import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Cost_of_balloons {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
		int Testcase=Integer.parseInt(br.readLine());
		if (1 <= Testcase && Testcase <= 10) {
			for(int i=0;i<Testcase;i++) {
				String[] cost = br.readLine().split(" ");
				int participants=Integer.parseInt(br.readLine());
				int First=0,Second=0;
				if (1 <= participants && participants <= 10) {
					for(int k=0;k<participants;k++) {
						String[] status = br.readLine().split(" ");
						if(Integer.parseInt(status[0]) != 0) {
							First++;
						}
						if (Integer.parseInt(status[1]) != 0) {
							Second++;
						}
					}
					System.out.println(First*Integer.parseInt(cost[0])+Second*Integer.parseInt(cost[1])<First*Integer.parseInt(cost[1])+Second*Integer.parseInt(cost[0])?First*Integer.parseInt(cost[0])+Second*Integer.parseInt(cost[1]):First*Integer.parseInt(cost[1])+Second*Integer.parseInt(cost[0]));
				}
			}
		}
	}
}

