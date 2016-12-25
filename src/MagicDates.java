import javax.swing.JOptionPane;

public class MagicDates
{
	public static void main(String []args)
	{
		String input;
		int month;
		int day;
		int year;

		input = JOptionPane.showInputDialog("Enter a month in numeric form:");
		month = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter a day of the month:");
		day = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter a year (just the last 2 digits):");
		year = Integer.parseInt(input);

		if (month * day == year)
			JOptionPane.showMessageDialog(null, "This date is magic:)");
		else
			JOptionPane.showMessageDialog(null, "This date is not magic:(");

		System.exit(0);

	}
}

		