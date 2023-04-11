package phoneBrandArray;

import java.util.Scanner;

public class PhoneBrandClass {

	Scanner sc = new Scanner(System.in);

	String[] samsungBrand = { "S20", "S21", "Flip3", "Fold3" };
	String[] iphoneBrand = { "iPhone 11", "iPhone 12", "iPhone 13", "iPhone 14" };
	String[] googleBrand = { "Google Pixel 16", "Google Pixel 16 Pro", "Google Pixel Pro", "Google Pixel 15" };

	void samsungBrandDisplay() {
		System.out.println("All available Samsung Products");

		for (int i = 0; i < samsungBrand.length; i++) {

			System.out.println(samsungBrand[i]);

		}
	}

	void iphoneBrandDisplay() {
		System.out.println("All available Apple Products");

		for (int i = 0; i < iphoneBrand.length; i++) {

			System.out.println(iphoneBrand[i]);

		}
	}

	void googleBrandDisplay() {
		System.out.println("All available Google Products");

		for (int i = 0; i < googleBrand.length; i++) {

			System.out.println(googleBrand[i]);

		}
	}

	void getUserBrandDisplay() {
		int flag = 0;

		System.out.println("Choose one product from list");

		String userBrand = sc.nextLine();

		/*
		 * for(int i=0;i<samsungBrand.length;i++) {
		 * 
		 * if(samsungBrand[i].equals(userBrand) || iphoneBrand[j].equals(userBrand) ||
		 * googleBrand[k].equals(userBrand)) {
		 * 
		 * System.out.println("Selected product is: "+userBrand); flag=1; break; }
		 * 
		 * }
		 * 
		 * if(flag!=1) { System.out.println("Please select a product from the list"); }
		 */

		for (int i = 0; i < samsungBrand.length; i++) 
		{
			if (samsungBrand[i].equals(userBrand)) 
			{
				System.out.println("Selected product is: " + userBrand);
				flag = 1;
			}
		}

		for (int i = 0; i < iphoneBrand.length; i++) 
		{
			if (iphoneBrand[i].equals(userBrand)) 
			{
				System.out.println("Selected product is: " + userBrand);
				flag = 1;
			}
		}

		for (int i = 0; i < googleBrand.length; i++) 
		{
			if (googleBrand[i].equals(userBrand)) 
			{
				System.out.println("Selected product is: " + userBrand);
				flag = 1;
			}
		}

		if (flag != 1) 
		{
			System.out.println("Please select a product from the list");
		}

	}

}
