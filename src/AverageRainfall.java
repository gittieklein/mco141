//Gittie Klein

import java.util.Scanner;

public class AverageRainfall 
{
	public static void main(String args[])
	{
		int years;
		double inches;
		String month;
		double totalInches = 0;
		
		Scanner input = new Scanner(System.in);
		
		//Ask the user for a number of years
		System.out.print("For how many years would you like to calcuate the average rainfall? ");
		years = input.nextInt();
		
		//Input validation. Make sure the number of years is at least 1.
		while (years < 0)
		{
			System.out.println("Invalid. \nYou must enter 1 or greater for the number of years.");
			System.out.print("For how many years would you like to calcuate the average rainfall? ");
			years = input.nextInt();
		}
		
		for (int i = 1; i <= years; i++)
		{
			System.out.printf("\nYEAR %d", i);
			System.out.println("\n--------");
			System.out.println("Enter the number of inches of rainfall in the month of: ");
			for (int x = 1; x <= 12; x++)
			{
				switch (x)
				{
					case 1:
						month = "January";
						break;
					case 2:
						month = "February";
						break;
					case 3:
						month = "March";
						break;
					case 4:
						month = "April";
						break;
					case 5:
						month = "May";
						break;
					case 6:
						month = "June";
						break;
					case 7:
						month = "July";
						break;
					case 8:
						month = "August";
						break;
					case 9:
						month = "September";
						break;
					case 10:
						month = "October";
						break;
					case 11:
						month = "November";
						break;
					case 12:
						month = "December";
						break;
					default:
						month = "invalid";
					
				}
				System.out.printf("%-12s ", month);
				inches = input.nextDouble();
				
				//input validation that the number of inches is positive
				while (inches < 0)
				{
					System.out.println("Invalid. \nYou must enter a positive number for the inches of rain.");
					System.out.printf("How many inches of rain were there in the month of %s? ", month);
					inches = input.nextDouble();
				}
				
				//you need an accumulator to get the total inches
				totalInches += inches;
			}
		}
		
		//display the output
		int months = years * 12;
		double average = totalInches / months;
		
		System.out.printf("\nYou calculated a total of %d months.", months);
		System.out.printf("\nIn %d months, there was %.2f inches of rainfall.", months, totalInches);
		System.out.printf("\nThe average rainfall per month in the %d month period is %.2f inches.", months, average);
	}
}
