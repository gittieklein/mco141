//Gittie Klein
//This program will convert the number inputed to Roman Numerals

//Needed when using the Scanner class
import java.util.Scanner;

public class RomanNumerals
{
	public static void main(String []args)
	{
		int number;
		String romanNumeral;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number from 1 to 10: ");
		number = input.nextInt();

		if (number ==1)
			romanNumeral = "I";
		else if (number == 2)
			romanNumeral = "II";
		else if (number == 3)
			romanNumeral = "III";
		else if (number == 4)
			romanNumeral = "IV";
		else if (number == 5)
			romanNumeral = "V";
		else if (number == 6)
			romanNumeral = "VI";
		else if (number == 7)
			romanNumeral = "VII";
		else if (number == 8)
			romanNumeral = "VIII";
		else if (number == 9)
			romanNumeral = "IX";
		else if (number == 10)
			romanNumeral = "X";
		else
			romanNumeral = "invalid";
		
		//You only want to display the Roman Numeral if a user typed in a correct value
		if (number >= 1 && number <=10)
			System.out.print("In Roman Numerals, a " + number + " is " + romanNumeral + ".");
		else
			System.out.print("You must enter a value from 1 to 10.");
		

	}
}