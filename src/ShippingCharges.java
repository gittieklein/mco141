//Gittie Klein
//This program calculates how much it cost to ship things with The Fast Freight Shipping Company

//Tell the computer the location of the scanner class.
import java.util.Scanner;

public class ShippingCharges 
{
	public static void main(String []args)
	{
		int weight;
		int miles;
		double chargeBasedOnWeight;
		int milesTimes500;				//Variable to see if the package is being sent more than 500 miles. 
										//If the package is being sent less than 500 miles, this variable will
										//be zero. We will take the variable of milesTimes500 and add 1 if there
										//is a modulus (remainder). Then that number will be multiplied by the rate.
		int remainder;					//This variable will be a 0 if the number of miles is divisible by 500.
										//If the number is not divisible by 500, it will be the remainder.
		int number;						//This number will be 1 or 0. 1 if there is a remainder and 0 if there is no 
										//remainder.
		int number2;					//In order to know the totalCharges, we need to know how many miles the package
										//is being sent in relation to 500. How many times is 500 multiplied to get to the
										//number of miles the package is being shipped.
		double totalCharges;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many lbs. is your package? ");
		weight = input.nextInt();

		System.out.print("How far do you want to send the package (in miles)? ");
		miles = input.nextInt();
		
		if (weight < 0)
		{	
			chargeBasedOnWeight = 0;
			System.out.println("The weight of the package cannot be less than zero. \nPlease run the program again.");
		}
		else if (weight <= 2)
			chargeBasedOnWeight = 1.10;
		else if (weight <=6)
			chargeBasedOnWeight = 2.20;
		else if (weight <= 10)
			chargeBasedOnWeight = 3.70;
		else
			chargeBasedOnWeight = 3.80;
		
		//Divide the number of miles by 500 to see how many times the rate will need to be multiplied.
		//But this is not the final number it will be multiplied by because we also need to take the reaminder into account.
		milesTimes500 = miles / 500;
		
		//Calculate the remainder of the miles shipped divided by 500.
		remainder = miles % 500;
		
		//We have to see if there is a remainder, and if there is, we have to add one to milesTimes500.
		if (remainder > 0)
			number = 1;
		else
			number = 0;
		
		//Add the 1 or 0 (if there is or isn't a remainder) to the number of times the miles is divisible by 500.
		number2 = milesTimes500 + number;
		
		totalCharges = number2 * chargeBasedOnWeight;
		
		//We only want to print the charges if the number entered is valid.
		if (weight <0);
		else
			System.out.print("Your charges are $" + totalCharges + ".");
	}	
}
