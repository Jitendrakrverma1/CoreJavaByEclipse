
          // Insert item in Array
package Jitendra;
import java.util.Scanner;
public class Insert_Item_In_Array {
	public static void main(String[] args) {
		int size,loc,item;
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
		System.out.print("\nEnter new item:");
		item = s.nextInt();
		for(int i=size; i>loc; i--) {
			a[i] = a[i-1];
		}
		a[loc]=item;
		size++;
		for(int i=0; i<size; i++) {
			System.out.print(a[i]+" ");
		}
		s.close();
	}
}
