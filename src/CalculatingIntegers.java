//Gittie Klein
//This program uses the print writer class to calculate the min, max and average of a list of numbers

//import statement for the Scanner class
import java.util.Scanner;

//import statement for the printwriter class
import java.io.*;

public class CalculatingIntegers 
{
	public static void main(String []args)throws IOException
	{
		//create a file object
		File number = new File("C:\\Users\\Gittie Klein\\Documents\\gittie\\touro\\Intro to Programming-Professor Morgulis\\Numbers.txt");
		
		//Check to make sure that the file exists before trying to read from it
		if (!number.exists())
		{
			System.out.println("The file doesn't exist.");
			System.exit(0);
		}
		
		//associate the file with the Scanner class
		Scanner read = new Scanner(number);
		
		//Read the file
		//do it in a do while loop so it reads the number, checks if it's the min or the max and adds it to the accumulator
		int min = 100;				//Start with a high number because the min is likely to be lower
		int max = 0;				//Start with a low number because the max is likely to be higher
		int i = 0;					//This variable will be the counter to know how many numbers there are in the file
		int total = 0;
		double average;
		int line;					//hold the integer from the file
		
		line = read.nextInt();
		min = line;
		max = line;
		total += line;
		i++;
		
		while (read.hasNext())
		{
			line = read.nextInt();
			if (line < min)
			{
				min = line;
			}
			if (line > max)
			{
				max = line;
			}
			total += line;
			i++;
		} 
		
		//close the file
		read.close();
		
		average = (double)total / i;
		
		//Display the information calculated
		System.out.printf("The smallest number in Numbers.txt is %d.", min);
		System.out.printf("\nThe largest number in Numbers.txt is %d.", max);
		System.out.printf("\nThe average of all the numbers in Numbers.txt is %.4f.", average);
		
		//Write the information to a file
		//Connect a file to the program
		PrintWriter output = new PrintWriter("C:\\Users\\Gittie Klein\\Documents\\gittie\\touro\\Intro to Programming-Professor Morgulis\\Output.txt");
		
		//Writer to the file
		output.printf("The smallest number in Numbers.txt is  %d.", min);
		output.println();
		output.printf("The largest number in Numbers.txt is %d.", max);
		output.println();
		output.printf("The average of all the numbers in Numbers.txt is %.4f.", average);
				
		//close the PrintWriter
		output.close();
	}

}
