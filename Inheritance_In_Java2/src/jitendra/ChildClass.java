
package jitendra;
public class ChildClass extends ParentClass
 {
  public static int b = 20;
  // CClass method
  public static void m2() 
  {
	System.out.println("====CClass static method====");  
	System.out.println("The value of b:"+b);
  }
  // static block for CClass
  static{
	  System.out.println("= static block for CClass==");
	  System.out.println("The value of b:"+b);
  }
}
