package loginPage;

import java.util.Scanner;

public class LoginPageClass {
	
	String username = "pivotAdmin";
	String password = "Admin123";
	String enteredUsername;
	String enteredPassword;
	
	Scanner sc = new Scanner(System.in);
	//Scanner sc1 = new Scanner(System.in);
	
	void loginPage() 
	{
					
		for(int counter=1;counter<=3;counter++)
		{
			
			System.out.println("Enter your Username");
			enteredUsername = sc.nextLine();
			//System.out.println(enteredUsername);
			
			System.out.println("Enter your Password");
			enteredPassword = sc.nextLine();
			//System.out.println(enteredPassword);
			
			//if(enteredUsername == "pivotAdmin" && enteredPassword == "Admin123")
			if(enteredUsername.equals(username) && enteredPassword.equals(password))
			{
				System.out.println("You are logged in");
				break;
			}
			else if(enteredUsername.equals(username) || enteredPassword.equals(password))
			{
				System.out.println("Incorrect username or password...Try again...");
															
				if(counter==3)
				{
					System.out.println("Sorry...You have exceeded maximum number of tries. Your account got locked.");
				}
			}
			else
			{
				
				System.out.println("Incorrect username or password...Try again...");
							
				if(counter==3)
				{
					System.out.println("Sorry...You have exceeded maximum number of tries. Your account got locked.");
				}
					
			}
							
		}
	}

}
