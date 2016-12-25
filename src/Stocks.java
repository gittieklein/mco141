//Gittie Klein
//Program to see whether or not Aviva profited from her stocks.

public class Stocks 
{
	public static void main(String[] args)
	{
		int shares = 1200;					//The number of shares that Aviva purchased.
		double paid = 31.64;				//The amount Aviva paid per share.
		double total = shares * paid;		//The total amount that Aviva paid for her stocks
											//(without commission).
		double commission = total * .02;	//The commission Aviva paid the stock broker.
		double total2 = total + commission;	//The total amount Aviva paid including the commission.
		
		System.out.println("Aviva bought " + shares + " shares for $" + paid + " per share.");
		System.out.println("The stocks cost $" + total + " before she paid commission.");
		System.out.println("Aviva paid $" + commission + " commission to her stock broker when she bought the stock.");
		System.out.println("After the commission, the stocks cost $" + total2 + ".");
		
		double paid2 = 32.69;				//Aviva sold the stocks for 32.69 per share.
		double sold = shares * paid2;		//Total Aviva made on the stocks (before she paid commission.
		double commission2 = sold * .02;	//The commission Aviva paid the stock broker, from the money
											//she made on selling the stock.
		
		System.out.println("\nAviva sold the 1200 shares for $" + paid2 + " per share.");
		System.out.println("In total, Aviva sold the stocks for $" + sold + ".");
		System.out.println("Aviva paid $" + commission2 + " commission to the stockbroker when she sold the stocks.");
		
		double profit = -1 * (sold - total2 - commission2); 	//I multiplied by -1 so that the number comes out positive.
		
		System.out.println("\nAviva suffered a loss of $" + profit + " on her stocks.");	
	}
}
