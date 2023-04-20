package phoneBrandWithPlan;

public class PhoneBrandWithPlans {

	String[] phoneListSam = { "S22", "S22+", "S22 Ultra", "S22FE" };
	int[] phonePriceSam = { 25, 35, 55, 20 };
	String[] phoneListApp = { "iPhone 14", "iPhone 14 Pro", "iPhone 14 Pro Max", "iPhone 14 Mini" };
	int[] phonePriceApp = { 30, 40, 65, 25 };
	String[] phonePlan = { "Rogers", "Bell", "Telus" };
	int[] phonePlanPrice = { 70, 80, 75 };
	
	int phonePrice;
	int planPrice;
	int monthlyAmount;
	String phoneName;
	String planName;
	int flag;

	
	void getPhoneListing(String osType)
	{
				
		if(osType.equals("Android"))
		{
			
			System.out.println("Here are the models listed under this category");
			
			for (int i = 0; i < phoneListSam.length; i++) 
			{
				
				System.out.println(phoneListSam[i]);
			}
			
			System.out.println("Please enter the model that you want to Choose from: ");
		}
		
		else if(osType.equals("iOS"))
		{
			
			System.out.println("Here are the models listed under this category");
			
			for (int i = 0; i < phoneListApp.length; i++) 
			{
				System.out.println(phoneListApp[i]);
				
			}
			
			System.out.println("Please enter the model that you want to Choose from: ");
		}
		
		else
		{
			System.out.println("Please enter a valid option");
		}
		
	}
	
	String getPhonePrice(String phoneType)
	{
		
			
		for(int i=0; i<phoneListSam.length; i++)
		{
			if(phoneType.equals(phoneListSam[i]))
			{
								
				phonePrice = phonePriceSam[i];
				
				phoneName = phoneListSam[i];
				
				flag = 1;
				
			}
			
			
		}
		
		for(int i=0; i<phoneListApp.length; i++)
		{
			if(phoneType.equals(phoneListApp[i]))
			{
								
				phonePrice = phonePriceApp[i];
				
				phoneName = phoneListApp[i];
				
				flag = 1; 
				
			}
			
		}
		
		if(flag == 0) 
		{
			System.out.println("Invalid Model"); 
		}
		else
		{
			System.out.println("Please select the plan that you want to Choose from: ");
			
			for (int i = 0; i < phonePlan.length; i++)
			{
				System.out.println(phonePlan[i]);
			}
		}
		 
		return phoneName;
	}
	
		
	String getPlan(String planType) 
	{
		for(int i=0; i<phonePlan.length; i++)
		{
			if(planType.equals(phonePlan[i]))
			{
				planPrice = phonePlanPrice[i];
				
				planName = phonePlan[i];
			}
		}
		
		return planName;
	}
	
	void getFinalBill()
	{
		
		System.out.println("You have selected " + phoneName + " with " + planName);
							
		System.out.println("Your Phone Tab will be: " + phonePrice);
		
		System.out.println("Your monthly plan: " + planPrice);
		
		monthlyAmount = phonePrice+planPrice;
		
		System.out.println("Total monthly amount: " + monthlyAmount);
	}

}
