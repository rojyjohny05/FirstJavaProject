package firstInterview;

public class InterviewClass {
	
	int[] number = {5,8,2,11,15};
	int smallerNumber=number[0];
	
	void getSmallestNumber()
	{
		for(int i=0;i<number.length;i++)
		{
			if(number[i]<smallerNumber)
			{
				smallerNumber=number[i];
			}
		}
		
		System.out.println("Smallest number is: " +smallerNumber);
	}

}
