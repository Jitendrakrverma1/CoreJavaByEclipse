package maccess;
import java.util.HashSet;
public class Demoset1 
{
	@SuppressWarnings({ "unchecked", "removal", "rawtypes" })
	public static void main(String[] args) 
	{
		HashSet hs1 = new HashSet();
		hs1.add(new Integer(121)); //Adding Integer Object
		hs1.add(new String("NITHYD")); // Adding String Object
		hs1.add(new StudentData("567","Jitendra")); // Adding studentData Object
		//hs1.add(12);
		System.out.println(hs1.toString());
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(new Integer(12));
		hs2.add(new Integer(13));
		//hs2.add(14);  // we add like this type
		System.out.println(hs2.toString());
		
		HashSet<String> hs3 = new HashSet<String>();
		hs3.add(new String("Java"));
		hs3.add(new String("Programming"));
		//hs3.add("me");   // we add like this type
		System.out.println(hs3.toString());
		
		HashSet<StudentData> hs4 = new HashSet<StudentData>();
		hs4.add(new StudentData("675","Raj"));
		hs4.add(new StudentData("677","Ram"));
		System.out.println(hs4.toString());
		
	}
}
