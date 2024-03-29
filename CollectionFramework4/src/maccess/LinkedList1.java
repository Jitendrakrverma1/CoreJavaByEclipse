
           // LinkedList Operation [It is a linear data structure]

package maccess;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args)
	{
	   // Creating LinkedList object
		LinkedList<String> list = new LinkedList<String>();
		// Adding element to the linkedList
		list.add("Jitendra");
		list.add("Chandan");
		list.add("Ram");
		list.add("Raju");
		list.add(2,"Kanak");
		
		// printing the element of linkedlist
		System.out.println("list: "+list);
		
		// Adding element to the first position of linkedList
		list.addFirst("Anoop");
		// Adding element to the last position of linkedList
		list.addLast("Shailendra");
		System.out.println("List: "+list);
		
		// Iterating the linkedList
		System.out.println("====printing using Iterator ====");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
		
		//Removing element from linkedList
		//list.remove() := it removes first element of the list
		list.remove(2);
		list.remove("Kanak");
		// removing first and last element
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		// set() and get() the value to linkedList
		list.set(1, "Mangal");
		System.out.println(list);
		
		Object str = list.getClass();
		System.out.println("str:"+str);
		
		String str1 = list.get(2);
		System.out.println("str1:"+str1);
		       // or
		Object str2 = list.get(1);
		System.out.println("str2:"+str2);
		
		Object var1 = list.getFirst();
		Object var2 = list.getLast();
		System.out.println("var1: "+var1);
		System.out.println("var2: "+var2);
		
		list.add("pankaj");
		list.add("sonu");
		list.add("Akash");
		list.add("Aman");
		// clone() method
		Object list1 = list.clone();
		System.out.println("list1: "+list1);
		
		//poll() ;= it return and removes the first item of the list.
		// pollFirst():= it removes first item of the list.
		//pollLast() := it removes last element of list.
		String o1 = list.poll();
		String o2 = list.pollFirst();
		String o3 = list.pollLast();
		System.out.println("o1:"+o1);
		System.out.println("o2:"+o2);
		System.out.println("o3:"+o3);
		System.out.println(list);
		
		// size() method
		System.out.println("Length of the list: "+list.size());
		// removeFirstOccurence() method
		list.removeFirstOccurrence("Raju");
		// removeLastOccurence() method
		list.removeFirstOccurrence("Akash");
		System.out.println("List:"+list);
		
		// Object addAll(Collection c) method
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("pooja");
		arr.add("lakhsmi");
		list.addAll(arr);
		System.out.println("list:"+list);
		
		// push() : it add at first position,  and pop(): it removes at last position oprations
		list.push("Anuj");
		System.out.println("list:"+list);
		list.pop();
		System.out.println("list:"+list);
		
		list.clear();
		System.out.println("list:"+list);
	}
}
