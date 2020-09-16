import java.util.Scanner;
import java.math.*;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.io.IOException;
public class InvoiceBigDecimal 
{
   public static void main(String [] args) throws IOException
   {
      //variable declarations
      BigDecimal SALES_TAX_PCT = new BigDecimal("0.05");
      
      Scanner kbd = new Scanner(System.in); //input variables
      String choice = "y";
      String fileName = null;
      
      BigDecimal subtotal = new BigDecimal("0.0");          //calculation variables
      BigDecimal discountPercent = new BigDecimal("0.0");
      BigDecimal discountAmount = new BigDecimal("0.0");
      BigDecimal salesTax = new BigDecimal("0.0");
      BigDecimal totalBeforeTax = new BigDecimal("0.0");
      BigDecimal total = new BigDecimal("0.0");
      BigDecimal hundred = new BigDecimal("99.99");
           
      String message;   //output variable
      
      //program logic
      while(choice.equalsIgnoreCase("Y") ) 
      {
         //user prompt
         System.out.print("Enter file name: "); 
         
         fileName = kbd.next();
         
         java.io.File fileInvoice = new java.io.File(fileName);
   
         Scanner fScanner = new Scanner(fileInvoice);
         	      
	      while(fScanner.hasNextLine())
	      {
	         subtotal = fScanner.nextBigDecimal();
         
            //establish discount rate
            discountPercent = new BigDecimal ("0.0"); //clear value for each set-up
            if(hundred.compareTo(subtotal)< 0)
               discountPercent = new BigDecimal("0.10");
            else
               discountPercent = new BigDecimal ("0.0");
            
            //set discount
            discountAmount = subtotal.multiply(discountPercent);
            totalBeforeTax = subtotal.subtract(discountAmount);
            salesTax = totalBeforeTax.multiply(SALES_TAX_PCT);
            total = totalBeforeTax.add(salesTax);
         
            //format version and display the results
            message = "Discount percent: "  + discountPercent + "\n" +
                      "Discount amount:  "  + discountAmount + "\n" +
                      "Total beore tax:  "  + totalBeforeTax + "\n" +
                      "Sales tax:        "  + salesTax + "\n" + 
                      "Invoice total:    "  + total + "\n";
            System.out.println("Formatted version: \n" +message);
         }
         
         //see if user wants to continue
         System.out.print("Continue? (y/n): ");
         choice = kbd.next();
         System.out.println();  
     }     
   }
}