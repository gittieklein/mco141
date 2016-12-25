import java.util.Scanner;

public class HotelOccupancy
{
	public static void main(String []args)
	{
		int floors = 0;
		int rooms = 0;
		int occupied = 0;
		int totalRooms = 0;
		int totalOccupied = 0;
		int vacant = 0;
		double occupancyRate;

		Scanner input = new Scanner(System.in);
		System.out.print("How many floors are the there in the hotel? ");
		floors = input.nextInt();
		while (floors < 1)
		{
			System.out.print("The number of floors must be 1 or greater. \nHow many floors are the there in the hotel? ");
			floors = input.nextInt();
		}
		
		for (int i =1; i <= floors; i++)
		{
			System.out.printf("How many rooms are there on floor %d of the hotel? ", i);
			rooms = input.nextInt();
			while (rooms < 10)
			{
				System.out.print("There must be at least 10 rooms on a floor. \nEnter a number that is 10 or greater. ");
				rooms = input.nextInt();
			}
			totalRooms += rooms;
			System.out.print("How many of the rooms are occupied? ");
			occupied = input.nextInt();
			totalOccupied += occupied;
			
		}
		
		vacant = rooms  - occupied;
		occupancyRate = (double)totalOccupied / totalRooms;

		System.out.printf("\nThe hotel has %d rooms. \n%d rooms are occupied." +
				"\n%d rooms are vacant. \nThe occupancy rate for the hotel is %.3f.", +
				totalRooms, totalOccupied, vacant, occupancyRate);

		input.close();

	}
}