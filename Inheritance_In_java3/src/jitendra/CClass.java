package jitendra;
public class CClass extends PClass
 {
   public  static int a =10;
   public static void m1() {
	   System.out.println("==Pclass m1() ==");
	   System.out.println("The value of a:"+a);
   }
   static {
	   System.out.print("==Static block of Cclass");
	   System.out.println("The value of a:"+a);
   }
 }
