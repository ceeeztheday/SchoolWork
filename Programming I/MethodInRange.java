import java.util.Scanner;
public class MethodInRange
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int val1;
      int val2;
      int searchVal;
      boolean range = true;
      
      System.out.println("Please enter two values that represent a range: ");
      val1 = input.nextInt();
      val2 = input.nextInt();
      System.out.println("Please enter a value to be tested: ");
      searchVal = input.nextInt();
      
      range = isInRange(val1, val2, searchVal);
      System.out.println("Value is in range: " + range);
    }
    public static boolean isInRange(int val1, int val2, int searchVal)
    {  
      if(val1>=searchVal&&searchVal>=val2)
         return(true);
      else if(val1<=searchVal&&searchVal<=val2)
         return(true);
      else if(val2>=searchVal&&searchVal>=val1)
         return(true);
      else if(val2<=searchVal&&searchVal<=val1)
         return(true);
      else
         return(false);
     }
}
      
      
   
      