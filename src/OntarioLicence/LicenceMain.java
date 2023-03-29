package OntarioLicence;

public class LicenceMain {

	public static void main(String[] args) {
		
		//Create instance
		IssueLicence licence = new IssueLicence();
		
		licence.age = 16;
		licence.levelOfLicence=null;
		
		licence.issueOntarioLicence();

	}

}
