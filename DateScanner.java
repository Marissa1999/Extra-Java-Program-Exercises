// A program to demonstrate how to read a date of the form
// month-name dd, yyyy
// using ONLY Scanner methods
// Programmer: Sadegh Ghaderpanah
// September 26, 2017

import java.util.Scanner;

public class Date_Scanner 
{
	public static void main (String[] args)
	{
		// create a Scanner using the keyboard as source of input
		Scanner keyboard = new Scanner(System.in); 
		
		// Prompt for a date and read the entire input line as a String
		System.out.printf("Enter a date using the format \"month-name dd, yyyy\": ");
		String inputLine = keyboard.nextLine();
		System.out.printf("user input:%s%n", inputLine);
	    
		// create a Scanner using inputLine as source of input
		Scanner strScan1 = new Scanner(inputLine); 
		// change sc's delimiting pattern to 
		// "zero or more spaces followed by a comma followed by zero or more spaces"
	    strScan1 = strScan1.useDelimiter("\\s*,\\s*");   
	    if( ! strScan1.hasNext())
	    {
	    	 System.out.printf("Input is empty. Nothing to read. Goodbye!");
	    	 System.exit(1);
	    }
	    // read that first token, which ideally is a month name followed by a day number
	    String monthNameAndDay = strScan1.next();
	    System.out.println("month Name And Day: " +  monthNameAndDay);
	    // Resets sc's delimiting pattern to its original settings
	    strScan1.reset();
	    // Skips input that matches the pattern 
	    // "zero or more spaces followed by a comma followed by zero or more spaces"
	    if( strScan1.hasNext())
	    {
	    	strScan1.skip("\\s*,\\s*");
	    }
	    
	    // Read the year as an integer
	    // Peek at input before reading it as an integer
	    if(! strScan1.hasNextInt())
	    {
	    	String badInput;
	    	if(strScan1.hasNext() )
	    	{
	    		badInput = strScan1.nextLine();
	    	}
	    	else
	    	{
	    		badInput = "NO INPUT";
	    	}
	    	 System.out.printf("Error. Expected a number for year, found %s. Goodbye!\n", badInput);
	    	 System.exit(1);	    	
	    }
	    // read year
	    int year = strScan1.nextInt();
	    System.out.printf("year: %d\n", year);
	    
	    // Now, dissect monthNameAndDay into monthName and day
		// create a Scanner using monthNameAndDay as source of input
		Scanner strScan2 = new Scanner(monthNameAndDay);
		// peek at input before reading
	    if( ! strScan2.hasNext())
	    {
	    	 System.out.printf("Input is empty. Nothing to read. Goodbye!");
	    	 System.exit(1);
	    }
	    // good to go with at least the month name
		String monthName = strScan2.next();
		System.out.printf("month name: %s%n", monthName);
		
		// peek at input to check that there is an integer to read
	    if(! strScan2.hasNextInt())
	    {
	    	String badInput;
	    	if(strScan2.hasNext() )
	    	{
	    		badInput = strScan2.nextLine();
	    	}
	    	else
	    	{
	    		badInput = "NO INPUT";
	    	}
	    	 System.out.printf("Error. Expected a number for day, found %s. Goodbye!\n", badInput);
	    	 System.exit(1);
	    }
		// we do have an integer to input
	    int day = strScan2.nextInt();
	    System.out.printf("day: %d%n", day);
		
	    // Now that we have a month name, day and year, 
	    // we can implement the remaining steps 3-15 of Algorithm 1.
	}
}
