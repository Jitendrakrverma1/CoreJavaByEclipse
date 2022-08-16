
          // Different way to print array element
package Jitendra;
public class Print_Array_Element {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 11;
		a[1]=  12;
		a[2] = 13;
		a[3] = 14;
		a[4] = 15;
		// for loop
		System.out.println("Using for loop");
		for(int i=0; i<=4; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		// using foreach loop
		System.out.println("Using foreach loop");
		for(int b: a) {
			System.out.print(b+" ");
		}
	}

}
