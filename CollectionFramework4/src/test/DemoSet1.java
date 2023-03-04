package test;
import maccess.*;
import java.util.*;
public class DemoSet1 
{
   @SuppressWarnings({ "unchecked", "removal", "rawtypes" })
  public static void main(String[] args)
     {
	   HashSet hs1 = new HashSet();
	   hs1.add(new Integer(121));  // Adding Integer Object
	   hs1.add(new String("NITHYD"));   // Adding string Object
	   hs1.add(new Collection1("121","Nit"));  // Adding Student Object
	   System.out.println(hs1.toString());
	   
	   HashSet<Integer> hs2 = new HashSet<Integer>();
	   hs2.add(new Integer(12));
	   hs2.add(new Integer(21));
	   System.out.println(hs2.toString());
	   
	   HashSet<String> hs3 = new HashSet<String>();
	   hs3.add(new String("Java"));
	   hs3.add(new String("HyD"));
	   System.out.println(hs3.toString());
	   
	   HashSet<Collection1> hs4 = new HashSet<Collection1>();
	   hs4.add(new Collection1("A23","Ram"));
	   hs4.add(new Collection1("A21","Raj"));
	   System.out.println(hs4.toString());
   }
}
