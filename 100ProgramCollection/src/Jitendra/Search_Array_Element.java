         /*  Search Array Element  */
        // a[5] = 10,20,30,40,50.
        // search item   70 ---> Item not found  
package Jitendra;
import java.util.Scanner;
public class Search_Array_Element {
	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the element of Array:");
		for(int i=0; i<5; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Array Element:");
		for(int i=0; i<5; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEnter the element to be serched:");
	      int num = s.nextInt();
	      int count=0;
	    for(int i=0; i<5; i++) {
	    	if(a[i]==num) {
	    		count++;
	    	}
	    }
	    if(count>0)
		    System.out.print("Item found "+count+" times");
	    else
	    	System.out.print("Item not found");
		s.close();
	}
}
