package maccess;
import java.util.*;
public class DemoSet2 
{
  //@SuppressWarnings("removal")
  public static void main(String[] args)
    {
	 Scanner s = new Scanner(System.in);
	 Set<Integer> ob = null;
	 System.out.println("Number Of Oprerations.........");
	 System.out.println("1.Hashset\n2.LinkedHashset\n3.TreeSet");
	 System.out.println("Enter the Choice:");
	 switch(s.nextInt())
	 {
	   case 1:
		   System.out.println("User Choose HashSet........");
		   ob = new HashSet<Integer>();
		   break;
	   case 2:
		   System.out.println("User Choosse LinkedHashset.");
		    ob = new LinkedHashSet<Integer>();
		   break;
	   case 3:
		   System.out.println("User Chhoose treeSet...");
		   ob = new HashSet<Integer>();
		   break;
	   default:
		   System.out.println("Invalid Coice.......");
		   System.exit(0);
	 }
	 System.out.println("Enter the number of element to be added:");
	 int n = s.nextInt();
	 System.out.println("Enter"+n+" Integer Objects:");
	 for(int i=1; i<=n; i++)
	 {
		 ob.add(s.nextInt());
	 }
	 System.out.println("=====Display from set<E>===");
	 System.out.println(ob.toString());
	 s.close();
  }
}
