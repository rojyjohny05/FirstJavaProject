package waterTank;

public class WaterTankClass {

	int initialCapacity = 85;
	int maximumCapacity = 100;
	int remainingQty;

	void fillWaterTank() {
		
		System.out.println("Current Level: " + initialCapacity + " Liters");
		
		while (initialCapacity <= maximumCapacity) 
		{
		
			initialCapacity+=10;	
			
			if(initialCapacity > maximumCapacity)
			{
				System.out.println("Reached Maximum Level, Cannot Overfill.");
				break;
			}
			else
			{
				System.out.println("Next Fill: " + initialCapacity + " Liters");
				
				remainingQty = maximumCapacity - initialCapacity;
				
				if(remainingQty==0)
				{
					initialCapacity +=remainingQty;
					
					//System.out.println("Next Fill: " + initialCapacity + " Liters");
				}
				else if(remainingQty<=10)
				{
					initialCapacity +=remainingQty;
					
					System.out.println("Next Fill: " + initialCapacity + " Liters");
				}
				else
				{
					//initialCapacity +=remainingQty;
					//System.out.println("invalid");
				}
				
			}

			

		}

		

	}

}
