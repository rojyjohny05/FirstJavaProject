package print10ConsecutiveNumbers;

public class PrintNumbersMain {

	public static void main(String[] args) {
		
		PrintNumbers numberLoop = new PrintNumbers();
				
		//while loop
		System.out.println("printing output for While loop");
		numberLoop.number = 1;
		numberLoop.printWhileNumbers();
		
		//Do While Loop
		System.out.println("printing output for Do While loop");
		numberLoop.num = 1;
		numberLoop.printDoWhileNumbers();
		

	}

}
