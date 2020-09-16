public class MostFrequent
{
   public static void main (String [] args)
   {
   
      //array 
      int [] array = {81, 81, 39, 17, 39, 17, 17, 17, 81, 81, 39, 5, 39, 9};
      
      System.out.println(MostFrequentValue(array));
      
   }
   
   public static int MostFrequentValue(int [] myArray)
   {
      int element = 0;
      int count = 0; // number of times the value appears
      int i = 0;
      int temp = 0;
      int tempCount = 0;
      int j = 0;
      
      for(i = 0; i < myArray.length; i++)
         {
            temp = myArray[i]; // hold element being examined
            
         
      for(j = 0; j < myArray.length; j++)
         {
            if(myArray[j] == temp)
            {
               tempCount++;
            }
            
            if(tempCount > count)
            {
               element = temp;
               count = tempCount;
            }
         } 
         return(element);     
   }
}