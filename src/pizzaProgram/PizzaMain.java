package pizzaProgram;

import java.util.Scanner;

public class PizzaMain {

	public static void main(String[] args) {
		
		PizzaClass pizza = new PizzaClass();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose one type: Small/Medium/Large");
		
		String type = sc.nextLine();
		
		
		
		//pizza.getPizzaBill(type,additionalTopping,extraCheese);
		
		pizza.getPizzaBill(type);

	}

}
