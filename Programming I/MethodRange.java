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
      if(val1>=searchval&&searchval>=val2)
         return(false);
      else if(val1<=searchval&&searchval<=2)
         return(false);
      else if(val2>=searchval&&searchval>=val1)
         return(false);
      else if(val2<=searchval&&seachval<=val1)
         return(false);
      else
         return(true);
     }
}
      
      
   
      