package primeNumber;

import java.util.Scanner;

public class PrimeNumberClass {
	
	boolean number;
	
	Scanner sc = new Scanner(System.in);
	
	void checkPrimeNumber()
	{
		System.out.println("Enter the positive number");
		int enteredPositiveNumber = sc.nextInt();
		
		if (enteredPositiveNumber == 0 || enteredPositiveNumber == 1)
		{
			System.out.println(enteredPositiveNumber +" is not a prime number");
		}

		else if (enteredPositiveNumber == 2)
		{
		    System.out.println(enteredPositiveNumber +" is a prime number");
		}

		else if (enteredPositiveNumber % 2 == 0)
		{
			System.out.println(enteredPositiveNumber +" is not a prime number");
		}
		
		else
		{
			int lastCount = enteredPositiveNumber-1;
			   	 
		    for (int num=2;num<=lastCount;num++)
		    {
		    	
		    	if(enteredPositiveNumber % num == 0)
		    	{
		    		number=false;
		    		break;
		    	}
		    	
		    	if(enteredPositiveNumber % num != 0)
		    	{
		    		number=true;
		    		//break;
		    	}
		    	
		    	else 
		    	{
		    		number=true;
		    	}
		    	
		    	
		    }   
		    
		    if(number)
	    	{
	    		System.out.println(enteredPositiveNumber +" is a prime number");
	    	}
	    	else
	    	{
	    		System.out.println(enteredPositiveNumber +" is not a prime number");
	    	}
		     
		}
	          
	
	}

}
