
                     /*     HashSet  */
// It is implementation class of  set<E> interface.
/*  set<E> canbe implemented :-
  1) Set<E> s = new HashSet<E>();
  2) Set<E> s1 = new LinkedHashSet<E>();
  3) Set<E> s2 = new TreeSet<E>();
*/
package maccess;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 
{
	public static void main(String[] args)
	{
      // HashSet declaration
		HashSet<String> hset = new HashSet<String>();
	 // Adding element to the HAshSet
	    hset.add("Apple");
	    hset.add("Mango");
	    hset.add("Grapes");
	    hset.add("Oragne");
	    hset.add("Fig");
	    // Adding duplicate element
	    hset.add("Apple");
	    hset.add("Mango");
	    // Addition of null values
	    hset.add(null);
	    hset.add(null);
	    // Displaying Hashset elements
	    System.out.println("hset: "+hset);
	    
	    boolean s = hset.contains("Mango");
	    System.out.println("Contains: "+s);
	    
	    boolean s1 = hset.isEmpty();
	    System.out.println(s1);
	    
	    System.out.println(hset.size());
	    Object s11 = hset.clone();
	    System.out.println("s11: "+s11);
	    
	    // equals() method
	    Object s14 = hset.equals(s11);
	    System.out.println(s14);
	    
	    System.out.println(hset.getClass());
	    
	    Iterator<String> ob15 = hset.iterator();
	    while(ob15.hasNext())
	    {
	    	System.out.println(ob15.next());
	    }
	    // remove() method
	    hset.remove("Apple");
	    System.out.println(hset);
//	    hset.removeAll(hset);
	    System.out.println("hset: "+hset);
	    
	    // convert hashSet to Arrya
	    // creating an String Array
	    String [] arr = new String[hset.size()];
	    hset.toArray(arr);
	    System.out.println("Array Element: ");
	    for(String p : arr) {
	    	System.out.print(p+" ");
	    }
	    
	}
}
