
             // Palindrome Number in Java
package Jitendra;
import java.util.Scanner;
public class Palindrome_Number {
	public static void main(String[] args) {
		int n,reverse=0,reminder;
		System.out.print("Enter any number:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int c = n;
		while(n>0) {
			reminder = n%10;
			reverse = reverse*10+reminder;
			n = n/10;
		}
		if(reverse==c) {
			System.out.print("Number is palindrome...");
		}else {
			System.out.print("Number is not palindrome....");
		}
		s.close();
	}

}
