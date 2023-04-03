package atmWithdraw;
import java.util.Scanner;

public class AtmWithdrawAmount {
	
	int actualPin=1234;
	int enteredPin;
	double accountBalance=100;
	double overDraftAmount=1000;
	int withdrawAmount;
	double balanceAmount;
	
	Scanner sc = new Scanner(System.in);
	
	void atmWithdraw()
	{
		for(int counter=1;counter<=3;counter++)
		{
			
			System.out.println("Enter your PIN");
			enteredPin = sc.nextInt();
			if(actualPin==enteredPin)
			{
				System.out.println("Entered PIN is correct.");
				
				//if (accountBalance > withdrawAmount || overDraftAmount > withdrawAmount) 
				//{
					System.out.println("Enter Amount:");
					withdrawAmount = sc.nextInt();
										
					if (accountBalance > withdrawAmount)
					{
						System.out.println("You have sufficient Balance. Please collect the cash: "+withdrawAmount);
						balanceAmount = accountBalance-withdrawAmount;
						System.out.println("Balance Amount: " + balanceAmount);
					}
					else if (overDraftAmount > withdrawAmount)
					{
						System.out.println("Overdraft is available. Please collect the cash: "+withdrawAmount);
						balanceAmount = overDraftAmount-withdrawAmount;
						System.out.println("Balance Overdraft: " + balanceAmount);
					}
					else
					{
						System.out.println("Sorry!!! Not enough Balance");
					}
				//}
				//else 
				//{
					//System.out.println("Not enough Balance");
				//}
				break;
			} 
				
			else
			{
				System.out.println("Entered PIN is incorrect.");
				if(counter==3)
				{
					System.out.println("You have exceeded maximum number of tries. Try again after 24 hrs");
					//break;
				}
				
			}	
			
			
		}
		
					
	}
}


