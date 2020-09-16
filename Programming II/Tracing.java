public class Tracing
{
   public static void main(String[ ] args)
   {
      int i = 7, j = 0, result = 0;
      int[] arr = { 92, 84, 17};
      
      while(j < 3)
      {
         try
         {
            result = i/j;
            for(int row = 1; row < 4; row++)
               System.out.println("arr val: "+ arr[row] + "\t");      
         }
               
         catch(ArithmeticException e)
         {           
            System.out.println("arithmetic error.");
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
            System.out.println("Array index out of bounds");
         }  
         catch(Exception e)
         {  
            System.out.println("generic exception.");
         }
         finally
         {
            System.out.println("\nHowdy");
         }
         j++;
      }
      j = 0;
      try
      {
         result = i/j;
         arr[3] = 19;
      }
      catch(ArithmeticException e)
      {
         System.out.println("arithmetic error.");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("Array index out of bounds");
      }
      catch(Exception e)
      {
         System.out.println("generic exception.");
      }
      finally
      {
         System.out.println("Done");
      }
   }
}