public class SearchSet1_B
{
   public static void main(String [] args)
   {
      int [] arr1 = {32, 45, 17, 84, 31};
      int [] arr2 = {16, 31, 44};
         
      if( isPresent(arr1, arr2) )
         System.out.println("Array arr1 has a value that is also in arr2.");
      else
         System.out.println("Array arr1 does not have a value that is in arr2.");
   
   }
   
   public static boolean isPresent(int [] b, int [] vals)
   {
      /*SOLUTION HINTS     
      1) loop through b array to select a b value to be compared to each of the vals values
      2) for each b array value loop through the entire vals array
      3) compare each vals array value to the current b value
      4) return true if a value in val is found in the array
      */
      int i = 0;
      int j = 0;
      
      for(i=0; i<b.length; i++)
      {
         for(j=0; j<vals.length; j++)
         {
            if(b[i]==vals[j])
               return(true);
         }
      }
      return(false);    //1) return false if after inspecting all values there are no values in b that match any of the values in vals
   }
}