public class SearchSet1_A
{
   public static void main(String [] args)
   {
      int [] arr1 = {32, 45, 17, 84, 31};
      
      int a = 16;
      int b = 31;
      int c = 44;
      
      //below are three calls to arr1
      //each call compares a different value (stored in a, b and c) to those in arr1
      //the output will display a message indicating whether or not the values in a or b or c can be found in arr1
      //you are to complete the method isPresent( ) to allow main to function properly
      if( isPresent(arr1, a) )
         System.out.println("The value " + a + " is in the array");
      else
         System.out.println("The value " + a + " is not in the array");
         
      if( isPresent(arr1, b) )
         System.out.println("The value " + b + " is in the array");
      else
         System.out.println("The value " + b + " is not in the array");
         
      if( isPresent(arr1, c) )
         System.out.println("The value " + c + " is in the array");
      else
         System.out.println("The value " + c + " is not in the array");
   
   }
   public static boolean isPresent(int [] b, int val)
   {
      /*SOLUTION HINTS     
      1) loop through b array to select a b value to be compared to the value stored in val
      2) return true if a value in val is found in the array
      */
      int i = 0;
      
      for(i=0; i<b.length; i++)
      {   
         if(b[i]==val)
            return(true);
            
      }
      return(false); //1) return false if after inspecting all values there are no values in b that match the value in val
   }
   
}