package test;
// functional interface
public interface IResult 
{
  public static final int k=20;   // variable memory in interface
  public void result (String str);
  public default void show()
  {
	  System.out.println("====default show()===");
	  System.out.println("the value k:"+k);
  }
}
