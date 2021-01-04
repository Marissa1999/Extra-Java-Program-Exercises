
import java.util.Scanner;


public class MyUtil {

	public static // means that the static variable keyboard can also be used by static methods
	Scanner keyboard = new Scanner(System.in);

        // write a method that prompts the user for and reads an integer, and then returns it.
	// The method should repeatedly ask for an integer until the user enters one.
	public static
	int readInt()
	{
		int x;
		System.out.print("Enter an integer: "); // generic prompt message
		while( ! keyboard.hasNextInt())
		{
			String badInput = keyboard.nextLine();
                        System.out.printf("Invalid input: %s%n", badInput);
			System.out.printf("please Enter an integer: ");
                        
		}
		x = keyboard.nextInt();
                keyboard.nextLine(); // consume the newline character
		return x;
	}


        // write a method that prompts the user for and reads an integer, and then returns it.
        // The method should take the prompt message as a parameter.
	// The method should repeatedly display the prompt message until the user enters an integers.

	public static
	int readInt(String promptMessage)
	{
		int x;
		System.out.print(promptMessage); // // customized prompt message
		while( ! keyboard.hasNextInt())
		{
			String badInput = keyboard.nextLine();
                        System.out.printf("Invalid input: %s%n", badInput);
			System.out.printf("%s", promptMessage);
		}
		x = keyboard.nextInt();
                keyboard.nextLine(); // consume the newline character
		return x;
	}





	/* Write a method that takes the height of a triangle as parameter and
        draws a retanbular pattern of the given height, that looks like this when height is 5:
        *
        **
        ***
        ****
        *****
        */

	public static
	void drawTriangle(int height)
	{
            for(int k = 1; k <= height; ++k)
            {
                    for(int star=1; star <= k; ++star)
                    {
                            System.out.print('*');
                    }
                    System.out.println();	// line break
            }
	return; // optional because it is immediately followed by method drawTriangle's closing brace }
	}


        // Write a method that draws a rectangle of given height and width.
        /* Example: a 4 by 10 rectangle
        xxxxxxxxxx
        xxxxxxxxxx
        xxxxxxxxxx
        xxxxxxxxxx
        */
        
	public static
	void drawRectangle(int length, int width)
	{
            for(int len = 1; len <= length; ++len)
            {
                    for(int w = 1; w <= width; ++w)
                    {
                            System.out.print('*');
                    }
                    System.out.println();	// line break
            }
            return; // optional because it is immediately followed by method drawRectangle's closing brace }
	}
        
        
     	public static 	void main(String[] args)
	{
		int age = readInt("Enter you age: ");
		int quarters = readInt("Enter quarters: ");
		// let's draw a rectangle of height 4 and width 6
		//drawRect(4, 6);

		// let's draw a rectangle of height 8 and width 5
		//drawRect(8, 5

                // let's try the readInt() which takes no arguments
		int height = readInt(); // call the generic version
		drawTriangle(height);

                // let's try our customized readInt() which takes a String message as parameter
		int width = readInt("Enter width of rectangle: "); // call the generic version
		int length = readInt("Enter length of rectangle: "); // call the generic version

                drawRectangle(length, width);
                //Note: length and width variables here are independent of variable length, width in the drawRectangle method

                return; // optional because it is immediately followed by method main's closing brace }
	}
}
