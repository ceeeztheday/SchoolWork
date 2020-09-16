import java.util.*;
public class EnterChar
{
   public static void main(String[]args)
   {
      Scanner kdb = new Scanner(System.in);
      int [] chars = new int[128];
      String s;
      char c;
      int counter = 1;
      int i;
      
      System.out.println("Enter 10 characters: ");
      try
      {
            while(counter !=11)
            {
                   c = kdb.next;
               if(c<128)
                  throw new InputMismatchException();
                  
              
               counter++;
            }
            
            
            
      }
      
      catch(InputMismatchException ime)
      {
         System.out.println("Input mismatch exception");
      }
      
   }
}