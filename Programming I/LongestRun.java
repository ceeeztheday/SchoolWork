public class LongestRun
{
   public static void main(String [] args)
   {
      int [] arr = {81, 81, 39, 17, 39, 17, 17, 17, 17, 17, 39, 5, 39, 39};
      
      System.out.println("\nThe longest run in array arr is: " + longestRun(arr) );
   }
   public static int longestRun(int [] myArray)
   {
      int i = 0;
      int temp = 0;
      int search = myArray[0];
      int longest = 0;
      
      for(i=0; i<myArray.length; i++)
      { 
         if(search==myArray[i])
         {
            temp++;
         }
         else
         {
            if(temp>longest)
            {
               longest= temp;
            }
         
            temp = 1;
            search=myArray[i];
         }
         if(temp>longest)
         { 
            longest= temp;
         }
      }
      return(longest);
 
 
 
 
 
 
 
   } 
}
