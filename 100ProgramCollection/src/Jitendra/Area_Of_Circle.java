       // Area of Circle (A = pi*r*r)
package Jitendra;
import java.util.Scanner;
public class Area_Of_Circle {
	public static void main(String[] args) {
     int r;
     final double pi = 3.14;
     Scanner s = new Scanner(System.in);
     System.out.print("Enter the value of radius:=");
      r = s.nextInt();
      double Area = pi*r*r;
      System.out.print("The value of Area:"+Area);
      s.close();
	}

}
