package Jitendra;
import java.util.Scanner;
public class Multiplication_Table {
	public static void main(String[] args) {
	 int num;
	 Scanner s = new Scanner(System.in);
	 System.out.print("Enter the value of n:");
	 num = s.nextInt();
	 for(int i=1; i<=num; i++) {
		  System.out.println(num+ "X" + i + "=" + num*i);
	 }
	 s.close();
	}
}
