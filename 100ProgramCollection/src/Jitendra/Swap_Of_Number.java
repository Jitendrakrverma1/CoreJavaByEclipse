
           // Swap of two number
package Jitendra;
import java.util.Scanner;
public class Swap_Of_Number {
	public static void main(String[] args) {
		int a, b, swap;
		Scanner s = new Scanner(System.in);
		System.out.println("Before Swapping----");
		System.out.println("Enter value of a:");
		a = s.nextInt();
		System.out.print("Enter value of b:");
		b = s.nextInt();
		 swap = a;
		 a = b;
		 b = a;
		System.out.println("After Swapping---"); 
		   System.out.println("The value of a:"+a);
		   System.out.println("The value of b:"+b);
		   System.out.println("The value of swap:"+swap);
		   s.close();
	}
}