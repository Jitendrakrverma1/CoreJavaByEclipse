package jitendra;
import java.util.Scanner;
public class MainClass
{
	public static void main(String[] args) 
	{
		AtmOperationInterf  op = new AtmOperationImpl();
		int atmnumber = 12345;
		int atmpin = 123;
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine!!!");
		System.out.println("Enter Atm NUmber : ");
		int atmNumber = s.nextInt();
		System.out.println("Enter Atm Pin:");
		int pin = s.nextInt();
		if((atmnumber==atmNumber)&&(atmpin==pin))
		{
			while(true)
			{
				System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit.");
				System.out.println("Enter Choice : ");
				int ch = s.nextInt();
				if(ch==1) {
					op.viewBalance();
				}
				else if(ch==2){
				   System.out.println("Enter amount to withdraw ");	
				   double withdrawAmount = s.nextDouble();
				   op.withdrawAmount(withdrawAmount);
				   }
				else if(ch==3){
					System.out.println("Enter Amount to Deposit :");
					double depositAmount = s.nextDouble();
				     op.depositAmount(depositAmount);	
				}
				else if(ch==4){
					op.viewMiiniStatement();
				}
				else if(ch==5){
					System.out.println("**Sir Please,Collect Your ATM Card**\n **Thank you for Using ATM Machine..***");
					System.exit(0);
				}
				else {
					System.out.println("Please enter correct choice...");
				}
			}
		}
		else {
			System.out.println("Incorrect Atm Number or Pin.....");
			System.exit(0);
		}
		s.close();
	}
}

/* Output:=
Welcome to ATM Machine!!!
Enter Atm NUmber : 
12345
Enter Atm Pin:
123
1.View Available Balance
2.Withdraw Amount
3.Deposit Amount
4.View Mini Statement
5.Exit.
Enter Choice : 
3
Enter Amount to Deposit :
10000
10000.0 Deposited Successfully !!
Available Balance is : 10000.0
1.View Available Balance
2.Withdraw Amount
3.Deposit Amount
4.View Mini Statement
5.Exit.
Enter Choice : 
2000
Please enter correct choice...
1.View Available Balance
2.Withdraw Amount
3.Deposit Amount
4.View Mini Statement
5.Exit.
Enter Choice : 
3
Enter Amount to Deposit :
2000
2000.0 Deposited Successfully !!
Available Balance is : 12000.0
1.View Available Balance
2.Withdraw Amount
3.Deposit Amount
4.View Mini Statement
5.Exit.
Enter Choice : 
8000
Please enter correct choice...
1.View Available Balance
2.Withdraw Amount
3.Deposit Amount
4.View Mini Statement
5.Exit.
Enter Choice : 
2
Enter amount to withdraw 
2000
Collect the Cash 2000.0

Available Balance is : 10000.0
1.View Available Balance
2.Withdraw Amount
3.Deposit Amount
4.View Mini Statement
5.Exit.
Enter Choice : 
4
10000.0Amount deposited
2000.0Amount Withdrwan
1.View Available Balance
2.Withdraw Amount
3.Deposit Amount
4.View Mini Statement
5.Exit.
Enter Choice : 
5
**Sir Please,Collect Your ATM Card**
 **Thank you for Using ATM Machine..***

 */
