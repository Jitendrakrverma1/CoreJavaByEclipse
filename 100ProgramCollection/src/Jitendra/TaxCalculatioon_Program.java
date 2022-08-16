      // Tax Calculation Program 
// if salary<=100000 ==> then no tax
// if salary>100000 b/w 10000000 ==> 10% tax
// if tax is 20%.
package Jitendra;
import java.util.Scanner;
public class TaxCalculatioon_Program {
	public static void main(String[] args) {
		int sal;
		float tax;
		System.out.print("Enter salary:");
		Scanner s = new Scanner(System.in);
		sal = s.nextInt();
		if(sal<=100000) {
			System.out.print(sal+"no tax");
		}
		else if(sal>100000 && sal<=1000000) {
			tax = sal*0.10F;
			System.out.print(sal+" "+tax);
		}
		else {
			tax = sal*0.20F;
			System.out.print(sal + " "+tax);
		}
		s.close();
	}
}
