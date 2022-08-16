
package jitendra;
public class ParentClass 
 {
   public static int a =10; 
   // PClass method
   public static void m1() 
   {
	   System.out.println("===Parent class statis method====");
	   System.out.println("the value of a:"+a);
   }
   // static method of PClass
   static{
	 System.out.println("==PClass static block");  
	 System.out.println("The value of a:"+a);
   }
}
