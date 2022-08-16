
                  //ASCII value of Character in java
package Jitendra;
import java.util.Scanner;
public class ASCII_Value_of_Character {
	public static void main(String[] args) {
		char ch;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Character:");
	    ch = s.next().charAt(0);	
	   int a = ch;
	   System.out.print("ASCII Value is:"+a);
	   s.close();
	}

}
