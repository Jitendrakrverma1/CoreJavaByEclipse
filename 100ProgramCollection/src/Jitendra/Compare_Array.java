
            // Compare array
      // 1)  ==
      // 2)  equals()
package Jitendra;
import java.util.Arrays;
public class Compare_Array {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50}; 
		int b[] = {10,20,30,40,50};
		// use of (==) operator
//		if(a==b)
//			System.out.print("Both are equals...");
//		else
//			System.out.print("Both are not equal...");
		
		// use of equals method
		if(Arrays.equals(a, b)) {
			System.out.print("Both are equals....");
		}
		else {
			System.out.print("Both are not equals....");
		}
	}
}
