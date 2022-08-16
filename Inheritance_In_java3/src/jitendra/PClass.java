package jitendra;
public class PClass
 {
    public static int b=20;
    public static void m2() {
    	System.out.println("=static of Pclaass==");
    	System.out.println("The value of b:"+b);
    }
    static {
    	System.out.println("=Static block ofPClas");
    	System.out.println("The value of b:"+b);
    }
 }
