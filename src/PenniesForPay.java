//Gittie Klein
//This program calculates the amount a person would 
//earn over a period of time if his salary is doubles every day

//input the Scanner class
import java.util.Scanner;

public class PenniesForPay 
{
	public static void main(String []args)
	{
		int days;
		double salary = .01;
		double total = .01;
		
		Scanner input = new Scanner(System.in);
		System.out.print("How many days did you work? ");
		days = input.nextInt();
		
		//Input validation. Make sure the user entered a number greater than 0.
		while (days < 1)
		{
			System.out.println("You must enter a number 1 or greater for the number of days worked.");
			System.out.print("How many days did you work? ");
			days = input.nextInt();
		}
		
		System.out.printf("\nDay\t\tSalary");
		System.out.println("\n------------------------------------");
		System.out.printf("Day 1\t\t$" + "%,15.2f", salary);
		
		//The salary should continue to double for the amount of days the user worked.
		for (int i = 2; i <= days; i++)
		{
			salary *= 2;
			System.out.printf("\nDay " + i + "\t\t$%,15.2f", salary);
			total += salary;
		}
		
		//Display the total pay
		System.out.printf("\n\nYour total pay after " + days + " days is $%,.2f.", total);
		
		input.close();
	}

}
