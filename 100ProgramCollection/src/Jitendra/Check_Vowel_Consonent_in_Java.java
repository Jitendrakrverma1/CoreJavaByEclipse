package Jitendra;
import java.util.Scanner;
public class Check_Vowel_Consonent_in_Java {
	public static void main(String[] args) {
		char ch;
		System.out.print("Enter the character:");
		Scanner s = new Scanner(System.in);
		ch = s.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.print("Vowel");
		}
		else {
			System.out.print("Consonent");
		}
		s.close();
	}
}
