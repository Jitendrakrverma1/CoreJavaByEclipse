
           // Print diamond symbol
package Jitendra;
public class Print_Diamond_symbol {
	public static void main(String[] args) {
		int i,j;
		for(i=1; i<=5; i++) {       // row
			for(j=5; j>i; j--) {      // space(column)
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1); k++) {            
				System.out.print("*");
			}
			System.out.print("\n");
		}
		// output := half diamond
//	     *
//	    ***
//	   *****
//	  *******
//	 *********
		// repeat this process again to complete the diamond
		for(i=4; i>=1; i--) {      // row
			for(j=5; j>i; j--) {    // space(column)
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
//output:=
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		 *******
//		  *****
//		   ***
//		    *
	}

}
