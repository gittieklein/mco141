import javax.swing.JOptionPane;

public class MaleAndFemalePercentages
{
	public static void main(String []args)
	{
		//Declare variables
		String input;
		int male;
		int female;

		//Ask the user how many males are in their class
		input = JOptionPane.showInputDialog("How many males are registered in the class?");
		male = Integer.parseInt(input);
		
		//Ask the user how many females are in their class
		input = JOptionPane.showInputDialog("How many females are registered in the class?");
		female = Integer.parseInt(input);

		int students = male + female;
		double percentMale;
		double percentFemale;
		
		percentMale = (double)male / students * 100;
		percentFemale = (double)female / students * 100;

		//Display the percentages of the male and female students
		JOptionPane.showMessageDialog(null, percentMale + "% of the class is males. \n" + 
											percentFemale + "% of the class is females.");
		

		//end the dialog box
		System.exit(0);
	}
}