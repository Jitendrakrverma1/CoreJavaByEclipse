package test;
public class CustRegistration {
     public void register(java.util.Scanner s, Customer c) {
    	 //customer object below
    	 System.out.println("Enter the CustId:");
    	 c.custId = s.nextLine();
    	 System.out.println("Enter the CustName:");
    	 c.custName = s.nextLine();
    	 System.out.println("Enter the CustPhNo:");
    	 c.phNo = Long.parseLong(s.nextLine());
    	 System.out.println("Enter the MailId:");
    	 c.mailId = s.nextLine();
    	 // Account object below
    	 System.out.println("Enter the custAcc:");
    	 c.ac.accNo = Long.parseLong(s.nextLine());
    	 System.out.println("Enter AccType:");
    	 c.ac.accType = s.nextLine();
    	 System.out.println("Enter balance:");
    	 c.ac.bal = Double.parseDouble(s.nextLine());
    	 //Address object below(internally connected with customer)
    	 System.out.println("Enter the House No:");
    	 c.ad.hNo = s.nextLine();
    	 System.out.println("Enter the Street name:");
    	 c.ad.sName = s.nextLine();
    	 System.out.println("Enter the city:");
    	 c.ad.city = s.nextLine();
    	 System.out.println("Enter the pinCode:");
    	 c.ad.pinCode = s.nextInt();
    	 
     }
}
