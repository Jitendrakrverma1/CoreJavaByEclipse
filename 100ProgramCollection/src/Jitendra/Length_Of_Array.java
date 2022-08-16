
         // print length of array
package Jitendra;
import java.util.Scanner;
public class Length_Of_Array {
	public static void main(String[] args) {
	   int a[] = new int[5];
	   Scanner s = new Scanner(System.in);
	   System.out.print("Enter the Elemnt of array:");
	   // take value of array
	   for(int i=0; i<5; i++)
	   {
		 a[i] = s.nextInt();   
	   }
	   System.out.println("Array element:");
	   // print array element
	   for(int i=0; i<5; i++) {
		   System.out.print(a[i]+" ");
	   }
	   System.out.println("Array Length:"+a.length);
	   s.close();
	}
}
