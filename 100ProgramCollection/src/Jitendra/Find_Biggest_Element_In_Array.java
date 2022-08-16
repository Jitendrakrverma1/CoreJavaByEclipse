
         // Find Maximum number in Array
package Jitendra;
import java.util.Scanner;
public class Find_Biggest_Element_In_Array {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of array:");
		for(int i=0; i<5; i++) {
			a[i] = s.nextInt();
		}
		int max = a[0];
		for(int i=0; i<5; i++) {
			if(a[i]>max)
			{
				max = a[i];
			}
		  }
		System.out.print("Maximum number is:"+max);
		s.close();
	}
}
