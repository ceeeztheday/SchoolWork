package arithmeticexceptions;

public class ArithmeticExceptions_1
{
	public static void main(String[ ] args)
	{

		int i=1;
		int j=1;
	
		//WHAT IS THE POTENTIAL ERROR?
		try			//NO LOOP
		{
			i++; //becomes 2
			j--; //becomes 0
			
			if (i/j > 1)
			{
				i++;
			}
		}
	
		catch(ArithmeticException e)
		{				
			System.out.println("arithmetic error.");
		}
	
		catch(ArrayIndexOutOfBoundsException e)
		{
	
			System.out.println("Array index out of bounds");
		}
	
		catch(Exception e)
		{		
			System.out.println("generic exception.");
		}
	
		finally
		{
			System.out.println("In the finally block");		
		}
	}
}
