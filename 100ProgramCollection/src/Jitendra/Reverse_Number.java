
                // Print Reverse Number
package Jitendra;
import java.util.Scanner;
public class Reverse_Number {
	public static void main(String[] args) {
		int n,r;
		System.out.print("Enter any number:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.print("Reverse number:");
		 while(n>0) 
		{
		  r = n%10;
		 System.out.print(r+"");
		  n = n/10;
		}  
		s.close();
	}
}
