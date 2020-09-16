package divisionbyzero;


public class DBZERO1b
{
	public static void main(String [] args)
	{
		try		//NO LOOP
		{
			int result = divByZero(24, 3);
			
			System.out.println("result = " + result);
			
			result = divByZero(24, 0);
			
			System.out.println("result = " + result);
		}
		catch(Exception e)
		{
			System.out.println("In catch, message = " + e);
		}
	}
	public static int divByZero(int num, int denom)
	{
		return(num/denom);
	}
}
/*CONSOLE

result = 8
In catch, message = java.lang.ArithmeticException: / by zero

*/