package findStudentGame;

//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindStudentClass {

	int hiddenStudentIndex;
	int wrongGuess;
	String hiddenStudentName;
	String[] checkArray = new String[10];
	String[] nameOfStudents = { "Aleena", "Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
			"Kamaldeep", "Manpreetk", "Manpreets", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat", "Rojy",
			"Sojan", "Suchitra", "Vindhuja" };

	Scanner sc = new Scanner(System.in);

	String getHiddenStudentName() {
		Random randomIndex = new Random();
		hiddenStudentIndex = randomIndex.nextInt(nameOfStudents.length);

		hiddenStudentName = nameOfStudents[hiddenStudentIndex];
		return hiddenStudentName;
	}

	void getDashes() {
		for (int i = 0; i < hiddenStudentName.length(); i++) {
			System.out.print("_ ");
		}
	}

	void getStudentLetter() {

		System.out.println("\nGuess the letter:  ");
		String letter = sc.nextLine();

		String[] nameArray = hiddenStudentName.split("");

		if (hiddenStudentName.contains(letter)) {
			System.out.println("You are guessing: ");

			for (int i = 0; i < hiddenStudentName.length(); i++) {
				if (nameArray[i].equals(letter)) {
					checkArray[i] = nameArray[i];
				}

			}
		} else {
			wrongGuess++;
			System.out.println("\nYou have guessed " + wrongGuess + " wrong letters");
		}
		// System.out.println(Arrays.toString(checkArray));
		for (int j = 0; j < hiddenStudentName.length(); j++) {
			if (checkArray[j] != null) {
				System.out.print(checkArray[j] + " ");

			} else {
				System.out.print("_ ");
			}
		}

		String finalName = String.join("", checkArray);
		// String finalName = checkArray.toString();
		// System.out.println(finalName);
		if (finalName.replace("null", "").equals(hiddenStudentName)) {
			System.out.println("\nCongratualtions!!! You have won the game...");
		} else if (wrongGuess < 5) {
			getStudentLetter();
		} else {
			System.out.println("\nSorry!!! You have tried maximum number of wrong attempts");
		}

	}

}
