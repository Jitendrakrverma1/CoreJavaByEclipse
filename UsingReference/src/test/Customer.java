package test;
public class Customer {
    String custId, custName, mailId;
    long phNo;
    Account ac;  //Non-primitive reference variable
    Address ad;  //Non-primitive reference variable
    // using constructor to initialize references
    public Customer(Account ob1, Address ob2) {
    	ac = ob1;
    	ad = ob2;
    }
    // for display the data method below
    public String toString() {
    	return custId+"\n"+custName+"\n"+mailId+"\n"+phNo+"\n"+
             ac.accNo+"\n"+ac.accType+"\n"+ac.bal+"\n"+ad.hNo+"\n"+
    			ad.sName+"\n"+ad.city+"\n"+ad.pinCode;
    }
}
