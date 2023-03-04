
                               /*     Vector In Java    */
// Vector implements list interface like ArrayList. It is synchronized and it gives poor performance in searching
//  delete, and update of its element.

                              /* Three way to create vector class object:    */
//  Method 1:=  Vector vec = new Vector();
// Method 2:=  Vector obj = new Vector(int initialCapacity);
// Method 2:=  Vector obj = new Vector(int initialCapacity , capacityIncrement);

package maccess;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
public class Vector1 
{
	public static void main(String[] args) 
	{
       /* Vector of initial capacity(size) of 2  */
		Vector<String> vec = new Vector<String>(2);
		
		// Adding element to a Vector
		vec.add("Pankaj");
		vec.add("Chandan");
		vec.add("Nandu");
		vec.add(3, "Anirudh");
		vec.addElement("Jitendra");
		vec.addElement("shailendra");
		// Displaying the element of vector
		System.out.println("Vec: "+vec);
		
		/* Check size and capacityIncrement */
		System.out.println("size of Vector: "+vec.size());
		System.out.println("Default Capacity of Vector: "+vec.capacity());
		
		// display Vector element
		Enumeration<String> enum1 = vec.elements();
		while(enum1.hasMoreElements())
		{
			System.out.println(enum1.nextElement());
		}
		
		System.out.println("Vec: "+vec);
		
		// boolean contains(Object element) method
		boolean s = vec.contains("Jitendra");
		System.out.println(s);
		
		// containsAll(collection<?> object) method
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("Akash"); ob.add("Mangal");
		Object v = vec.containsAll(ob);
		System.out.println(v);
		
		// Object elementAt(int index) method
		Object v1 = vec.elementAt(2);    // Object  or  String
		System.out.println(v1);  // Nandu
		
		/* Object firstElement()  and lastElement() method*/
		Object f1 = vec.firstElement();
		Object f2 = vec.lastElement();
		System.out.println("f1: "+f1);
		System.out.println("f2: "+f2);
		
		// getClass() method
		System.out.println(vec.getClass());
		// Object get(int index) method
		System.out.println(vec.get(4));
		System.out.println(vec.toString());
        System.out.println(vec.toArray());
        // isEmpty() method
        System.out.println(vec.isEmpty());
        
        // void setElementAt(Object element, int index) method 
        vec.set(3, "Kalu");
        System.out.println("Vec: "+vec);
        vec.setElementAt("Gappu", 4);
        System.out.println("Vec: "+vec);
        
        // subList(int startindex, int lastindex) method
        Object sr = vec.subList(3, 6);
        System.out.println("sr: "+sr);
        
        // insertElementAt(Object element, int index) method
        vec.insertElementAt("fuga", 2);
        System.out.println("vec1:"+vec);
        
        // remove() method
        vec.remove(3);
        vec.remove("Shailendra");
        vec.removeElement("fuga");
        vec.removeElementAt(4);
        System.out.println("vec: "+vec);
        
        // ListIterator() method
        ListIterator<String> ob1=vec.listIterator();
        while(ob1.hasNext())
        {
        	System.out.print(ob1.next()+",");
        }
        
        System.out.println();
        // elementAt(int index) method
      String v11 =   vec.elementAt(3);
        System.out.println(v11);
        
        //firstElement() and lastElement() method
        String v12 = vec.firstElement();
       String v13 =  vec.lastElement();
       System.out.println(v12);
       System.out.println(v13);
       
       //get(int index) method
       Object v14 = vec.get(2);   // Object  or String
       System.out.println(v14);
       
       //sort() method
       Collections.sort(vec);
       System.out.println(vec);
       
       // copy element of one vector to another vector
       Vector<String> vec1 = new Vector<String>();
       vec1.add("1st");
       vec1.add("2nd");
       vec1.add("3rd");
       vec1.add("4th");
       vec1.add("5th");
       vec1.add("6th");
       System.out.println("vec1:"+vec1);
       // copy vec element in vec1
       Collections.copy(vec1, vec);
       System.out.println("vec1:"+vec1);
       
       // Iterator() and ListIterator() method
       Iterator<String> ob11 = vec.iterator();
       while(ob11.hasNext())
       {
    	   System.out.println(ob11.next());
       }
        // ListIterator() methhod
       ListIterator<String> ob12 = vec.listIterator();
       while(ob12.hasNext())
       {
    	   System.out.println(ob12.next());
       }
       
       //Convert vector to list
       List<String> list = Collections.list(vec.elements());
       for(String str12 : list)
       {
    	   System.out.println(str12);
       }
	}
}
