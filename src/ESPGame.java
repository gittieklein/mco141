//Gittie Klein
//This program tests your extrasensory perception

//when using the Random class
import java.util.Random;

//when using the Scanner class
import java.util.Scanner;

public class ESPGame 
{
	public static void main(String[] args)
	{
		int correct = 0;
		
		for (int i = 1; i <=10; i++)
		{
			String computerColor = color();
			String guess = userTurn();
			System.out.printf("The computer's color is %s.\n", computerColor);
			if (computerColor.equalsIgnoreCase(guess))
				correct += 1;
		}
		System.out.printf("You guessed the correct color %d of the times.", correct);
	}
	
	/**
	 * The color method generates a random color
	 * @return color the random color the computer has selected
	 */
	
	public static String color()
	{
		Random rand = new Random();
		int num = rand.nextInt(5);
		String color = null;
		
		//convert the random number to a random color
		switch (num)
		{
			case 0:
				color = "Red";
				break;
			case 1:
				color = "Green";
				break;
			case 2:
				color = "Blue";
				break;
			case 3:
				color = "Orange";
				break;
			case 4:
				color = "Yellow";
				break;
		}
		
		return color;
	}
	
	/**
	 * The userTurn method asks the user to guess the color
	 * the computer selected
	 * @return guess the user's guess for the color
	 */
	
	public static String userTurn()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Try to guess the color that the computer has selected: "
				+ "(Red, Green, Blue, Orange or Yellow) ");
		String guess = input.nextLine();
		return guess;
	}
}
