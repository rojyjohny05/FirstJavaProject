package cityNameWithString;

public class CityNameClass {

	int foundCity;
	String[] nameOfCities = { "Toronto", "Ottawa", "Brampton", "Hamilton", "London", "Mississauga", "Burlington",
			"Kingston", "Kitchener" };

	int getCityName(String cityName) {
		for (int i = 0; i < nameOfCities.length; i++) {
			if (nameOfCities[i].equals(cityName)) {
				foundCity = 1;
			}
		}

		return foundCity;
	}

	void getCitiesEndingWithSpecificWord(String wordToCheck) {
		for (int i = 0; i < nameOfCities.length; i++) {
			if (nameOfCities[i].contains(wordToCheck))
				System.out.println(nameOfCities[i]);
		}
	}

	void getCitiesReplacedWithWord(String wordToCheck) {
		for (int i = 0; i < nameOfCities.length; i++) {
			if (nameOfCities[i].contains(wordToCheck)) {
				System.out.println(nameOfCities[i].replace("ton", "fun"));
			}
		}
	}

	void splitAndStore(String str) {
		String streetAddress = str.substring(0, 16);
		String cityName = str.substring(17, 24);
		String zipCode = str.substring(25);
		System.out.println("String streetAddress= " + streetAddress);
		System.out.println("String city= " + cityName);
		System.out.println("String zip= " + zipCode);

	}

}
