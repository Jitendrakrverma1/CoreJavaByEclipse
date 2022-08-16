
          // Check divisiblity of 5
package Jitendra;
import java.util.Scanner;
public class Check_Divisiblity {
	public static void main(String[] args) {
	   int num;
	   System.out.print("Enter any number:");
	   Scanner s = new Scanner(System.in);
	   num = s.nextInt();
	   if(num%5==0) {
		   System.out.print("Divisble by 5...");
	   }
	   else {
		   System.out.print("Not Divisble by 5..");
	   }
	   s.close();
	}

}
