package multiplicationTable;

import java.util.Scanner;

public class MultiplicationTableClass {
	
	int number;
	
	Scanner sc = new Scanner(System.in);
	
	void multiplicationTable()
	{
		System.out.println("Enter the number");
		number = sc.nextInt();
		
		System.out.println("Multiplication Table of " + number);
		System.out.println("**************************");
		
		for(int i=1;i<=10;i++)
		{
			int tableValue = i*number;
			
			System.out.println(i + " X " + number + " = " + tableValue);
		}
		
	}

}
