package waterTank;

public class WaterTankClass {
	
	int firstCapacity;
	
	void fillWaterTank()
	{
	
		int fillIdentifier=1;
		
		while(firstCapacity<=100)
		{
			firstCapacity+=10;
			
			System.out.println(fillIdentifier + " Fill: " +firstCapacity + " Liters");
			
			fillIdentifier++;
									
			if(firstCapacity==100)
			{
				System.out.println("Reached Maximum Level, Cannot Overfill.");
				break;
			}
		}
	}

}
