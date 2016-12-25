//Gittie Klein

//using the Scanner class
import java.util.Scanner;

//using the Random class
import java.util.Random;

public class RandomNumberGuessingGame 
{
		public static void main(String []args)
		{
			Random num = new Random();
			int rand = num.nextInt(99) + 1;
			
			Scanner input = new Scanner(System.in);
			System.out.print("Guess what the random number is from 1 - 100: ");
			int guess = input.nextInt();
			
			while (guess != rand)
			{
				while (guess > rand)
				{
					System.out.println("Too high, try again.");
					System.out.print("Guess what the random number is from 1 - 100: ");
					guess = input.nextInt();
				}
				while (guess < rand)
				{
					System.out.println("Too low, try again.");
					System.out.print("Guess what the random number is from 1 - 100: ");
					guess = input.nextInt();
				}
			}
			
			if (guess == rand)
				System.out.printf("Yay! You guesed the right number! Then random number was %d.", rand);
			
			input.close();
		}

}
