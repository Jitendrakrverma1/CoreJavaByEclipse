// WAP to read String object and display as following:
/*
  input:= java                              output:= a
          program                                    m
          task                                       k
 * */
package maccess;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;
public class DemoArray3 {
	public static void main(String[] args)
  {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the size of an Array:");
	 int n = Integer.parseInt(s.nextLine());
	 String a[] = new String[n];  // Array Object
	 System.out.println("Enter "+n+" String Objects:");
	 for(int i=0; i<a.length; i++)
	 {
		 a[i] = new String(s.nextLine());
		 // Adding Integer Object to String Object based on index
	 }
	 System.out.println("===Display using spliterator<T> (Java8)===");
	 Spliterator<String> sp = Arrays.spliterator(a);
	 sp.forEachRemaining((k)->
	 {
		String str = k.toString();
		char ch = str.charAt(str.length()-1);
		System.out.println(ch);
	 });
	 
	 s.close();
  }
}
