package Jitendra;
import java.util.Scanner;
public class Print_Character_in_java {
	public static void main(String[] args) {
	  char ch;
	  System.out.println("Please enter character:");
	  Scanner s = new Scanner(System.in);
	  ch = s.next().charAt(0);
	  // in place of 0 that we want to write you can right and answer will 
//	  print according to index that you give.
	  System.out.println("Character is:"+ch);
	  s.close();
	}

}
