public class SampleFinal_1_2016_Problem_4
{
   public static void main(String [] args)
   {
      int [] myArray = {81,81,39,17,39, 7,7,7,7,7,5,39,39 };
      int [] array2 = {81, 35, 81, 35, 81};
      int [] array3 = {45, 54, 54, 5, 67};
      
      System.out.println("for myArray mostFrequentValue( ) returns: " + mostFrequentValue(myArray));
      System.out.println("for array2 mostFrequentValue( ) returns: " + mostFrequentValue(array2));
      System.out.println("for array3 mostFrequentValue( ) returns: " + mostFrequentValue(array3));
   }
   public static int mostFrequentValue(int [] myArray)
   {
           //set first value in array to the initial most frequent value
      int mostFrequent = myArray[0];    //set the default value of mostFrequent to the first value in the array
      int currentFrequentCount = 1;          //count occurrence of currentFrequent
      int mostFrequentCount = 1;             //stores the count of the mostFrequent occurrences
      int i = 0;
      int j = 0;
      
      for(i = 0; i < myArray.length; i++) //hold one value in array
      {
         currentFrequentCount = 1;  //set currentFrequentCount to 1 for each new set of otherValues to be tested
         
         for(j = 0; j < myArray.length; j++) //compare above to all values in the array
         {
            if(myArray[i] == myArray[j])
            {
               currentFrequentCount++;    //if an otherValues value matches the currentConsideration, increment currentCount
            }
         }
         
         if(currentFrequentCount > mostFrequentCount)       //found a new value with more frequent appearences
         {
            mostFrequentCount = currentFrequentCount;       //update the mostFrequentCount 
            mostFrequent = myArray[i];   //store the new mostFrequent value in mostFrequent
         }
         
         //Return to the first loop and move to the next value in the array.
         //    Then compare this new value with all the values in the array to see if there is a new mostFrequent value.
         
     }//END currentConsideration loop
     
     return(mostFrequent);    //return the value that appears most in the array
   }
}


/*
Write the method public static int mostFrequentValue(int [] myArray) 
that takes an integer array myArray. 

The method returns the value in array myArray that appears the most. 

For example, if myArray were the array below, the method would return the value 39,
 because 39 appears five times in myArray and no other integer appears that many times. 
 You may assume that some value in myArray does appear more frequently than all others.
 
 myArray
81
81
39
17
39
17
17
17
81
81
39
5
39
39
*/