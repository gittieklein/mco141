//Gittie Klein

//when using the Scanner class
import java.util.Scanner;

public class Bowlerama 
{
	public static void main(String[] args)
	{
		//make named constants for minimum number of bowlers
		//the minimum number of games and the maximum score
		final int MIN_PLAYERS = 3;
		final int MIN_GAMES = 2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("How many players are on the bowling team? ");
		int players = input.nextInt();
		players = inputValidation(input, players, MIN_PLAYERS);
		System.out.print("How many games will be bowled by the bowling team? ");
		int games = input.nextInt();
		games = inputValidation(input, games, MIN_GAMES);
		
		bowlingGame(input, players, games);
	}
	
	/**
		The bowlingGame method calculates players' averages and the team average. It also calculates
		the highest average of all the players.
		@param input the Scanner variable so that the user could input data in this method
		@param players the number of bowlers
		@param games the number of bowling games
	 */
	
	public static void bowlingGame(Scanner input, int players, int games)
	{
		int score;
		int playerTotal = 0;
		int teamTotal = 0;
		double playerAverage;
		double teamAverage;
		double maxAverage = 0;
		final int MAX_SCORE = 300;
		
		//leave a blank line
		System.out.println();
		
		for(int i = 1; i <= players; i++)
		{
			playerTotal = 0;
			
			for(int x = 1; x <= games; x++)
			{
				System.out.printf("What is the score for player %d in game %d? ", i, x);
				score = input.nextInt();
				while (score < 0 || score > MAX_SCORE)
				{
					System.out.print("\nYou must enter a valid score. ");
					score = input.nextInt();
				}
				playerTotal += score;
			}	
				
			playerAverage = playerTotal / (double) games;
			System.out.printf("\nThe average score for player %d is %.2f.\n\n", i, playerAverage);
			teamTotal += playerAverage;
				
			//if the player average is greater than the max average then the player average
			//should become the max average
			if (playerAverage > maxAverage)
				maxAverage = playerAverage;
			
		}
		teamAverage = teamTotal / (double) games;
		System.out.printf("\nThe team average score is %.2f.", teamAverage);
		System.out.printf("\nThe hightest average score is %.2f.", maxAverage);
	}
	
	/**
	 	The inputValidation method tests to make sure that the user entered a valid number
	 	@param input the Scanner variable so that the user could input data in this method
		@param test holds the integer that the user entered for number of players or games
		@param num holds the named constants for the minimum number of bowlers and games
		@return newNum the number the user enters for the players or games if he entered an
		invalid number of the original number if the user entered a valid number
	*/
	
	public static int inputValidation(Scanner input, int value, int num)
	{
		while (value < num)
		{
			System.out.printf("You must enter a numbe greater than %d. ", (num - 1));
			value = input.nextInt();
		}
		return value;
	}
}
