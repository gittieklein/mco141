//Gittie Klein
import java.util.Scanner;

public class StockProfit 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//ask the user for information
		System.out.print("How many shares do you have? ");
		double ns = input.nextDouble();
		System.out.print("What is the purchase price per share? ");
		double pp = input.nextDouble();
		System.out.print("What is the purchase commission paid? ");
		double pc = input.nextDouble();
		System.out.print("What is the sale price per share? ");
		double sp = input.nextDouble();
		System.out.print("What is the sales commission paid? ");
		double sc = input.nextDouble();
		
		double profit = userData(ns, pp, pc, sp, sc);
		if (profit > 0)
			System.out.printf("Your profit is $%.2f.", profit);
		else 
			System.out.printf("Your loss is $%.2f.", profit);
	}
	
	/**
	 * the userData method calculates whether or not there was a profit 
	 * @param ns number of shares
	 * @param pp purchase price per share
	 * @param pc purchase commission paid
	 * @param sp sale price per share
	 * @param sc sale commission paid
	 * @return the amount profited or lost
	 */
	
	public static double userData(double ns, double pp, double pc, double sp, double sc)
	{
		double profit = ((ns * sp) - sc) - ((ns * pp) +pc);
		return profit;
	}
}
