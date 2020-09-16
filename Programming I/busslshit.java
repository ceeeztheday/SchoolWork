import java.util.*;
public class busslshit
{
   public static void main(String[]args)
   {
      int quarters = 0;
      int nickles = 0;
      int remain = 0;
      int total = 0;
      Scanner input = new Scanner(System.in);
      final int QUARTERS = 25;
      final int NICKLES = 5;
      
      System.out.println("Enter an integer:");
      total = input.nextInt();
      
      remain = total;
      
      quarters=remain/QUARTERS;
      remain = remain%QUARTERS;
      
      nickles = remain/NICKLES;
      remain = remain%NICKLES;
      
      System.out.println("To make " + total +" cents, you need: ");
      System.out.println(quarters+ " quarters");
      System.out.println(nickles+" nickles");
      System.out.println(remain+" pennies");
   }
}