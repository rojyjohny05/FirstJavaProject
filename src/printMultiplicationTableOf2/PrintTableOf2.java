package printMultiplicationTableOf2;

public class PrintTableOf2 {
	
	int number;
	
	void printMultiples()
	{
		int finalNumber = number * 10;
		while(number<=finalNumber)
		{
			System.out.println(number);
			number+=2;
		}
	}

}
