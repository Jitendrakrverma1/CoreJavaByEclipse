
                   //Find factor of number

// input 10 => 1,2,5,10
package Jitendra;
import java.util.Scanner;
public class Factor_Of_Number {
	public static void main(String[] args) {
      int n;
      System.out.print("Enter any number:");
      Scanner s  = new Scanner(System.in);
      n = s.nextInt();
    for(int i=1; i<=n; i++) {
    	if(n%i==0) {
    		System.out.print(i+"  ");
    	}
    }
      s.close();
	}
}
