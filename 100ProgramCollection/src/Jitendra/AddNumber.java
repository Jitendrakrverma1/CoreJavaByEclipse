package Jitendra;
import java.util.Scanner;
 public class AddNumber 
 {
   public static void main(String args[]) {
	   int a, b , sum;
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the num1:");
	   a = s.nextInt();
	   System.out.println("Enter the num2:");
	   b = s.nextInt();
	   sum = a + b;
	   System.out.print("***Sum of two num.:**"+sum);	   
	   s.close();

   }
 }
