package Jitendra;
import java.util.Scanner;
public class Maximum_Number {
	public static void main(String[] args) {
	 int a, b ;
	 Scanner s = new Scanner(System.in);
	 System.out.print("Enter the value of a: ");
	 a = s.nextInt();
	 System.out.print("Enter the value of b: ");
	 b = s.nextInt();
	 if(a>b) {
		 System.out.print("A is greater...."+a);
	 }
	 else {
		 System.out.print("B is gereter..."+b);
	 }
	 s.close();
	 
	}

}
