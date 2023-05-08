package bankingAssignmentUsingInheritance;

public class AtmClass extends BankOperations{
	
	private int pin;
	
	public AtmClass(int pinNumber,double balance) 
	{
		super(balance);
		this.pin = pinNumber; 
	}
	
	@Override
	public boolean validatePIN(int enteredPIN) {
		boolean isPinCorrect = false;
		if (enteredPIN == pin) {
			isPinCorrect = true;
		}
		return isPinCorrect;
	}
	
	@Override
    public void changePin(String newPin) {
        if (newPin.equals(String.valueOf(pin))) {
            System.out.println("New PIN can't be the same as the old one.\nSorry!!! Cannot change your password this time. Try later..");
            return;
        }

        if (newPin.length() < 4) {
            System.out.println("New PIN must be at least 4 characters long.\nSorry!!! Cannot change your password this time. Try later..");
            return;
        }

        this.pin = Integer.parseInt(newPin);
        System.out.println("PIN changed successfully.");
	}
	
	@Override
	public int getNewPin() {
		return pin;
	}

	@Override
	public void changePassword(String newPassword) {
		
	}

	
	 

		
}
