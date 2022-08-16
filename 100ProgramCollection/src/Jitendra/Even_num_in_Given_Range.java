package Jitendra;
import java.util.Scanner;
public class Even_num_in_Given_Range {
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num:");
		n = s.nextInt();
		//using for loop
		for(int i=0; i<=n; i+=2) {
			System.out.print(i+" ");
		}
		s.close();
		
	}

}
