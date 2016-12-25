//this program will predict the size of a population
import java.util.Scanner;

public class population
{
	public static void main(String []ars)
	{
		double population;
		double increase;
		int days;

		Scanner input = new Scanner(System.in);
		
		//get info from the user
		System.out.print("What is the starting number of organisms? ");
		population = input.nextDouble();
		
		//it must start out at least 2 organisms
		while (population < 2)
		{
			System.out.println("The starting size of the population must be at least two.");
			System.out.print("What is the starting number of organisms? ");
			population = input.nextDouble();
		}

		System.out.print("What is the average daily popultaion increase of the organisms (as a percent)? ");
		increase = input.nextDouble();

		//the daily increase can't be a negative number
		while (increase <= 0)
		{
			System.out.println("The daily increase has to be greater than zero.");
			System.out.print("What is the average daily popultaion increase of the organisms (as a percent)? ");
			increase = input.nextDouble();
		}

		System.out.print("How many days will the organisms multiply? ");
		days = input.nextInt();

		//the number of days has to be one or greater
		while (days < 1)
		{
			System.out.println("The nuber of days can't be less than one.");
			System.out.print("How many days will the organisms multiply? ");
			days = input.nextInt();
		}

		System.out.println("Day\t\tPopulation");
		System.out.printf("1\t\t%.2f organisms", population);
		
		for (int i = 2; i <= days; i++)
		{
			population = population + population * (increase / 100); 
			System.out.print("\n" + i + "\t\t" + population + " organisims");
		}
		
		input.close();
	}
}