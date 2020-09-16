import java.util.Scanner;
   public class BankPiggy
   {
   public static void main(String[]args)
   {
   Scanner input = new Scanner(System.in);
   
   //Var
   final int HALF_DOLLAR = 50;
   final int QUARTERS = 25;
   final int DIMES = 10;
   final int NICKLES = 5;
   
   int totalInBank;
   int halfDollar;
   int quarters;
   int dimes;
   int nickles;
   int remainingCents;
   
   //User prompt
   System.out.println("Please enter the total dollar amount in the piggy bank: ");
   totalInBank = input.nextInt();
   
   //Logic
    remainingCents=totalInBank;
    
    halfDollar= remainingCents/HALF_DOLLAR;
    remainingCents= remainingCents%HALF_DOLLAR;
    
    quarters= remainingCents/QUARTERS;
    remainingCents = remainingCents%QUARTERS;
    
    dimes = remainingCents/DIMES;
    remainingCents=remainingCents%DIMES;
    
    nickles=remainingCents/NICKLES;
    remainingCents=remainingCents%NICKLES;
    
    //Display
    System.out.println("In $" + totalInBank +" there are: ");
    System.out.println(halfDollar+ " half dollar(s), "+quarters+" quarter(s), "+
                      dimes+" dime(s), "+nickles+" nickle(s), and "+remainingCents+
                      " cent(s).");  
   }
}
