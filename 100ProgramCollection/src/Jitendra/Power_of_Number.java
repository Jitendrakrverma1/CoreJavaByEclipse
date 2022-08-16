package Jitendra;
import java.util.Scanner;
public class Power_of_Number {
	public static void main(String[] args) {
		int n,p,result=1;
		System.out.print("Enter No.");
		Scanner s  = new Scanner(System.in);
		n = s.nextInt();
		System.out.print("Enter power..");
		p = s.nextInt();
		for(int i=1; i<=p; i++) {
			result = n * result;
		}
		System.out.print(result);
		s.close();
	}

}
