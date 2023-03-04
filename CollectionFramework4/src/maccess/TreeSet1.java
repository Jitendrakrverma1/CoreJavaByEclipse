                // TreeSet
// It is similar to HAshSet and it sort the element in the ascending order while HashSet does't maintain.
// Syntax:-  TreeSet<E> obj = new TreeSet<E>();  

package maccess;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		// treeSet of String type
		TreeSet<Integer> ob = new TreeSet<Integer>();
		// Adding element to treeSet
		ob.add(11);ob.add(13);ob.add(14);
		ob.add(12);ob.add(15);ob.add(16);
		System.out.println(ob);
		
	}
}
