              // print by using this "one dimensional array element"
      // toString() , asList(),  deepToString() := print all array element
    //   using by import java.util.Arrays

    // By Using Arrays package we print all the element of array are printed
           // in between ([]) this.
package Jitendra;
import java.util.Arrays;
public class Print_Array_Element1 {
	public static void main(String[] args) {
	    String a[] = {"Learn", "Coding","Jitendra","Verma"};
	    System.out.println("toString:"+Arrays.toString(a));
	    System.out.println("asList:"+Arrays.asList(a));
	    System.out.println("deepToString:"+Arrays.deepToString(a));
      // By using deepToString() method we print two-dimensional array	    
	    int b[][] = {{10,20},{30,40}};
	    System.out.println("deepToString:="+Arrays.deepToString(b));
	}
}
