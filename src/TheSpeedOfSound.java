//Gittie Klein
//This program will calculate the speed of sound in air, water and steel

//Tell the computer where the Scanner class is
import java.util.Scanner;

public class TheSpeedOfSound 
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Would you like to see the speed of air, water or steel? ");
		String medium;
		medium = input.nextLine();
		
		System.out.print("How many feet will the sound wave travel in the medium? ");
		double distance = input.nextInt();
		
		//Calculate the speed of sound for air, water and steel
		double air = distance / 1100.0;
		double water = distance / 4900.0;
		double steel = distance / 16400.0;
		
		//Based on the users input, the program will display the speed of sound for that particular medium
		switch (medium.toLowerCase())
		{
			case "air":
				System.out.println("It will take " + air + " seconds for sound to travel through " + distance + " feet of air.");
				break;
			case "water":
				System.out.println("It will take " + water + " seconds for sound to travel through " + distance + " feet of water.");
				break;
			case "steel":
				System.out.println("It will take " + steel + " seconds for sound to travel through " + distance + " feet of steel.");
				break;
			default:
				System.out.println("You didn't enter air, water or steel. \nPlease run the program again to try again.");
		
		}
		
	}
}
