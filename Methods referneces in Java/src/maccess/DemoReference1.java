package maccess;
import test.*;
public class DemoReference1 
{
	public static void main(String[] args) 
 {
	System.out.println("****Reference to Constructor***");
	ITest ob1 = Display:: new;  // Reference to constructor
	ob1.dis(123);   // con_body_call
	ob1.show(200);
	System.out.println("****Reference to Instance Method*****");
	Display d = new Display(111);  //con_call
	ITest ob2 = d::m1;  // Reference to Instance method
	ob2.dis(124);  // Instance_methd_body_call
	ob2.show(300);
	System.out.println("****Reference to static method***");
	ITest ob3 = Display :: m2;  // reference to static method
	ob3.dis(125);   // static_method_body_call
	ob3.show(400);
  }
}
