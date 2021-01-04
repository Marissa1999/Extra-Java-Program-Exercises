import java.util.Scanner;

public class ScannerTest
{
	public static void main(String[] args)
	{
		int x = 12;
		double y = 45.677777;
		String name = "Joe";
		System.out.printf("%d %f %s%n", x, y, name);
		System.out.printf(" x = %d y = %f  name  %s%n", x, y, name);
		System.out.printf(" x = |%d| y = |%f|  name  |%s|%n", x, y, name);
		System.out.printf(" x = |%12d| y = |%12.2f|  name  |%15s|%n", x, y, name);
		System.out.printf(" x = |%-12d| y = |%-12.2f|  name  |%-15s|%n", x, y, name);
		System.out.printf(" x = |%-12d| y = |%.2f|  name  |%-15s|%n", x, y, name);
	/*	
	// Convert "2017" to an int.
		String yearStr = "2017x";
		Scanner yearScanner = new Scanner(yearStr);
		int year = yearScanner.nextInt();
		if( ! yearScanner.hasNextInt())
		{
			System.out.println("Error - bad year value" + yearScanner.next());
			System.exit(1);
		}
		System.out.println("Year : " + year);
		
		
		Scanner kb = new Scanner(System.in);  // define a Scanner
		System.out.print("Enter date: ");
		String sampleDate = kb.nextLine();//"  July   5  ,      2000 ";
		System.out.println(sampleDate);
		
		sampleDate = sampleDate.trim();	// trim leading and trailing spaces
		
		// Define a Scanner attached to a date String
		Scanner scan = new Scanner(sampleDate); 
		
		// extract the month name
		String monthName = scan.next();
		
		// read the day number
		int day = scan.nextInt();
		
		// extract the comma and discard it
		String comma = scan.next();
		
		// read the year number
		int year = scan.nextInt();
		
		System.out.println(monthName + " " + day + " " + year);
		
	*/	
		
		
	}
}