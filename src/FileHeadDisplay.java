//Gittie Klein
//This program displays the first five lines of the file that the user enters

//when using the Scanner class
import java.util.Scanner;

//when using the file class
import java.io.*;

public class FileHeadDisplay 
{
	public static void main(String[] args) throws IOException
	{
		String fileName;
		Scanner input = new Scanner(System.in);

		//ask the user the name of the file
		System.out.println("What is the name of the file that you would like view the first "
				+ "five lines of the file's contents? ");
		fileName = input.nextLine();
		
		//open the file
		File view = new File(fileName);

		//make sure the file exists
		if (!view.exists())
		{
			System.out.println("The file doesn't exist");
			System.exit(0);
		}

		//create a Scanner object so you can read from the file
		Scanner read = new Scanner(view);
		
		//read the first 5 lines of the file
		for (int i = 1; i <= 5; i++)
		{
			String content = read.nextLine();
			System.out.println(content);
		}
		
		//close the Scanner
		read.close();
	}
}
