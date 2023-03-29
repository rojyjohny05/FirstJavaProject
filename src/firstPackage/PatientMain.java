package firstPackage;

public class PatientMain {

	public static void main(String[] args) {

		// Create instance
		PatientDetails pd = new PatientDetails();

		// Initialize variables
		pd.patientName = "Rojy";
		pd.patientAge = 28;
		pd.patientPhone = 123456789;
		pd.billAmount = 59.99;
		pd.insuranceAmount = 50.99;

		// Invoke methods
		pd.getAppointment();
		pd.cancelAppoinment();
		pd.payBill();
		pd.claimInsurance();
	}

}
