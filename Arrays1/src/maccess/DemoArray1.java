                      /*    Arrays           */
/*  Arrays Types:=
  1) Single dimensional
  2) Multidimensional
 */
// WAP to read and display Integer WrapperClass objects using Array?
package maccess;
import java.util.*;
public class DemoArray1
 {
   public static void main(String[] args)
   {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the size of an Array:");
	   int n = s.nextInt();
	   Integer a[] = new Integer[n];  // Array Object
	   System.out.println("Enter"+n+" Integer Objects:");
	   for(int i=0; i<a.length; i++)
	   {
		   a[i] = new Integer(s.nextInt());
		   // Adding integer object to Array object based on index 
	   }
	   System.out.println("=== Display Using old for loop====");
	   for(int i=0; i<a.length; i++)
	   {
		   System.out.print(a[i].toString()+" ");
	   }
	   System.out.println("\n===Display using Extended for(Java5)===");
	   for(Integer k:a)
	   {
		   System.out.print(k.toString()+" ");
	   }
	   System.out.println("\n===Display using spliterator<T> (Java8) ===");
	   Spliterator<Integer> sp = Arrays.spliterator(a);
	   sp.forEachRemaining((k)->
	   {
		   System.out.print(k.toString()+" ");
	   });
	   s.close();
   }
}

//output:=
//Enter the size of an Array:
//5
//Enter5 Integer Objects:
//12
//11
//23
//34
//32
//=== Display Using old for loop====
//12 11 23 34 32 
//===Display using Extended for(Java5)===
//12 11 23 34 32 
//===Display using splIterator<T> (Java8) ===
//12 11 23 34 32 
