package Jitendra;
import java.util.Scanner;
public class UserInputInJava {
  public static void main(String[] args) {
	  int a,b;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the value:");
	  a=s.nextInt();
	  System.out.println("Enter the value:");
	  b=s.nextInt();
	  System.out.println(a);
	  System.out.println(b);
	  s.close();
  }
}
