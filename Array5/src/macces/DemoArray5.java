
// Object Array := The array which is declared with "java.lang.Object" class is known as Object Array..

package macces;
import java.util.*;
import test.Employee;
public class DemoArray5 {
	public static void main(String[] args) {
	Object O[] = new Object[3];   // ObjectArray of size 3 
	O[0] = new Integer(123);    // Integer WrapperClass Object
	O[1] = new String("NIT HYD");  // String Object
	O[2] = new Employee("A111","Raj","SE",18000,35000);
	// User defined employee Object
	System.out.println("===Display Object Array===");
	Spliterator<Object> sp = Arrays.spliterator(O);
	sp.forEachRemaining(k->
	{
		System.out.println(k.toString());
	});
	}
}
