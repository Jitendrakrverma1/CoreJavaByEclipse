package test;

import java.util.Scanner;
import java.util.Spliterator;
import java.util.TreeSet;

@SuppressWarnings("rawtypes")
public class DemoSet3
{
  public static void main(String[] args)
  {
	  Scanner s = new Scanner(System.in);
	  TreeSet<Product> ob = new TreeSet<Product>();
	  System.out.println("Enter the number of product:");
	  int n = s.nextInt();
	  System.out.println("Enter "+n+" Product Details:");
	  for(int i=1; i<=n ; i++)
	  {
		  System.out.println("=====Details of Product"+i+"=====");
		  System.out.println("Enter the Code: ");
		  String code = s.nextLine();
		  System.out.println("Enter the name: ");
		  String name = s.nextLine();
		  System.out.println("Enter the price: ");
		  float price = Float.parseFloat(s.nextLine());
		  System.out.println("Enter the qty: ");
		  int qty = Integer.parseInt(s.nextLine());
		  ob.add(new Product(code,name,price,qty));
	  }
	  System.out.println("===Diaplay product based on price===");
	  Spliterator<Product> ob1 =ob.spliterator();
	  ob1.forEachRemaining(k->{
		  System.out.println(k.toString());
	  });
	s.close();		  
  }
}
