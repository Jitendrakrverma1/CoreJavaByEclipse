            // Area of Triangle

package Jitendra;
import java.util.Scanner;
import java.lang.Math;
public class Area_Of_Triangle {
	public static void main(String[] args) {
	  int a, b, c;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the value of triangle side:");
	  a = s.nextInt();
	  b = s.nextInt();
	  c = s.nextInt();
	  int sp = (a+b+c)/2;
	  int area = (int) Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
	  System.out.print("Area of triangle is:"+area);
	  s.close();
	}

}
