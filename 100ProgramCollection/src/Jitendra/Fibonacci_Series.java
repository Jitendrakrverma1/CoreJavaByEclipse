
       // Print fibonacci series
// 0 1 1 2 5 8 11.............
package Jitendra;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int a=0, b=1,c,term;
		System.out.print("Enter term:");
		Scanner s = new Scanner(System.in);
		term = s.nextInt();
		for(int i=1; i<=term; i++) {
			System.out.print(a+" ");
			c = a + b;
			a = b;
			b = c;
		}
		s.close();
	}

}
