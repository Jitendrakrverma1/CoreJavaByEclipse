
//           Convert Uppercase to LowerCase and vice-versa.
package Jitendra;
import java.util.Scanner;
public class Covert_Lower_to_Upper_and_Vice_versa {
	public static void main(String[] args) {
		char ch,ch2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any character:");
		ch = s.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			// Character.lowercase() is default package of java.lang
			ch2 = Character.toLowerCase(ch);
//			ch2 = ch.toLowerCase();   we can't take at this type
			System.out.print("Lowercase: "+ ch2);
		}
		else {
			ch2 = Character.toUpperCase(ch);
			System.out.print("Uppercase: "+ ch2);
		}
		s.close();
	}
}
