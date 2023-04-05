package arrayDivisiblebyThreeAndFive;

public class ArrayDivisibleClass {

	int[] divisibleArray = new int[10];
	int i;
	int j;

	void divisibleArrayBynumber() 
	{
		
		for (int number = 1; number <= 500; number++) 
		{
							
			for (i=j; i <= 9; i++) 
			{
				if (number % 3 == 0 && number % 5 == 0) 
				{
					divisibleArray[i] = number;
					
					j=i+1;
					
					break;
				}
				
			}
		}
	}

}
