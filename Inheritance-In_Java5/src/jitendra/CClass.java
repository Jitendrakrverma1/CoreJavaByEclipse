package jitendra;
public class CClass extends PClass
 {
   public int b =10;
   public CClass(int x) {
	    super(x); // it is used to print the value of 
         // PClass first and pass same parameter in super that take PClass Constructor 
	   System.out.println("==Constructor of Cclass==");
	   System.out.println("The value of x:"+x);
	   System.out.println("==The value of b:"+b);
   }
 }
