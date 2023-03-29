package OntarioLicence;

public class IssueLicence {
	
	int age;
	String levelOfLicence;
	
	void issueOntarioLicence()
	{
		if(age>=16)
		{
			System.out.println("Eligible for taking Licence.");
			
			if(levelOfLicence=="G1")
			{
				System.out.println("Licence : G2 or G");
			}
			else if(levelOfLicence=="G2")
			{
				System.out.println("Licence : G");
			}
			else if(levelOfLicence=="G")
			{
				System.out.println("You have completed the level.");
			}
			else if(levelOfLicence==null)
			{
				System.out.println("Licence: G1, G2, G");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		else
		{
			System.out.println("Not eligible for taking Licence.");
		}
	}
	
	//int age;
	boolean g1Licence;
	boolean g2Licence;
	boolean gLicence;
	
	/*void booleanLicence()
	{
		if(age>=16)
		{
			if(g1Licence)
			{
				System.out.println("Can take G2");
			}
			else if(g1Licence)
			{
				System.out.println("Can take G");
			}
			else if(g1Licence)
			{
				System.out.println("Already have G");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		else
		{
			System.out.println("Not eligible");
		}
	}*/
	

}
