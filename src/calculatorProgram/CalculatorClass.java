package calculatorProgram;

public class CalculatorClass {
	
	int num1;
	int num2;
	
	int num3;

	void sumOfNumbers() {
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
	}

	void differenceOfNumbers() {
		int difference = num1 - num2;
		System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
	}

	void productOfNumbers() {
		int product = num1 * num2;
		System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
	}

	void divisionOfNumbers() {
		int quotient = num1 / num2;
		System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);
		int remainder = num1 % num2;
		System.out.println("Remainder of the division operation of " + num1 + " and " + num2 + " is " + remainder);
	}
	
	void sqaureOfNumbers() {
		int square = num3 * num3;
		System.out.println("Square of " + num3 +  " is " + square);
	}
	
	void cubeOfNumbers() {
		int cube = num3 * num3 * num3;
		System.out.println("Cube of " + num3 +  " is " + cube);
	}

}
