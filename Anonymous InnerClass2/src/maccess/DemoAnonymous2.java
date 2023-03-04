package maccess;
import test.*;
public class DemoAnonymous2 
{
	public static void main(String[] args)
	{
		// Anonymous Inner Class as Implementation Class
		ITest ob = new ITest()
		{
			// implemented or override method
			public void m1(int x)
			{
				System.out.println("=== m1(x)===");
				System.out.println("The value of x: "+x);
			}
			public void m3(int y)
			{
				System.out.println("=== m3(y)===");
				System.out.println("The Value y: "+y);
			}
		};
		ob.m1(11);
		ob.m2(12);
//		ob.m3(14);   // error 
		}
}
