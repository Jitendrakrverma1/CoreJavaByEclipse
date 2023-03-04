                   /*    Multiple Inheritance             */

//  we create multiple interface in program.

package jitendra;
interface A
{
	void show();  // public + abstract
}
interface B
{
	void show();// public + abstract
	void disp();
}
public class MultipleInheritance implements A,B
{
	@Override
	public void show()
	{
		System.out.println("This is class A & B");
	}
	@Override
	public void disp() {
	System.out.println("This is B & A");
	}
	public static void main(String[] args)
	{
	  MultipleInheritance ob = new MultipleInheritance();
	  ob.show();
	  ob.disp();
	}
}
