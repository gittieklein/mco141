//Gittie Klein
//Program to figure out the restaurant bill

import java.util.Scanner;

public class RestaurantBill 
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);				//Telling the computer that the input is coming from the keyboard
		System.out.print("Bill (without tax): $");			//A prompt so the user knows what to type in
		double bill = input.nextDouble();					//Assigning the users input to a variable
		double tax =.0675;									//The tax is 6.75% which is .0675
		System.out.println("Tax: $" + (tax * bill));
		double includingTax = (bill + bill * tax);
		double tip = .20;									//The tip is 20% which is .20
		System.out.print("Tip: $" + (tip * includingTax));
		System.out.print("\nFinal bill inculding tax and tip: $" + (tip * includingTax + includingTax));
	}
}