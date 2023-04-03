package chocolateBox;

public class ChocolateBoxClass {
	
	int initialQty=27;
	
	void fillChocolateBox()
	{
		do
		{
			if(initialQty==27)
			{
				System.out.println("Initial Quantity: " +initialQty);
			}
			else
			{
				System.out.println("Next Fill: " +initialQty);
			}
			
			initialQty+=5;
			
			if(initialQty>63)
			{
				System.out.println("Reached Maximum Level, Cannot go above 63.");
				//break;
			}
			
		}while(initialQty<=63);
	
	}

}
