package bankingAssignmentUsingInheritance;

public abstract class BankOperations {
	
	private double balance;

    public BankOperations(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double viewBalance() {
        return balance;
    }
    
    public boolean validatePIN(int enteredPIN) {
		boolean isPinCorrect = false;
		return isPinCorrect;
	}
    
    public boolean validatePswd(String enteredUsername, String enteredPswd) {
		boolean isPswdCorrect = false;
		return isPswdCorrect;
	}
    
    public abstract void changePin(String newPinPassword);

	public int getNewPin() 
	{
		return 0;
	}

	public abstract void changePassword(String newPassword);
	  
	public String getNewPswd() 
	{ 
		return null; 
	}
	 


}

