import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CoinChange {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        // your code goes here
        
      int amt = in.nextInt();
   final int PENNY = 1;
   final int QUARTER = 25;
   final int DIME = 10;
   final int NICKEL = 5;
  
   int quarters = 0;
   int dimes = 0;
   int nickels = 0;
   int cents = 0;
   int pennys = 0;
     
    cents = amt;
/*   
    quarters= remainingCents/QUARTERS;
    remainingCents = remainingCents%QUARTERS;
    
    dimes = remainingCents/DIMES;
    remainingCents=remainingCents%DIMES;
    
    nickles=remainingCents/NICKLES;
    remainingCents=remainingCents%NICKLES;
*/
   do{    
        if (cents >= 25)
        {
            quarters = cents / QUARTER;    // How many quarters we can get?
            cents = cents % QUARTER;
            
        }
        else if (cents >= 10)
        {
            dimes = cents /DIME;    // How many dimes we can get?
            cents = cents % DIME;
        }
        else if (cents >= 5)
        {
            nickels = cents /NICKEL;    // How many nickels we can get?
            cents = cents % NICKEL;
        }
        else
        {    
            pennys = cents;    // How many cents we'd have left?
            cents = 0;
        }
    }while (cents != 0);
   
      if(pennys > 1)
         System.out.print(quarters + " quarters\n" +
                          dimes + " dimes\n" + 
                          pennys + " pennies\n");
      else
         System.out.print(quarters + " quarters\n" +
                          dimes + " dimes\n" +
                          pennys + " penny");
      
   }
}
