package jitendra;
public class Multiplication extends Substraction implements Addition
 {
   public void mul()
   {
	   int x, y=10, z=20;
	    x = y * z;
	    System.out.println("mul is:"+x);
   }
   // implementing the method of interface
   public void add()
   {
	   int x, y=10, z=20;
	    x = y + z;
	    System.out.println("add is:"+x);
   }
}
