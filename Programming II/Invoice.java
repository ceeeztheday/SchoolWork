import java.util.Scanner;
import java.text.NumberFormat;

public class Invoice
{
   public static void main(String [] args)
   {
      //variable declarations
      final double SALES_TAX_PCT = .05;
      
      Scanner kbd = new Scanner(System.in); //input variables
      String choice = "y";
      
      double subtotal = 0;          //calculation variables
      double discountPercent = 0.0;
      double discountAmount = 0.0;
      double salesTax = 0.0;
      double totalBeforeTax = 0.0;
      double total = 0.0;
      
      NumberFormat currency = NumberFormat.getCurrencyInstance(); //format setup
      NumberFormat percent = NumberFormat.getPercentInstance();
      
      String message;   //output variable
      
      //program logic
      while(choice.equals("Y") || choice.equals("y")) //CHANGE 1
      {
         //user prompt
         System.out.print("Enter subtotal: "); 
         subtotal = kbd.nextDouble();
         
         //establish discount rate
         discountPercent = 0.0; //clear value for each set-up
         if(subtotal >= 100)
            discountPercent = .1;
         else
            discountPercent = 0.0;
            
         //set discount
         discountAmount = subtotal * discountPercent;
         totalBeforeTax = subtotal - discountAmount;
         salesTax = totalBeforeTax * SALES_TAX_PCT;
         total = totalBeforeTax + salesTax;
         
         //format version and display the results
         message = "Discount percent: "  + percent.format(discountPercent) + "\n" +
                   "Discount amount:  "  + currency.format(discountAmount) + "\n" +
                   "Total beore tax:  "  + currency.format(totalBeforeTax) + "\n" +
                   "Sales tax:        "  + currency.format(salesTax) + "\n" + 
                   "Invoice total:     "  + currency.format(total) + "\n";
         System.out.println("Formatted version: \n" +message);
         
         //non-format and display the results
         message = "Discount percent: "  + discountPercent + "\n" +
                   "Discount amount:  "  + discountAmount + "\n" +
                   "Total beore tax:  "  + totalBeforeTax + "\n" +
                   "Sales tax:        "  + salesTax + "\n" + 
                   "Invoice total:     "  + total + "\n";
         System.out.println("Unformatted version: \n" + message);
         
         //see if user wants to continue
         System.out.print("Continue? (y/n): ");
         choice = kbd.next();
         System.out.println();
         
      }
         
   }
}