
               // Prime number checker program
package Jitendra;
import java.util.Scanner;
public class Prime_Number {
	public static void main(String[] args) {
		int n,count=0;
		System.out.print("Enter any number:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.print("Number Prime number...");
			}
			else {
				System.out.print("Number is not Prime.");
			}
			s.close();
	}
}
