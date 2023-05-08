package bankingAssignmentUsingInheritance;

public class OnlineBanking extends BankOperations {
	
	private String accountNumber;
	private String onlineBankingPassword;

	public OnlineBanking(String accountNumber, String password, double initialBalance) {
		super(initialBalance);
		this.accountNumber = accountNumber; 
		this.onlineBankingPassword = password; 
		
	}
	
	@Override
	public boolean validatePswd(String enteredUsername, String enteredPswd) {
		boolean isPswdCorrect = false;
		if (enteredUsername.equals(accountNumber) && enteredPswd.equals(onlineBankingPassword)) {
			isPswdCorrect = true;
		}
		return isPswdCorrect;
	}
	
	@Override
    public void changePassword(String newPassword) {
        if (newPassword.equals(onlineBankingPassword)) {
            System.out.println("New password can't be the same as the old one.\nSorry!!! Cannot change your password this time. Try later..");
            return;
        }

        if (newPassword.length() < 8 || newPassword.matches(".[&$@].")) {
            System.out.println("New password must be at least 8 characters long and not contain any of the following special characters: &, $, @.\nSorry!!! Cannot change your password this time. Try later..");
            return;
        }

        this.onlineBankingPassword = newPassword;
        System.out.println("Password changed successfully.");
    }
	
	@Override
	public String getNewPswd() {
		return onlineBankingPassword;
	}

	@Override
	public void changePin(String newPinPassword) {
		
	}

		
}
