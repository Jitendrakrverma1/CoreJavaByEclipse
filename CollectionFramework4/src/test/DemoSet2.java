package test;
import java.util.*;
public class DemoSet2
{
   @SuppressWarnings("removal")
public static void main(String[] args)
   {
	   Scanner s = new Scanner(System.in);
	   Set<Integer> ob = null;
	   while(true) {
	   System.out.println("======choice=====");
	   System.out.println("1.HashSet\n2.LinkedSet\n3.Treeset\n4.exit");
	   System.out.println("Enter the Choice:");
	   switch(s.nextInt())
	   {
	   case 1:
		   ob = new HashSet<Integer>();
		   break;
	   case 2:
		   ob = new LinkedHashSet<Integer>();
		   break;
	   case 3:
		   ob = new TreeSet<Integer>();
		   break;
	   default:
		   System.out.println("Invalid choice.......");
		   System.exit(0);
	   }
	   System.out.println("Enter the number of element to be added:");
	   int n = s.nextInt();
	   System.out.println("Enter "+n+" Integer Objects:");
	   for(int i=1; i<=n; i++)
	   {
		   ob.add(new Integer(s.nextInt()));
	   }
	   System.out.println("======Display from Set<E>===");
	   System.out.println(ob.toString());
	   }
   }
}

