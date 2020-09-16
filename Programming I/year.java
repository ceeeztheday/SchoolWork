import java.util.Scanner;
public class year
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      
      int y = 0;
      boolean leap;
      System.out.println("Please enter a year: ");
      y = input.nextInt();
      
      leap = isYear(y);
      System.out.println(leap);
   }
   public static boolean isYear(int y)
   {
      if(y%4==0 && y%100!=0)
         return(true);
      else if(y%400==0)
         return(true);
      else
         return(false);
   }
}
         
         
      