                   /* Anonymous InnerClass */

                 /* (B) Anonymous inner class as Implementation class  */

/* The process of declaring the Implementation class without name is known as "Anonymous 
    InnerClass as class extension".  */
/*  
   syntax:=  interface ITest
              {   
                 //interface body  
              }
              ITest Ob = new ITest()
              {
                //Impl_Class_body
              };
  */

package test;
public interface ITest
{
 public void m1(int x);
 public default void m2(int y)
 {
	 System.out.println("===default m2(y)===");
	 System.out.println("The value of y:"+y);
 }
}
