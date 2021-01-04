import java.util.Scanner;
public class InputValidation
{
	public static void main(String[] args)
	{
		// define a Scanner attached to keyboard
		Scanner keyboard = new Scanner(System.in);
/*		
		InputValidation iv = new InputValidation();
		String name1 = new String("joe");
		String name2 = new String(name1);
		String aName = "Bob";
		System.out.println('A');
		System.out.println((int) 'A');
		
		// Prompt
		System.out.println("Enter an integer: ");
		
		// Peek
		if( ! keyboard.hasNextInt() )
		{
			String badInput = keyboard.nextLine();
			System.out.println("Input error. Expected a number. Encountered " + badInput);
			System.out.println("Try again later .... ");
			System.exit(1);
		}
		
		// Read
		int x = keyboard.nextInt();
	
        final int ZERO = 0;
		System.out.println("Enter a weekday number 0-6: ");
		int weekday = keyboard.nextInt();
		switch( weekday )
		{
			case ZERO: System.out.println("Sunday"); break;
			case 1: System.out.println("Monday"); 
			case 2: System.out.println("Tuesday"); break;
			case 3: System.out.println("Wednesday"); break;
			case 4: System.out.println("Thursday");
			case 5: System.out.println("Friday"); break;
			case 6: System.out.println("Saturday"); break;
			default: System.out.println("Invalid day number");
			
			
		}
		
		
		System.out.println("Enter a character: ");
		String str1 = keyboard.next();
		String str2 = str1.toUpperCase();
		char ch = str2.charAt(0);
		//char ch = keyboard.next().toUpperCase().charAt(0);
		// Determine whether ch is a vowel. A, E, I, O, U
		switch(ch)
		{
			case 'A': case 'E': case 'I':
			case 'O':
			case 'U': System.out.println( ch + " is a vowel");
			          break;
			
			default: System.out.println( ch + " is NOT a vowel"); 
			break; // optional
		}
		
		// Convert ch to a number
		// is ch a digit?
		if( Character.isDigit(ch) )  // if( '0' <= ch && ch <= '9'
		{
			System.out.println( ch + " is a digit");
			// convert ch to a number
			int num = Character.getNumericValue(ch); // num = ch - '0';
			
		}
		else
					{
			System.out.println( ch + " is NOT a digit");
		}
	

// express the folowing proposition in Java.
// A year y is a leap year if y is a multiple of 4 but not 100, or y is a multiple of 400
// A year y is a leap year 
// if (y is a multiple of 4) AND (y is not a multiple of 100)
// or  (y is a multiple of 400)

// 2004 leap year
// 2100, 2200, 2300 not leap years
// 2400 is a leap

			// Prompt
		System.out.println("Enter an year : ");
		
		// Peek
		if( ! keyboard.hasNextInt() )
		{
			String badInput = keyboard.nextLine();
			System.out.println("Input error. Expected a number. Encountered " + badInput);
			System.out.println("Try again later .... ");
			System.exit(1);
		}
		
		// Read
		int year = keyboard.nextInt();
		// if (y is a multiple of 4) AND (y is not a multiple of 100)
// or  (y is a multiple of 400)
boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) 
                     || (year % 400 == 0);
		System.out.println("It is " + isLeapYear + " that " + year + " is a leap year");
		


		int a = 123;
		double b = 10.0/7.0;
		String name = "Joe";
		System.out.printf("a = |%5d|  b = |%10.2f|  name =  |%10s|%n", a, b, name);
		System.out.printf("a = |%-5d|  b = |%-10.2f|  name =  |%-10s|%n", a, b, name);

		// d decimal (integers)
		// f double and float
		// s Strings
		// b boolean
		
*/

		String name1 = new String("Joe");
		String name2 = new String("Joe");
		if( name1 == name2)
		{
			System.out.printf( "Using == to compare:  %s is the same as %s%n", name1, name2);
		}
		else
		{
			System.out.printf( "%s is not the same as %s%n", name1, name2);
		}
		
		if( name1.equals(name2))
		{
			System.out.printf( "Using equals to compare:  %s is the same as %s%n", name1, name2);
		}
		else
		{
			System.out.printf( "%s is not the same as %s%n", name1, name2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//boolean result =  "".isEmpty();
		//System.out.println("result: " + result);
		
		
		
		
	}
	
}










