//Gittie Klein

//to use the Scanner class
import java.util.Scanner;

public class ConversionProgram 
{
	public static void main(String []args)
	{
		int number;
		int selection;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a distance in meters: ");
		number = input.nextInt();
		
		while (number < 0)
		{
			System.out.println("You must enter a positive number for the distance in meters.");
			System.out.print("Enter a distance in meters: ");
			number = input.nextInt();
		}
		
		do
		{
			menu();
			System.out.print("\nEnter your choice: ");
			selection = input.nextInt();
		
			//input validation
			while (selection < 1 || selection > 4)
			{
				System.out.print("Invalid selection. \nYou must enter 1, 2, 3 or 4: ");
				selection = input.nextInt();
			}
		
			//use a switch statement to create a menu for the user
			switch (selection)
			{
				case 1: 
					showKilometers(number);
					break;
				case 2:
					showInches(number);
					break;
				case 3:
					showFeet(number);
					break;
				case 4:
					System.out.println("\nBye.");
					System.exit(0);
					break;
			} 
		}while (selection != 4);
	}
	
	/**
		The menu method displays the menu of selections.
	*/
	
	public static void menu()
	{
		System.out.println("\nMenu:");
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program");
	}
	
	/**
	 	The showKilometers method accepts a number in meters
	 	and converts it to kilometers. 
	 	@param number The number of meters that will be converted to kilometers
	*/
	
	public static void showKilometers(int number)
	{
		double kilometers;
		kilometers = number * .001;
		System.out.printf("\n%d meters is %.3f kilometers.\n", number, kilometers);
	}
	
	/**
	 	The showInches method accepts a number in meters
	 	and converts it to inches.
	  	@param number The number of meters that will be converted to inches
	*/
	
	public static void showInches(int number)
	{
		double inches;
		inches = number * 39.37;
		System.out.printf("\n%d meters is %.3f inches.\n", number, inches);
	}
	
	/**
		The showFeet method accepts a number in meters
		and converts it to inches.
		@param number The number of meters that will be converted to feet
	*/
	
	public static void showFeet(int number)
	{
		double feet;
		feet = number * 3.281;
		System.out.printf("\n%d meters is %.3f feet.\n", number, feet);
	}
	
	
}
