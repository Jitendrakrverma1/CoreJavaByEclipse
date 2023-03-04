package maccess;
import java.util.Scanner;
import test.*;
public class DemoLambdaExpression1
{
  public static void main(String[] args)
  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the String:");
	  String s1 = s.nextLine();
	  // Lambda Expression
	  IResult ob = (String str)->
	  {
		  System.out.println("===String data===");
		  for(int i=0; i<=str.length(); i++)
		  {
			  char ch = str.charAt(i);
			  System.out.print(ch+" ");
		  }
		  System.out.println("\n====Interface varaible====");
		  System.out.println("Value k:"+IResult.k);
	  };
	  ob.result(s1);  //Lambda Expression
	  ob.show();      // Default concrete method
	  s.close();
  }
}
