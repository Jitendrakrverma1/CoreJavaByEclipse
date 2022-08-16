
          // check number is positive or negative

package Jitendra;
import java.util.Scanner;
public class Check_Number_positive_or_Negative {
	public static void main(String[] args) {
		int num;
		Scanner s  = new Scanner(System.in);
		 System.out.println("Enter the value of num:");
		 num = s.nextInt();
		 if(num>0) {
			 System.out.println(num+" Number is positive...");
		 }
		 else {
			 System.out.println(num+" Number is Negative...");
		 }
		s.close();
	}

}
