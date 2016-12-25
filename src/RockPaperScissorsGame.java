//Gittie Klein

//when using random class
import java.util.Random;

//when using the scanner class
import java.util.Scanner;

public class RockPaperScissorsGame 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String answer;
		
		do
		{
			String computerSelection = computerTurn();
			String userSelection = playerTurn(input);
			System.out.printf("The computer chose %s.\n", computerSelection);

			//display the winner
			winner(computerSelection, userSelection);

			System.out.print("Do you want to play again? (yes/no) ");
			answer = input.nextLine();
			System.out.println();
		}while (answer.equalsIgnoreCase("yes"));
	}
	
	/**
		The computerTurn method generates a random number and then converts it to
		rock paper or scissors
		@return turn rock, paper, or scissors - what the computer has chosen
	*/
		
	public static String computerTurn()
	{
		Random rand = new Random();
		int choice = rand.nextInt(3) + 1;
		String turn;
		
		//change numbers to rock paper and scissors
		switch (choice)
		{
			case 1: 
				turn = "rock";
				break;
			case 2:
				turn = "paper";
				break;
			case 3:
			default:
				turn = "scissors";	
		}
		
		return turn;
	}

	/**
		The playerTurn method gives the user a choice of rock, paper or scissors
		@param input transfer the Scanner class
		@return userChoice the selection the user made
	*/

	public static String playerTurn(Scanner input)
	{
		String userChoice;
		
		System.out.println("Please choose from the following: \n\tRock \n\tPaper \n\tScissors");
		userChoice = input.nextLine();

		return userChoice;
	}

	/**
		The winner method displays the winner
		@param computer the computer's selection
		@param user the user's selection
	*/

	public static void winner(String computer, String user)
	{
		if (user.equalsIgnoreCase("rock") && computer.equalsIgnoreCase("scissors"))
			System.out.println("The rock smashes the scissors. You win!");
		else if (user.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("rock"))
			System.out.println("The rock smashes the scissors. Computer wins!");
		else if (user.equalsIgnoreCase("scissors") && computer.equalsIgnoreCase("paper"))
			System.out.println("Scissors cuts paper. You win!");
		else if (user.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("scissors"))
			System.out.println("Scissors cuts paper. Computer wins!");
		else if (user.equalsIgnoreCase("rock") && computer.equalsIgnoreCase("paper"))
			System.out.println("Paper wraps rock. Computer wins!");
		else if (user.equalsIgnoreCase("paper") && computer.equalsIgnoreCase("rock"))
			System.out.println("Paper wraps rock. You win!");
		else
			System.out.println("The game must be played again to determine the winner.");

		System.out.println("Hope you enjoyed playing.");
	}
}
