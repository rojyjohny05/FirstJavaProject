package bankingAssignmentUsingInheritance;

public class PersonAccountDetails {
	
	private String accountNumber;
	private String accountHolderName;
	private int pinNumber;
	private String onlineBankingPassword;
	private double balance;
	
	public PersonAccountDetails(String accountNumber,String accountHolderName,int pinNumber,String onlineBankingPassword,double balance) 
	{ 
		this.accountNumber= accountNumber; 
		this.accountHolderName = accountHolderName; 
		this.pinNumber = pinNumber; 
		this.onlineBankingPassword = onlineBankingPassword; 
		this.balance = balance; 
	}
		
	public String getAccountNumber() {
		return accountNumber;
	}
	//public void setAccountNumber(String accountNumber) {
		//this.accountNumber = accountNumber;
	//}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	//public void setAccountHolderName(String accountHolderName) {
		//this.accountHolderName = accountHolderName;
	//}
	public int getPinNumber() {
		return pinNumber;
	}
	//public void setPinNumber(int pinNumber) {
		//this.pinNumber = pinNumber;
	//}
	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}
	//public void setOnlineBankingPassword(String onlineBankingPassword) {
		//this.onlineBankingPassword = onlineBankingPassword;
	//}
	public double getBalance() {
		return balance;
	}
	//public void setBalance(double balance) {
		//this.balance = balance;
	//}
	


}
