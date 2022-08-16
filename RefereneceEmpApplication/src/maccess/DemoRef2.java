package maccess;
import java.util.*;
import test.*;
public class DemoRef2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Contact c = new Contact();
		Salary sl = new Salary();
		Employeee e = new Employeee(c,sl);
		EmpRegistration er = new EmpRegistration();
		er.register(s, e);
		DisplayEmpDetails d = new DisplayEmpDetails();
		d.dis(e);
		s.close();
	  
	}
}
