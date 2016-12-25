import java.util.Scanner;


public class BarChart
{
	public static void main(String []args)
	{
		int store1;
		int store2;
		int store3;
		int store4;
		int store5;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter today's sales for five stores:");
		store1 = keyboard.nextInt();
		store2 = keyboard.nextInt();
		store3 = keyboard.nextInt();
		store4 = keyboard.nextInt();
		store5 = keyboard.nextInt();

		int num1 = store1 / 100;
		int num2 = store2 / 100;
		int num3 = store3 / 100;
		int num4 = store4 / 100;
		int num5 = store5 / 100;

		System.out.println();
		System.out.print("SALES BAR CHART");

		System.out.print("\nStore 1: ");
		for (int i = 1; i <= num1; i++)
		{
			System.out.print("*");
		}
		
		System.out.print("\nStore 2: ");
		for (int i = 1; i <= num2; i++)
		{
			System.out.print("*");
		}

		System.out.print("\nStore 3: ");
		for (int i = 1; i <= num3; i++)
		{
			System.out.print("*");
		}

		System.out.print("\nStore 4: ");
		for (int i = 1; i <= num4; i++)
		{
			System.out.print("*");
		}

		System.out.print("\nStore 5: ");
		for (int i = 1; i <= num5; i++)
		{
			System.out.print("*");
		}
		

	}
}