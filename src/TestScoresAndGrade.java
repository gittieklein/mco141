//Gittie Klein
//This program will figure out the average of 3 test scores

import javax.swing.JOptionPane;

public class TestScoresAndGrade
{
	public static void main(String []args)
	{
	//To hold the users test scores
	int test1, test2, test3;
	
	//Use for the dialog box because you could only enter a String
	String keyboard;

	int total;
	double average;
	char grade;

	keyboard = JOptionPane.showInputDialog("Enter a test score: ");
	test1 = Integer.parseInt(keyboard);
	keyboard = JOptionPane.showInputDialog("Enter another test score: ");
	test2 = Integer.parseInt(keyboard);
	keyboard = JOptionPane.showInputDialog("Enter another test score: ");
	test3 = Integer.parseInt(keyboard);

	total = test1 + test2 + test3;
	average = total / 3.0;

	JOptionPane.showMessageDialog(null, "Your average is " + average + " .");

	if (average >= 90 && average <= 100)
		grade = 'A';
	else if (average >= 80)
		grade = 'B';
	else if (average >= 70)
		grade = 'C';
	else if (average >= 60)
		grade = 'D';
	else if (average < 60)
		grade = 'F';
	else 
		grade = 'e';
		
	if (grade != 'e')
		JOptionPane.showMessageDialog(null, "Your grade is: " + grade);
	else
		JOptionPane.showMessageDialog(null, "There is an error. \nPlease try again.");

	System.exit(0);
	
	}
}