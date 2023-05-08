package bankingAssignmentUsingInheritance;

import java.util.Scanner;

public class BankingMain {

	public static void main(String[] args) {
			
		BankOperations bop = null;
						
		System.out.println("What type of banking service do you need? ATM/Online Banking");
		Scanner sc = new Scanner(System.in);
		String selectedSer = sc.nextLine();
		
		PersonAccountDetails personAccount = new PersonAccountDetails("1234567","Rojy", 1234,"RO4567",5000.24);
		
		int flag = 0;	
		
		switch (selectedSer) {
		case "ATM":
			System.out.println("Enter your Pin number:");
			int enteredPin = sc.nextInt();
			
			bop = new AtmClass(personAccount.getPinNumber(),personAccount.getBalance());
			
			boolean isPINCorrect = bop.validatePIN(enteredPin);
			
			if(isPINCorrect) {
				
				System.out.println("Do you want to change your pin?? Yes/No");
				String changePinYesNo = sc.next();
				
				if(changePinYesNo.equals("Yes"))
				{
					System.out.println("Enter your new pin");
					int changePin = sc.nextInt();
					
					bop.changePin(Integer.toString(changePin));
					
					System.out.println("New Pin: " + bop.getNewPin());
									
				}
				
				flag=1;
			}
			else 
			{
				System.out.println("Pin is incorrect");
			}
			break;
			
		case "Online Banking":
			System.out.println("Enter your Username(Account number):");
			String enteredUsername = sc.next();
			System.out.println("Enter your Password:");
			String enteredPswd = sc.next();
			
			bop = new OnlineBanking(personAccount.getAccountNumber(),personAccount.getOnlineBankingPassword(),personAccount.getBalance());
			
			boolean isPswdCorrect = bop.validatePswd(enteredUsername,enteredPswd);
			
			if(isPswdCorrect) 
			{
				
				System.out.println("Do you want to change your password?? Yes/No"); String
				changePswdYesNo = sc.next();
				  
				if(changePswdYesNo.equals("Yes")) 
				{
					System.out.println("Enter your new password"); 
					String changePswd = sc.next();
				  
					bop.changePassword(changePswd);
				  
					System.out.println("New Password: " + bop.getNewPswd());
				}
																		
				flag=1;
			}
			else 
			{
				System.out.println("Username or password is incorrect");
			}
			break;
			
		default:
			System.out.println("Invalid Service");
			break;
		}
			
		if(flag==1)
		{
			System.out.println("Account Number: " + personAccount.getAccountNumber());
			System.out.println("Account Holder Name: " + personAccount.getAccountHolderName());
			
			System.out.println("What kind of banking operation do you need? Withdraw / Deposit");
			String selectedOpr = sc.next();
			
			if(selectedOpr.equals("Withdraw"))
			{
				System.out.println("Enter the money you want to withdraw:");
				double withdrawMoney = sc.nextDouble();
				
				bop.withdraw(withdrawMoney);
                System.out.println("Withdraw successful. New balance: " + bop.viewBalance());
				
			}
			else if(selectedOpr.equals("Deposit"))
			{
				System.out.println("Enter the money you want to Deposit:");
				double depositMoney = sc.nextDouble();
				
				bop.deposit(depositMoney);
                System.out.println("Deposit successful. New balance: " + bop.viewBalance());
				
			}
			else
			{
				System.out.println("Invalid operation"); 
			}
		}

	}

}
