
           // Number Pattern
package Jitendra;
public class Pattern_Number4 {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {         //(1<=1)T=> print 1
				System.out.print(j);   // 1
			}                          // 12
			System.out.print("\n");    // 123
		}                              // 1234
//output:=                             // 12345
//		1
//		12
//		123
//		1234
//		12345
		
		// star pattern 2
		for(i=1;i<=5;i++) {       // row
			for(j=1;j<=i;j++) {
				System.out.print(i);   // column
			}
			System.out.print("\n");
		}
//output:=
//		1
//		22
//		333
//		4444
//		55555
		
		// star pattern 3
		int count = 0;
		for(i=1;i<=5;i++) {       // row
			for(j=1;j<=i;j++) {
				count++;
				System.out.print(count+" ");   // column
			}
			System.out.print("\n");
		}
//output:=
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 

	}

}
