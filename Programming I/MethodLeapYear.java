import java.util.Scanner;
public class MethodLeapYear
{
   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      int year;
      boolean leap;
      
      System.out.println("Please enter a year: ");
      year = input.nextInt();
     
      leap = isLeapYear(year);
      System.out.println(year + " is a leap year: "+leap);
    }
    public static boolean isLeapYear(int year)
    {
      if(year%4==0 && year%100!=0)
         return(true);
      else if(year%400==0)
         return(true);
      else
         return(false);
     }
}
      
