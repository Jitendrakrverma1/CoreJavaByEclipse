package Jitendra;
import java.util.Scanner;
public class Eligible_vote {
	public static void main(String[] args) {
		int age;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age:");
		 age = s.nextInt();
		if(age>18) {
			System.out.print("you are eligible for vote..");
		}
		else {
			System.out.print("you are not eligible...");
		}
		s.close();
	}
}
