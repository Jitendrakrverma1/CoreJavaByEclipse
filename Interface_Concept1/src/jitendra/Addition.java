package jitendra;
import java.util.*;
public class Addition implements Jack 
 {
	public void takeInput()
	{
		Scanner s = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter the value of y:");
		y = s.nextInt();
		System.out.println("Enter the value of z:");
		z = s.nextInt();
		x = y + z;
		System.out.println("Sum is :"+x);
		s.close();
	}
}
