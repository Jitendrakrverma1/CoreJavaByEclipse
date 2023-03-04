package maccess;
import java.util.*;
public class DemoVector1 
{
  @SuppressWarnings("removal")
public static void main(String[] args)
  {
	  Scanner s = new Scanner(System.in);
	  Vector<Integer> v = new Vector<Integer>();
	  System.out.println("Enter the  number of element to added:");
	  int  n = s.nextInt();
	  System.out.println("Enter"+n+" Elements:");
	  for(int i=1; i<=n; i++)
	  {
		  v.add(new Integer(s.nextInt()));
	  }
	  System.out.println("========Display from Vector====");
	  System.out.println(v.toString());
	  System.out.println("firstElemnt:"+v.firstElement());
	  System.out.println("lastElement:"+v.lastElement());
	  System.out.println("ele at index1:"+v.elementAt(1));
	  v.setElementAt(new Integer(2001),1);
	  System.out.println(v.toString());
	  v.removeElementAt(1);
	  System.out.println(v.toString());
	  v.insertElementAt(new Integer(700), 1);
	  System.out.println(v.toString());
	  v.removeElement(new Integer(11));
	  System.out.println(v.toString());
	  System.out.println("====Sorthing order====");
	  Collections.sort(v);
	  System.out.println(v.toString());
	  System.out.println("Size:"+v.size());
	  v.removeAllElements();
	  System.out.println("After clear size:"+v.size());
	  s.close();
  }
}
