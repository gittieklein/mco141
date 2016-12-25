import java.util.Scanner;

public class DistanceTraveled
{
	public static void main(String []args)
	{
		int speed;
		int hours;
		
		Scanner input = new Scanner(System.in);

		System.out.print("What is the speed of a vehicle (in mph)? ");
		speed = input.nextInt();
		while (speed < 0)
		{	
			System.out.print("You must enter a positive value for the speed." +
					"\nWhat is the speed of a vehicle (in mph)?");
			speed = input.nextInt();
		}

		System.out.print("How many hours did the vehicle travel? ");
		hours = input.nextInt();
		while (hours < 1)
		{	
			System.out.print("You must enter a number greater than one for numer of hours." +
					"\nHow many hours did the vehicle travel?");
			hours = input.nextInt();
		}
		
		System.out.println("Hours\t\tDistance Traveled");
		System.out.println("-----------------------------------------");
		
		
		
		for(int i  = 1; i <= hours; i++)
		{
			int caldulatedDistance = distance (i, speed, hours);
			System.out.printf("%d\t\t%8d\n", i, caldulatedDistance);
		}
	}
	
	/**
	 * The distance method accepts the vehicle's speed and time and 
	 * calculates the distance for every hour
	 * @param i transfer the counter for the for loop
	 * @param speed the speed of the vehicle
	 * @param hours the hours the vehicle traveled
	 * @return the calculated distance based on time and speed
	 */
	
	public static int distance (int i, int speed, int hours)
	{
		int calculatedDistance;
		calculatedDistance = speed * i;
		return calculatedDistance;
	}
}
