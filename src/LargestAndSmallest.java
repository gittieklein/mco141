import java.util.Scanner;

public class LargestAndSmallest
{
	public static void main(String []args)
	{
		int num;
		int min = 1000000;
		int max = 0;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a series of integers. Enter -99 to indicate the end of the series.");

		do
		{
			num = input.nextInt();
			
			if (num != -99 && num < min)
			{
				min = num;
			}

			if (num != -99 && num > max)
			{
				max = num;
			}
		} while (num != -99);

		System.out.printf("The largest number entered is %d.", max);
		System.out.printf("\nThe smallest number entered is %d.", min);

		input.close();
	}
}