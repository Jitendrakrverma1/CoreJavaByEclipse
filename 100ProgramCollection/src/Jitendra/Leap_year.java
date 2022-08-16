
       // Leap year program
package Jitendra;
import java.util.Scanner;
public class Leap_year {
	public static void main(String[] args) {
		int year;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Year:");
		year = s.nextInt();
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0) {
			System.out.println(year+" year is leap year....");
		}
		else {
			System.out.println(year+" year is not leap year...");
		}
		s.close();
	}

}
