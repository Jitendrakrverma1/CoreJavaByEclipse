
          // Arrays Method := sort() , equals(), copyOf() method
package Jitendra;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays_Method {
	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of array:");
		for(int i=0; i<a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Enter the value of second array:");
		for(int i=0; i<a.length; i++) {
			b[i] = s.nextInt();
		}
		// use of Arrays.sort() method
		System.out.print("\nUse of Arrays.sort() method:");
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nUse of Arrays.equals() method:");
		// use of Arrays.equals() method 
		boolean c = Arrays.equals(a, b);
		System.out.print("\nKya Array Equal Hai:"+c);
		// use of Arrays.copyOf() method
//		int a1[] = Arrays.copyOf(int[] original, int newlength)
		System.out.print("\nUse of Arrays.Copyof() method:");
		int a1[] = Arrays.copyOf(a, 5);
		for(int i=0; i<a.length; i++) {
			System.out.print(a1[i]+" ");
		}
		s.close();
	}
}
