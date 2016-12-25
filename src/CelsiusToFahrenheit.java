//this program displays C temp and the F equivalents (0-20)

public class CelsiusToFahrenheit
{
	public static void main(String []args)
	{
		double c = 0;
		double f = (9 / 5) * c + 32;

		System.out.print("Celsius\tFahrenheit");
		System.out.print("\n-----------------------");

		for(; c <= 20; c ++)
		{
			f = (9 * c) / 5 + 32;
			System.out.printf("\n%.0f\t%.1f", c, f);
		}		

	}
}