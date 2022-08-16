
        // Character pattern program
package Jitendra;
public class Pattern4_Character {
	public static void main(String[] args) {
		char i,j;
		for(i='A'; i<='E'; i++) {
			for(j='A'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
//output:=
//		A
//		AB
//		ABC
//		ABCD
//		ABCDE
		
      // character pattern 2
		for(i='A'; i<='E'; i++) {
			for(j='A'; j<=i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
//output:=
//      A
//		BB
//		CCC
//		DDDD
//		EEEEE		
     
		// character pattern 3
		char count='A';
		for(i='A'; i<='E'; i++) {
			for(j='A'; j<=i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.print("\n");
		}
//output:=
//		A 
//		B C 
//		D E F 
//		G H I J 
//		K L M N O 
	}
}
