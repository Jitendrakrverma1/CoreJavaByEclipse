
                  // Print 2D Array
package Jitendra;

import java.util.Scanner;
public class Print_2D_Array {
	public static void main(String[] args) {
		int a[][] = new int[2][2];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element of Array:");
		for(int i=0; i<2; i++) {          // row
			for(int j=0; j<2; j++) {      // column
				a[i][j] = s.nextInt();
			}
		}
		System.out.print("Matrix:\n");
		for(int i=0; i<2; i++) {          // row
			for(int j=0; j<2; j++) {      // column
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		s.close();
	}
}
