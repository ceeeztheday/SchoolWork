/*
	Test user input to see if it is: 
		1) even
		2) positive value
		
	As output, the program will display a message listing the value
		of the user input and stating the following: 
		" the user input value is even and positive " OR
		" the user input value is not even and/ not positive "
*/

public class IfConditionCheatSheet
{
	public static void main(String [] args)
	{
		int n = 44;
		
		//assumption, the input value is negative and odd
		boolean isPositive = false;
		boolean isEven = false;
		
		if(n % 2 == 0) 
		{
			isEven = true;
		}
		if( n >= 0)
		{
			isPositive = true;
		}
		
			
		if(isPositive == true)
			System.out.println("The user input value " + n + " is positive");
		if(isPositive == false)
			System.out.println("The user input value " + n + " is negative");
		if(isEven == true)
			System.out.println("and it is even");
		if(isEven == false)
			System.out.println("and it is odd");	
		
		/*Suggested test data
			-45
			-44
			45
			44
		*/
		
		//alternate way of writing conditional tests with boolean variable
		if(isPositive)
			System.out.println("The user input value " + n + " is positive");
		if(!isPositive)
			System.out.println("The user input value " + n + " is negative");
		if(isEven)
			System.out.println("and it is even");
		if(!isEven)
			System.out.println("and it is odd");
	}
}