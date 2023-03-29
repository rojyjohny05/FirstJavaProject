package largestOfThreeNumbers;

public class LargestNumber {
	int n1;
	int n2;
	int n3;
	
	void getLargestNumber() {
		
		System.out.println("Given Numbers are " + n1 + ", " + n2 + ", " + n3);
		
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println("Largest number is " +n1);
			}
			else
			{
				System.out.println("Largest number is " +n3);
			}
			
		}
		else
		{
			if(n2>n3)
			{
				System.out.println("Largest number is " +n2);
			}
			else
			{
				System.out.println("Largest number is " +n3);
			}
		}
		
	}

}
