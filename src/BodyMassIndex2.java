//Gittie Klein
//This program calculates a person's BMI

import javax.swing.JOptionPane;

public class BodyMassIndex2 
{
	public static void main(String []args)
	{
		String input;
		double weight;
		double height;
		double bmi;
		String weightStatus;
		
		//ask the user his weight
		input = JOptionPane.showInputDialog("What is your weight (in pounds)?");
		
		//convert the string to a double
		weight = Double.parseDouble(input);
		
		//ask the user his height
		input = JOptionPane.showInputDialog("What is your height (in inches)?");
		
		//convert the string to a double
		height = Double.parseDouble(input);
		
		//calculate the BMI
		bmi = weight * 703.0 / Math.pow(height,2);
		
		//figure out if the weight is a healthy weight or not
		if (bmi < 0)
		{
			weightStatus = "invalid";
			JOptionPane.showMessageDialog(null, "Invalid.\nHeight and weight must be positive numbers.");
		}
		else
		{
			if (bmi >= 18.5 && bmi <= 25)
				weightStatus = "optimal weight";
			else if (bmi > 25)
				weightStatus = "overweight";
			else
				weightStatus = "underweight";
			JOptionPane.showMessageDialog(null, "Your BMI is " + bmi + "." + "\nYou are " + weightStatus + " .");
		}
		
		
			
		
		//end the dialog box
		System.exit(0);
	}

}
