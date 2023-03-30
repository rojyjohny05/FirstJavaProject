package print10ConsecutiveNumbers;

public class PrintNumbers {
	
	//while loop
	int number;
	void printWhileNumbers()
	{
		int finalNumber = number + 9;
		while(number<=finalNumber)
		{
			System.out.println(number);
			number++;
		}
	}
	
	//do while loop
	int num;
	void printDoWhileNumbers()
	{
		int finalNumber = num + 9;
		do
		{
			System.out.println(num);
			num++;
		}while(num<=finalNumber);
	}
}
