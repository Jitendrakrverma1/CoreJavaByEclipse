
                  /*       Interface               */

// Interface:= it is just like a class, which contains only abstract method.
// To achieve interface java provides a keyword called "implements".
// Interface methods are by default public and abstract.
// Interface variable are by default public, static,final.
// Interface method must be OverRiden inside the implementing classes.
// Interface nothing but deals with client and developer.
    
   import java.util.Scanner;
    interface client      // It is used to store details of User.
    {
    	void input();  // public + abstract
    	void output(); // public + abstract
    }
    class Raju implements client
    {
    	String name;
    	double sal;
    	public void input() // if we not use here "public" then it consider "default" 
    	{
    		Scanner s = new Scanner(System.in);
    		System.out.println("Enter UserName:");
    		name = s.nextLine();
    		System.out.println("Enter Sal:");
    		sal = s.nextDouble();
    		s.close();
    	}
    	public void output()
    	{
    		System.out.println(name+" "+sal);
    	}
    }
  public class one 
  {
    public static void main(String[] args)
    {
    	client c = new Raju();
    	c.input();
    	c.output();
      }
   }
