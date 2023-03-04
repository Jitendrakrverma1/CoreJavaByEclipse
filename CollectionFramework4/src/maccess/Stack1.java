package maccess;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Stack;
public class Stack1 
{
	public static void main(String[] args) 
	{
		// creating a generic Stack
		Stack<String> ob = new Stack<String>();
		// adding element to stack
		ob.add("J");
		ob.addElement("M");
		ob.push("N");
		ob.push("K");
		System.out.println("ob:"+ob);   // [J, M, N, K]
		
		Object s = ob.search("N");
		System.out.println("search element:"+s);
		
		// using peek() method is used for retriving value from peek of stack
		System.out.println("peek element: "+ob.peek());  // k
		
		// pop() method
		System.out.println("Popped element:"+ob.pop());  // K
		System.out.println(ob);
		
		// capacity() method
		System.out.println("default capacity:"+ob.capacity());  // 10
		
		// elementAt() method
		Object ob31 = ob.elementAt(1);
		System.out.println("elementAt:"+ob31);
		
		// empty() method
		boolean s1 = ob.empty();
		System.out.println("empty(): "+s1);
		
		// elements() method
		Object s2 = ob.elements();
		System.out.println("elements() :"+s2);
		
		// equals() method
		Stack<String> ob1 = new Stack<String>();
		ob1.push("M");
		ob.push("N");
		ob.push("A");
		boolean s3 = ob.equals(ob1);
		System.out.println("equals(): "+s3);
		
		// firstElement() method
		String s11 =ob.firstElement();
		System.out.println("firstElement(): "+s11);
		
		// lastElement() method
		String s12 = ob.lastElement();
		System.out.println("lastElement(): "+s12);
		
		// contains() method
		boolean s13 =ob.contains(ob);
		System.out.println("contains(): "+s13);
		
		//get() method
		String s14 = ob.get(0);
		System.out.println("get(): "+s14);
		
		// getClass() method
		Object s15 = ob.getClass();
		System.out.println("getClass(): "+s15);
		
		// indexOf() method
		int s16 = ob.indexOf("j");   // int or object
		System.out.println("indexOf: "+s16);
		
		// indexOf(String element, int index)
		Object s17 = ob.indexOf("M", 0);
		System.out.println("indexOf(1):"+s17);
		
		// insertElement() method
		ob.insertElementAt("Jitendra", 2);
		System.out.println("insertElementAt(): "+ob);
		
		// isEmpty() method
		boolean s18 = ob.isEmpty();
		System.out.println("isEmpty(): "+s18);
		
		// Iterator() method
		Iterator<String> s19 = ob.iterator();
		while(s19.hasNext()) {
			System.out.print("Iterator(): "+s19.next() +" ");	
		}
		
		System.out.println();
		
		// remove() method
		ob.remove(3);
		System.out.println("remove(): "+ob);
		
		// remove(Object el) method
		ob.remove("N");
		System.out.println("remove(Object ele): "+ob);
		
		// removeElement(Object ele) method
		ob.removeElement("N");
		System.out.println("removeelement(): "+ob);
		
//		ob.removeAllElements();
//		System.out.println();
		
		// search() method
		int s21 = ob.search("M");   // int or Object
		System.out.println("search(): "+s21);
		
		// set(int index, Object ele) method
		ob.set(1, "MAngo");
		System.out.println("set(): "+ob);
		
		// setElement(Object el , int index) method
		ob.setElementAt("Pankaj", 1);
		System.out.println("setElementAt(): "+ob);
		
		// subList(int startIndex, int lastIndex) method
		List<String> s22 = ob.subList(1, 3);
		System.out.println("sublist(): "+s22);
		
		// toString() method
		System.out.println("tostring(): "+ob.toString());
		
		// Spliterator() method
		Spliterator<String>ob11 = ob.spliterator();
		ob11.forEachRemaining(k->{
			System.out.println("Spliterator(): "+k.toString());
		});
	}
}
