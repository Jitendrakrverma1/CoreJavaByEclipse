
             // Prime number between two number
package Jitendra;
import java.util.Scanner;
public class Prime_Number_Between_two_Number {
	public static void main(String[] args) {
		int n1, n2, i, j;
		System.out.print("Enter value of two numwer:");
		Scanner s = new Scanner(System.in);
		n1 = s.nextInt();
		n2 = s.nextInt();
		for( i=n1; i<=n2; i++) {
			// loop for prime number
			for( j=2; j<=i; j++) {
				if(i%j==0)
					break;
			  }
			if(i==j)
				System.out.print(j+" ");
		}
		s.close();
	}
}
