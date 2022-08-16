                      // Factorial of  number
    // 5! = 5*4*3*2*1

package Jitendra;
import java.util.Scanner;
public class Factorial_of_Number {
	public static void main(String[] args) {
		int num , fact=1;
		Scanner s = new Scanner(System.in);
		System.out.print("enter the value of num:");
		num = s.nextInt();
		for(int i=1; i<=num; i++)
		{
		   	fact = i*fact;
		}
		System.out.print("Factorial of"+" "+num+" is:="+fact);
		s.close();
	}
}
