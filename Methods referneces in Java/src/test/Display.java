package test;
public class Display 
{
	// References to constructor
  public Display(int x)
  {
	  System.out.println("===Constructor Body===");
	  System.out.println("Value x:"+x);
  }
  // References to Instance method
  public void m1(int y)
  {
	  System.out.println("====Instance method Body===");
	  System.out.println("Value y:"+y);
  }
  // Reference to static method
  public static void m2(int z)
  {
	  System.out.println("===static method body====");
	  System.out.println("Value z:"+z);
  }
}
