                /* Anonymous InnerClass */
// The Inner classes which are declared without name are known as Anonymous InnerClass.
// It is two types:=
// (A) Anonymous Inner class as class extension
// (B) Anonymous Inner class as Implementation class

                 /* (A) Anonymous inner class as class extension */
/* The process of declaring the childClass without name is known as "Anonymous InnerClass
  as class extension".  */
/*  
   syntax:=  class PClass
              {   
                 //PClass body  
              }
              PClass Ob = new PClass()
              {
                //CClass body
              };
  */

package test;
public class PClass 
{
  public void m1(int x)
  {
	  System.out.println("===PClass m1()===");
	  System.out.println("The value x: "+x);
  }
  public void m2(int y)
  {
	  System.out.println("===PClass m2()===");
	  System.out.println("The value of y: "+y);
  }
}
