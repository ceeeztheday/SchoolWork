public class MaxAndMin
{
	public static void main(String [ ] args)
	{          
         int [] array = {1, 2, 3, 4};
         int i = 0;                 
         int maxValue = 0; 
         int minValue = 0; 
         
         
			//******display array data: first to last
		   System.out.println("The values stored in the array in order of first to last are: ");
		
		   for(i = 0; i < array.length; i++) 
		   {
			   System.out.println(array[i]);	
		   }
           
		
		   //*******find largest value in array 
		   
		
		   for(i = 0; i < array.length; i++)
		   {
			   if(maxValue < array[i])
            {
				   maxValue = array[i];
            }
		   }
		   System.out.println("The largest value in the array is: " + maxValue);
		   
	
		   //*****find smallest value in the array 
		   minValue = array[0];
	
		   for(i = 0; i < array.length; i++)
		   {
			   if(minValue > array[i])
            {
				minValue = array[i];
            }
		   }
		   System.out.println("The smallest value in the array is: " + minValue);
   }
}



