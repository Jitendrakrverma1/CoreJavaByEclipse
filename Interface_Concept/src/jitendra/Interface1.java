
                   /* Use only public or abstract method inside interface  */

package jitendra;
interface RajTech{
	void add();   // By default [ public , abstract ] {if we not define anything with void}
	void sub();   // By default [ public , abstract ]  { then when we override method we use
	  }                                               //{ public to replace default(weaker then public)}
 class JitTech implements RajTech
{    
	@Override 
	public void add()
	{
		int x, y=10, z=20;
		 x = y + z;
		 System.out.println("sum of number:"+x);
	}
	public void sub()
	{
		int x, y=10, z=20;
		 x = y + z;
		 System.out.println("substraction of number:"+x);
	}
}
public class Interface1
 {
	public static void main(String[] args) 
	{
		RajTech  ob = new JitTech();
		 ob.add();
		 ob.sub();
	}
}
