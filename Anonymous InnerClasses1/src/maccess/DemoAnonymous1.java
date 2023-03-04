package maccess;
import test.*;
public class DemoAnonymous1 
{
	public static void main(String[] args)
	{
		// Anonymous Inner Class as Class extension
		PClass ob = new PClass()
		{
			public void m1(int x)
			{
				System.out.println("===CClass m1()===");
				System.out.println("The value of x: "+x);
			}
			public void m3(int z)
			{
				System.out.println("===CClass m3()===");
				System.out.println("The Value z: "+z);
			}
		};
		ob.m1(11);
		ob.m2(12);
//		ob.m3(14);   // It generate error because By using PClass object can't access CClass method
	}

}
