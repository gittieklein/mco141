import java.util.Scanner;

public class StringManipulator
{
	public static void main(String []args)
	{
	
		//declare variables
		String city;
		int number;
		String upper;
		String lower;
		char firstChar;

		//ask the user their favorite city
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the name of your favorite city? ");
		city = keyboard.nextLine();
	
		//find the parts of their favorite city
		number = city.length();
		upper = city.toUpperCase();
		lower = city.toLowerCase();
		firstChar = city.charAt(0);

		//print out the info of their favorite city
		System.out.println("There are " + number + " charcters in the name of your favorite city.");
		System.out.println("The name of your favorite city appears like \"" + upper + "\" in all upper case letters.");
		System.out.println("The name of your favorite city appears like \"" + lower + "\" in all lower case letters.");
		System.out.print("The first character of your favorite city is " + firstChar + ".");
	}
}

		
	