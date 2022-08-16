
            // Half Diamond pattern
package Jitendra;
public class Half_Diamond_pattern {
	public static void main(String[] args) {
		int i,j;
		for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
//output:=
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		repeat this process again to complete this half-diamond
		for(i=1; i<=4; i++) {
			for(j=4; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
//		output:=
//		* * * * 
//		* * * 
//		* * 
//		* 
//output:=(complete output:=)
//		* 
//		* * 
//		* * * 
//		* * * * 
//		* * * * * 
//		* * * * 
//		* * * 
//		* * 
//		* 
	}
}
