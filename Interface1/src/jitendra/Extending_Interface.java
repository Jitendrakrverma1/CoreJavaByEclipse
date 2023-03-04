
                             /*     Extending Interface     */
// we extend one interface to other interface

package jitendra;
// this interface give only add operation
interface Gill{
	void add();   // public + abstract
}
// if we want both add , sub both operation then we extend first interface
interface Raj extends Gill
{
	void sub();  // public + abstract
}
class Ankit implements Raj
{
	@Override
	public void add() {
		int a=10, b=20,c;
		c = a + b;
		System.out.println("Add is:"+c);
	}
	@Override
	public void sub() {
		int a=10, b=20,c;
		c = a - b;
		System.out.println("sub is:"+c);
	}
}
public class Extending_Interface
{
	public static void main(String[] args) {
		Ankit ob = new Ankit(); 
    //or  Raj ob = new Ankit();  // it will give both add() and sub() method.
   //or Gill ob = new Ankit();	// generate error because it give only add() method not sub() method
		ob.add();
		ob.sub();
	}
}
