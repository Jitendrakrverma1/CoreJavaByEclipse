
        // Find sum of Array Element
package Jitendra;
import java.util.Scanner;
public class Sum_Of_Array_Elemnet {
	public static void main(String[] args) {
		int a[] = new int[5];
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the element of first array:");
		for(int i=0; i<5; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Array Elemnt:");
		for(int i=0; i<5; i++) 
		{
		  System.out.print(a[i]+" ");
		  sum = sum + a[i];
		}
		System.out.print("\nSum Of Array Element:"+sum);
		s.close();
	}
}
