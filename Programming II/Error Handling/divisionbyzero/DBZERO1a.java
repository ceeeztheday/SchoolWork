/*
 	Example of console display when zero is used as a divisor
*/

package divisionbyzero;

public class DBZERO1a
{
	public static void main(String [] args)
	{
		//WHAT IS THE POTENTIAL ERROR?
		int result = divByZero(24, 3);
		
		System.out.println("result = " + result);
		
		result = divByZero(24, 0);
		
		System.out.println("result = " + result);
	}
	public static int divByZero(int num, int denom)
	{
		return(num/denom);
	}
}
/* CONSOLE (note: program runs until division by zero

result = 8
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at divisionbyzero.DBZERO1a.divByZero(DBZERO1a.java:17)
	at divisionbyzero.DBZERO1a.main(DBZERO1a.java:11)

*/