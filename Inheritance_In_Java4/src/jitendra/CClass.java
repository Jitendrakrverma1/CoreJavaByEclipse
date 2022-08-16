package jitendra;
public class CClass extends PClass
 {
  public int b=20;
  public CClass() {
//	  super();  it i not needed in 0-parameter constructor and it is 
//	  added by compiler by default
	  System.out.println("==Constructor for CClass==");
	  System.out.println("The value of b:"+b);
   }
 }
