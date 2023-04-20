package crsCalculator;

import java.util.Scanner;

public class CrsCalculatorClass {

	String[] education = { "PhD", "Master Degree", "Two or more Degrees", "Plus Two" };
	int[] eduScore = { 25, 23, 22, 21 };
	String[] experience = { "4-5 years", "6 years or more" };
	int[] expScore = { 13, 15 };
	int[] age = { 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47 };
	int[] ageScore = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

	Scanner sc = new Scanner(System.in);

	String eduLevel;
	int eduPoints;
	String expLevel;
	int expPoints;
	int ageLevel;
	int agePoints;
	double listening;
	double speaking;
	double reading;
	double writing;
	int ieltsPoints;
	boolean relativePresent;
	int relativePoints;
	boolean studiesPresent;
	int studiesPoints;
	boolean workPresent;
	int workPoints;
	int totalCrsPoints;

	void getEduactionScore() {

		System.out.println("Please enter your education level from below list: ");

		for (int i = 0; i < education.length; i++) {

			System.out.println(education[i]);
		}

		eduLevel = sc.nextLine();

		for (int i = 0; i < education.length; i++) {

			if (eduLevel.equals(education[i])) {
				eduPoints = eduScore[i];
			}

		}

	}

	void getExperienceScore() {

		System.out.println("Please enter your experience level from below list: ");

		for (int i = 0; i < experience.length; i++) {

			System.out.println(experience[i]);
		}

		expLevel = sc.nextLine();

		for (int i = 0; i < experience.length; i++) {

			if (expLevel.equals(experience[i])) {
				expPoints = expScore[i];
			}

		}

	}

	void getAgeScore() {

		System.out.println("Please enter your age: ");

		ageLevel = sc.nextInt();

		if (ageLevel >= 18 && ageLevel <= 35) {
			agePoints = 12;
		}

		else if (ageLevel >= 36 && ageLevel <= 47) {
			for (int i = 0; i < age.length; i++) {
				agePoints = ageScore[i];
			}
		}

	}

	void getIeltsScore() {

		System.out.println("Enter your IELTS Score for Listening: ");
		listening = sc.nextDouble();

		if (listening >= 8) {
			ieltsPoints += 6;
		} else if (listening == 7.5) {
			ieltsPoints += 5;
		}

		System.out.println("Enter your IELTS Score for Speaking: ");
		speaking = sc.nextDouble();
		if (speaking >= 7) {
			ieltsPoints += 6;
		} else if (speaking == 6.5) {
			ieltsPoints += 5;
		}

		System.out.println("Enter your IELTS Score for Reading: ");
		reading = sc.nextDouble();
		if (reading >= 7) {
			ieltsPoints += 6;
		} else if (listening == 6.5) {
			ieltsPoints += 5;
		}

		System.out.println("Enter your IELTS Score for Writing: ");
		writing = sc.nextDouble();
		if (writing >= 7) {
			ieltsPoints += 6;
		} else if (listening == 6.5) {
			ieltsPoints += 5;
		}

	}

	void getRelativeScore() {
		System.out.println("Do you have relative in Canada who is a citizen or PR holder?");

		relativePresent = sc.nextBoolean();

		if (relativePresent) {
			relativePoints = 5;
		} else {
			relativePoints = 0;
		}
	}

	void getCanadianStudiesScore() {
		System.out.println("Have you studied in Canada for atleast 2 years?");

		studiesPresent = sc.nextBoolean();

		if (studiesPresent) {
			studiesPoints = 5;
		} else {
			studiesPoints = 0;
		}
	}

	void getWorkExpScore() {
		System.out.println("Have you worked in Canada for atleast 1 year under NOC O/A/B");

		workPresent = sc.nextBoolean();

		if (workPresent) {
			workPoints = 10;
		} else {
			workPoints = 0;
		}
	}

	void getTotalCrsScore() {
		totalCrsPoints = eduPoints + expPoints + agePoints + ieltsPoints + relativePoints + studiesPoints + workPoints;

		System.out.println("Total points you have scored: " + totalCrsPoints);

		if (totalCrsPoints >= 67) {
			System.out.println("You are qualified to submit the profile");
		} else {
			System.out.println("Sorry!!! You are not qualified to submit the profile");
		}
	}

}
