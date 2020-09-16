package ArrayOutOfBounds;


public class AOB1a
{

	public static void main(String[] args)
	{
		
		//WHAT IS THE POTENTIAL ERROR?
		int a[] = new int[2];
	         
		System.out.println("Access element three :" + a[3]);
	        
		System.out.println("Out of the block");

	}

}
/* error message
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
at ArrayOutOfBounds.AOB1a.main(AOB1a.java:12)
*/