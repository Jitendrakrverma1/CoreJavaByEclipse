
// WAP to read multiple Product details and display in Sorting Order based on prices using TreeSet?

package maccess;
import java.util.*;
import test.Product;
public class DemoSet4
{
	public static void main(String[] args)
	{
	  Scanner s = new Scanner(System.in);
	  TreeSet<Product> ob = new TreeSet<Product>();
	  System.out.println("Enter the number of Products:");
	  int n = Integer.parseInt(s.nextLine());
	  System.out.println("Enter"+n+" Product Detalis:");
	  for(int i=1; i<=n; i++)
	  {
		  System.out.println("=====Details of Product-"+i+"======");
		  System.out.println("Enter the code:");
		  String code = s.nextLine();
		  System.out.println("Enter the name:");
		  String name = s.nextLine();
		  System.out.println("Enter the price:");
		  float price= Float.parseFloat(s.nextLine());
		  System.out.println("Enter the qty:");
		  int qty = Integer.parseInt(s.nextLine());
		  
		  ob.add(new Product(code,name,price,qty)); // Adding product Objects to Set<E>
	  } // end of loops
	  System.out.println("=====Display Product based on price===");
	  Spliterator<Product> sp = ob.spliterator();
	  sp.forEachRemaining((k)->
	  {
		  System.out.println(k.toString());
	  });
	  s.close();
	}
}




