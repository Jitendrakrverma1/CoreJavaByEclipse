
         //  Sort array element in ascending order
package Jitendra;
import java.util.Scanner;
public class SortArrayElementInAcending_Order {
	public static void main(String[] args) {
		int a[] = new int[6];
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the array element:");
		for(int i=0; i<6; i++) {
			a[i] = s.nextInt();
		}
		for(int i=0; i<6; i++) {
			// here we take value of j is one more than i 
			for(int j=i+1; j<5; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
		}
		System.out.print("ascending order array element:");
		for(int i=0; i<6; i++)
			System.out.print(a[i]+" ");
		s.close();
	}
}
