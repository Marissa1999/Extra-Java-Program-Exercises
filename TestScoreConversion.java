import java.util.Scanner;

public class TestScoreConversion
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);  // define a Scanner
		
		// prompt for and read a test score
		System.out.print("Enter a test score between 0 and 100, inclusive: ");
		double score = kb.nextDouble();
		if( score < 0.0 || score > 100.0 )
		{
			System.out.println("Test score " + score + " is out of range");
			System.out.println("Try again later");
			System.exit(1);
		}
		char letterGrade = 'X';
		if(  score >= 90.0) letterGrade = 'A';
		else if( score >= 80.0) letterGrade = 'B';
		else if( score >= 70.0) letterGrade = 'C';
		else if( score >= 60.0) letterGrade = 'D';
		else letterGrade = 'F';
		
		
	
		
		
		
		
		/*
		if( 90.0 <= score && score <= 100.0) letterGrade = 'A';

		if( 80.0 <= score && score < 90.0) letterGrade = 'B';
		
		if( 70.0 <= score && score < 80.0)
		{
			letterGrade = 'C';
		}	
		if( 60.0 <= score && score < 70.0)
		{
			letterGrade = 'D';
		}	
		if( score < 60.0)
		{
			letterGrade = 'F';
		}	*/

	System.out.println("Test Score: " + score);
	System.out.println("Letter grade: " + letterGrade);
	}



}