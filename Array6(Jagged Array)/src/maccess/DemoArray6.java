
                      /*  Jagged Array*/
// The Array which is holding array object is known as Jagged Array.
package maccess;
import java.util.*;
public class DemoArray6
{
  public static void main(String[] args)
  {
	  Scanner s = new Scanner(System.in);
	  Integer a1[] = {11,12,13};  // Integer array of size 3
	  Integer a2[] = {111,122,133,144};  // Integer array of size 4
	  Integer a[][] = {a1,a2};  // Jagged Array
	  System.out.println("===Display from Jagged array===");
	  Spliterator<Integer[]> sp = Arrays.spliterator(a);
	  sp.forEachRemaining(k->
	  {
		  System.out.println("Array:");
		  Spliterator<Integer> sp1 = Arrays.spliterator(k);
		  sp1.forEachRemaining(z->
		  {
			  System.out.println(z.toString()+" ");
		  });  //InnerLoop
		  System.out.println();
	  });  // OuterLoop
	  s.close();
  }
}

/* Output:=
 ===Display from Jagged array===
Array:
11 
12 
13 

Array:
111 
122 
133 
144 
 */
