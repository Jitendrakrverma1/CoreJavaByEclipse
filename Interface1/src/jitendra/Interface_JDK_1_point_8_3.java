
                /* Interface JDK 1.9   */
// JDK 1.9 include private method in interface and this private method is also declared
//  with static or non-static type

                     /* interface private method  */
package jitendra;
interface L
{
	private  void add(int x, int y)
	{
		System.out.println("Add is:"+(x+y));
	}
	//if we want to access this method then we create one default or static function
	default void call()
	{
		add(10,20);
	}
	// or
//	public static void call1()
//	{
//		add(10,20);
//	}
}
class Bi implements L
{
	public void sub(int x, int y)
	{
		System.out.println("sub is:"+(x-y));
	}
}
public class Interface_JDK_1_point_8_3 {
	public static void main(String[] args) {
       Bi t = new Bi();
     //  t.add(20, 10); // generate error (because it is private not access)
       // we call call method 
       t.call();
       t.sub(200, 100);
	}
}
