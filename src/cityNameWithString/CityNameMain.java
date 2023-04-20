package cityNameWithString;

import java.util.Scanner;

public class CityNameMain {

	public static void main(String[] args) {

		CityNameClass city = new CityNameClass();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name of the City: ");
		String cityName = sc.nextLine();
		int foundCity = city.getCityName(cityName);
		if (foundCity == 1) {
			System.out.println("City found in the list");
		} else {
			System.out.println("City not found in the list");
		}

		System.out.println("\nCities ending with 'ton' are listing below:");
		city.getCitiesEndingWithSpecificWord("ton");

		System.out.println("\nCities ending with 'ton' are replaced by 'fun':");
		city.getCitiesReplacedWithWord("ton");
		
		System.out.println("\nGiven String is: 100 queen street,Toronto,M5V 3E3 \nSplit and store into:");
		String str = "100 queen street,Toronto,M5V 3E3";
		city.splitAndStore(str);

	}

}
