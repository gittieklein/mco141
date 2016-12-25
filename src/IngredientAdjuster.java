//Gittie Klein
//This is a program to adjust measurements of ingredients based on the number of cookies wanted

import javax.swing.JOptionPane;

public class IngredientAdjuster 
{
	public static void main(String []args)
	{
		String input;
		input = JOptionPane.showInputDialog("How many cookies would you like to bake?");
		
		//converting the string to an integer
		int cookies;
		cookies = Integer.parseInt(input);			
		
		double sugar;													
		double butter;
		double flour;
		
		//find out the measurements of ingredients for the number of cookies wanted
		sugar = (1.5 / 48) * cookies;
		butter = (1.0 /48) * cookies;
		flour = (2.75 / 48) * cookies;
		
		JOptionPane.showMessageDialog(null, "You will need:\n" + sugar + " cups of sugar\n" 
								+ butter + " cups of butter\n" + flour + " cups of flour");
		
		JOptionPane.showMessageDialog(null, "Enjoy the cookies!");
		
		//end the dialog box
		System.exit(0);
	}
}
