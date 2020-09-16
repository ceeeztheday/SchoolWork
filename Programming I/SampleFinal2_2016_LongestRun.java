public class SampleFinal2_2016_LongestRun
{
   public static void main(String [] args)
   {
      int [] arr = {81, 81, 39, 17, 39, 17, 17, 17, 17, 81, 39, 5, 39, 39};
      int [] arr2 = {81, 81, 39, 17, 39, 39, 39, 39, 17, 17, 17, 81, 81, 39, 5, 39, 39};
      int [] arr3 = {81, 39, 17, 5, 11, 101};
      int [] arr4 = {81, 81, 39, 39, 39};
      
      
      System.out.println("\nThe longest run in array arr is: " + longestRun(arr) );
      System.out.println("\nThe longest run in array arr2 is: " + longestRun(arr2) );
      System.out.println("\nThe longest run in array arr3 is: " + longestRun(arr3) );
      System.out.println("\nThe longest run in array arr4 is: " + longestRun(arr4) );
   
   }
   public static int longestRun(int [] myArray)
   {
      //method returns the length of the longest run in array myArray
      int i = 0;                    //loop counter
      int tempLongestRun = 0;          //stores current longest run
      int actualLongestRun = 0;        //stores longest run
      int searchVal = myArray[0];   //use first array value as initial test value
      
      for(i = 0; i < myArray.length; i++)  // go through array
      {
         if(searchVal == myArray[i]) 
         {
            tempLongestRun++;
         }
         else
         {
            if(tempLongestRun > actualLongestRun)
            {
               actualLongestRun = tempLongestRun;     //a longer run has been found
            }
            tempLongestRun = 1;  //run has ended; looking at a new value so reset temp
            searchVal = myArray[i]; //get new search value
         }
         if(tempLongestRun > actualLongestRun)
         {
            actualLongestRun = tempLongestRun;     //a longer run has been found
         }
      }
      
      return(actualLongestRun);
   
   }

}
/* PROGRAM OUTPUT

The longest run in array arr is: 3

The longest run in array arr2 is: 4

The longest run in array arr3 is: 1

*/