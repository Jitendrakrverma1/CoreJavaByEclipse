
// reverse the String using StringTokenizer and stringBuffer.

package test;
import java.util.*;
public class Assignment111
{
   public static void ain(String[] args)
   {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the String: ");
	   String str = s.nextLine();
	   StringTokenizer ob = new StringTokenizer(str," ");
	   System.out.println("====reverse of words====");
	   while(ob.hasMoreTokens())
	   {
		   String tk = ob.nextToken();
		   StringBuffer str1 = new StringBuffer(tk);
		   System.out.println(str1.reverse());
	   }
	   s.close();
   }
}
