
                /*   Interface JDK 1.8        */

// from (JDk 1.8) onwards, interface can have "default & static" methods.
// If we want to add more method in interface immediately then we use default,static method.
// default & static method is compulsory to "define inside interface". If we want to 
// outside then we change the method type(public) when we define outside.

                    /*    Interface Default Method    */
package jitendra;
interface F
{
	void a1();  // public + abstract
	void a2();  // public + abstract
	
    //	If we add one more method a3() and not implementing this method in class E,C,D then it
	// generate error
	//void a3();  // public + abstract
	// if we want to remove this error then we make void a3() as default void a3()
	default void a3()
	{
		System.out.println("may or may not override in implemeting classes");
	}
}
class E implements F
{
  @Override
	public void a1() {
		System.out.println("Class B a1()");
	}
  @Override
	public void a2() {
	System.out.println("Class B a2()");
	}
  // here if we want to override then we change access_modifier type (default => public)
  @Override
  public void a3()
	{
		System.out.println("may or may not override in implemeting classes");
	}
}
class C implements F
{
  @Override
	public void a1() {
		System.out.println("Class C a1()");
	}
  @Override
	public void a2() {
	System.out.println("Class C a2()");
	}
  @Override
  public void a3()
	{
		System.out.println("may or may not override in implemeting classes");
	}
}
class D implements F
{
  @Override
	public void a1() {
		System.out.println("Class D a1()");
	}
  @Override
	public void a2() {
	System.out.println("Class D a2()");
	}
  @Override
  public void a3()
	{
		System.out.println("may or may not override in implemeting classes");
	}
}
public class Interface_JDK_1_point_8 
{
	public static void main(String[] args) {
		E b = new E();
		b.a1(); b.a2(); b.a3();
		
		C c = new C();
		c.a1(); c.a2(); b.a3();
		
		D d = new D();
		d.a1(); d.a2();
		// here also we called a3() method
		d.a3();
	}
}
