package pizzaProgram;

import java.util.Scanner;

public class PizzaClass {
	
	String[] pizzaTypeArray = {"Small","Medium","Large"};
	int[] pizzaPriceArray = {15,20,25};
	int[] pizzaToppingPriceArray = {2,3,3};
	int[] pizzaExtraCheeseArray = {1,1,1};
	
	int pizzaPrice;
	
	
	
	Scanner sc = new Scanner(System.in);
	
	//void getPizzaBill(String type,String additionalTopping,String extraCheese)
	//{
	void getPizzaBill(String type)
	{
		
		//int flag=0;
	
		for (int i = 0; i < pizzaTypeArray.length; i++) 
		{
			
			  if (pizzaTypeArray[i].equals(type)) 
			  { 
				  pizzaPrice = pizzaPriceArray[i];
				  
				  System.out.println("Do you want additional toppings? Yes/No");
					
				  //boolean additionalTopping = sc.nextBoolean();
				  String additionalTopping = sc.nextLine();
					
				  System.out.println("Do you want Extra Cheese? Yes/No");
					
				  //boolean extraCheese = sc.nextBoolean();
				  String extraCheese = sc.nextLine();
			  
				  if (additionalTopping.equals("Yes")) 
				  { 
					  pizzaPrice = pizzaPrice + pizzaToppingPriceArray[i]; 
				  } 
				  
				  if (extraCheese.equals("Yes")) 
				  { 
					  pizzaPrice = pizzaPrice + pizzaExtraCheeseArray[i]; 
				  }
			  }
				/*
				 * else { flag = 1; }
				 */
			  
			  
		}
		/*if(flag!=1)
		{
			System.out.println("Your Final Bill: $"+ pizzaPrice);
		}
		else
		{*/
			//System.out.println("Please select a valid option");
		//}
		
		System.out.println("Your Final Bill: $"+ pizzaPrice);
	}
}
	
		
	
			
	




