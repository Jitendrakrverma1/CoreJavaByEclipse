
                  // Star Pattern Program1
package Jitendra;
public class Pattern1 {
	public static void main(String[] args) {
		int i,j;
		for( i=1; i<=4; i++) {     // row := 1.
			for( j=1; j<=i; j++) {  // column  
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
		
// output:= 
//		*
//		**
//		***
//		****		
		// Star pattern 2
		for(i=1; i<=5; i++) {      // row := 1.....5
			for(j=5; j>=i;j--) {    // column:= 5......1  (*****)
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		// or
		for(i=5; i>=1; i--) {        // row:= 5......1 =>(******)
			for(j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
// output:=
//		*****
//		****
//		***
//		**
//		*
		          // star pattern 3
		for(i=1; i<=5; i++) {         // row       ||    *
			for(j=i; j<=5; j++) {       // space   ||   **
				System.out.print(" ");         //  ||  *** 
			}                                  //  || ****
			for(int k=1; k<=i; k++) {      //column||*****
				System.out.print("*");
			}
			System.out.print("\n");
		}
//output:=
//		    *
//		   **
//		  ***
//		 ****
//		*****		
		System.out.print("\n");
		// star pattern 4
		for(i=1; i<=5; i++) {         // row       ||*****    
			for(j=1; j<i; j++) {       // space    || ****
				System.out.print(" ");         //  ||  ***   
			}                                  //  ||   ** 
			for(int k=i; k<=5; k++) {      //column||    *
				System.out.print("*");
			}
			System.out.print("\n");
		}
//output:=
//		*****
//		 ****
//		  ***
//		   **
//		    *
	}
 }

