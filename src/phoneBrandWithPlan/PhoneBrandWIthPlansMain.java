package phoneBrandWithPlan;

import java.util.Scanner;

public class PhoneBrandWIthPlansMain {

	public static void main(String[] args) {
		
		PhoneBrandWithPlans phone = new PhoneBrandWithPlans();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the brand that you want to Choose from: iOS/Android");
		String osType = sc.nextLine();
		phone.getPhoneListing(osType);
		
		String phoneType = sc.nextLine();
		phone.getPhonePrice(phoneType);
		
		String planType = sc.nextLine();
		phone.getPlan(planType);
				
		phone.getFinalBill();

	}

}
