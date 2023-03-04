package test;
import java.util.*;
public class DemoSet4 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Set<StudentData> ob = null;
		System.out.println("=======choice======");
		System.out.println("1.Hashset\n2.LinkedHashSet\n3.TreeSet\n4.Exit.");
		System.out.println("Enter the choice: ");
		switch(s.nextInt())
		{
		case 1:
			ob = new HashSet<StudentData>();
			break;
		case 2:
			ob = new LinkedHashSet<StudentData>();
			break;
		case 3:
			ob = new TreeSet<StudentData>();
			break;
		default:
			System.out.println("Invalid Choie======");
			System.exit(0);
		}
		System.out.println("Enter the number of Student: ");
		int n = s.nextInt();
		System.out.println("Enter "+n+" StudentDetails: ");
		for(int i=1; i<=n; i++)
		{
			System.out.println("Enter the Name of Student:");
			String name = s.nextLine();
			System.out.println("Enter the rollnO: ");
			String rollNO = s.nextLine();
			ob.add(new StudentData(name,rollNO));
		}
		System.out.println("====Diaplay from Set<E>");
		Iterator<StudentData> ob11 = ob.iterator();
		while(ob11.hasNext())
		{
			System.out.print(ob11.next()+" ");
		}
		s.close();
	}
}
