package jitendra;
import java.util.HashMap;
import java.util.Map;
public class AtmOperationImpl implements AtmOperationInterf 
{
    ATM atm = new ATM();
    @SuppressWarnings({ "unchecked", "rawtypes" })
	Map<Double,String> ministmt = new HashMap();
	public void viewBalance() {
		System.out.println("\nAvailable Balance is : "+atm.getBlance());
	}
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
		  if(withdrawAmount<=atm.getBlance()){
			ministmt.put(withdrawAmount, "Amount Withdrwan");
			System.out.println("Collect the Cash "+withdrawAmount);
			atm.setBlance(atm.getBlance()-withdrawAmount);
			viewBalance();	
		  }
		 else{
			System.out.println("Insufficient Balance !!");
		   }
		}
	else {
			System.out.println("Please Enter the Amount in multiple of 500.");
	     }
	  }
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount, "Amount deposited");
		System.out.print(depositAmount+" Deposited Successfully !!");
		atm.setBlance(atm.getBlance()+depositAmount);
		viewBalance();
	}
	public void viewMiiniStatement() {
		for(Map.Entry<Double,String> m:ministmt.entrySet()){
			System.out.println(m.getKey()+""+m.getValue());
		}
	}
}
