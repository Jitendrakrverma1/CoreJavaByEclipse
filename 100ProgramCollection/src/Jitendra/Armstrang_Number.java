
              // Armstrong number program
package Jitendra;
import java.util.Scanner;
public class Armstrang_Number{ 
	public static void main(String[] args) {
		int n;
		int rem,arm=0;
		System.out.print("Enter the Number:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int c= n;
		while(n>0) {
			 rem = n%10;
			arm = arm+(rem*rem*rem);
			 n = n/10;
		}
		if(c==arm) {
			System.out.print("Number is armstrong..");
		}else {
			System.out.print("Number is not Armstrong....");
		}
		s.close();
		
	}

}
