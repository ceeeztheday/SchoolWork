import java.util.Scanner;

public class ArrayObjectivesPracticeGroup1Solution
{
	public static void main(String [ ] args)
	{          
         Scanner input = new Scanner(System.in);
        
         int n = 0;//variable for size of array
         
         //prompt user to enter number of elements to be stored within the array
         System.out.println("Please enter the number of elements to be stored within the array: ");
         n = input.nextInt();
		
         int [] array = new int[n];  //declare an integer array of size n
         int i = 0;        //array index
         int maxValue = 0; //max value in array
         int maxIndex = 0; //max values index
         int minValue = 0; //min value in array
         int minIndex = 0; //min values index
													
		   //*******zero-out array
		   for(i = 0; i < array.length; i++)
			   array[i] = 0;
		
		   //*******load array
		   for(i = 0; i < array.length; i++)	//loop through array to load array
		   {
			   //NOTE: paren for (i + 1) necessary
			   System.out.println("Enter integer " + (i + 1) + ": "); 	//prompt user
			   array[i] = input.nextInt();								//store value
		   }
		
		   //******display array data: first to last
		   System.out.println("The values stored in the array in order of first to last are: ");
		
		   for(i = 0; i < array.length; i++) //loop through array
		   {
			   System.out.println(array[i]);	
		   }
		
		   //*******display array data: in reverse order
		   System.out.println("The values stored in the array in order of last to first are: ");
      
         for(i = array.length - 1; i >= 0; i--)
         {
			   System.out.println(array[i]);
		   }	
		   //*******find largest value in array and its index
		   maxValue = array[0];
		
		   for(i = 0; i < array.length; i++)
		   {
			   if(maxValue < array[i])
            {
				   maxValue = array[i];
               maxIndex = i;
            }
		   }
		   System.out.println("The largest value in the array is: " + maxValue);
		   System.out.println("The index of the largest value is: " + maxIndex);
	
		   //*****find smallest value in the array and its index
		   minValue = array[0];	
	
		   for(i = 0; i < array.length; i++)
		   {
			   if(minValue > array[i])
            {
				minValue = array[i];
				minIndex = i;
            }
		   }
		   System.out.println("The smallest value in the array is: " + minValue);
		   System.out.println("The index of the smallest value is: " + minIndex);
   }
}