package own;

import java.util.Scanner;

public class test
{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the length : ");
     int l = sc.nextInt();
     System.out.println("Enter the breadth : ");
     int b = sc.nextInt();
     Area obj = new Area();
     
     double area = obj.setDim(l,b);
     System.out.println("Area of the rectangle : "+area);
 }
}