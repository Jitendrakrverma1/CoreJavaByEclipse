                               /*  StringTokenizer */
// stringTokenizer class is from java.utl.package and which is used to break the given string into
//    piece(tokens) based on deliMeter.


package maccess;
import java.util.*;
public class StringTokenizer1
{
  public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = s.nextLine();
		System.out.println("enter the delimeter: ");
		String delimeter = s.nextLine();
		StringTokenizer str1 = new StringTokenizer(str,delimeter);
		System.out.println("======count of tokens====");
		System.out.println("Count: "+ str1.countTokens());
		System.out.println("Diaplay String:");
		while(str1.hasMoreTokens())
		{
			String tk = str1.nextToken();  // retrieve token
			System.out.println(tk.toString());
			System.out.println("count of tokens: "+str1.countTokens());
		}
		s.close();
	}
}

/* output :=
    Enter the string: 
java language
enter the delimeter: 
l
======count of tokens====
Count: 2
Diaplay String:
java 
count of tokens: 1
anguage
count of tokens: 0


*/