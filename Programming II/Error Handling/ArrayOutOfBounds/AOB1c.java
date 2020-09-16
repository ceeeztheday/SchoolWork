package ArrayOutOfBounds;

public class AOB1c
{

	public static void main(String[] args)
	{
		try
		{
	         int a[] = {45, 97, 83};
	         
	         for(int i = 0; i <= a.length; i++)
	         {
	        	 System.out.println("Access element three :" + a[i]);
	         }
	         
	     }
		 catch(ArrayIndexOutOfBoundsException e)
	     {
	         System.out.println("Exception thrown  :" + e);
	     }
		
	     System.out.println("Out of the block");
	}

}
