package firstPackage;

public class PatientDetails {
	String patientName;
	int patientAge;
	int patientPhone;
	double billAmount;
	double insuranceAmount;
	String reasonForAppoinment;
	
	void getAppointment() {
		System.out.println("Appoinment details for " +patientName);
	}
	void cancelAppoinment() {
		System.out.println("Cancel appointment for " +patientName);
	}
	void payBill() {
		System.out.println("Amount to Pay: " +billAmount);
	}
	void claimInsurance() {
		System.out.println("Insurance Amount: " +insuranceAmount);
	}
}
