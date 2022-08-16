package maccess;
import test.*;
import java.util.*;
public class DemoReference {
   public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   Account ac = new Account(); //object for account
	   Address ad = new Address(); //object for address
	   Customer c  = new Customer(ac,ad);
	   CustRegistration ob = new CustRegistration();
	   ob.register(s,c);
	   DisplayCustDetails d  = new DisplayCustDetails();
	   d.dis(c);
	   s.close();
   }
}
