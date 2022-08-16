package Jitendra;
import java.util.Scanner;
public class AddofFirstNatural_num
{
	public static void main(String[] args) {
		int n , sum=0;
		System.out.print("Enter the value of n::");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for(int i=1; i<=n; i++) 
		{
			sum = sum + i;
		}
		System.out.print("Sum is:"+sum);
		s.close();
	}

}
