//Gittie Klein
//This program calculates the weight of an object based on its mass

import javax.swing.JOptionPane;

public class MassAndWeight
{
	public static void main(String []args)
	{
		String input;
		double mass;
		double weight;
		
		input = JOptionPane.showInputDialog("Enter an abject's mass in kilograms to calculate the weight in Newtons.");
		mass = Double.parseDouble(input);

		//calculate the weight
		weight = mass * 9.8;
		
		JOptionPane.showMessageDialog(null, "The weight of the object is " + weight + " .");

		if (weight >1000)
			JOptionPane.showMessageDialog(null, "The object is too heavy.");
		else if (weight < 10)
			JOptionPane.showMessageDialog(null, "The object is too light.");

		System.exit(0);


	}
}