import java.util.Scanner;
class demo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] arr = new double[n][2];
        String[] dir = new String[n];
        double sum = 0;
        for(int i=0;i<n;i++)
        {
            arr[i][0] = Math.ceil(sc.nextDouble());
            arr[i][1] = Math.ceil(sc.nextDouble());
            dir[i]  = sc.next();
            sum = (((arr[i][0])/arr[i][1])*60) + sum;
        }
        System.out.println((int)Math.ceil(sum));
    }
}