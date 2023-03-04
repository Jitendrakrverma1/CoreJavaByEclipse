package jitendra;
// it inherit Subtraction and implement interface addition
public class Multiplication extends Substraction implements Addition
 {
   public void mul() {
	   int x , y=20, z=10;
	   x = y*z;
	   System.out.println("Mul is:"+x);
   }
   public void add()
   {
	   int x , y=20, z=10;
	   x = y+z;
	   System.out.println("Add is:"+x);
   }
}
