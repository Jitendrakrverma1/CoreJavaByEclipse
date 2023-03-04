package maccess;
import java.util.Scanner;
import test.*;
public class DemoLambdaExpression1 
{
	public static void main(String[] args)
	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter val1:");
	  int v1 = s.nextInt();
	  System.out.println("Enter val2:");
	  int v2 = s.nextInt();
	  System.out.println("=====Your Choice=====");
	  System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.moddiv");
	  System.out.println("********Enter the choice*********");
	  switch(s.nextInt())
	  {
	  case 1:
		  // lambda Expression
		  IArithmetic ad = (int x, int y)-> x+y;
		  System.out.println("sum:"+ad.calculate(v1, v2));
		  break;
	  case 2:
		  IArithmetic sb = (int x, int y)-> x-y;
		  System.out.println("sub:"+sb.calculate(v1, v2));
		  break;
	  case 3:
		  IArithmetic ml = (int x, int y)-> x*y;
		  System.out.println("mul:"+ml.calculate(v1, v2));
		  break;
	  case 4:
		  IArithmetic div = (int x, int y)-> x/y;
		  System.out.println("div:"+div.calculate(v1, v2));
		  break;
	  case 5:
		  IArithmetic mod = (int x, int y)-> x%y;
		  System.out.println("moddiv:"+mod.calculate(v1, v2));
		  break;
	default:
		System.out.println("Invalid choice.....");
	  }
	  s.close();
	}
}
