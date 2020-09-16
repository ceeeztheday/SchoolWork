
package divisionbyzero;

import java.util.Scanner;

public class DBZERO1c
{
	public static void main(String [] args)
	{
		//variable declarations
		Scanner kbd = new Scanner(System.in);
		int num = 0;
		int denom = 0;
		boolean endLoop = false;	//monitor catch issue
		
		//user prompt and data input
		System.out.println("Enter a numerator and a divisor: ");
		num = kbd.nextInt();
		denom = kbd.nextInt();
		while(!endLoop)			//LOOP CONSTRUCT
		{
			try
			{
				int result = divByZero(num, denom);
				
				System.out.println("result = " + result);
				//endLoop = true;	//terminate process resulting from an error
			}
			catch(Exception e)
			{
				System.out.println("In catch, message = " + e);
				System.out.println("\nEnter a numerator and a divisor: ");
				num = kbd.nextInt();
				denom = kbd.nextInt();
			}
		}//end while loop
	}
	public static int divByZero(int num, int denom)
	{
		return(num/denom);
	}
}
