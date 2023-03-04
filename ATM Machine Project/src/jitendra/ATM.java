              /*   ATM MACHINE PROJECT IN JAVA   */
// 1. Validate the user through ATM Number and Pin.
// 2. User should able to perform below Operation.
//           1.Check Available Balance.
//           2.Withdraw Amount.
//           3.Deposit Amount.
//           4.View mint Statement.
//           5.Exit.


package jitendra;
public class ATM 
{
   private double blance;
   private double depositAmount;
   private double withdrawAmount;
   
   // default constructor
   public ATM()
   {
	   
   }

// getter and setter method
public double getBlance() 
{
	return blance;
}

public void setBlance(double blance) 
{
	this.blance = blance;
}

public double getDepositAmount() 
{
	return depositAmount;
}

public void setDepositAmount(double depositAmount)
{
	this.depositAmount = depositAmount;
}

public double getWithdrawAmount() 
{
	return withdrawAmount;
}

public void setWithdrawAmount(double withdrawAmount) 
{
	this.withdrawAmount = withdrawAmount;
}  
}
