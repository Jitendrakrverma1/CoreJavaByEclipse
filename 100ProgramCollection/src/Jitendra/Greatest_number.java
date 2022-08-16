package Jitendra;
import java.util.Scanner;
public class Greatest_number {
	public static void main(String[] args) {
	  int a, b, c;
	  Scanner s = new Scanner(System.in);
	  System.out.print("Enter the value of a:");
	    a = s.nextInt();
	  System.out.print("Enter the value of b:");
		b = s.nextInt();
	  System.out.print("Enter the value of c:");
		c = s.nextInt();		
	  if(a>b && a>c) {
		  System.out.print(a+"is greater....");
	  }
	  else if(b>a && b>c) {
		  System.out.print(b+" is greater...");
	  }
	  else {
		  System.out.print(c+" is greater..");
	  }	
	 s.close();
	}
}
