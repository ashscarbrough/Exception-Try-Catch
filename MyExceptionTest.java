import java.util.Scanner;

/*
 *  Author: 	Ash Scarbrough
 *  Date:		8/3/2016
 *  Assignment:	Homework Assignment #3
 *  Class:		CSCI-C490 (Advanced Java)
 *  Function: 	MyExceptionTest is a Driver Class that is intended to test the functionality
 *  			of the programmer created Exception class: StringTooLongException.
 *  			The purpose of this driver is:
 *  				- to ask user to input a String of length less than 20 characters
 *  				- to exit the program when the user enters "DONE"
 *  				- to continue to accept user inputs until done is entered
 *  				- if a string with greater than 20 characters is entered, an exception 
 *  					(StringTooLongException) is thrown and caught, displaying a message
 *  					that the String entered is too long.
 */

public class MyExceptionTest {
	
	private static String userString = "";  // Initialize string to empty
	
	static Scanner input = new Scanner(System.in);  // Create a Scanner to obtain user input
	
	// main can potentially throw StringTooLongException
	public static void main(String [] args)throws StringTooLongException{  
		
		// Exception created with message output
		StringTooLongException lengthProblem = 
				new StringTooLongException("String is too long, it must be under 20 characters.");
		
		while (!userString.equals("DONE")){  // Program will continue to run until user enters "DONE"
			
			System.out.println("Please input a string message less than 20 character. Enter DONE to exit.");
			
			// Try block used to catch a string if it is too long
			try {  
				userString = input.nextLine();  // Obtain user input
				if (userString.length() >= 20)  // if input is greater than or equal to 20 characters
					throw lengthProblem;		// exception is thrown
				else if (userString.equals("DONE"))		// "DONE" exits program
					System.out.println("Exiting Program");
				else
					System.out.println("Valid input");	
			}
			catch (StringTooLongException ex){	// Catch for StringTooLongException
				System.out.println(lengthProblem.getMessage());	// Output message for long string exception
			}
		}
	}
}
