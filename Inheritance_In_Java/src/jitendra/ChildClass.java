
package jitendra;
public class ChildClass extends ParentClass
 {
  public  int b = 20;
  // CClass method
  public  void m2() 
  {
	System.out.println("====CClass instance method====");  
	System.out.println("The value of b:"+b);
  }
  // instance block for CClass
  {
	  System.out.println("==instance block for CClass==");
	  System.out.println("The value of b:"+b);
  }
}
