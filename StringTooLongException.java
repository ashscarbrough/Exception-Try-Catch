/*
 *  Author: 	Ash Scarbrough
 *  Date:		8/3/2016
 *  Assignment:	Homework Assignment #3
 *  Class:		CSCI-C490 (Advanced Java)
 *  Function: 	StringTooLongException defines a new exception class
 *  			that is a subclass of the general Exception class.
 *  			This class takes a message given at its creation and 
 *  			can display this message if called.
 */

public class StringTooLongException extends Exception{
	
	// Sets up the exception object with a particular message.
	StringTooLongException (String message)
	{
		super (message); // takes the constructor of the parent class
	}
}
