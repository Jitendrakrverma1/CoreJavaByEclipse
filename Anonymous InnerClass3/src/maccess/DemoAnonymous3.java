package maccess;
import java.util.Scanner;
import test.*;
public class DemoAnonymous3 
{
  public static void main(String[] args)
  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter val1:");
	  int v1 = s.nextInt();
	  System.out.println("Enter val2:");
	  int v2 = s.nextInt();
	  System.out.println("=== your choice----");
	  System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.moddiv");
	  System.out.println("*********Enter your choice-----");
	  switch(s.nextInt())
	  {
	  case 1:
		  IArithmetic ad = new IArithmetic()
		  {
			  public double calculate(int x, int y)
			  {
				  return x+y;
			  }
		  };
		  System.out.println("Sum:"+ad.calculate(v1, v2));
		  break;
	  case 2:
		  IArithmetic sb = new IArithmetic()
		  {
			  public double calculate(int x, int y)
			  {
				  return x-y;
			  }
		  };
		  System.out.println("Sub:"+sb.calculate(v1, v2));
		  break;
		  case 3:
		  IArithmetic ml = new IArithmetic()
		  {
			  public double calculate(int x, int y)
			  {
				  return x*y;
			  }
		  };
		  System.out.println("mul:"+ml.calculate(v1, v2));
		  break;
		  case 4:
		  IArithmetic md = new IArithmetic()
		  {
			  public double calculate(int x, int y)
			  {
				  return x%y;
			  }
		  };
		  System.out.println("mod:"+md.calculate(v1, v2));
		  break;
		  case 5:
		  IArithmetic dv = new IArithmetic()
		  {
			  public double calculate(int x, int y)
			  {
				  return x/y;
			  }
		  };
		  System.out.println("div:"+dv.calculate(v1, v2));
		  break;
		  default:
			  System.out.println("Invalid choice------");
	  }
	  s.close();
  }
}
