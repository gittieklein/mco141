//figure out the sum of numbers from 1 up until a certain number

import java.util.Scanner;

public class SumOfNumbers
{
	public static void main(String []args)
	{
		int num;
		//a variable act as the accumulator
		int total = 0;				

		Scanner input = new Scanner(System.in);	
		System.out.print("Please enter a positive integer: ");
		num = input.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			total += i;
		}
		
		//display the sumer of the numbers 1 through num
		System.out.printf("The sum of the numbers 1 through %d is %d.", num, total);
	}
}
