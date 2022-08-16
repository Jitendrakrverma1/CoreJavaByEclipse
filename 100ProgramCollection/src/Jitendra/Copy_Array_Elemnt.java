
         // Copy Array Element
package Jitendra;
import java.util.Scanner;
public class Copy_Array_Elemnt {
	public static void main(String[] args) {
		int a[] = new int[4];
		int b[] = new int[4];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array element:");
		for(int i=0; i<4; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("\nFirst Array Element:");
		for(int i=0; i<4; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\n Second Array Element:");
		for(int i=0; i<4; i++) {
			b[i] = a[i];  // Copy First Array Element into Second Array
			System.out.print(b[i]+" ");
		}
		s.close();
	}
}
