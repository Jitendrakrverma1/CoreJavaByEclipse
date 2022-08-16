
       // Enter Month number & print number of days in month
// input=> month number  1  -->January=31 days
package Jitendra;
import java.util.Scanner;
public class Month_Number_and_day_of_month {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter number of month:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		if(n==1) {
			System.out.print("Jan=31 days");
		}else if(n==2) {
			System.out.print("Feb=28 days");
		}else if(n==3) {
			System.out.print("March= 31 days");
		}else if(n==4) {
			System.out.print("April= 30 days");
		}else if(n==5) {
			System.out.print("May= 31 days");
		}else if(n==6) {
			System.out.print("June= 30 days");
		}else if(n==7) {
			System.out.print("July= 31 days");
		}else if(n==8) {
			System.out.print("Auguest= 31 days");
		}else if(n==9) {
			System.out.print("Sept= 30 days");
		}else if(n==10) {
			System.out.print("Oct= 31 days");
		}else if(n==11) {
			System.out.print("Nov= 30 days");
		}else if(n==12) {
			System.out.print("Dec= 31 days");
		}else {
			System.out.print("Not a month of the year.........");
		}
		s.close();
	}

}
