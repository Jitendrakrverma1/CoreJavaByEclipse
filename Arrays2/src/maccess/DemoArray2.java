
// WAP to read and display String object using Array ?
package maccess;
import java.util.*;
public class DemoArray2 
 {
   public static void main(String[] args)
   {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the size of array:");
	   int n = Integer.parseInt(s.nextLine());
	   String a[] = new String[n]; // Array  Object
	   System.out.println("Enter "+n+" String Objects:");
	   for(int i=0; i<a.length; i++)
	   {
		   a[i] = new String(s.nextLine());
		   // Adding Integer object to String object
	   }
	   System.out.println("===Display using old for loop===");
	   for(int i=0; i<a.length; i++)
	   {
		   System.out.print(a[i].toString()+" ");
	   }
	   System.out.println("\n====Display using Extended for(Java5)====");
	   for(String k:a)
	   {
		   System.out.print(k.toString()+" ");
	   }
	   System.out.println("\n====Display using Spliterartor<T> (Java8)====");
	   Spliterator<String> str1 = Arrays.spliterator(a);
	   str1.forEachRemaining((k)->
	   {
		 System.out.print(k.toString()+" ");
	   });
	   s.close();
   }
}

// output;=
/*
Enter the size of array:
5
Enter5String Objects:
jitendra
chandan
pankaj
shivam
Anirudh
===Display using old for loop===
jitendra chandan pankaj shivam Anirudh 
====Display using Extended for(Java5)====
jitendra chandan pankaj shivam Anirudh 
====Display using Spliterartor<T> (Java8)====
jitendra chandan pankaj shivam Anirudh 

*/
