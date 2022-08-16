
       // Delete array element
package Jitendra;
import java.util.Scanner;
public class Delete_Array_Element {
	public static void main(String[] args) {
		int size,loc;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size:");
		size = s.nextInt();
		int a[] = new int[size+1];
		System.out.print("Enter the element of array:");
		for(int i=0; i<size; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("\nEnter Array location:");
		loc = s.nextInt();
		for(int i=loc; i<size-1; i++) {
			a[i] = a[i+1];
		}
		size--;
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		s.close();
	}
}
