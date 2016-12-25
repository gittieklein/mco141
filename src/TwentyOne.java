//Gittie Klein

//when using the Scanner class
import java.util.Scanner;

//when using the Random class
import java.util.Random;

public class TwentyOne
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int selection;
		String again;

		gameRules();
		
		do
		{
			//variables to hold the scores of the 2 players
			int playerScore = 0;
			int houseScore = 0;
			
			/*each player starts off with 2 cards. this loop will iterate 2 times generating 
			2 random numbers for each player*/
			for (int i = 1; i <=2; i++)
			{
				playerScore += randomCard();
				houseScore += randomCard();
			}
			
			//tell the user his score from his 2 staring cards before his first turn
			System.out.println("You start off the game with 2 cards. \nYour score is " + playerScore + ".");
			
			//players turn
			while (playerScore < 21)
			{
				selection = gameMenu();
				
				switch (selection)
				{
					case 1:
						//add the value of the random card to the total score
						playerScore += drawCard();
						System.out.println("\nYour score is " + playerScore + ".");
						break;
					case 2:
						System.out.println("\nYour score is " + playerScore + ".");
						break;
					case 3:
						System.out.println("\nThank you for playing.\nBye.");
						System.exit(0);
				}
				
				/*if the user chose to freeze, you do not want to continue showing them the menu
				and asking them to make a selection*/
				if (selection == 2)
				{
					break;
				}
			}	
			
			//computer turn
			if (playerScore <= 21)
			{
				while (houseScore <15)
				{
					houseScore += randomCard();
				}
				winner(houseScore, playerScore);
			}
			else
			{
				/*if the player has more than 21, the game ends and the house doens't go.
				The user loses the game.*/
				winner(houseScore, playerScore);
			}

			System.out.println("\nWould you like to play again? (yes/no)");
			again = input.nextLine();
			System.out.println();
		} while (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("y"));
		
		System.out.print("Thank you for playing.\nBye.");
		input.close();
	}
	
	/**
		The drawCard method will generate a random card.
		The value of the card will be added to the players score.
		@return card the random card that's added to the user's score
	*/

	public static int drawCard()
	{
		int card;
		int suit;
		
		Random num = new Random();
		card = num.nextInt(13) + 1;
		suit = num.nextInt(4) +1;
		
		String face;
		String pic;
		
		//convert number to what the card really is, like a 1 is an A
		switch (card)
			{
				case 1:
					face = "A";
					break;
				case 11:
					face = "J";
					break;
				case 12:
					face = "Q";
					break;
				case 13:
					face = "K";
				default:
					/*convert the cards to Strings to display the number
					cards with the same variable as the face cards*/
					face = Integer.toString(card);
			}

		//convert the random numbers generate for suit to a suit name
		switch (suit)
		{
			case 1:
				pic = "spades";
				break;
			case 2: 
				pic = "hearts";
				break;
			case 3:
				pic = "diamonds";
				break;
			case 4:
			default:
				pic = "clubs";
		}

		//display the card that the user got
		System.out.println("\nYour card is a " + face + " of " + pic + ".");

		//the value of a J, Q and K are 10
		if (card >= 11 && card <= 13)
		{
			card = 10;
		}
		
		return card;
	}

	/**
		The gameMenu method gives the user a list of options of what he would  like to do by his turn.
		@return selection the section the user made for his turn
	*/

	public static int gameMenu()
	{
		int selection;
		Scanner input = new Scanner(System.in);

		System.out.println("\nIt is your turn.");
		System.out.println("\n----------------------------"
				+ "\n|   1. Draw a card	   |"
				+ "\n|   2. Freeze		   |" 
				+ "\n|   3. Quit		   |"
				+ "\n----------------------------\n");
		
		selection = input.nextInt();
		
		while (selection < 1 || selection > 3)
		{
			System.out.println("You must enter a valid choice.");
			selection = input.nextInt();
		}
		
		return selection;
	}

	/**
		The gameRules method displays the rules of the 21.
	*/

	public static void gameRules()
	{
		System.out.println("Welcome to the game of \"21\". \nYou start with 2 cards and aim to get as close to 21 as "
				+ "possible.\nNumber cards have their face value, Aces are worth 1, and Jacks, Kings and Queens are "
				+ "worth 10.\nEach turn, you decide if you want to draw a card or sit on what you have" 
				+ " (freeze). \nYou can have as many cards as you like as long as you don’t go over 21. \n\nThe rules"
				+ " of the house: \nThe house (computer) will continue to draw cards as long as its score is less than"
				+ " 15. \nIt will \"freeze\" with a score of 15 or higher.");
		System.out.println("\nReady...");
	}
			
	/**
		The randomCard method generates a random card.
		This method is used for the computer/house and 
		the 2 random cards that each player gets at the
		start of the game.
		@return card the random card used at the beginning of the game and for computer turns
	*/
	
	public static int randomCard()
	{
		int card;
		Random num = new Random();
		card = num.nextInt(13) + 1;
		if (card >= 11 && card <= 13)
		{
			card = 10;
		}
		return card;
	}
	
	/**
		The winner method displays the results of
		the game and who the winner is.
		@param houseScore the computer's score
		@param playerScore the player's score
	*/
	
	public static void winner(int houseScore, int playerScore)
	{
		System.out.println("\nYour score is " + playerScore + ".");
		System.out.println("The computer's score is " + houseScore + ".");
		
		if ((playerScore <= 21 && playerScore > houseScore) || (houseScore > 21 && playerScore <= 21))
		{
			System.out.println("\nCongradulations!!! \nYou Won!!!\n");
		}
		else if (playerScore == houseScore)
		{
			System.out.println("\nIt's a tie.");
		}
		else
		{
			System.out.println("\nYou lose:(");
		}
		
		System.out.println("Thank you for playing. \nHope you enjoyed!");
	}

}
