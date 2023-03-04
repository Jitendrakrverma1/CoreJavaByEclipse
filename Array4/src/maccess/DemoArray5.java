
// WAP to read and display multiple Employee details using Array?

package maccess;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;
import test.*;
public class DemoArray5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of employee:");
		int n = Integer.parseInt(s.nextLine());
		Employee a[] = new Employee[n];
		System.out.println("Enter "+n+" Employee details:");
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter EmpId:");
			String id = s.nextLine();
			System.out.println("Enter EmpName:");
			String name = s.nextLine();
			System.out.println("Enter Empdesg:");
			String desg = s.nextLine();
			System.out.println("Enter EmpbSal:");
			int bSal =Integer.parseInt(s.nextLine());
			float totSal = bSal + (0.93F*bSal)+(0.63F*bSal);
			a[i] = new Employee(id,name,desg,bSal,totSal);  // Con_call
     // Adding Employee Object to Array Object based on index			
		}  //end of loop
	
	System.out.println("====Employee Details===");	
	Spliterator<Employee> sp = Arrays.spliterator(a);
	sp.forEachRemaining((k)->
	{
		System.out.println(k.toString());
	});	
		s.close();
	}
}
/*
 Enter the number of employee:
5
Enter 5 Employee details:
Enter EmpId:
A111
Enter EmpName:
jitendra
Enter Empdesg:
SE
Enter EmpbSal:
20000
Enter EmpId:
A222
Enter EmpName:
jitendra1
Enter Empdesg:
SC
Enter EmpbSal:
12000
Enter EmpId:
A333
Enter EmpName:
jitendra2
Enter Empdesg:
sm
Enter EmpbSal:
11000
Enter EmpId:
A444
Enter EmpName:
jitendra3
Enter Empdesg:
sl
Enter EmpbSal:
10000
Enter EmpId:
A555
Enter EmpName:
jitendra4
Enter Empdesg:
ls
Enter EmpbSal:
90000
====Employee Details===
A111	jitendra	SE	20000	51200.0
A222	jitendra1	SC	12000	30720.0
A333	jitendra2	sm	11000	28160.0
A444	jitendra3	sl	10000	25600.0
A555	jitendra4	ls	90000	230400.0

*/
