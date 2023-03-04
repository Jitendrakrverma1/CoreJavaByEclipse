package maccess;
import java.util.ArrayList;
public class ArrayList1 {
	public static void main(String[] args) 
	{
       // Java Program to demonstrate the working of java program
	  // Declaring the ArrayList with initial size n
		ArrayList<Integer> ob = new ArrayList<Integer>();
		// Appending the element at the end of ArrayList
		for(int i=1; i<=5; i++) {
			ob.add(i);
		}
		System.out.println("ob: "+ob);
		// printing using forEach loop
		for(Integer k:ob) {
			System.out.println("k: "+k);
		}
	}
}
