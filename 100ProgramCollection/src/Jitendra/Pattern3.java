
        // Star Pattern 3
package Jitendra;
public class Pattern3 {
	public static void main(String[] args) {
		int i, j;
		for(i=1; i<=5; i++)   //row
		{
			for(j=i; j<5; j++)  // space
			{
				System.out.print(".");
			}
			for(int k=1;k<=i;k++)   // star
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
//output:=
//		....* 
//		...* * 
//		..* * * 
//		.* * * * 
//		* * * * * 
		
		         // or
		for(i=1; i<=5; i++)   //row
		{
			for(j=5; j>i; j--)  // space
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)   // star
			{
				System.out.print("*-");
			}
			System.out.print("\n");
		}
//output:
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 
		
              // star pattern 2	
		for(i=1; i<=5; i++)   //row
		{
			for(j=5; j>i; j--)  // space
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)   // star  (i=1)   first line=> *
			{                                 //(i=2) SecondLine=>   ***
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
	}
}
