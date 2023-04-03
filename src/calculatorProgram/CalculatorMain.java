package calculatorProgram;

public class CalculatorMain {

	public static void main(String[] args) {
		
		CalculatorClass calculator = new CalculatorClass();
		
		calculator.num1=10;
		calculator.num2=4;
		calculator.num3=3;
		
		String operation="cube";
		
		switch (operation) {
		case "add":
			calculator.sumOfNumbers();
			break;
		case "subtract":
			calculator.differenceOfNumbers();
			break;
		case "multiply":
			calculator.productOfNumbers();
			break;
		case "divide":
			calculator.divisionOfNumbers();
			break;
		case "square":
			calculator.sqaureOfNumbers();
			break;
		case "cube":
			calculator.cubeOfNumbers();
			break;

		default:
			System.out.println("Invalid Operation!!!");
			break;
		}
		

	}

}
