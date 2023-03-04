                                /*  Method References in Java  */
// Reference to constructor
// Reference to Instance method
// Reference to static method


package test;
public interface ITest 
{
  public abstract void dis(int k);
  public default void show(int p)
  {
	  System.out.println("===default show(p)====");
	  System.out.println("Value p:"+p);
  }

}
