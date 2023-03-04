
                   /* Interface JDK 1.8 [static interface method] */

// static method of interface can't be override.

package jitendra;
interface J
{
	public static void Show()
	{
		System.out.println("can't override interface static methods");
	}
}
/*   so we can't override static method
 
class Demo implements J
{
	@Override
	public static void Show() {
		System.out.println("can't override interface static methods");	
	}
}  
 */

// main function is also define inside interface
interface ao
{
	public static void main(String[] args)
	{
		System.out.println("Can't override static method");
	}
}
public class Interface_JDK_1_point_8_2 {
	public static void main(String[] args) {
		J.Show();
//		Demo d = new Demo();
//		d.Show();
		ao.main(args);
	}
}
